package fernandezdiana_Parcial2;

public class Participante {
	
	private String dni;
	private int puntaje;
	private String nombre;
	private String apellido;
	
	public Participante(String dni,String nombre,String apellido) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setPuntaje(0);
	}
	
	
	private void setDni(String dni) {
		this.dni = dni;
	}
	
	private void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDni(){
		return dni;
	}
	
	
	public String nombreCompleto(){
		return nombre + " " + apellido;
	}
	
	public void sumarUnPunto() {
		this.setPuntaje(this.puntaje + 1);
	}
	
	public int getPuntaje() {
		return puntaje;
	}


	@Override
	public String toString() {
		return "Participante [dni=" + dni + ", puntaje=" + puntaje + ", nombre=" + nombre + ", apellido=" + apellido
				+ "]";
	}
	
	
	
	
	

}
