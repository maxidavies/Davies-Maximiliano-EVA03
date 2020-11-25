package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICorredor, ICiclista, INadador{

	private String distanciaPreferida;
	private TipoDeBicicleta tipo;
	private Integer cantidadDeKilometrosEntrenados;

	public Triatleta(Integer numeroDeSocio, String nombre, String distanciaPreferida, TipoDeBicicleta tipo) {
		super(numeroDeSocio, nombre);
		this.distanciaPreferida = distanciaPreferida;
		this.tipo = tipo;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipo;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipo) {
		this.tipo = tipo;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.cantidadDeKilometrosEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return cantidadDeKilometrosEntrenados;
	}
	
}

