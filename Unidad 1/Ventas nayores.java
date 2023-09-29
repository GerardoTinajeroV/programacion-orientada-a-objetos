
package temaarrays;
import java.util.Scanner;

public class Temaarrays {

    public static void main(String[] args) {
        //guardar las ventas de 10 dias en un arreglo y determinar cuales son mayores a 2000
        double ventas[] = new double[10];
        Scanner entrada = new Scanner(System.in);
        System.out.println("*******ventas mayores a 2000******");
        System.out.println("ingrese las 10 ventas del mes");
        //llenar el arreglo
        for (int i = 0; i <= ventas.length-1; i++) {
            System.out.println("ingrese la venta"+(i+1)+"");
            ventas[i]=entrada.nextDouble();
            
            
        }
        
        //determinar cuales ventas en el arreglo son mayores o iguales a 2000
        ventasmayores2000(ventas);
    }
    public static void ventasmayores2000(double x[]){
        
     int j=0;
     int total=0;
     double acumuladorventas=0;
        System.out.println("estas son las ventas mayores a 2000");
        //recorrer areglo
        while(j<10){
            if (x[j]>=2000){
                System.out.println("$"+x[j]);
                total++;
              acumuladorventas= acumuladorventas+x[j];
                
            }
            j++;
        }
        System.out.println("el total de las ventas mayores o igual a 2000 es:"+ total);
        System.out.println("el total acumulado es"+ acumuladorventas);
    }
}
