package dam2.inicial.ejercicio3;

public class Contacto {
	
	private String nombre;
	private String correo;
	private int numero;
	
	public Contacto(String nombre, String correo, int numero) {
		
		this.nombre = nombre;
		this.correo = correo;
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Contacto() {
		
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", correo=" + correo + ", numero=" + numero + "]";
	}
	
	

}
