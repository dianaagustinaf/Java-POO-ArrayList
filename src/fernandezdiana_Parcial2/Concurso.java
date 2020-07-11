package fernandezdiana_Parcial2;

import java.util.ArrayList;


public class Concurso {

	private String nombre;
	private ArrayList<Participante> participantes;
	
	
	public Concurso(String nombre){
		this.setNombre(nombre);
		this.participantes = new ArrayList<Participante>();
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//3
	
	private Participante buscarParticipante(String dni){
		Participante participante = null;
		boolean encontrado = false;
		int i = 0;
		
		while (encontrado == false && i < participantes.size()) {
			if (participantes.get(i).getDni().equals(dni)){
				encontrado = true;
				participante = participantes.get(i);
			}else {
				i++;
			}
		}
		return participante;
	}
	
	//4
	
	public boolean agregarParticipante(String dni, String nombre, String apellido) {
		boolean pudoAgregar = false;
		if (buscarParticipante(dni) == null){
			this.participantes.add(new Participante(dni, nombre, apellido));
			pudoAgregar = true;
		}
		return pudoAgregar;
	}

	//5
	
	public boolean eliminarParticipante(String dniAEliminar){
		boolean pudoEliminar = false;
		Participante participanteABorrar;
		participanteABorrar = buscarParticipante(dniAEliminar);
		
		if(participanteABorrar != null){
			this.participantes.remove(participanteABorrar);
			pudoEliminar = true;
		}		
		return pudoEliminar;
	}
	
	//6
	
	public void votarParticipante(String dni){
		boolean pudoVotar = false;
		Participante participanteVotado = buscarParticipante(dni);
		
		if(participanteVotado != null){
			participanteVotado.sumarUnPunto();
			System.out.println("Voto para " + participanteVotado.nombreCompleto());
		}else{
			System.out.println("Voto inválido: Dni inexistente.");
		}
	}	
	
	//7
	
	public int cantidadParticipantes() {
		return this.participantes.size();
	}
	
	
	//8	
	
	public void mejorPuntaje(){
		int puntajePActual;
		int mejorPuntaje = Integer.MIN_VALUE;
		Participante mejorParticipante = null;
		
		if (this.participantes.size() > 0) {
				
			for (Participante p : this.participantes){
				puntajePActual = p.getPuntaje();
			
				if (puntajePActual > mejorPuntaje) {
					mejorPuntaje = puntajePActual;
					mejorParticipante = p;
				}
			}
		System.out.println("El DNI del participante con mejor puntaje es " + mejorParticipante.getDni());
		
		}else{
			System.out.println("No hay participantes inscriptos");
		}
		
	}
	
	//9
	
	public void listarParticipantesConPuntajeIgualA(int puntaje){
		
		int participantesConEsePuntaje = 0;
		
		for (Participante p : this.participantes){
			if (p.getPuntaje() == puntaje) {
				System.out.println(p.toString());
				participantesConEsePuntaje++;
			}
		}
		if (participantesConEsePuntaje == 0) {
			System.out.println("No hay participantes con ese puntaje.");
		}
	}
	 
	
	
}
