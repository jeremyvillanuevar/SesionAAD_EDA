
import java.util.Stack;

public class pilapregunta0 {
    public static void main (String args[]){
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(5);
        pila.push(3);
        pila.push(6);
        pila.push(2);
        System.out.println(pila);

        System.out.println("Ejemplo de Extracción");
        //Sacan los valores de la pila
        for (int i=1;i<=5;i++) {
            System.out.println(pila.pop());
        }
        System.out.println(pila);
    }

}
