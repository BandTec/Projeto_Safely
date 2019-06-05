/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ntborges
 */
public class ValidarLogin {

    public int getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public static int idEstabelecimento;

    Conexao conexao = new Conexao();

    public boolean validar(String email, String senha) throws SQLException {
        Connection conn = Conexao.open();

        try {

            ResultSet user = Conexao.executeQuery("select * from TB_USUARIO where email = '" + email + "' and senha = '" + senha + "'", conn);

            ArrayList<Usuario> lf = new ArrayList<>();

            while (user.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(user.getInt("idUsuario"));
                u.setNome(user.getString("nome"));
                u.setEmail(user.getString("email"));
                u.setSenha(user.getString("senha"));
                u.setIdEstabelecimento(user.getInt("fk_estabelecimento"));
                lf.add(u);

            }
            if (!lf.isEmpty()) {
                setIdEstabelecimento(lf.get(0).getIdEstabelecimento());
                return true;
            } else {
                return false;
            }
        } finally {
            Conexao.close(conn);
        }

    }

}
