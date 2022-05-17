package Mundo;

import java.util.*;

public abstract class Manillas {
	
	protected String tipo;
	protected int numManilla;
	protected int edad;
	protected double valorDinero;
	protected int cantEntradasPiscina;
	protected int cantEntradasTobogan;
	protected String tipoEntrada;
	
	//Constructor para manillas normales
	public Manillas(int numManillaP, int edadP, double valorP, String tipoEntradaP){//, int cantPiscinaP, int cantToboganP) {
		this.tipo = "Normal";
		this.numManilla = numManillaP;
		this.edad = edadP;
		this.valorDinero = valorP;
		this.cantEntradasPiscina = 0; //cantPiscinaP;
		this.cantEntradasTobogan = 0; //cantToboganP;
		this.tipoEntrada = tipoEntradaP;
	}
	
	//Constructor para manillas ilimitadas
	public Manillas(int numManillaP, int edadP, String tipoEntradaP) {//, int cantPiscinaP, int cantToboganP) {
		this.tipo = "Ilimitada";
		this.numManilla = numManillaP;
		this.edad = edadP;
		this.cantEntradasPiscina = 0; //cantPiscinaP;
		this.cantEntradasTobogan = 0; //cantToboganP;
		this.tipoEntrada = tipoEntradaP;
	}
	
	//----GETTERS AND SETTERS
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumManilla() {
		return numManilla;
	}

	public void setNumManilla(int numManilla) {
		this.numManilla = numManilla;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getValorDinero() {
		return valorDinero;
	}

	public void setValorDinero(double valorDinero) {
		this.valorDinero = valorDinero;
	}

	public int getCantEntradasPiscina() {
		return cantEntradasPiscina;
	}

	public void setCantEntradasPiscina(int cantEntradasPiscina) {
		this.cantEntradasPiscina = cantEntradasPiscina;
	}

	public int getCantEntradasTobogan() {
		return cantEntradasTobogan;
	}

	public void setCantEntradasTobogan(int cantEntradasTobogan) {
		this.cantEntradasTobogan = cantEntradasTobogan;
	}
	
	public String getTipoEntrada() {
		return tipoEntrada;
	}

	public void setTipoEntrada(String tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}

	@Override
	public String toString() {
		return "Numero de Manilla: " + this.numManilla + "\n" + 
				"Edad: " + this.edad + "\n" + 
				"Tipo de Manilla: " + this.tipo + "\n" + 
				"Cantidad entradas a Piscina: " + this.cantEntradasPiscina + "\n" + 
				"Cantidad entradas a Tobogan: " + this.cantEntradasTobogan;
	}
	
	public abstract String calcPrecioManillas(int idManilla);
}


/*
public class ControlManillas{

	
*/
