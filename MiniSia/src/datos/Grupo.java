package sia;

import java.util.ArrayList;

public class Grupo {
	
	private int numeroGrupo;
	private int cupos;
	private String aula;
	private String horario;
	private Profesor profesor;
	private Asignatura asignatura;
	private ArrayList<Estudiante> estudiantesInscritos;
	
	public int getNumeroGrupo() {
		return numeroGrupo;
	}
	public void setNumeroGrupo(int numeroGrupo) {
		this.numeroGrupo = numeroGrupo;
	}
	public int getCupos() {
		return cupos;
	}
	public void setCupos(int cupos) {
		this.cupos = cupos;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		this.aula = aula;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	public Asignatura getAsignatura() {
		return asignatura;
	}
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public ArrayList<Estudiante> getEstudiantesInscritos() {
		return estudiantesInscritos;
	}
	public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
		this.estudiantesInscritos = estudiantesInscritos;
	}

}
