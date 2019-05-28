const express = require('express');
const router = express.Router();
const isNull = require('../script').isNull;
const Database = require('../Database');
const Cryptr = require('cryptr');
const config = require('../config');
const cryptr = new Cryptr(config.security.key);

// rota de autenticação
router.post('/', (req, res, next) => {
	console.log('tentando autenticar...');
	
	try {
			
		// após o body, são os nomes dos campos no formulário no front	
		const email = req.body.email
		const senha = req.body.senha;
		
		const msgErro = {'mensagem': 'Login e/ou senha inválidos!'};
		
		if (isNull(email) || isNull(senha)) {
			//console.log('Login e/ou senha inválidos');
			res.render('login', msgErro);
		} else {
			console.log('tentando consulta no banco...');
			// altere aqui o seu select de acordo com sua tabela DO BANCO
			Database.query(`SELECT * FROM USUARIO WHERE email = '${email}';`).then(results => {
				//COMEÇO RETORNO DO SELECT PARA EFETUAR LOGIN
				console.log(`Linhas: ${results.recordsets[0].length}`);//aqui nao muda
				let linhas = results.recordsets[0];
				if (linhas.length > 0) {//SE TAMANHO DE LINHAS FOR MAIOR QUE ZERO, ENTRA NA CONDIÇÃO
					let senhaBanco = linhas[0].senha; // é 'senha' o nome de seu campo DO BANCO?
					if (senhaBanco === senha) {
						let user = {
							// mantenha "nome" e "login" nos antes dos ":"
							email: linhas[0].email, // é 'usuario' o nome de seu campo do BANCO?
							senha: linhas[0].senha, // é 'senha' o nome de seu campo DO BANCO?
						};
						req.session.user = user;
						res.status(200).send('ok');
					} else {
						res.status(401).send(msgErro);
					}
				} else {
					res.status(401).send(msgErro);
				}
			}).catch(error => {
				res.status(401).send(msgErro);
			});
		}
    
	} catch (e) {
		console.error(`erro: ${e}`);
		res.send({'mensagem':`${e}`});
	}

});

// rota que recupera os dados do usuário na sessão
// a princípio, não precisa mexer aqui
router.get('/sessao', (req, res, next) => {
    if (req.session.user && req.session.user) {
		const usuario = req.session.user;
        res.json({
            'email': usuario.email,
            'senha': usuario.senha,
        });
    } else {
        res.status(401).json({
            'mensagem': 'Nenhum usuário na sessão'
        });
    }
});

module.exports = router;
