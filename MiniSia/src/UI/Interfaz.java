package UI;

import java.util.Scanner;

public class Interfaz {

	public static void iniciar()
	{
		System.out.println("---------Bienvenido al Mini SIA-------");
		
	}
	public static int MostrarMenuInicio()
	{
		System.out.println("\nSelecciona una opción:");
		System.out.println("1. Ver carreras \n2. Ver las asignaturas\n3. Ver todos los estudiantes\n4. Ver todos los profesores\5.salir");
		Scanner entrada = new Scanner(System.in);
		int seleccion = entrada.nextInt();
		return seleccion;
	}
	
	public static void preguntarAccion()
	{
		System.out.println("Seleccione el número para ver a detalle o 0 para menu anterior 0 -1 para menu principal");
	}
	public static int seleccionar()
	{
		Scanner entrada = new Scanner(System.in);
		int seleccion = entrada.nextInt();
		return seleccion;
	}

}
