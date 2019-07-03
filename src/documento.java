import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class documento extends inventario {
	
	private String RUTA = "C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\";
	
	@SuppressWarnings("resource")
	public void guardarInventario() throws IOException, ParseException  {
		
		
		File fichero = new File("C:\\Users\\Marco\\eclipse-workspace\\Inventario\\inventario\\IInventario.json");
		fichero.delete();
		
		FilenameFilter filter=new FilenameFilter(){
			public boolean accept(File dir, String fileName) {
			return fileName.endsWith("csv");
			}
			};
			
			File f=new File(RUTA);
			String [] fileList=f.list(filter);
			 String producto = "IInventario";
			 FileWriter product = new FileWriter(RUTA + producto + ".json");
			 
			 
			for (int i=0; i < fileList.length; i++){

			  String entireFileText = new Scanner(new File(RUTA +fileList[i]))
					  
			  .useDelimiter("\r\n").next();
			  
			product.write(entireFileText + "\r\n");
			
			}	
			product.close();
			
			System.out.println("--Archivo Generado--");
	}
}
