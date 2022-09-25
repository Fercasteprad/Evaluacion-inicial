package dam2.inicial.ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		ArrayList <Contacto> agenda = new ArrayList<Contacto>();
		Contacto c1 = new Contacto ("Fernando","aa@correo",123456789);
		Contacto c2 = new Contacto ("Alicia","aa@correo",123456789);
		Contacto c3 = new Contacto ("Marcos","aa@correo",123456789);
		agenda.add(c1);
		agenda.add(c2);
		agenda.add(c3);
		
		boolean salir = false;
		Scanner sc = new Scanner (System.in);
		
		do {
			
			System.out.println("Que quieres hacer?");
			System.out.println("1 - Leer contacto");
			System.out.println("2 - Añadir contacto");
			System.out.println("3 - Borrar contacto");
			System.out.println("s - Salir");
			
			String opcion = sc.next();
			
			if (opcion.equals("1")) {
				for (int i = 0; i<agenda.size();i++) {
					Contacto guardaContacto = agenda.get(i);
					System.out.println(guardaContacto.toString());
				}
			}
			else if (opcion.equals("2")) {
				System.out.println("Esbribe el nombre");
				String nombre = sc.next();
				System.out.println("Esbribe el correo");
				String correo = sc.next();
				System.out.println("Esbribe el numero");
				int numero = sc.nextInt();
				Contacto nuevo = new Contacto(nombre,correo,numero);
				agenda.add(nuevo);
			}
			
			else if (opcion.equals("3")) {
				int opcionBorrar = 0;
				do {
					System.out.println("Que contacto quieres borrar?:");
					for (int i = 0; i<agenda.size();i++) {
						Contacto guardaContacto = agenda.get(i);
						System.out.println((i+1)+" - "+guardaContacto.toString());
					}
					
					opcionBorrar = sc.nextInt();
				} while (opcionBorrar < 1 || opcionBorrar > agenda.size());
			
				agenda.remove(opcionBorrar-1);
			}
			
			else if (opcion.equals("s")) {
				System.out.println("Has salido del programa");
				salir = true;
			}
			
			else {
				System.err.println("Por favor elige una opción correcta");
				
			}
		}
		while (!salir);
			
			

	}

}
