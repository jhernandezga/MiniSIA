package datos;

import java.util.ArrayList;

public class Departamento {
	private String nombre;
	private String codigo;
	private String coordinador;
	private Facultad facultad;
	private ArrayList<Asignatura> asignaturasOfertadas ;
	private ArrayList<Carrera> carreras;
	
	public Departamento(String pNombre)
	{
		nombre = pNombre;
		codigo ="";
		coordinador = "";
		facultad = null;
		asignaturasOfertadas = new ArrayList<Asignatura>();
		carreras = new ArrayList<Carrera>();
	}
	public Departamento(String pNombre, Facultad pFacultad)
	{
		nombre = pNombre;
		codigo ="";
		coordinador = "";
		facultad = pFacultad;
		asignaturasOfertadas = new ArrayList<Asignatura>();
		carreras = new ArrayList<Carrera>();
	}
	public Departamento(String pNombre, String pCodigo,Facultad pFacultad)
	{
		nombre = pNombre;
		codigo =pCodigo;
		coordinador = "";
		facultad = pFacultad;
		asignaturasOfertadas = new ArrayList<Asignatura>();
		carreras = new ArrayList<Carrera>();
	}
	
	
	public Departamento(String nombre, String codigo, String coordinador, Facultad facultad) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.coordinador = coordinador;
		this.facultad = facultad;
	}
	
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
	public void añadirAsignaturaOfertada(Asignatura pAsignatura) {
		asignaturasOfertadas.add(pAsignatura);
	}
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	public void añadirCarrera(Carrera carrera) {
		carreras.add(carrera);
	}
	@Override
	public String toString() {
		return "nombre=" + nombre + "\ncodigo=" + codigo + "\ncoordinador=" + coordinador + "\nfacultad="
				+ facultad + "]";
	}
	
	

}
