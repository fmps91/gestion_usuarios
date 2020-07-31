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
@Table(name = "historia_clinica" , schema = "public") 
public class Historia {

	private long id;
	private String nombre;
	private long edad;
	private String sexo;
	private String ocupacion;
	private long telefono;
	private String fecha;
	private String hora;
	private String lugar;
	private String motivo;
    private long id_usuario;
    


	
	
	public Historia() {
		
	}
	
	public Historia(
		String nombre,
		long edad,
		String sexo,
		String ocupacion, 
		long telefono,
		String fecha,
		String hora,
		String lugar, 
		String motivo,
		long id_usuario
		
		) {

		this.nombre = nombre;
		this.edad=edad;
		this.sexo = sexo;
		this.ocupacion = ocupacion;
		this.telefono=telefono;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
		this.motivo = motivo;
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

	@Column(name = "nombre", nullable = false)
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "edad", nullable = false)
	public Long getid_usuarioo() {
		return edad;
	}
	public void setid_usuarioo(Long edad) {
		this.edad = edad;
    }
	
	@Column(name = "sexo", nullable = false)
	public String getsexo() {
		return sexo;
	}
	public void setsexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "ocupacion", nullable = false)
	public String getocupacion() {
		return ocupacion;
	}
	public void setocupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	
	@Column(name = "telefono", nullable = false)
	public Long gettelefono() {
		return telefono;
	}
	public void settelefono(Long telefono) {
		this.telefono = telefono;
	}
	
	@Column(name = "fecha", nullable = false)
	public String getfecha() {
		return fecha;
	}
	public void setfecha(String fecha) {
		this.fecha = fecha;
	}

	@Column(name = "hora", nullable = false)
	public String gethora() {
		return hora;
	}
	public void sethora(String hora) {
		this.hora = hora;
	}

	@Column(name = "lugar", nullable = false)
	public String getlugar() {
		return lugar;
	}
	public void setlugar(String lugar) {
		this.lugar = lugar;
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

	
}
