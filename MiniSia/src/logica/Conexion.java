package logica;

import java.util.ArrayList;

import datos.Carrera;
import datos.Departamento;
import datos.Estudiante;
import datos.Facultad;
import datos.Grupo;
import datos.Profesor;
import datos.Asignatura;
import UI.Interfaz;

public class Conexion {
	
	
	public static void main(String[] XD)
	{ 
		//INSTACIACIÓN
		//estas listas son para instanciar con nombres y apellidos aleatorios||cuando se armen los constructores
		Estudiante estudiantes[] = new Estudiante[6];
		Profesor profesores[] = new Profesor[2];
		Carrera carreras[] = new Carrera[4];
		Asignatura asignaturas[] = new Asignatura[4];
		Departamento departamentos[] = new Departamento[3];
		Facultad facultades[] = new Facultad[2];
		Grupo grupos[] = new Grupo[2];
		
		Facultad ingeniería = new Facultad("Facultad de Ingeniería","1B11");
		Facultad ciencias = new Facultad("Facultad de de Ciencias");
		facultades[0] = ingeniería;
		facultades[1] = ciencias;
		
		Departamento depElectrica = new Departamento("Dept. Ingeniería eléctrica y electrónica","2545Ae","José Eclipse",ingeniería);
		Departamento depSistemas = new Departamento("Dept. Ingeniería sistemas e industrial",ingeniería);
		Departamento depMatematicas = new Departamento("Dept. Matemáticas",ciencias);
		departamentos[0] = depElectrica;
		departamentos[1] = depSistemas;
		departamentos[2] = depMatematicas;
		
		
		Carrera electronica = new Carrera("Ingeniería Electrónica",172,"1234",depElectrica);
		Carrera sistemas = new Carrera("Ingeniería de Sistemas",168,depSistemas);
		Carrera industrial = new Carrera("Ingeniería Industrial",14,"asd",depSistemas);
		Carrera matematicas = new Carrera("Matematicas",143,depMatematicas);
		carreras[0]=electronica;
		carreras[1]=sistemas;
		carreras[2]=industrial;
		carreras[3]=matematicas;
		
		Profesor profe1 = new Profesor("Jorge ASASD",1324568,58);
		Profesor profe2 = new Profesor("Pedro jksaie",1324568,58);
		profesores[0]=profe1;
		profesores[1]=profe2;
		
		asignaturas[0] = new Asignatura("POO",3,depSistemas);
		asignaturas[1] = new Asignatura("Calculo",4,depMatematicas);
		asignaturas[2] = new Asignatura("Circuitos",4);
		asignaturas[3] = new Asignatura("Ingeco","46as");
		
		
		estudiantes[0]=new Estudiante("Jose mnns",78946,electronica);
		estudiantes[1]=new Estudiante("Maria mnns",14546,sistemas);
		estudiantes[2]=new Estudiante("koja mnsns",78178946);
		estudiantes[3]=new Estudiante("Raton skja",2378946,matematicas);
		estudiantes[4]=new Estudiante("Ruben Gonzales",industrial);
		estudiantes[5]=new Estudiante("Eduaro Carriazo",25478946,electronica);
		
		grupos[0] = new Grupo(1,profesores[0],asignaturas[0]);
		grupos[1] = new Grupo(16,45,asignaturas[2]);
		
		
		profe1.setEmail("asdjas@gmail.com");
		estudiantes[4].setCreditosAprobados(145);
		estudiantes[0].setCreditosDisponibles(158);
		profe1.setEspecialidad("Computación");
		
		
		
		//INTERACCION CON USUARIO
		int seleccion;
		do {
			Interfaz.iniciar();
			Interfaz.MostrarMenuInicio();
			seleccion = Interfaz.seleccionar();
			
			switch(seleccion)
			{
				case 1:
					ver(carreras);
					detallar(carreras.length,Interfaz.seleccionar(),carreras);
					break;
				case 2:
					ver(asignaturas);
					detallar(asignaturas.length,Interfaz.seleccionar(),asignaturas);
					break;
				case 3:
					ver(estudiantes);
					detallar(estudiantes.length,Interfaz.seleccionar(),estudiantes);
					break;
				case 4:
					ver(profesores);
					detallar(profesores.length,Interfaz.seleccionar(),profesores);
					
					break;
				case 5:
					ver(departamentos);
					detallar(departamentos.length,Interfaz.seleccionar(),departamentos);
					break;
				case 6:
					ver(facultades);
					detallar(facultades.length,Interfaz.seleccionar(),facultades);
					break;
				case 7:
					ver(grupos);
					detallar(grupos.length,Interfaz.seleccionar(),grupos);
					break;
				case 0:
					break;
				default:
					System.out.println("Ingrese una opción válida");
			
			}
			
		}while(seleccion != 0);
		
	}
	
	
	
	//FUNCIONES AUXILIARES
	
	public static void ver(Estudiante estudiantes[])
	{
		for(int i = 0; i<estudiantes.length;i++)
		{
			System.out.println((i+1)+". "+estudiantes[i].getNombre());
		}
		Interfaz.preguntarAccion();
	}
	public  static void ver(Profesor profesores[])
	{
		for(int i = 0; i<profesores.length;i++)
		{
			System.out.println((i+1)+". "+profesores[i].getNombre());
		}
		Interfaz.preguntarAccion();
		
	}
	public static void ver(Carrera carreras[])
	{
		for(int i = 0; i<carreras.length;i++)
		{
			System.out.println((i+1)+". "+carreras[i].getNombre());
		}	
		Interfaz.preguntarAccion();
	}
	public static void ver(Asignatura asignaturas[])
	{
		for(int i = 0; i<asignaturas.length;i++)
		{
			System.out.println((i+1)+". "+asignaturas[i].getNombre());
		}
		Interfaz.preguntarAccion();
	}
	public static void ver(Grupo grupo[])
	{
		for(int i = 0; i<grupo.length;i++)
		{
			System.out.println((i+1)+". "+grupo[i].getNumeroGrupo());
		}
		Interfaz.preguntarAccion();
	}
	public static void ver(Facultad asignaturas[])
	{
		for(int i = 0; i<asignaturas.length;i++)
		{
			System.out.println((i+1)+". "+asignaturas[i].getNombre());
		}
		Interfaz.preguntarAccion();
	}
	public static void ver(Departamento asignaturas[])
	{
		for(int i = 0; i<asignaturas.length;i++)
		{
			System.out.println((i+1)+". "+asignaturas[i].getNombre());
		}
		Interfaz.preguntarAccion();
	}
	
	public static void detallar(int limite,int indice,Object arreglo[])
	{
		int select = indice;
		if((select <= limite)&&(select!= 0))
		{
			System.out.println(arreglo[indice-1]);
			System.out.println("\n\nPresione cualquier numero para volver al menú principal");
			Interfaz.seleccionar();
		}
		else if(select!= 0)
		{
			System.out.println("\nSeleccione una opcion valida");
			detallar(limite,Interfaz.seleccionar(),arreglo);
			
		}
		
	}

}
