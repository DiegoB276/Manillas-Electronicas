package Mundo;
/*Esta clase es de manillas ilimitadas, necesitamos el numero de manilla, la edad, tipo de entrada.
Llamamos al constructor hecho para manillas ilimitadas (El que no tiene valor).*/

public class ManIlimit extends Manillas {

	public ManIlimit(int numManillaP, int edadP, double valorP, String tipoEntradaP) {
		super(numManillaP, edadP, valorP, tipoEntradaP);
	}

	/*Calcula el precio a cobrar, como es ilimitada no cobra nada, solo cuenta los numeros de accesos*/
	public String calcPrecioManillas(int numManillaP) {
		int accesPisc = 0, accesTob = 0;
		String rta = "";
		if (numManillaP > 0) {
			if (this.tipoEntrada == "Ilimitado") {
				if (this.tipoEntrada == "Piscina") {
					accesPisc++;
					this.cantEntradasPiscina += accesPisc;
					rta = "Cobro realizado";
				} else {
					if (this.tipoEntrada == "Tobogan") {
						accesTob++;
						this.cantEntradasPiscina += accesTob;
						rta = "Cobro realizado";
					} else {
						rta = "Escritura Invalida";
					}
				}
			} else {
				rta = "Escritura Invalida";
			}
		} else {
			rta = "No se aceptan valores negativos";
		}
		return rta;
	}
	
	@Override
	public String toString() {
		String rta1, rta2;
		rta1 = super.toString();
		rta2 = "Entradas a toboganes: " + this.cantEntradasTobogan + "\n" + 
				"Entradas a piscina: " + this.cantEntradasPiscina;
		return rta1 + rta2;
	}
	
}
