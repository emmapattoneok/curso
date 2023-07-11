package lab03prj06.comercio.src;
import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("COMERCIO");
        
       Scanner datos = new Scanner(System.in);
        String nomb;
        String apell;
        int numCliente;
        int tipoiva;
        float preciolista;
        double alicuota;
        
        double precioventaalicuota;
        double preciofinal;
        boolean exe;
        exe=false;
        System.out.println("ingrese el nombre y apellido");
         nomb= datos.nextLine();  apell= datos.nextLine();
        System.out.println("ingrese el numero de cliente");
        numCliente=datos.nextInt();
        System.out.println("ingrese el monto de la compra");
        preciolista=datos.nextFloat();
        System.out.println("seleccione tipo de iva");
        System.out.println("1: RESPONSABLE INSCRIPTO");
        System.out.println("2: RESPONSABLE NO INSCRIPO");
        System.out.println("3: EXENTO");
        System.out.println("4: CONSUMIDOR FINAL");
        System.out.println("ingrese una opcion");
        tipoiva= datos.nextInt();
         alicuota= (preciolista*21)/100;
         preciofinal=preciolista;
         precioventaalicuota= alicuota+preciofinal;
          System.out.println("codigo de clilente............................."  + numCliente);
                    System.out.println("Nombre de el cliente..........................."  + nomb + apell);
         switch (tipoiva) {
             case 1:
             System.out.println("Tipo de situacion de IVA.................Responsable inscripto" );
             alicuota= (preciolista*21)/100;
           
            break;
         case 2:
         System.out.println("Tipo de situacion de IVA.................Responsable no inscripto" );
         alicuota= (preciolista*21)/100;
        
                 break;
                 case 3:
                  
                     exe=true;

                     break;
               case 4:
                     System.out.println("Tipo de situacion de IVA.................Consumidor final");
             alicuota= (preciolista*21)/100;
            
              break;
                 }
                  
                   if (exe) {
                      System.out.println("Tipo de situacion de IVA.................Exento"  );
                        System.out.println("precio final............................." + preciofinal);
                        exe=true;
                       }
                        
                     else  {
                        
                           System.out.println("Monto de alicuota aplicada.................." + alicuota);
                        System.out.println("Precio final con alicuota................." + precioventaalicuota);
                         
                        }
                    System.out.println("----------------------------------------------");
                    System.out.println("PRECIONE ENTER PARA SALIR");


                     


    }
}
