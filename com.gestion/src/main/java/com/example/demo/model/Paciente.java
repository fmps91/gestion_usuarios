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
@Table(name = "paciente", schema = "public")
public class Paciente {

	private long id;
	private String nombre;
	private long num_emergencia;
	private String fec_nacimiento;
	private long id_Paciente;

	public Paciente() {

	}

	public Paciente(String nombre, long num_emergencia,String fec_nacimiento, long id_Paciente) {
		this.nombre = nombre;
		this.num_emergencia = num_emergencia;

		this.fec_nacimiento = fec_nacimiento;

		this.id_Paciente = id_Paciente;
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

	@Column(name = "num_emergencia", nullable = false)
	public Long getnum_emergencia() {
		return num_emergencia;
	}

	public void setnum_emergencia(Long num_emergencia) {
		this.num_emergencia = num_emergencia;
	}

	@Column(name = "fec_nacimiento", nullable = false)
	public String getfec_nacimiento() {
		return fec_nacimiento;
	}

	public void setfec_nacimiento(String fec_nacimiento) {
		this.fec_nacimiento = fec_nacimiento;
	}

	@Column(name = "id_Paciente", nullable = false)
	public Long getid_Paciente() {
		return id_Paciente;
	}

	public void setid_Paciente(Long id_Paciente) {
		this.id_Paciente = id_Paciente;
	}

}
