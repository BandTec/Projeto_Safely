const express = require('express'); //framework node back-end que vai rodar a aplicacaoWeb
const path = require('path');
const logger = require("morgan");
const createError = require('http-errors');

//variáveis que fazem rota com cada pagina
const indexRouter = require('./routes/index');//pegando a pagina index como principal e fazendo rotas
const loginRouter = require('./routes/login');
const logoutRouter = require('./routes/logout');


//fim de rotas de pagina

const app = express(); //inicio do express
//definição de pasta principal education
app.set('public', path.join(__dirname, 'public'));
app.use(express.json()); //uso de dados com JSON
app.use(express.urlencoded({ extended: false}));
app.use(logger('dev'));
app.use(express.static(path.join(__dirname, 'public')));

app.use((req, res, next) =>{
    next();
});
app.use('/', indexRouter);
app.use('/login', loginRouter);
app.use('/logout', logoutRouter);//ainda vai precisar das outras rotas


app.use(function(req, res, next) {
    next(createError(404));//pagina não encontrada
  });
  
  app.use(function(err, req, res, next) {
    // set locals, only providing error in development
    res.locals.message = err.message;
    res.locals.error = req.app.get('env') === 'development' ? err : {};
  
    // render the error page
    return res.status(err.status || 500);
    
  });
module.exports = app;//exportando o app para ser executado na web