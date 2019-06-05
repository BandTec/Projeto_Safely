const express = require('express');
const router = express.Router();
const isNull = require('../script').isNull;
const Database = require('../Database');//conexao  com o banco
const Cryptr = require('cryptr');//criptografia
const config = require('../config');//banco
const cryptr = new Cryptr(config.security.key);

router.post('/estabelecimento', (req, res, next) => {
    let cnpj = req.body.CNPJ;
    let estabelecimento = req.body.estabelecimento;

    if (isNull(cnpj) || isNull(estabelecimento)) {
        res.status(400).json({'mensagem': 'Todos os campos são obrigatórios'});
    }else {
        console.log(`cnpj: ${cnpj}, email: ${estabelecimento}`);
        try{
            cadastrarEstabelecimento(cnpj,estabelecimento).then(results => {
                console.log(results);
                res.status(302).redirect('/index.html');
            }).catch(erro => {
                console.log(erro);
                res.status(400).json({'mensagem':`Erro ao cadastrar estabelecimento: ${erro}`});
            });
        }catch{
            console.log("erro na criação do estabelecimento");
        }

    }

});

router.post('/usuario', (req, res, next) => {
    let nome = req.body.name;
    let email = req.body.email;
    let senha = req.body.senha;
    let cnpj = req.body.CNPJ;

    if (isNull(nome) || isNull(email) || isNull(senha)) {
        res.status(400).json({'mensagem': 'Todos os campos são obrigatórios'});
    }else {
        console.log(`username: ${nome}, email: ${email}, senha: ${senha}`);
        try{
        let id;
        empresa(cnpj).then(results => {
            id = results.recordset[0].idEstabelecimento;
            criarUsuario(nome, senha, email, id).then(results => {
                res.status(302).redirect('/index.html');
            }).catch(erro => {
                console.error(`Erro: ${erro}`);
                res.status(400).json({'mensagem':`Erro ao cadastrar usuario: ${erro}`});
                });
            });
           
  
        }catch (error){
            console.log(error);
        }
            

    }

});

router.post('/bruno_veado', (req, res, next) => {
	
	// após o body, são os nomes dos campos no formulário (no front)
    let cnpj = req.body.CNPJ;
    let estabelecimento = req.body.estabelecimento;
    let nome = req.body.name;
    let email = req.body.email;
    let senha = req.body.password;
    
    

    if (isNull(cnpj) || isNull(estabelecimento) || isNull(nome) || isNull(email) || isNull(senha)) {
        res.status(400).json({'mensagem': 'Todos os campos são obrigatórios'});
    }

	//tirar comentário caso desejar criptografar a senha
    //senha = cryptr.encrypt(senha);

    console.log(`username: ${nome}, email: ${email}, password: ${senha}`);


    cadastrarEstabelecimento(cnpj,estabelecimento).then(results => {
        res.status(302).redirect('/index.html');
    }).catch(erro => {
        console.error(`Erro: ${erro}`);
        res.status(400).json({'mensagem':`Erro ao cadastrar estabelecimento: ${erro}`});
    });

    console.log("============================1");


    let idempresa = empresa(cnpj);
    console.log(idempresa);
    
    console.log("============================2");
    criarUsuario(nome, senha, email).then(results => {
        res.status(302).redirect('/index.html');
    }).catch(erro => {
		console.error(`Erro: ${erro}`);
        res.status(400).json({'mensagem':`Erro ao cadastrar   usuario: ${erro}`});
    });
});

function criarUsuario(nome, senha, email,idEstabelecimento) {
    console.log("passou aqui");
    return new Promise((resolve, reject) => {
        let create = undefined;
        verificarLogin(email).then(exists => {
            create = !exists;
            console.log('create:', create);
            if (create) {
                let querystring = `INSERT INTO TB_USUARIO (nome, email, senha,fk_estabelecimento) VALUES ('${nome}', '${email}', '${senha}', '${idEstabelecimento}');`;
                console.log(querystring);
                Database.query(querystring).then(results => {
                    resolve(results);
                }).catch(error => {
                    console.error(error);
                    reject(error);
                });
            } else {
                reject(`Usuário ${nome} já cadastrado!`);
            }
        }).catch((erro) => {
            reject(erro);
        });
    });
}

function cadastrarEstabelecimento(cnpj,estabelecimento) {
        return new Promise((resolve, reject) => {
            let create = undefined;
            verificarLogin(estabelecimento).then(exists => {
                create = !exists;
                console.log('create:', create);
                if (create) {
                    let querystring = `INSERT INTO TB_ESTABELECIMENTO (nome,CNPJ) VALUES ('${estabelecimento}','${cnpj}');`;
                    Database.query(querystring).then(results => {
                        let existe = results.rowsAffected.length > 0;
                        console.log(existe);
                        resolve(existe);
                    }).catch(error => {
                        console.error(error);
                        reject(error);
                    });
                } else {
                    reject(`Estabelecimento ${estabelecimento} já cadastrada!`);
                }
            }).catch((erro) => {
                reject(erro);
            });
        });
}

function verificarLogin(email) {
    let querystring = `SELECT * FROM TB_USUARIO WHERE email = '${email}'`;
    return new Promise((resolve, reject) => {
        Database.query(querystring).then(results => {
                let existe = results.recordsets[0].length > 0;
                resolve(existe);
            }).catch(error => {
                reject(error);
            });
        });
}
function empresa(cnpj) {
    let querystring = `SELECT idEstabelecimento FROM TB_ESTABELECIMENTO WHERE CNPJ = '${cnpj}'`;
    return new Promise((resolve, reject) => {
        Database.query(querystring).then(results => {
            let existe = results.recordsets[0].length > 0;
            let idEstabelecimento = results.recordsets[0];
            resolve(results);
        }).catch(error => {
            reject(error);
        });
    });
}


module.exports = router;