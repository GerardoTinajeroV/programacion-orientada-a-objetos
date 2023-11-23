
package pkg651partidosdefutbol;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Main {
    private static final String nombreArchivo = "partidos.txt";
    
    public static void main(String[] args) {
        ArrayList<partidosfutbol> partidos = new ArrayList<partidosfutbol>();
        
        File archivo=new File( nombreArchivo);
        Scanner s = null;
        
        try{
            s = new Scanner(archivo);
            while(s.hasNextLine()){
               String linea = s.nextLine();
               String [] CortarString = linea.split("::");
               
               //mapeo de array con objetos dela clase partidos de futbol
               partidosfutbol partido = new partidosfutbol();
               partido.setEquipoLocal(CortarString[0]);
               partido.setEquipoVisitante(CortarString[1]);
               partido.setGolesLocal(Integer.parseInt(CortarString[2]));
               partido.setGolesVisitante(Integer.parseInt(CortarString[3]));
               
               
              partidos.add(partido);
       }
            
        } catch(Exception e){
            e.printStackTrace();
        }
      
        System.out.println("Impresion de objeto antes de procesar");
       Iterator<partidosfutbol> itpartidos = partidos.iterator();
       
       while(itpartidos.hasNext()){
           partidosfutbol partido = itpartidos.next();
           System.out.println(partido.getEquipoLocal()+ " " + partido.getEquipoVisitante()+ " "+ partido.getGolesLocal()+ " "+ partido.getGolesVisitante());
       }
       
        System.out.println("");
        
        //examinar partidos empatados
        itpartidos = partidos.iterator();
        while(itpartidos.hasNext()){
            partidosfutbol partido = itpartidos.next();
            
            
          if(partido.getGolesLocal() != partido.getGolesVisitante()){
              
              itpartidos.remove();
              
          }
        }
         System.out.println("");
         
          
        System.out.println("Impresion de objeto antes de procesar");
       itpartidos = partidos.iterator();
       while(itpartidos.hasNext()){
           partidosfutbol partido = itpartidos.next();
           System.out.println(partido.getEquipoLocal()+ " " + partido.getEquipoVisitante()+ " "+ partido.getGolesLocal()+ " "+ partido.getGolesVisitante());
       }
    }
    
    
}
