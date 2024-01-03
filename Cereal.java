package p1examenpracticoriscokennet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Cereal extends Producto{
    int ncer;
    String fecha_caducidad;
    String sabor;
    public void CrearArchivoCereales(){
        String ArchivoCSV = "Cereales.csv";
        try{
            FileWriter archivo = new FileWriter(ArchivoCSV);
            PrintWriter escribir = new PrintWriter(archivo);
            escribir.println("Nombre del cereal: "+nombre);
            escribir.println("Codigo del cereal: "+codigo_producto);
            escribir.close();
            System.out.println("El archivo se creo exitosamente con los datos almacenados en las variables");
            archivo.close();
        }catch(IOException e){
            e.printStackTrace();
            
        }       
    }
    public void agregarCereal(){
        System.out.println("Ingrese el nombre del cereal");
        nombre= scanner.nextLine();
        System.out.println("Ingrese el codigo del cereal;");
        codigo_producto = scanner.nextInt();
        System.out.println("Ingrese la fecha de caducidad del cereal: ");
        scanner.nextLine();
        fecha_caducidad = scanner.nextLine();
        System.out.println("Ingrese el sabor del cereal: ");
        sabor = scanner.nextLine();
        CrearArchivoCereales();
        mostrarCereal();
    }
    public void mostrarCereal(){
        try{
            FileReader archivo = new FileReader("Cereales.csv");
            if(archivo.ready()){
                String linea;
                BufferedReader leer = new BufferedReader(archivo);
                while((linea=leer.readLine())!=null){
                    System.out.println(linea);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
