package fernandezdiana_Parcial2;

public class Test {

	public static void main(String[] args) {
		
		Concurso ortBakers = new Concurso("Quarantine Bakers");
				
//			1. Agregar participante con dni 14723980, nombre Agustina y apellido González
			pudoAgregar(ortBakers.agregarParticipante("14723980", "Agustina", "Gonzalez"));
			
//			2. Agregar participante con dni 14723980, nombre Samantha y apellido Pérez. (No debería
//			agregarse a la lista ya hay un concursante con ese dni)
			pudoAgregar(ortBakers.agregarParticipante("14723980", "Samantha", "Perez"));

//			3. Agregar participante con dni 36581454, nombre Damian y apellido Martínez
			pudoAgregar(ortBakers.agregarParticipante("36581454", "Damian", "Martínez"));

//			4. Agregar participante con dni 17606987, nombre Martina y apellido Luna
			pudoAgregar(ortBakers.agregarParticipante("17606987", "Martina", "Luna"));

//			5. Agregar participante con dni 33887253, nombre Emilio y apellido Caxi
			pudoAgregar(ortBakers.agregarParticipante("33887253", "Emilio", "Caxi"));

//			6. Comenzar la votación. Si el participante existe mostrar su nombre completo; sino mostrar
//			"Voto inválido: Dni inexistente".
//			a. Votar por el dni 123456789 una vez (debe fallar porque no existe).
			ortBakers.votarParticipante("123456789");
			
//			b. Votar por el dni 14723980 una vez.
			ortBakers.votarParticipante("14723980");

//			c. Votar por el dni 36581454 tres veces.
			ortBakers.votarParticipante("36581454");
			ortBakers.votarParticipante("36581454");
			ortBakers.votarParticipante("36581454");
			
//			d. Votar por el dni 17606987 una vez
			ortBakers.votarParticipante("17606987");
			
//			e. Votar por el dni 33887253 dos veces
			ortBakers.votarParticipante("33887253");
			ortBakers.votarParticipante("33887253");
			
//			7. Mostrar la cantidad total de participantes
			System.out.println(ortBakers.cantidadParticipantes());
			
//			8. Eliminar el participante con dni 17606987
			pudoEliminar(ortBakers.eliminarParticipante("17606987"));
			
//			9. Eliminar el participante con dni 99999999. Debe decir “No se pudo eliminar participante con
//			dni 99999999”.
			pudoEliminar(ortBakers.eliminarParticipante("99999999"));
			
//			10. Mostrar nuevamente la cantidad total de participantes
			System.out.println(ortBakers.cantidadParticipantes());

//			11. Llamar al método pedido en el cuestionario para listar los participantes.
			ortBakers.listarParticipantesConPuntajeIgualA(3);
			ortBakers.listarParticipantesConPuntajeIgualA(10);
			
//			12. Mostrar el dato del ganador según lo pedido en el cuestionario. Debería corresponder a
//			Damián Martínez, dni 36581454
			ortBakers.mejorPuntaje();
		
		
		
	}
	
	
	public static void pudoAgregar(boolean agregar){
		if (agregar == true) {
			System.out.println("Se agregó participante");
		}else {
			System.out.println("Ya existía un participante con ese DNI");
		}
	}
	
	
	public static void pudoEliminar (boolean eliminar){
		if (eliminar == true) {
			System.out.println("Se eliminó participante");
		}else {
			System.out.println("No se pudo eliminar participante con ese DNI");
		}
	}
	
	

}
