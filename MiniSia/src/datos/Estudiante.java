package datos;

import java.util.ArrayList;

public class Estudiante {
	
	private int cedula;
	private int edad;
	private int creditosAprobados;
	private int creditosReprobados;
	private int creditosDisponibles;
	private int matricula;
	private double promedio;
	private String nombre;
	private String email;
	private ArrayList<Grupo> gruposInscritos; 
	private Carrera carrera;

	
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
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
	public int getCreditosAprobados() {
		return creditosAprobados;
	}
	public void setCreditosAprobados(int creditosAprobados) {
		this.creditosAprobados = creditosAprobados;
	}
	public int getCreditosReprobados() {
		return creditosReprobados;
	}
	public void setCreditosReprobados(int creditosReprobados) {
		this.creditosReprobados = creditosReprobados;
	}
	public int getCreditosDisponibles() {
		return creditosDisponibles;
	}
	public void setCreditosDisponibles(int creditosDisponibles) {
		this.creditosDisponibles = creditosDisponibles;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
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
	public ArrayList<Grupo> getGruposInscritos() {
		return gruposInscritos;
	}
	public void setGruposInscritos(ArrayList<Grupo> gruposInscritos) {
		this.gruposInscritos = gruposInscritos;
	}
}
