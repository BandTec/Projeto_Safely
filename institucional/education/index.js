// Servidor HTTP
const express = require('express');

const app = express();

// Converter os dados que foram retornados em JSON
const bodyParser = require('body-parser');


const port = process.env.PORT || 3000;

// Freamework de acesso ao SQL
const sql = require('mssql');

// Connection string
const connStr = 'Server=tcp:safely.database.windows.net,1433;Initial Catalog=Safely;Persist Security Info=False;User ID=s_adm;Password=@Bestlab;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;';

// Funcao de conexao
sql.connect(connStr)
    .then(conn => GLOBAL.conn = conn)
    .catch(err => console.log(err));

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

// Rotas, parecidas com arquivos
const router = express.Router();

// Rota inicial
router.get('/', (req, res) => res.json({ message: 'Working' }));


app.use('/', router);


// Starto servidor
app.listen(port);


// Rota de login
router.get('/usuario/:usuario/:senha', (req, res) => {

    // Via parametro
    let username = req.params.email;
    let password = req.params.senha;

    // Funcao de acesso ao banco
    GLOBAL.conn.request()
        .query(`SELECT * FROM USUARIO where email = '${username}' AND senha = '${password}'`)
        .then(result => {
            let data = JSON.parse(JSON.stringify(result.recordset));
            if(data.length === 0)
                res.send("não encontrou ninguem com essas informacoes")
            else
                res.send("encontrou")
        })
        //Tratando de erro
        .catch(err => res.json(err));
})