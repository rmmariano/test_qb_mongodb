package conf_5_2_1;

import java.util.List;
import java.util.Set;

import org.esfinge.querybuilder.QueryBuilder;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.query.Query;

public class Main {
	
	public static void main(String[] args) {
		
		MongoDBDatastoreProvider db = new MongoDBDatastoreProvider();		
		Datastore ds = db.getDatastore();
		
		Cliente cliente = new Cliente(); cliente.setId(0); cliente.setNome("Maril");		
		
		Cliente cliente02 = new Cliente(); cliente02.setId(1); cliente02.setNome("Abys");
		
		Cliente cliente03 = new Cliente(); cliente03.setId(2); cliente03.setNome("Maril");	
		
		Cachorro cachorro = new Cachorro();
		cachorro.setId(0); cachorro.setNome("Hau"); cachorro.setRaca("pastor");
//		
//		Pagamento pagamento = new Pagamento();
//		pagamento.id = 0; pagamento.valor = 300.00f; pagamento.data = "30/06/2016";
		
		cliente.addCachorro(cachorro);
//		cliente.pagamentos.add(pagamento);
		
		ds.save(cliente); ds.save(cliente02); ds.save(cliente03);		
		
		System.out.println("Consulta usando Repository: ");
		
		Query<Cliente> query_cliente = ds.find(Cliente.class);		
		List<Cliente> lista_clientes = query_cliente.asList();
		
		for(Cliente c: lista_clientes){
			System.out.println("Id: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			
			System.out.println("Cachorros: ");			
			Set<Cachorro> set_cachorros = c.getCachorros();				
			for(Cachorro dog: set_cachorros){
				System.out.println(" Nome: " + dog.getNome());				
				System.out.println(" Raca: " + dog.getRaca());
			}
//			
//			System.out.println("Pagamentos: ");			
//			Set<Pagamento> set_pags = c.pagamentos;			
//			for(Pagamento pag: set_pags){
//				System.out.println(" ID: " + pag.id);				
//				System.out.println(" Valor: " + pag.valor);
//				System.out.println(" Data: " + pag.data);
//			}
//			
			System.out.println("\n");			
		}
		
		
		System.out.println("\n*************\nConsultas pelo Query Builder: \n");
		
		ClienteDAO dao = QueryBuilder.create(ClienteDAO.class);
		
		System.out.println("Consultar por ID do cliente (0): ");
		List<Cliente> lista_de_clientes = dao.getClienteById(0);
		
		for(Cliente c: lista_de_clientes){
			System.out.println("Id: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			
			System.out.println("Cachorros: ");			
			Set<Cachorro> set_cachorros = c.getCachorros();				
			for(Cachorro dog: set_cachorros){
				System.out.println(" Nome: " + dog.getNome());				
				System.out.println(" Raca: " + dog.getRaca());
			}

//			System.out.println("Pagamentos: ");			
//			Set<Pagamento> set_pags = c.pagamentos;			
//			for(Pagamento pag: set_pags){
//				System.out.println(" ID: " + pag.id);				
//				System.out.println(" Valor: " + pag.valor);
//				System.out.println(" Data: " + pag.data);
//			}
			
			System.out.println("\n");			
		}
		
		
		System.out.println("Consultar pelo nome do cliente (Maril): ");
		lista_de_clientes = dao.getClienteByNome("Maril");
		
		for(Cliente c: lista_de_clientes){
			System.out.println("Id: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			
			System.out.println("Cachorros: ");			
			Set<Cachorro> set_cachorros = c.getCachorros();				
			for(Cachorro dog: set_cachorros){
				System.out.println(" Nome: " + dog.getNome());				
				System.out.println(" Raca: " + dog.getRaca());
			}
//			
//			System.out.println("Pagamentos: ");			
//			Set<Pagamento> set_pags = c.pagamentos;			
//			for(Pagamento pag: set_pags){
//				System.out.println(" ID: " + pag.id);				
//				System.out.println(" Valor: " + pag.valor);
//				System.out.println(" Data: " + pag.data);
//			}
			
			System.out.println("\n");			
		}
		
	}

}
