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
	public void setGrupos(ArrayList<Grupo> grupos) {
		this.grupos = grupos;
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
	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	

}
