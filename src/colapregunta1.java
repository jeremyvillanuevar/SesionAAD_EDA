import java.util.LinkedList;
import java.util.Queue;

public class colapregunta1 {


    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        String nombre="Bertha";
        cola.add(nombre);
        String nombre2="Kelly";
        cola.add(nombre2);
        String nombre3="Harold";
        cola.add(nombre3);
        System.out.println(cola);
        for(int i=1; i<=3; i++){
            System.out.println("Extrayendo: " + cola.remove());
        }
        System.out.println(cola);
        System.out.println("Cola Vacía.");


    }



}
