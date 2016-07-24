package conf_5_2_1;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Cachorro {
	
	@Id
	public int id;
	public String nome;
	public String raca;
	
	
//	public Cachorro() {
//	}	
//	
//	public Cachorro(String nome, String raca) {
//		this.nome = nome;
//		this.raca = raca;
//	}
//	
//	
//	//Getters and setters
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//	public String getRaca() {
//		return raca;
//	}
//
//	public void setRaca(String raca) {
//		this.raca = raca;
//	}

}
