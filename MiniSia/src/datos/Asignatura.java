package datos;

import java.util.ArrayList;

public class Asignatura {
	
	private int creditos;
	private String nombre;
	private String tipologia;
	private String codigo;
	private String duracion;
	private Departamento departamento;
	private ArrayList<Grupo> grupos;
	private ArrayList<Carrera> carreras;
	
	public Asignatura()
	{
		nombre = "";
		creditos = 0;
		codigo= "";
		duracion ="";
		departamento = null;
		grupos = new ArrayList<Grupo>();
		carreras = new ArrayList<Carrera>();
	}
	public Asignatura(String pNombre, int pCreditos)
	{
		nombre = pNombre;
		creditos = pCreditos;
		codigo= "";
		duracion ="";
		departamento = null;
		grupos = new ArrayList<Grupo>();
		carreras = new ArrayList<Carrera>();
		
	}
	public Asignatura(String pNombre, String pCodigo)
	{
		nombre = pNombre;
		creditos = 0;
		codigo= "";
		duracion ="";
		departamento = null;
		grupos = new ArrayList<Grupo>();
		carreras = new ArrayList<Carrera>();
	}
	public Asignatura(String pNombre, int pCredito, Departamento pDepartamento)
	{
		nombre = pNombre;
		creditos = pCredito;
		codigo= "";
		duracion ="";
		departamento = pDepartamento;
		grupos = new ArrayList<Grupo>();
		carreras = new ArrayList<Carrera>();
	}
	public Asignatura(String pNombre, String pCodigo, Departamento pDepartamento)
	{
		nombre = pNombre;
		creditos = 0;
		codigo= pCodigo;
		duracion ="";
		departamento = pDepartamento;
		grupos = new ArrayList<Grupo>();
		carreras = new ArrayList<Carrera>();
	}
	
	public Asignatura(int creditos, String nombre, String tipologia, String codigo, String duracion,
			Departamento departamento) {
		super();
		this.creditos = creditos;
		this.nombre = nombre;
		this.tipologia = tipologia;
		this.codigo = codigo;
		this.duracion = duracion;
		this.departamento = departamento;
		grupos = new ArrayList<Grupo>();
		carreras = new ArrayList<Carrera>();
	}
	
	
	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditoss) {
		this.creditos = creditoss;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipologia() {
		return tipologia;
	}
	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public ArrayList<Grupo> getGrupos() {
		return grupos;
	}
	public void asignarGrupo(Grupo grupo) {
		grupos.add(grupo);
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	public void ofrecerACarrera(Carrera carrera) {
		carreras.add(carrera);
	}
	
	@Override
	public String toString() {
		return "nombre= " + nombre+"\ncreditos= " + creditos +"\ntipologia=" + tipologia + "\ncodigo="
				+ codigo + "\nduracion=" + duracion + "\ndepartamento=" + departamento;
	}
	
	

}
