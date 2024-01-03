package p1examenpracticoriscokennet;

import java.util.Scanner;

public class Producto extends P1ExamenPracticoRiscoKennet{
    //atributos
    int seleccion;
    int codigo_producto;
    String nombre;
    double precio;
    String[] MenuA={"1. Crear archivo de cereales(CSV)","2. Crear archivo de detergentes(JSON)","3. Ingrese cereales(Arreglos/CSV))","4. Ver lista de cereales(CSV)","5. Ingresa detergente(Arreglos/JSON)","6. Ver lista de detergentes","7. Salir" };
    Scanner scanner = new Scanner(System.in);
    public void Menu(){
        //CONSTRUCTORES
        Cereal cereal = new Cereal();
        Detergente detergente = new Detergente();
        //
        do{
            System.out.println("Bienvenido a nuestra tienda");
            System.out.println("Ingrse la opcion con la que desea trabajar");
            for(int i=0;i<7;i++){
                System.out.println(MenuA[i]);
            }
            /*
            System.out.println("1. Crear archivo de cereales(CSV)");
            System.out.println("2. Crear archivo de detergentes(JSON)");
            System.out.println("3. Ingrese cereales(Arreglos/CSV))");
            System.out.println("4. Ver lista de cereales(CSV)");
            System.out.println("5. Ingresa detergente(Arreglos/JSON)");
            System.out.println("6. Ver lista de detergentes");
            System.out.println("7. Salir");*/
            seleccion = scanner.nextInt();
            while(seleccion<1||seleccion>7){
                System.out.println("Ingrese un valor entre 1 y 7");
                seleccion = scanner.nextInt();
            }
            switch(seleccion){
                case 1:
                    cereal.CrearArchivoCereales();
                    break;
                case 2:
                    detergente.CrearArchivoDetergentes();    
                    break;
                case 3:
                    cereal.agregarCereal();
                    break;
                case 4:
                    cereal.mostrarCereal();
                    break;
                case 5:
                    detergente.agregarDetergente();
                    break;
                case 6:
                    //detergente.mostrarDetergente();
                    break;
                case 7:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.out.println("ERROR SWITCH PRODUCTO");
            }
            
        }while(seleccion!=7);
    }
}
