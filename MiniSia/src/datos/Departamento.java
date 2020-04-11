package datos;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String codigo;
	private String coordinador;
	private Facultad facultad;
	private ArrayList<Asignatura> asignaturasOfertadas ;
	private ArrayList<Carrera> carreras;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getCoordinador() {
		return coordinador;
	}
	public void setCoordinador(String coordinador) {
		this.coordinador = coordinador;
	}
	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	public ArrayList<Asignatura> getAsignaturasOfertadas() {
		return asignaturasOfertadas;
	}
	public void setAsignaturasOfertadas(ArrayList<Asignatura> asignaturasOfertadas) {
		this.asignaturasOfertadas = asignaturasOfertadas;
	}
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}
	

}
