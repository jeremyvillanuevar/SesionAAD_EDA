import java.util.Queue;
import java.util.LinkedList;
import java.lang.Math;
public class colapregunta0 {


    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        int n = 10;
        //Esto para el random
        int max = 99;
        int min = 1;
        int range = max - min + 1;
        //Fin del la librería para el random.
        int r;
        for(int i=1; i<=n; i++){
            //Esto para el random
            r=  (int)(Math.random() * range) + min;
            //Fin del la librería para el random.
            cola.add(r);
        }
        System.out.println(cola);
        int suma =0;
        for(int i=1; i<=n; i++){
            suma = suma + cola.remove();
        }
        System.out.println(cola);
        System.out.println("Suma: " + suma);


    }



}
