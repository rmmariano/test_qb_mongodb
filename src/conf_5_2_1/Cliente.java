package conf_5_2_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.code.morphia.annotations.Reference;

@Entity
public class Cliente {
	
	@Id
	private int id;
	private String nome;
	
//	@Reference
	private Set<Cachorro> cachorros = new HashSet<Cachorro>();
	
//	@Reference
//	public Set<Pagamento> pagamentos = new HashSet<Pagamento>();
	

	public void addCachorro(Cachorro cachorro) {
		cachorros.add(cachorro);
	}
//	
//	public void addPagamento(Pagamento pagamento) {
//		pagamentos.add(pagamento);
//	}
	
	
	// Getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Cachorro> getCachorros() {
		return cachorros;
	}

	public void setCachorros(Set<Cachorro> cachorros) {
		this.cachorros = cachorros;
	}
//
//	public Set<Pagamento> getPagamentos() {
//		return pagamentos;
//	}
//
//	public void setPagamentos(Set<Pagamento> pagamentos) {
//		this.pagamentos = pagamentos;
//	}

}
