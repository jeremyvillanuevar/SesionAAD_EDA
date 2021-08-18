//Esto es para el scanner
import java.util.Scanner;
//Hasta acá
public class pseudocodigo{
    public static void main(String[] args)
    {
        // Inicio
        double areav2;
        int ladox;

        //Esto es para el scanner
        //Inicializar Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado");
        //     Leemos el valor de un lado del cuadrado
        // Sin Scanner
        // ladox=3;
        ladox = sc.nextInt();
        //Hasta acá

        //     Calcular Area del Cuadrado: Area = lado * lado
        areav2 = ladox*ladox;
        //     Mostrar mensaje el "Area es"
        System.out.println("Área es igual a: ");
        //     Mostrar el valor de Area
        System.out.println(areav2);
        // Fin
        System.out.println("Jeremy estuvo aquí");
        System.out.println("System.out.println sirve para enviar mensajes");

    }
}
