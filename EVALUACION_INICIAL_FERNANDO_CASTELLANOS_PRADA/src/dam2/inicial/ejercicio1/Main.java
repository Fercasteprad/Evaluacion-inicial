package dam2.inicial.ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		String variable = "Tomas Perez CamposTomas Perez Campos";
		int ancho = variable.length()/2;
		String sinError = variable.substring(0,ancho);
		System.out.println(sinError);

	}

}
