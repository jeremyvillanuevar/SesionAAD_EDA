//package paquete;

//Es para traer valores de consola
import java.util.Scanner;


public class AAD7_E1_Jeremy{

    static String [] codigosProductos = {"AR000101","PE125610","PE752124"};
    //static String [] codigosProductos = {"AR0001011","PE12561.1","PE7521241"};

    public static void main (String[] args) {

        //String [] codigosProductos = {"AR0001011","PE125610","PE752124"};

        //Previo para Cadenas
        String tempCodProducto = codigosProductos[0];//AR0001011
        System.out.println("Codigo Producto Temporal: "+tempCodProducto);
        //                                                                   POSINICIO,POSFINAL
        System.out.println("Codigo Producto Temporal País de procedencia del producto: "+tempCodProducto.substring(0,2));
        String PaisProcedencia = tempCodProducto.substring(0,2);
        System.out.println("Codigo Producto Temporal Correlativo de productos ingresado: "+tempCodProducto.substring(3,6));
        //Trabajar con numeros en cadenas
        int numero = Integer.parseInt(tempCodProducto.substring(2,6));
        System.out.println("Codigo Producto Temporal Costo de almacenamiento diario del producto: "+tempCodProducto.substring(7,8));
        double numerocondecimal = Double.parseDouble(tempCodProducto.substring(6,8));

        //-----------------------

        System.out.println("NacionalidadProductos AR es de: "+obtenerNacionalidadProductos("AR"));

        System.out.println("NacionalidadProductos PE es de: "+obtenerNacionalidadProductos("PE"));

        System.out.println("MaximoCorrelativo AR es de: "+obtenerMaximoCorrelativodeNacionalidad("AR"));
        System.out.println("MaximoCorrelativo PE es de: "+obtenerMaximoCorrelativodeNacionalidad("PE"));

        System.out.println("obtenerCostoTotalAlmacenajeNacionalidad AR es de: "+obtenerCostoTotalAlmacenajeNacionalidad("AR"));

        System.out.println("obtenerCostoTotalAlmacenajeNacionalidad PE es de: "+obtenerCostoTotalAlmacenajeNacionalidad("PE"));



    }

    static double obtenerCostoTotalAlmacenajeNacionalidad(String nacionalidad) {

        double costototal = 0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=codigosProductos.length-1;i++) {
            if (codigosProductos[i].substring(0,2).equals(nacionalidad))
            {
                double costo= Double.parseDouble(codigosProductos[i].substring(6,8));
                //double costo= Double.parseDouble(codigosProductos[i].substring(6,9));
                costototal=costototal+costo;
            }
        }
        return costototal;
    }

    static int obtenerMaximoCorrelativodeNacionalidad(String nacionalidad) {

        int maximotemporal = 0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=codigosProductos.length-1;i++) {
            if (codigosProductos[i].substring(0,2).equals(nacionalidad))
            {
                int comparar= Integer.parseInt(codigosProductos[i].substring(2,6));
                if (comparar >maximotemporal)
                    maximotemporal=comparar;
            }
        }
        return maximotemporal;
    }


    static int obtenerNacionalidadProductos(String nacionalidad) {

        int cantidad = 0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=codigosProductos.length-1;i++) {
            if (codigosProductos[i].substring(0,2).equals(nacionalidad))
                cantidad=cantidad+1;
        }
        return cantidad;
    }


}