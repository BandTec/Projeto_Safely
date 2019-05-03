<?php
if ((isset($_POST['email']))&&(!empty($_POST['email']))){
    // PHP Data Objects(PDO) Sample Code:
    try {
        $conn = new PDO("sqlsrv:server = tcp:safely.database.windows.net,1433; Database = Safely", "s_adm", "{your_password_here}");
        $conn->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    }
    catch (PDOException $e) {
        print("Error connecting to SQL Server.");
        die(print_r($e));
    }

    // SQL Server Extension Sample Code:
    $connectionInfo = array("UID" => "s_adm@safely", "pwd" => "{your_password_here}", "Database" => "Safely", "LoginTimeout" => 30, "Encrypt" => 1, "TrustServerCertificate" => 0);
    $serverName = "tcp:safely.database.windows.net,1433";
    $conn = sqlsrv_connect($serverName, $connectionInfo);

    ini_set('display_errors', 1); ini_set('display_startup_errors', 1); error_reporting(E_ALL);

    $select_db = mysql_select_db("Safely"); //seleciona o banco de dados

    //Abaixo atribuímos os valores provenientes do formulário pelo método POST
    $CNPJ = $_POST['CNPJ']; 
    $estabelecimento = $_POST['estabelecimento'];
    $email = $_POST['email'];
    $user = $_POST['user'];
    $password = $_POST['password'];

    $string_sql = "INSERT INTO empresa (id_empresa,CNPJ) VALUES (null,'{$CNPJ}')"; //String com consulta SQL da inserção
    $string_sql = "INSERT INTO usuario (id,email,usuario, senha) VALUES (null,'{$email}','{$user}', '{$password}')"; //String com consulta SQL da inserção
    $string_sql = "INSERT INTO estabelecimento (id_estabelecimento, nome) VALUES (null,'{$estabelecimento}')"; //String com consulta SQL da inserção

    mysql_query($string_sql,$conexao); //Realiza a consulta

    if(mysql_affected_rows() == 1){ //verifica se foi afetada alguma linha, nesse caso inserida alguma linha
        echo "<p>Formulário Registrado</p>";
        echo '<a href="index.html">Voltar para formulário de cadastro</a>'; //Apenas um link para retornar para o formulário de cadastro
    } else {
        echo "Erro, não foi possível inserir no banco de dados";
    }
}

    mysql_close($conexao); //fecha conexão com banco de dados 
?>
