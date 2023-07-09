import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("numeros y letras");
        Scanner datos= new Scanner (System.in);
        int num;
         System.out.println("ingrese un numero del 1 al 5:");
		num = datos.nextInt();
		switch (num) {
		case 1:
			System.out.println("el numero ingresado es: UNO");
			break;
		case 2:
			System.out.println("el numero ingresado es: DOS");
			break;
		case 3:
			System.out.println("el numero ingresado es: TRES");
					
			break;
		case 4:
			System.out.println("el numero ingresado es: CUATRO");
			break;
		case 5:
			System.out.println("el numero ingresado es: CINCO");
			break;
		default:
			System.out.println("el numero ingresado no es correcto");
			// System.out.println("gracias por participar");
		}



    }
}
