
package temaarrays;

import java.util.ArrayList;

public class arraylistseriestv {

   
    public static void main(String[] args) {
       ArrayList<String>listaseries = new ArrayList<>();
       listaseries.add("Breaking Bad");
       listaseries.add("FRIENDS");
       listaseries.add("Vikingos");
       
        
      System.out.println(listaseries);
      
      listaseries.remove("friends");
      
      boolean containfriends = listaseries.contains("friends");
        System.out.println("la lista contiene a friends?;"+ containfriends);
        
        int tamanno = listaseries.size();
        System.out.println("el tamaño del array list es;"+ tamanno);
        
        ArrayList<Integer> listainteger = new ArrayList<>();
        ArrayList<Double> listaDouble = new ArrayList<>();
        ArrayList<Boolean> listabooleanos = new ArrayList<>();
        
    }
    
}