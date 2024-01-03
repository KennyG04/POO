package p1examenpracticoriscokennet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONObject;
import java.io.FileNotFoundException;

public class Detergente extends Producto{
    String olor;
    Double peso_neto;
    public void CrearArchivoDetergentes(){
        JSONObject escribir = new JSONObject();
        
        escribir.put("Nombre del Detergente: ", nombre);
        escribir.put("Codigo del detergente: ", codigo_producto);
        
        try(FileWriter escritor = new FileWriter("Detergente.json")){
            escribir.toString();
            System.out.println("El archivo se creo exitosamente con los datos almacenados en las variables");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void agregarDetergente(){
        System.out.println("Ingrese el nombre del detergente: ");
        nombre= scanner.nextLine();
        System.out.println("Ingrese el codigo del detergente: ");
        codigo_producto = scanner.nextInt();
        System.out.println("Ingrese el olor del detergente: ");
        scanner.nextLine();
        olor = scanner.nextLine();
        System.out.println("Ingrese el peso del detergente: ");
        peso_neto = scanner.nextDouble();
        CrearArchivoDetergentes();
        //mostrarDetergente();
    }
    /*public void mostrarDetergente(){
        try(BufferedReader leer = new BufferedReader(new FileReader ("Detergente.json")){
            StringBuilder Lector;
            String linea;
            Leer=leer.readLine(linea);
            System.out.println(linea);
        }catch(IOException e){
            e.printStackTrace();
        }
    }*/
}
