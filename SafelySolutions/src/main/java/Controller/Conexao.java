package Controller;

import java.sql.*;

public class Conexao {

    // Conexão com Azure
    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String connectionStr = "jdbc:sqlserver://safely.database.windows.net:1433;database=Safely";
    private String usuario = "s_adm@safely";
    private String senha = "@Bestlab";

    Connection conn = null;

    public Connection open() {
        try {
            conn = DriverManager.getConnection(connectionStr, usuario, senha);
            String open = conn.getSchema();
            return conn;

        } catch (SQLException e) {
            System.out.println("erro ao conectar " + e);
        }
        return null;
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }

    public ResultSet executeQuery(String sql) throws SQLException {

        try {

            Connection conn = open();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ResultSet executeQuery(String sql, Connection conn) throws SQLException {

        try {

            //Connection conn = open();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rset = pstm.executeQuery();
            return rset;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
// esse aqui é meu codigo da validação ( no caso aqui serve para fazer o insert no banco, validando é claro )
    public boolean executeCommand(String sql) throws SQLException {
        Connection conn = open();
        PreparedStatement pstm = conn.prepareStatement(sql);
        return pstm.executeUpdate() > 0;
    }
}
