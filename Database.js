var connectionFactory = require('../institucional/education/connectionFactory');

module.exports = function(app) {
    console.log("Módulo home rodando.");
    
    app.get(' ', function(req, res) {
        var connection = connectionFactory();
        console.log("Conectou!");

        request.query('select * from TB_USUARIO', function(err, results) {
            res.render('home', {home : results});
        });
        connection.close();
    });
}