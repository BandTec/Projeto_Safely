const express = require('express');
const router = express.Router();
const Database = require('../Database');//conexao  com o banco

router.get('/cpu', function(req, res, next){
    return carregaCpu().then(results => {
        console.log(results.recordsets);
        res.json(results.recordsets);
    }).catch(erro => {
        console.log(erro);
        res.status(400).json({'mensagem':`Erro ao carregar gráfico CPU: ${erro}`});
    });
    
});

router.get('/ram', function(req, res, next){
    return carregaRam().then(results => {
        console.log(results.recordsets);
        res.json(results.recordsets);
    }).catch(erro => {
        console.log(erro);
        res.status(400).json({'mensagem':`Erro ao carregar gráfico RAM: ${erro}`});
    });
    
});

router.get('/ramTamanho', function(req, res, next){
    return carregaRamTamanho().then(results => {
        console.log(results.recordsets);
        res.json(results.recordsets);
    }).catch(erro => {
        console.log(erro);
        res.status(400).json({'mensagem':`Erro ao carregar gráfico Disco: ${erro}`});
    });
    
});

router.get('/disco', function(req, res, next){
    return carregaDisco().then(results => {
        console.log(results.recordsets);
        res.json(results.recordsets);
    }).catch(erro => {
        console.log(erro);
        res.status(400).json({'mensagem':`Erro ao carregar gráfico Disco: ${erro}`});
    });
    
});

function carregaCpu() {
        let querystring = 'SELECT uso_processador FROM TB_LEITURA;';
        return new Promise((resolve, reject) => {
            Database.query(querystring).then(results => {
                resolve(results);
            }).catch(error => {
                console.error(error);
                reject(error);
            });
        });
}

function carregaRam() {
    let querystring = 'SELECT uso_ram FROM TB_LEITURA;';
    return new Promise((resolve, reject) => {
        Database.query(querystring).then(results => {
            resolve(results);
        }).catch(error => {
            console.error(error);
            reject(error);
        });
    });
}

function carregaRamTamanho() {
    let querystring = 'SELECT tamanho FROM TB_MEMORIA_RAM;';
    return new Promise((resolve, reject) => {
        Database.query(querystring).then(results => {
            resolve(results);
        }).catch(error => {
            console.error(error);
            reject(error);
        });
    });
}

function carregaDisco() {
    let querystring = 'SELECT uso_disco FROM TB_LEITURA;';
    return new Promise((resolve, reject) => {
        Database.query(querystring).then(results => {
            resolve(results);
        }).catch(error => {
            console.error(error);
            reject(error);
        });
    });
}


module.exports = router;