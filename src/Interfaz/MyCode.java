package Interfaz;
import Mundo.*;
import java.util.*;

public class MyCode {
	public static void main(String[] args) {
		
		ControlManillas con = new ControlManillas();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		
		//Menu
		do {
			
			System.out.println("---Menu---\n" + 
							"1. Crear una manilla normal" + "\n" + 
							"2. Crear una manilla ilimitada" + "\n" + 
							"3. Acceder a piscina o tobogan" + "\n" +
							"4. Recargar valor a manilla normal" + "\n" + 
							"5. Consultar la información de una manilla" + "\n" +
							"6. Informe");
			
			op = sc.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("Escribe el codigo");
				int readCode = sc.nextInt();
				System.out.println("Escribe la edad");
				int readEdad = sc.nextInt();
				System.out.println("Escribe el valor");
				double readVal = sc.nextInt();
				System.out.println("Tipo de entrada (Piscina o Tobogan)");
				String readTipoInt = sc.next();
				System.out.println(con.crearManNormal(readCode, readEdad, readVal, readTipoInt));
				break;
			case 2:
				System.out.println("Escribe el codigo");
				int readCodeIlimit = sc.nextInt();
				System.out.println("Escribe la edad");
				int readEdadIlimit = sc.nextInt();
				System.out.println("Escribe el valor");
				double readValIlimit = sc.nextInt();
				System.out.println("Tipo de entrada (Piscina o Tobogan)");
				String readTipoIntIlimit = sc.next();
				System.out.println(con.crearManIlimit(readCodeIlimit, readEdadIlimit, readValIlimit, readTipoIntIlimit));
				break;
			case 3:
				System.out.println("Escribe el codigo de la manilla");
				int readcodeMan = sc.nextInt();
				System.out.println(con.accesPiscinaTobogan(readcodeMan));
				break;
			case 4:
				break;
			case 5:
				System.out.println("Escribe el codigo de la manilla");
				int readCodeInfo = sc.nextInt();
				System.out.println(con.consultarInfoManilla(readCodeInfo));
				break;
			case 6:
				break;
			}
			
		}while(op != 100);
	}

}
