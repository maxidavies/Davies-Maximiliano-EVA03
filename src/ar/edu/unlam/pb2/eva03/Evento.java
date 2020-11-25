package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private HashMap<Integer, Deportista> participantes;

	public Evento(TipoDeEvento tipo) {
		this.participantes = new HashMap<Integer, Deportista>();
		this.tipo = tipo;
	}

	public Integer agregarParticipante(Deportista deportista) {
		participantes.put(numeroDeInscripcion, deportista);
		numeroDeInscripcion++;
		return numeroDeInscripcion;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(HashMap<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}

}
