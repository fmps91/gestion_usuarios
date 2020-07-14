/* package net.guides.springboot2.crud.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

//import net.guides.springboot2.crud.model.Permiso;

//import java.util.List;


@Entity
@Table(name = "rol" , schema = "public") 
public class Rol {

	private long id;
	private String nombre;
	private long id_usuario;

	
	
	public Rol() {
		
	}
	
	public Rol(String nombre, long id_usuario) {
		this.nombre = nombre;
		this.id_usuario=id_usuario;
	}
	
	
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "name", nullable = false)
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "id_usuario", nullable = false)
	public Long getid_usuario() {
		return id_usuario;
	}
	public void setid_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}


	
}
 */