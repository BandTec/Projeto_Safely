var express = require('express');
var router = express.Router();
var isNull = require('../script').isNull;
var Database = require('../Database');
const Cryptr = require('cryptr');
const config = require('../config');
const cryptr = new Cryptr(config.security.key);

router.get('/', (req, res, next) => {
    if (!req.session.username || req.session.username && !req.session.username.logged_in) {
        res.render('login', {
            'message': req.session.message || ''
        });
    } else {
        res.render('index', {
            session: req.session
        });
    }
});

router.post('/', (req, res, next) => {
    var username = req.body.usuario;
    var password = req.body.senha;

    if (isNull(username) || isNull(password)) {
        console.log('Invalid username and/or password!');
        res.render('login', {
            'message': 'Invalid username and/or password!'
        });
    } else {

        Database.query(`SELECT * FROM usuario WHERE usuario = '${username}';`).then(results => {
            results = results.recordsets[0];
            if (results.length > 0) {
                let decryptedPassword = cryptr.decrypt(results[0].senha);
                if (decryptedPassword === password) {
                    let user = {
                        nome: results[0].nome,
                        username: results[0].username,
                        id: results[0].id,
                        logged_in: true
                    };
                    req.session.user = user;
                    res.redirect('/index.ejs');
                } else {
                    res.render('login', {
                        'message': 'Invalid username/password!'
                    });
                }
            } else {
                res.render('login', {
                    'message': 'Invalid usernamename/password!'
                });
            }
        }).catch(error => {
            console.error(error);
            res.status(400).render('login', {'message': "Couldn't log in!"});
        });
    }
});

module.exports = router;
