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

//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.JsonIdentityReference;
//import com.fasterxml.jackson.annotation.JsonProperty;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//import org.hibernate.annotations.OnDelete;
//import org.hibernate.annotations.OnDeleteAction;

//import net.guides.springboot2.crud.model.Permiso;

//import java.util.List;


@Entity
@Table(name = "cita" , schema = "public") 
public class Cita {

    private long id;
    private String fecha;
	private String motivo;
    private long id_usuario;
    private long id_medico;


	
	
	public Cita() {
		
	}
	
	public Cita(String fecha,String motivo, long id_usuario, long id_medico) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.id_usuario=id_usuario;
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
	
	@Column(name = "fecha", nullable = false)
	public String getfecha() {
		return fecha;
	}
	public void setfecha(String fecha) {
		this.fecha = fecha;
    }
    
    @Column(name = "motivo", nullable = false)
	public String getmotivo() {
		return motivo;
	}
	public void setmotivo(String motivo) {
		this.motivo = motivo;
	}

	@Column(name = "id_usuario", nullable = false)
	public Long getid_usuario() {
		return id_usuario;
	}
	public void setid_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
    }

    @Column(name = "id_medico", nullable = false)
	public Long getid_usuarioo() {
		return id_medico;
	}
	public void setid_usuarioo(Long id_medico) {
		this.id_medico = id_medico;
    }
    
    


	
}
