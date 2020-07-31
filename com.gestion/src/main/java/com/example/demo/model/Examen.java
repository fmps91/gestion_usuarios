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
@Table(name = "examen" , schema = "public") 
public class Examen {

    private long id;
    private String hora;
	private String motivo;
	private String resultado;
    private long id_usuario;
    private long id_medico;


	
	
	public Examen() {
		
	}
	
	public Examen(String hora,String motivo,String resultado, long id_usuario, long id_medico) {
        this.hora = hora;
		this.motivo = motivo;
		this.resultado = resultado;

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
	
	@Column(name = "hora", nullable = false)
	public String gethora() {
		return hora;
	}
	public void sethora(String hora) {
		this.hora = hora;
    }
    
    @Column(name = "motivo", nullable = false)
	public String getmotivo() {
		return motivo;
	}
	public void setmotivo(String motivo) {
		this.motivo = motivo;
	}

	@Column(name = "resultado", nullable = false)
	public String getresultado() {
		return resultado;
	}
	public void setresultado(String resultado) {
		this.resultado = resultado;
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
