import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import org.json.simple.parser.ParseException;

import com.opencsv.CSVReader;


public class inventario extends documento{
	static Scanner entradaEscaner = new Scanner (System.in); 
	   public static final String SEPARATOR=";";
	   public static final String QUOTE="\"";
	
	
public static void mostrarInventario() throws IOException, ParseException  {

	
	BufferedReader br = null;
    
    try {
       
       br =new BufferedReader(new FileReader("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\prueba.csv"));
       String line = br.readLine();
       System.out.println("*********Inventario Disponible********** \n");
       while (null!=line) {
          String [] fields = line.split(SEPARATOR);
          System.out.println(Arrays.toString(fields));
          
          line = br.readLine();
       }
    } catch (Exception e) {
       
    } finally {
       if (null!=br) {
          br.close();
       }
       }
	
	
	
	
	
	
	/* JSONParser parser = new JSONParser();

     try {     
         Object obj = parser.parse(new FileReader("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\prueba.json"));

         JSONObject jsonObject =  (JSONObject) obj;

         String name = (String) jsonObject.get(obj);
         System.out.println(obj);
        
       
       
         
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } catch (ParseException e) {
         e.printStackTrace();
     }
    */
    
}






public static void buscarInventario()  {
    		 
    		
	}

public static void eliminarInventario() {

	
	}




public static void agregarArticulo() throws IOException	{	
	
	
	System.out.println("Nombre del articulo a agregar: ");
	String producto = entradaEscaner.nextLine ();
	System.out.println("Cantidad de articulo: ");
	String cantidad = entradaEscaner.nextLine ();
	
	File TextFile = new File("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\prueba.csv"); 
	FileWriter TextOut = new FileWriter(TextFile, true);
	TextOut.write(producto + " -Inventario:"+ cantidad + "\r\n");
	TextOut.close();
	
	System.out.print(producto + " Agregad@ al inventario \n \n");
	

	/*
	JSONObject obj = new JSONObject();	
	obj.put(producto, cantidad);

	try {
		FileWriter file = new FileWriter("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\prueba.json");
		file.write(((Object) obj).toString());
		file.flush();
		file.close();	//8095673939
	} catch (IOException e) {
	}

	System.out.print(obj + "\n");
	*/
		
	}

	}