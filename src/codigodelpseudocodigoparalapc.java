
import java.util.Scanner;

public class codigodelpseudocodigoparalapc {
    public static void main(String[] args){
        //Inicio
        //0) Creación de Variables
        //tipo nombre;
        int areadelcuadrado;
        int ladoadelcuadrado;
        //1) Leemos el tamaño del valor de lado A del cuadrado
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del lado A");
        ladoadelcuadrado= sc.nextInt();
        //2) Tenemos el tipo de figura que es cuadrado
        //3) Tenemos la fórmula del cálculo del área
        //4) Calcular Área del Cuadrado:
        //4)     Area = (valor de lado A del cuadrado) * (valor de lado A del cuadrado)
        areadelcuadrado=ladoadelcuadrado*ladoadelcuadrado;
        //5) Mostrar mensaje el "Area es"

        System.out.println("Area del cuadrado es:");

        //5) Mostrar el valor de Area
        System.out.println(areadelcuadrado);
        //        Fin


    }
}
