//Esto para el random
import java.lang.Math;
//Fin del la librería para el random.
public class pregunta1{
    public static void main(String[] args)
    {
        // Inicio
        int numero;
        int digito;
        int codigo;

        //Esto para el random
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        //Fin del la librería para el random.

        //  Leemos el valor del número
        numero = 28985;
        //  Calcular Dígito: Aleatorio

        //Esto para el random
        digito=  (int)(Math.random() * range) + min;
        //Fin del la librería para el random.

        //  Calcular Código: Código = Número * 10 + Dígito
        codigo=numero*10+digito;
        //  Mostrar mensaje el "Código es"
        System.out.println("Dígito es");
        //  Mostrar el valor de Dígito
        System.out.println(digito);
        //  Mostrar mensaje el "Código es"
        System.out.println("Código es");
        //  Mostrar el valor de Código
        System.out.println(codigo);
        // Fin


    }
}
