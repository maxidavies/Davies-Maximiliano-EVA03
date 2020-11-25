package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<Deportista>();
		this.competencias = new HashMap<String, Evento>();
	}

	public Boolean agregarDeportista(Deportista deportista) {
		return socios.add(deportista);
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipoDeEvento, String nombre) {
		competencias.put(nombre, new Evento(tipoDeEvento));
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		Integer numeroInscriptos = 0;
		Evento nuevo = competencias.get(nombreEvento);

		switch (nuevo.getTipo()) {
		case CARRERA_5K:
			if (deportista instanceof ICorredor)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case CARRERA_10K:
			if (deportista instanceof ICorredor)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case CARRERA_21K:
			if (deportista instanceof ICorredor)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case CARRERA_42K:
			if (deportista instanceof ICorredor)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case DUATLON:
			if (deportista instanceof ICiclista)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case CARRERA_NATACION_EN_PICINA:
			if (deportista instanceof INadador)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if (deportista instanceof INadador)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case TRIATLON_SHORT:
			if (deportista instanceof INadador)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case TRIATLON_OLIMPICO:
			if (deportista instanceof INadador)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case TRIATLON_MEDIO:
			if (deportista instanceof INadador)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		case TRIATLON_IRONMAN:
			if (deportista instanceof INadador)
				numeroInscriptos = nuevo.agregarParticipante(deportista);
			else
				throw new NoEstaPreparado();
			break;
		}
		return numeroInscriptos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
