package datos;

import java.util.ArrayList;

public class Grupo {
	
	private int numeroGrupo;
	private int cupos;
	private String aula;
	private String horario;
	private Profesor profesor;
	private Asignatura asignatura;
	private ArrayList<Estudiante> estudiantesInscritos;
	
	public Grupo(int numeroGrupo)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = 0;
		this.aula ="";
		this.horario = "";
		this.profesor = null;
		this.asignatura = null;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	public Grupo(int numeroGrupo, int cupos)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = cupos;
		this.aula ="";
		this.horario = "";
		this.profesor = null;
		this.asignatura = null;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	public Grupo(int numeroGrup, int cupos, String aula)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = cupos;
		this.aula =aula;
		this.horario = "";
		this.profesor = null;
		this.asignatura = null;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	public Grupo(int numeroGrup, int cupos, Profesor profe)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = cupos;
		this.aula ="";
		this.horario = "";
		this.profesor = profe;
		this.asignatura = null;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	public Grupo(int numeroGrup, int cupos, Asignatura asig)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = cupos;
		this.aula ="";
		this.horario = "";
		this.profesor = null;
		this.asignatura = asig;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	public Grupo(int numeroGrup, Profesor profe, Asignatura asig)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = 0 ;
		this.aula ="";
		this.horario = "";
		this.profesor = profe;
		this.asignatura = asig;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	public Grupo(int numeroGrup, int cupos, String aula,String horario, Profesor profesor, Asignatura asignatura)
	{
		this.numeroGrupo = numeroGrupo;
		this.cupos = cupos;
		this.aula =aula;
		this.horario = horario;
		this.profesor = profesor;
		this.asignatura = asignatura;
		estudiantesInscritos = new ArrayList<Estudiante>();
	}
	
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
	public void inscribirEstudiante(Estudiante pEstudiantes) {
		estudiantesInscritos.add(pEstudiantes);
		cupos--;
	}
	@Override
	public String toString() {
		return "Grupo =" + numeroGrupo + "\ncupos=" + cupos + "\naula=" + aula + "\nhorario=" + horario
				+ "\nprofesor=" + profesor.getNombre() + "\nasignatura=" + asignatura.getNombre();
	}
	
	

}
