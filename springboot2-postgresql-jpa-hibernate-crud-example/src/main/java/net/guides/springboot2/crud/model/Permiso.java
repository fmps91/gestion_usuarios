/* package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "permiso" , schema = "public") 
public class Permiso {

	private long id;
	private String nombre;
	private long id_usuario;

	public Permiso() {
		
	}
	
	public Permiso(String nombre,long id_usuario) {
		this.nombre = nombre;
		//this.id_usuario=id_usuario;
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

	@Column(name = "id_usuario")
	public long getId_Usuario() {
		return this.id_usuario;
	}

	
	public void setId_Usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	
}
 */