package datos;

import java.util.ArrayList;

public class Estudiante {
	
	private String nombre;
	private int cedula;
	private int edad;
	private int creditosAprobados;
	private int creditosReprobados;
	private int creditosDisponibles;
	private int matricula;
	private double promedio;
	private String email;
	private ArrayList<Grupo> gruposInscritos; 
	private Carrera carrera;

	public Estudiante(String pNombre)
	{
		nombre = pNombre;
		cedula = 0;
		edad = 0;
		creditosAprobados = 0;
		creditosReprobados = 0;
		matricula = 1;
		promedio = 0;
		email = "";
		carrera=null;
		gruposInscritos = new ArrayList<Grupo>();
		
	}
	public Estudiante(String pNombre, int pCedula)
	{
		nombre = pNombre;
		cedula = cedula;
		edad = 0;
		creditosAprobados = 0;
		creditosReprobados = 0;
		matricula = 1;
		promedio = 0;
		email = "";
		carrera=null;
		gruposInscritos = new ArrayList<Grupo>();
		
	}
	public Estudiante(String pNombre, Carrera pCarrera)
	{
		nombre = pNombre;
		cedula = 0;
		edad = 0;
		creditosAprobados = 0;
		creditosReprobados = 0;
		matricula = 1;
		promedio = 0;
		email = "";
		carrera=pCarrera;
		gruposInscritos = new ArrayList<Grupo>();
	}
	public Estudiante(String pNombre,int pCedula, Carrera pCarrera)
	{
		nombre = pNombre;
		cedula = pCedula;
		edad = 0;
		creditosAprobados = 0;
		creditosReprobados = 0;
		matricula = 1;
		promedio = 0;
		email = "";
		carrera=pCarrera;
		gruposInscritos = new ArrayList<Grupo>();
	}
	
	
	public Estudiante(String nombre, int cedula, int edad, int creditosAprobados, int creditosReprobados,
			int creditosDisponibles, int matricula, double promedio, String email, Carrera carrera) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.edad = edad;
		this.creditosAprobados = creditosAprobados;
		this.creditosReprobados = creditosReprobados;
		this.creditosDisponibles = creditosDisponibles;
		this.matricula = matricula;
		this.promedio = promedio;
		this.email = email;
		this.carrera = carrera;
	}
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
	@Override
	public String toString() {
		return "nombre=" + nombre + "\ncedula=" + cedula + "\nedad=" + edad + "\ncreditosAprobados="
				+ creditosAprobados + "\ncreditosReprobados=" + creditosReprobados + "\ncreditosDisponibles="
				+ creditosDisponibles + "\nmatricula=" + matricula + "\npromedio=" + promedio + "\nemail=" + email
				+ "\ncarrera=" + carrera.getNombre() + "]";
	}
	
}
