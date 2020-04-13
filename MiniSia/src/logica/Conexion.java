package logica;

import java.util.ArrayList;

import datos.Carrera;
import datos.Estudiante;
import datos.Profesor;
import datos.Asignatura;
import UI.Interfaz;

public class Conexion {
	
	
	public static void main(String[] XD)
	{ 
		//INSTACIACIÓN
		//estas listas son para instanciar con nombres y apellidos aleatorios||cuando se armen los constructores
		String nombres[] = {"andres","ana","valentina","jose","alexei","carlos","ruben","diego"};
		String apellidos[] = {"Gonzales","Rojas","Camargo","Rodriguez","King","Papastathopoulos","qwerty"};
		
		Estudiante estudiantes[] = new Estudiante[7];
		Profesor profesores[] = new Profesor[7];
		Carrera carreras[] = new Carrera[7];
		Asignatura asignaturas[] = new Asignatura[7];
		
		for(int i = 0; i<7;i++)
		{
			Estudiante estudiante = new Estudiante();
			Profesor profesor = new Profesor();
			estudiantes[i] = estudiante;
			profesores[i] = profesor;
		}
		
		
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
					break;
				default:
					System.out.println("Ingrese una opción válida");
			
			}
			
		}while(seleccion != 5);
		
	}
	
	
	
	public static void ver(Estudiante estudiantes[])
	{
		for(int i = 0; i<estudiantes.length;i++)
		{
			System.out.println(i+". "+estudiantes[i].getNombre());
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
	
	public static void detallar(int limite,int indice,Object arreglo[])
	{
		if((Interfaz.seleccionar() <= limite)&&(Interfaz.seleccionar() != 0))
		{
			System.out.println(arreglo[indice-1]);
			System.out.println("\n\nPresione cualquier numero para volver al menú principal");
			Interfaz.seleccionar();
		}
		else if(Interfaz.seleccionar() != 0)
		{
			System.out.println("\nSeleccione una opcion valida");
			detallar(limite,Interfaz.seleccionar(),arreglo);
			
		}
		
	}

}
