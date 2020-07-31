package com.example.demo.model;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;


//import java.util.List;


@Entity
@Table(name = "medico" , schema = "public") 
public class Medico {

	private long id;
	private String credencial;
	private long id_medico;

	
	
	public Medico() {
		
	}
	
	public Medico(String credencial, long id_medico) {
		this.credencial = credencial;
		this.id_medico=id_medico;
	}
	
	
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "credencial", nullable = false)
	public String getcredencial() {
		return credencial;
	}
	public void setcredencial(String credencial) {
		this.credencial = credencial;
	}

	@Column(name = "id_medico", nullable = false)
	public Long getid_medico() {
		return id_medico;
	}
	public void setid_medico(Long id_medico) {
		this.id_medico = id_medico;
	}


	
}
