package datos;

import java.util.ArrayList;

public class Profesor {
	
	private int cedula;
	private int edad;
	private String nombre;
	private String email;
	private String especialidad;
	private ArrayList<Grupo> grupos = new ArrayList() ;
	
	
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public ArrayList<Grupo> getGrupo() {
		return grupos;
	}
	public void setGrupo(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
	}
}
