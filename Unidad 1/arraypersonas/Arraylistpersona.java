
package arraylistpersonas;

import java.util.ArrayList;

public class Arraylistpersonas {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<persona> listaspersonas= new ArrayList<>();
        listaspersonas.add(new persona(1,"benito",15));
         listaspersonas.add(new persona(2,"ana",16));
          listaspersonas.add(new persona(3,"ahri",18));
          
          System.out.println(listaspersonas);
          System.out.println("ciclo for");
          for (int i = 0; i < listaspersonas.size(); i++) {
              System.out.println("contenido"+ listaspersonas.get(i).getNombre());
            
        }
          System.out.println("for each");
          for(persona perso:listaspersonas){
              System.out.println("contenido"+ perso.getNombre());
          }
    }
    
}
