package conf_5_2_1;

import java.util.List;

import org.esfinge.querybuilder.Repository;

public interface ClienteDAO extends Repository<Cliente>{
		
	public List<Cliente> getClienteById(int id);	
    public List<Cliente> getClienteByNome(String nome);

}

