package BancoDDados;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO {
    public void salvar(Object entidade) throws SQLException;

    public void apagar(Object entidade) throws SQLException;

    public void atualizar(Object entidade) throws  SQLException;

    public ArrayList<?> listarTodos() throws SQLException;


}
