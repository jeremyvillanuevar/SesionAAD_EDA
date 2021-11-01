//Es para traer valores de consola
import java.util.Scanner;
public class AAD2_E1_Jeremy{

    public static void main (String[] args)
    {


        //Se necesita siempre esta inicialización-
        //para obtener valores ingresados por usuario en consola
        Scanner sc = new Scanner(System.in);


        //Inicializar las constantes
        //Unidad Impositiva Tributaria = 3,600.00
        double unidadimpositivatributaria= 4250.00;
        //cantidad de sueldos que percibe la persona al año = 14
        double cantidaddesueldosquepercibelapersonaalaño = 14.0;
        //deducción legal = 7 UIT
        double deduccionlegal = 7 * unidadimpositivatributaria;
        //impuesto = 21%
        double impuesto=0.21;


        //Mostrar mensaje “Ingrese sueldo bruto mensual”
        System.out.println("Ingrese sueldo bruto mensual");
        //Leer sueldo bruto mensual
        double sueldobrutomensual;
        //Scanner obtiene el valor ingresado del usuario
        //se usa .nextLine para obtener un String
        //se usa .nextDouble para obtener un Double
        sueldobrutomensual= sc.nextDouble();

        //Mostrar mensaje “Ingrese monto percibido por concepto de utilidades”
        System.out.println("Ingrese monto percibido por concepto de utilidades");

        //Leer monto percibido por concepto de utilidades
        double montopercibidoporconceptodeutilidades;
        //Scanner obtiene el valor ingresado del usuario
        //se usa .nextLine para obtener un String
        //se usa .nextDouble para obtener un Double
        montopercibidoporconceptodeutilidades= sc.nextDouble();

        //Calcular sueldo anual = utilidad o monto percibido por concepto de utilidades + sueldo bruto mensual * cantidad de sueldos que percibe la persona al año
        double sueldoanual= montopercibidoporconceptodeutilidades + sueldobrutomensual * cantidaddesueldosquepercibelapersonaalaño;

        //Calcular sueldo con deducción (sueldo neto) = sueldo anual - deducción legal
        double sueldoneto = sueldoanual - deduccionlegal;

        //Declaramos la variable en un scope o alcance superior
        double impuestoalarentaquedebepagarporconceptodequintacategoria;
        //Si el sueldo anual < 25200
        if (sueldoanual<deduccionlegal)
        //Entonces
        {
            //el impuesto a la renta que debe pagar por concepto de quinta categoría o monto del impuesto = 0
            impuestoalarentaquedebepagarporconceptodequintacategoria = 0;
        }
        //De lo contrario (sino)
        else
        //Entonces
        {
            //Calcular impuesto a la renta que debe pagar por concepto de quinta categoría o monto del impuesto = impuesto * sueldo neto
            impuestoalarentaquedebepagarporconceptodequintacategoria = impuesto * sueldoneto;
        }
        //Mostrar el mensaje  "Su impuesto a la renta que debe pagar por concepto de quinta categoría es “, en la misma línea, mostrar el valor.
        System.out.println("Su impuesto a la renta que debe pagar por concepto de quinta categoría es "+impuestoalarentaquedebepagarporconceptodequintacategoria);
        System.out.printf("%.2f",impuestoalarentaquedebepagarporconceptodequintacategoria);
        System.out.println("");
    }
}