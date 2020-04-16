package datos;

import java.util.ArrayList;

public class Facultad {
	
	private String nombre;
	private String codigo;
	private ArrayList<Departamento> departamentos;
	
	public Facultad(String nombre) {
		this.nombre = nombre;
		codigo = "";
		departamentos = new ArrayList<Departamento>();
	}
	
	public Facultad(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
		departamentos = new ArrayList<Departamento>();
	}
	public void añadirDepartamento(Departamento pDepartamento)
	{
		departamentos.add(pDepartamento);
	}
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String toString() {
		return "Facultad  de " + nombre + "\ncodigo=" + codigo;
	}

	
	
	
	
	

}
