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




@Entity
@Table(name = "especialidad" , schema = "public") 
public class Especialidad {

    private long id;
    private String nombre;
	private String descripcion;
    private long id_medico;


	
	
	public Especialidad() {
		
	}
	
	public Especialidad(String nombre,String descripcion, long id_medico) {
        this.nombre = nombre;
        this.descripcion = descripcion;
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
	
	@Column(name = "nombre", nullable = false)
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
    }
    
    @Column(name = "descripcion", nullable = false)
	public String getdescripcion() {
		return descripcion;
	}
	public void setdescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

    @Column(name = "id_medico", nullable = false)
	public Long getid_usuarioo() {
		return id_medico;
	}
	public void setid_usuarioo(Long id_medico) {
		this.id_medico = id_medico;
    }
    
    


	
}
