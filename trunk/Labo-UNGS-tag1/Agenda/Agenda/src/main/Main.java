package main;
//Saludos a Jaime :P (prueba de Commit)

//otro cambiooo Jaime
import modelo.Agenda;
import presentacion.controlador.Controlador;
import presentacion.vista.Vista;


public class Main 
{

	public static void main(String[] args) 
	{
		Vista vista = new Vista();
		Agenda modelo = new Agenda();
		Controlador controlador = new Controlador(vista, modelo);
		controlador.inicializar();
		//accedi al repoooo!! 
		//repoo 4 pruebaa
	}
}