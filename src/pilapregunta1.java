
import java.util.Stack;

public class pilapregunta1 {
    public static void main (String args[]){
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(5);
        pila.push(3);
        pila.push(6);
        pila.push(2);
        System.out.println(pila);

        Stack<Integer> pilatemporal = new Stack<>();
        int contador=0;
        System.out.println("Cantidad de Elementos de Pila: "+pila.size());
        while ((!pila.isEmpty())&&pila.size()!=1) {
            contador++;
            if (pila.size()!=1)
            {
                int elementotemp = pila.pop();
                pilatemporal.push(elementotemp);

            }
        }

        Stack<Integer> pilatemporal2 = new Stack<>();
        int tamanopilatemporal=pilatemporal.size();
        for (int i=1;i<=tamanopilatemporal;i++) {
            pilatemporal2.push(pilatemporal.pop());
        }
        pilatemporal2.push(pila.pop());
        System.out.println(pila);
        System.out.println(pilatemporal);
        System.out.println(pilatemporal2);
    }

}
