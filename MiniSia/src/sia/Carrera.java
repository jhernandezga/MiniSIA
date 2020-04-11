package sia;

import java.util.ArrayList;

public class Carrera {
	
	private int creditos;
	private String codigoCarrera;
	private String nombre;
	private Departamento departamento;
	private ArrayList<Estudiante> estudiantes;
	private ArrayList<Asignatura> asignaturasDeCarrera;

	
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

}
