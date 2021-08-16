
import java.lang.Math;
public class pregunta1{
    public static void main(String[] args)
    {
        // Inicio
        int numero;
        int digito;
        int codigo;
        
        int max = 9;
        int min = 1;
        int range = max - min + 1;
          
        //  Leemos el valor del número
        numero = 28985;
        //  Calcular Dígito: Aleatorio
        digito=  (int)(Math.random() * range) + min;
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
