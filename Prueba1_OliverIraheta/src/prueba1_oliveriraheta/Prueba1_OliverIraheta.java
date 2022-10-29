package prueba1_oliveriraheta;

import java.util.Scanner;

public class Prueba1_OliverIraheta {

  
    public static void main(String[] args) {
        Scanner rm= new Scanner(System.in);
        int opc=0;
        int cont=0;
        int band=1;//El usuario solo va a salir cuando ingrese el #3 por eso estoy usando una bandera
        
        do{
            System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = ");
            System.out.println("Bienvenido a mi primera prueba practica en Java, las opciones son las siguientes: ");
            System.out.println("1. Repetir mi nombre.");
            System.out.println("2. SubMenu de mensajes.");
            System.out.println("3. Salir");
            opc=rm.nextInt();
            cont++;//contador de las veces que se repitio el menu principal
            
            switch (opc){
                case 1:
                    System.out.println("Ingrese que desea repetir el texto");
                    int cant= rm.nextInt();
                    for(int i=1; i<=cant; i++){
                        System.out.println(i+") ¡Hola mi nombre es Oliver Iraheta y miren mi prueba!");
                    }
                    break;
                    
                case 2:
                    int opc2=0;
                    int band2=1;
                    do{
                        System.out.println("Opciones: ");
                        System.out.println("1. Bienvenida");
                        System.out.println("2. Despedida ");
                        System.out.println("3. Salir del submenu");
                        opc2= rm.nextInt();
                            switch(opc2){
                                case 1:
                                    System.out.println("Bienvenid@ a mi SubMenu");
                                    break;
                                    
                                case 2:
                                    System.out.println("Hasta luego, gracias por usar mi programa");
                                    break;
                                    
                                case 3:
                                    band2=0;
                                    break;
                                case 4:
                                    System.out.println("Opcion no valida--Ingrese numero valido");
                                    break;
                            }
                    }while(band2==1);
                    break;
                
                case 3:
                    System.out.println("Adios, esta fue mi prueba");
                    band=0;
                    break;
                
                default:
                    System.out.println("Opcion no valida--Ingrese numero valido");
                    break;
            }
            
        }while(band==1);
        System.out.println("- Veces que se repitio el menu: "+cont);
    }
    
}
