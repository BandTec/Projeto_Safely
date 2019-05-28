const express = require('express');
const router = express.Router();
const isNull = require('../script').isNull;
const Database = require('../Database');//conexao  com o banco
const Cryptr = require('cryptr');//criptografia
const config = require('../config');//banco
const cryptr = new Cryptr(config.security.key);

router.post('/cadastrarFuncionario', (req, res, next) => {
	
	// após o body, são os nomes dos campos no formulário (no front)
    let franquia = req.body.franquia;
    let nome = req.body.nome;
    let senha = req.body.password;
    let email = req.body.email;
    let cnpj = req.body.CNPJ;

    if (isNull(cnpj) || isNull(franquia) || isNull(nome) || isNull(email) || isNull(senha)) {
        res.status(400).json({'mensagem': 'Todos os campos são obrigatórios'});
    }

	//tirar comentário caso desejar criptografar a senha
    //senha = cryptr.encrypt(senha);

    console.log(`username: ${nome}, email: ${email}, password: ${senha}`);

    criarUsuario(nome, senha, email).then(results => {
        req.session.message = `Usuário ${nome} criado com sucesso`;
        res.status(302).redirect('/index.html');
    }).catch(erro => {
		console.error(`Erro: ${erro}`);
        res.status(400).json({'mensagem':`Erro ao cadastrar: ${erro}`});
    });

    cadastrarFranquia(franquia).then(results => {
        req.session.message = `Franquia ${franquia} criada com sucesso`;
        res.status(302).redirect('/index.html');
    }).catch(erro => {
		console.error(`Erro: ${erro}`);
        res.status(400).json({'mensagem':`Erro ao cadastrar: ${erro}`});
    });

    cadastrarEmp(cnpj).then(results => {
        req.session.message = `Empresa ${cnpj} criada com sucesso`;
        res.status(302).redirect('/index.html');
    }).catch(erro => {
		console.error(`Erro: ${erro}`);
        res.status(400).json({'mensagem':`Erro ao cadastrar: ${erro}`});
    });
});

function criarUsuario(nome, senha,  email) {
    return new Promise((resolve, reject) => {
        let create = undefined;
        verificarLogin(usuario).then(exists => {
            create = !exists;
            console.log('create:', create);
            if (create) {
                let querystring = `INSERT INTO USUARIO (nome, email, senha) VALUES ('${nome}', '${email}', '${senha}');`;
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

    function cadastrarFranquia(franquia) {
        return new Promise((resolve, reject) => {
            let create = undefined;
            verificarLogin(cnpj).then(exists => {
                create = !exists;
                console.log('create:', create);
                if (create) {
                    let querystring = `INSERT INTO FRANQUIA (nome) VALUES ('${franquia}');`;
                    Database.query(querystring).then(results => {
                        resolve(results);
                    }).catch(error => {
                        console.error(error);
                        reject(error);
                    });
                } else {
                    reject(`Empresa ${cnpj} já cadastrada!`);
                }
            }).catch((erro) => {
                reject(erro);
            });
        });
    }
        function cadastrarEmp(cnpj) {
            return new Promise((resolve, reject) => {
                let create = undefined;
                verificarLogin(CNPJ).then(exists => {
                    create = !exists;
                    console.log('create:', create);
                    if (create) {
                        let querystring = `INSERT INTO EMPRESA (CNPJ) VALUES ('${cnpj}');`;
                        Database.query(querystring).then(results => {
                            resolve(results);
                        }).catch(error => {
                            console.error(error);
                            reject(error);
                        });
                    } else {
                        reject(`Empresa ${cnpj} já cadastrada!`);
                    }
                }).catch((erro) => {
                    reject(erro);
                });
            });
}

 function verificarLogin(email) {
    let querystring = `SELECT * FROM USUARIO WHERE email = '${email}'`;
    return new Promise((resolve, reject) => {
        Database.query(querystring).then(results => {
                let existe = results.recordsets[0].length > 0;
                resolve(existe);
            }).catch(error => {
                reject(error);
            });
        });
}



module.exports = router;