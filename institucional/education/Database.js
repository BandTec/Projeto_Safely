'use strict'; //Retrocompatibilidade com outras versoes do JS (para máquinas mais antigas)
const config = require("./config").database; //configurações do banco
const isNull = require("./script").isNull; //script de tudo nulo
const sql = require("mssql"); //Instancia de variavel para o SQL Server Azure

module.exports = {
  query: async queryString => {
    return new Promise(async (resolve, reject) => {
      if (isNull(queryString)) {
        return reject({
          message: "queryString is required!"
        });
      }


      console.log("Establishing connection to Database...");
      try {
        const pool = await new sql.ConnectionPool(config).connect();
        console.log("Connected to Database!");
        const res = await pool.request().query(queryString);
        await sql.close();
        console.log("Query succeded!");
        return resolve(res);
      } catch (err) {
        console.log(`Error executing query`);
        await sql.close();
        return reject(err);
      }
    });
  }
};