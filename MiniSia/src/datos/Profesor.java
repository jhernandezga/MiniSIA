package datos;

import java.util.ArrayList;

public class Profesor {
	
	private String nombre;
	private int cedula;
	private int edad;
	private String email;
	private String especialidad;
	private ArrayList<Grupo> grupos = new ArrayList<Grupo>() ;
	
	public Profesor(String nombre)
	{
		this.nombre = nombre;
		this.cedula = 0;
		this.edad = 0;
		this.email = "";
		this.especialidad = "";
		grupos = new ArrayList<Grupo>();
	}
	public Profesor(String nombre,int cedula)
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = 0;
		this.email = "";
		this.especialidad = "";
		grupos = new ArrayList<Grupo>();
	}
	public Profesor(String nombre,int cedula, int edad)
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.email = "";
		this.especialidad = "";
		grupos = new ArrayList<Grupo>();
	}
	public Profesor(String nombre,int cedula, int edad, String email)
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.email = email;
		this.especialidad = "";
		grupos = new ArrayList<Grupo>();
	}
	public Profesor(String nombre,int cedula, int edad, String email, String especialidad)
	{
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.email = email;
		this.especialidad = especialidad;
		grupos = new ArrayList<Grupo>();
	}
	
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
	public void asignarGrupo(Grupo grupo)
	{
		this.grupos.add(grupo);
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + "\ncedula=" + cedula + "\nedad=" + edad + "\nemail=" + email
				+ "\nespecialidad=" + especialidad;
	}
	
}
