package promedio;
import java.io.*; //importamos la libreria

public class promedio {

	public static final String delimiter = ",";
	   
	   public static void read(String csvFile) {  //función que lee el archivo y lo almacena en un arreglo
	      try { // funcion que nos permite seguir ejecutando el programa aunque este falle
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         float promT = 0;
	         int cont = 1;
	         while((line = br.readLine()) != null) { // ciclo que separa los estudiantes
	        	 
	        	 float num = 0;
	        	 tempArr = line.split(delimiter);
	        	 for(int i = 2; i<=5;i++) {
	                num += Float.parseFloat(tempArr[i]);
	            }
	        	 
	          float promedio = num /4; //imprimimos el promedio individual de los estudiantes
	          System.out.println("Promedio estudiante "+cont+": "+promedio);
	          promT += promedio;
	          cont ++;
	         }
	         float promeTotal = promT / 19; //imprimimos el promedio total de la clase
	         System.out.println("Promedio total del salón es: "+promeTotal);
	         br.close();
	         
	         } catch(IOException ioe) {// excluimos el error más comun al ejecutar el programa
	            ioe.printStackTrace();
	         }

	   }
	   
	   public static void main(String[] args) { // ejecutamos nuestra función
	      String csvFile = "C:\\Users\\User\\eclipse-workspace\\promedio\\src\\promedio\\PromedioCSV.csv";
	      promedio.read(csvFile);
	      
	   }
	}
