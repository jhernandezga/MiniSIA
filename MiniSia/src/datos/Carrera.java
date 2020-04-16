package datos;

import java.util.ArrayList;

public class Carrera {
	
	private String nombre;
	private int creditos;
	private String codigoCarrera;
	private Departamento departamento;
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<Asignatura> asignaturasDeCarrera;
	
	
	public Carrera(String nombre) {
		this.nombre = nombre;
		creditos = 0;
		codigoCarrera = "";
		estudiantes  = new ArrayList<Estudiante>();
		asignaturasDeCarrera = new ArrayList<Asignatura>();
	}
	
	public Carrera(String nombre, int creditos) {
		this.nombre = nombre;
		this.creditos = creditos;
		codigoCarrera = "";
		estudiantes  = new ArrayList<Estudiante>();
		asignaturasDeCarrera = new ArrayList<Asignatura>();
	}
	
	
	public Carrera(String nombre, int creditos, Departamento departamento) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.departamento = departamento;
		estudiantes  = new ArrayList<Estudiante>();
		asignaturasDeCarrera = new ArrayList<Asignatura>();
	}

	public Carrera(String nombre, int creditos, String codigoCarrera, Departamento departamento) {
		this.nombre = nombre;
		this.creditos = creditos;
		this.codigoCarrera = codigoCarrera;
		this.departamento = departamento;
		estudiantes  = new ArrayList<Estudiante>();
		asignaturasDeCarrera = new ArrayList<Asignatura>();
	}

	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	public ArrayList<Asignatura> getAsignaturasDeCarrera() {
		return asignaturasDeCarrera;
	}
	public void setAsignaturasDeCarrera(ArrayList<Asignatura> asignaturasDeCarrera) {
		this.asignaturasDeCarrera = asignaturasDeCarrera;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getCodigoCarrera() {
		return codigoCarrera;
	}
	public void setCodigoCarrera(String codigoCarrera) {
		this.codigoCarrera = codigoCarrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + "\ncreditos=" + creditos + "\ncodigoCarrera=" + codigoCarrera
				+ "\ndepartamento=" + departamento.getNombre();
	}
	

}
