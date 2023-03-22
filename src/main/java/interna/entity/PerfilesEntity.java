package interna.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "perfiles")
public class PerfilesEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private Integer matricula;
	private String nombre;
	private String paterno;
	private String materno;
	private Integer acceso;
	private String sexo;
	private String email;
	private String passwd;
	private Integer rol;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public Integer getAcceso() {
		return acceso;
	}
	public void setAcceso(Integer acceso) {
		this.acceso = acceso;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Integer getRol() {
		return rol;
	}
	public void setRol(Integer rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "PerfilesEntity [id=" + id + ", matricula=" + matricula + ", nombre=" + nombre + ", paterno=" + paterno
				+ ", materno=" + materno + ", acceso=" + acceso + ", sexo=" + sexo + ", email=" + email + ", passwd="
				+ passwd + ", rol=" + rol + "]";
	}
	public PerfilesEntity() {
		super();
	}
	public PerfilesEntity(Integer id, Integer matricula, String nombre, String paterno, String materno, Integer acceso,
			String sexo, String email, String passwd, Integer rol) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.acceso = acceso;
		this.sexo = sexo;
		this.email = email;
		this.passwd = passwd;
		this.rol = rol;
	}
	

}
