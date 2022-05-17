package Mundo;

import java.util.*;

public class ControlManillas{

	ArrayList<Manillas> manNormal;
	ArrayList<Manillas> manIlimit;

	public ControlManillas() {
		this.manNormal = new ArrayList<Manillas>();
		this.manIlimit = new ArrayList<Manillas>();
	}

	// Verifica que la manilla normal exista, si existe retorna la posicion, y si no, retorna -1.
	public int buscarManillasNormal(int numManillaP) {
		int rta = 0;
		for (int i = 0; i < this.manNormal.size(); i++) {
			if (numManillaP > 0) {
				if (numManillaP == this.manNormal.get(i).getNumManilla()) {
					rta = i;
				} else {
					rta = -1;
				}
			} else {
				rta = -1;
			}

		}
		return rta;
	}
	
	// Verifica que la manilla ilimitada exista, si existe retorna la posicion, y si no, retorna -1.
	public int buscarManillasIlimit(int numManillaP) {
		int rta = 0;
		for (int i = 0; i < this.manIlimit.size(); i++) {
			if (numManillaP > 0) {
				if (numManillaP == this.manIlimit.get(i).getNumManilla()) {
					rta = i;
				} else {
					rta = -1;
				}
			} else {
				rta = -1;
			}
		}
		return rta;
	}
	
	//Creacion de la manilla normal
	public String crearManNormal(int numManillaP, int edadP, double valorP, String tipoEntradaP) {
		int valManillaNormal = buscarManillasNormal(numManillaP);
		String rta = "";
		if(numManillaP > 0 && edadP > 0 && valorP > 0 ) {
			if(valManillaNormal > -1) {
				ManNormales aux = new ManNormales(numManillaP, edadP, valorP, tipoEntradaP);
				this.manNormal.add(aux);
				rta = "Manilla creada exitosamente";
			}else {
				rta = "No se encontró la manilla";
			}
		}else {
			rta = "No se aceptan valores negativos";
		}
		return rta;
	}
	
	//Creacion de la manilla ilimitada
	public String crearManIlimit(int numManillaP, int edadP, double valorP, String tipoEntradaP) {
		int valManillasIlimit = buscarManillasNormal(numManillaP);
		String rta = "";
		if(numManillaP > 0 && edadP > 0 && valorP > 0 ) {
			if(valManillasIlimit > -1) {
				ManNormales aux = new ManNormales(numManillaP, edadP, valorP, tipoEntradaP);
				this.manIlimit.add(aux);
				rta = "Manilla creada exitosamente";
			}else {
				rta = "No se encontró la manilla";
			}
		}else {
			rta = "No se aceptan valores negativos";
		}
		return rta;
	}
	
	//Acceder a la piscina
	public String accesPiscinaTobogan(int numManilla) {
		String rta = "";
		int valManiNormal = buscarManillasNormal(numManilla);
		int valManiIlimit = buscarManillasIlimit(numManilla);
		if(numManilla > 0) {
			if(valManiNormal > -1) {
				this.manNormal.get(valManiNormal).calcPrecioManillas(numManilla);
			}else {
				if(valManiIlimit > -1) {
					this.manIlimit.get(valManiIlimit).calcPrecioManillas(numManilla);
				}else {
					rta = "La manilla no existe";
				}
			}
		}else {
			rta = "No se aceptan valores negativos";
		}
		return rta;
	}
	
	public String consultarInfoManilla(int numManilla) {
		String rta = "";
		int valNormal = buscarManillasNormal(numManilla);
		int valIlimit = buscarManillasIlimit(numManilla);
		if(numManilla > 0) {
			if(valNormal > -1) {
				this.manNormal.get(valNormal).toString();
			}else {
				if(valIlimit > -1) {
					this.manIlimit.get(valIlimit).toString();
				}else {
					rta = "La manilla no existe";
				}
			}
		}else {
			rta = "No se reciben numeros negativos";
		}
		return rta;
	}
}
