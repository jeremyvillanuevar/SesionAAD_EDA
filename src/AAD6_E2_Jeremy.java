//package paquete;

//Es para traer valores de consola
import java.util.Scanner;


public class AAD6_E2_Jeremy{


    public static void main (String[] args) {


        //Entrar valores de vendedores
        //String vendedor = "Hugo";
        String [] vendedores = {"Hugo","Mariana","Luis","Jennifer","Jorge","Valeria","Manuel"};
        //Entrar valores de ventas
        int [] ventas = {15,16,1,0,4,15,13};
        //El tamaño del arreglo es cantidad de posiciones = arreglo.length
        //Las posiciones del arreglo comienzan en 0 hasta la cantidad-1

        int suma=CalculoTotaldeVentas(ventas);

        System.out.println("La venta total de unidades es de: "+suma);
        double porcentajecuotaalcanzada=CalculoPorcentajeCuotaAlcanzada(ventas);

        System.out.println("El porcentaje de cuota alcanzada es de: "+porcentajecuotaalcanzada+"%");

        String [] vendedoresalcanzaroncuota=obtenerVendedoresAlcanzanCuota(ventas,vendedores);

        System.out.println("Los que alcanzaron la cuota son los siguientes:");

        for (int i=0;i<=vendedoresalcanzaroncuota.length-1;i++)
        {
            System.out.println("Vendedor: "+vendedoresalcanzaroncuota[i]);
        }

        //int comision = 300*suma;
        int comision = obtenerComision(ventas);
        System.out.println("La comisión es de: "+comision);



        //Ejemplo Tipo EF
        String [] union = unirArreglos(vendedores , ventas);
        for (int i=0;i<=union.length-1;i++)
        {
            System.out.println("Unidos: "+union[i]);
        }
        //Ejemplo Tipo EF 

        String [] zonaVendedores = {"Lima","Huancayo","Huanuco","Huancayo","Huancayo","Huancayo","Huanuco"};
        int ctvz=CalculoTotaldeVentasdeVendedorenZona(vendedores,zonaVendedores,ventas,"Hugo","Lima");
        System.out.println("CalculoTotaldeVentasdeVendedor Hugo en Zona Lima: "+ctvz);
    }

    //Calculo de total de ventas
    static int CalculoTotaldeVentasdeVendedorenZona(String [] vendedores, String [] zonaVendedores,int [] ventas,String vendedor, String zona) {
        //        Variable sumatemporal=0
        int sumatemporal = 0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=ventas.length-1;i++) {
            //sumatemporal=sumatemporal+valor de venta del contador
            if (vendedores[i].equals(vendedor) && zonaVendedores[i].equals(zona))
                sumatemporal=sumatemporal+ventas[i];
            //Fin Incremento
        }
        //Retornar sumatemporal
        return sumatemporal;
    }

    static String [] unirArreglos(String [] vendedores,int [] ventas) {
        //        Variable sumatemporal=0
        String [] union = new String[vendedores.length+ventas.length];
        int temporal = 0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=vendedores.length-1;i++) {
            //sumatemporal=sumatemporal+valor de venta del contador
            union[temporal]=vendedores[i];
            temporal=temporal+1;
            //Fin Incremento
        }
        for (int i=0;i<=ventas.length-1;i++) {
            //sumatemporal=sumatemporal+valor de venta del contador
            union[temporal]=String.valueOf(ventas[i]);
            temporal=temporal+1;
            //Fin Incremento
        }
        //Retornar sumatemporal
        return union;
    }

    //Calculo de comision
    static int obtenerComision(int [] ventas) {
        return 300*CalculoTotaldeVentas(ventas);
    }

    //Calculo de total de ventas
    static int CalculoTotaldeVentas(int [] ventas) {
        //        Variable sumatemporal=0
        int sumatemporal = 0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=ventas.length-1;i++) {
            //sumatemporal=sumatemporal+valor de venta del contador
            sumatemporal=sumatemporal+ventas[i];
            //Fin Incremento
        }
        //Retornar sumatemporal
        return sumatemporal;
    }


    //Calculo de porcentaje de cuota alcanzada
    static double CalculoPorcentajeCuotaAlcanzada(int [] ventas) {
        // Variable alcanzaroncuota=0
        int alcanzaroncuota=0;
        // Variable porcentaje=0.0
        double porcentaje = 0.0;

        //Variable contador =0
        // Para cada incremento del contador siempre que sea menor que el numero de ventas
        for (int i=0;i<ventas.length;i++) {
            //Si (valor de venta del contador es mayor o igual que 5)
            if (ventas[i]>=5)
            {
                //alcanzaroncuota=alcanzaroncuota+1
                alcanzaroncuota=alcanzaroncuota+1;
            }
            //Fin Incremento
        }
        //porcentaje=alcanzaroncuota*100/numero de ventas
        porcentaje=alcanzaroncuota*100/ventas.length;
        //Retornar porcentaje
        return porcentaje;
    }


    //Obtener los que alcanzaron la cuota
    static String[] obtenerVendedoresAlcanzanCuota(int [] ventas, String [] vendedores) {
        // Variable alcanzaroncuota=0
        int alcanzaroncuota=0;
        // Variable porcentaje=0.0
        double porcentaje = 0.0;

        //Variable contador =0
        // Para cada incremento del contador siempre que sea menor que el numero de ventas
        for (int i=0;i<ventas.length;i++) {
            //Si (valor de venta del contador es mayor o igual que 5)
            if (ventas[i]>=5)
            {
                //alcanzaroncuota=alcanzaroncuota+1
                alcanzaroncuota=alcanzaroncuota+1;
            }
            //Fin Incremento
        }
        // Variable vendedoresalcanzaroncuota
        String[] vendedoresalcanzaroncuota = new String[alcanzaroncuota];
        alcanzaroncuota=0;
        // Para cada incremento del contador siempre que sea menor que el numero de ventas
        for (int i=0;i<ventas.length;i++) {
            //Si (valor de venta del contador es mayor o igual que 5)
            if (ventas[i]>=5)
            {
                vendedoresalcanzaroncuota[alcanzaroncuota]=vendedores[i];
                alcanzaroncuota=alcanzaroncuota+1;
            }
            //Fin Incremento
        }

        //Retornar vendedoresalcanzaroncuota
        return vendedoresalcanzaroncuota;
    }





}