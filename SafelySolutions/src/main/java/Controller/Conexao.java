package Controller;

import java.sql.*;

public class Conexao {
    // Conexão com Azure
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String connectionStr = "jdbc:sqlserver://smart420.database.windows.net:1433;database=Smart42";
    private static String usuario = "administrador";
    private static String senha = "Smart420";

    public static Connection open() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionStr, usuario, senha);
            String open = conn.getSchema();
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection conn) throws SQLException {
        conn.close();
    }

    public static ResultSet executeQuery(String sql) throws SQLException {

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


    public static boolean executeCommand(String sql) throws SQLException {
        Connection conn = open();
        PreparedStatement pstm = conn.prepareStatement(sql);
        return pstm.executeUpdate() > 0;
    }
}

