package Mundo;

public class ManNormales extends Manillas{

	public ManNormales(int numManillaP, int edadP, double valorP, String tipoEntradaP) {
		super(numManillaP, edadP, valorP, tipoEntradaP);
	}
	
	/*Calcula el precio a descontar, si es acceso a piscina el precio a cobrar es de 1500,
	 * si es acceso a tobogan el precio a cobrar es de 50*/
	public String calcPrecioManillas(int idManilla) {
		int accesPisc = 0, accesTob = 0;
		String rta = "";
		if(idManilla > 0) {
			if(this.tipo == "Normal") {
				if(this.tipoEntrada == "Piscina") {
					this.valorDinero -= 1500;
					accesPisc++;
					this.cantEntradasPiscina += accesPisc;
					rta = "Cobro realizado";
				}else {
					if(this.tipoEntrada == "Tobogan") {
						this.valorDinero -= 50;
						accesTob++;
						this.cantEntradasTobogan += accesTob;
						rta = "Cobro realizado";
					}else {
						rta = "Opcion invalida";
					}
				}
			}else
				rta = "Escritura inválida";
		}else {
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
