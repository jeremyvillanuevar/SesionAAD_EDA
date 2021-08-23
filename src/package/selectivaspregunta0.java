
public class selectivaspregunta0{

    public static void main (String[] args)
    {

        //Leer cantidad vendida de los paquetes 
        int cantidadvendida=15;
        //Leer precios de los paquetes 
        int preciodelpaquete49=50;
        int preciodelpaquete99=100;
        int preciodelpaquete199=200;

        int ventas;

        ventas=0;
        //Leer paquete vendido
        int paquetevendido=199;
        //Selección x paquete vendido
        //Si Ventas paquete 49 = cantidad vendida* precio, 50 nuevos soles
        if (paquetevendido==49)
            ventas=cantidadvendida*preciodelpaquete49;
        else
            //	Ventas paquete 99 = cantidad vendida* precio, 100 nuevos soles
            if (paquetevendido==99)
                ventas=cantidadvendida*preciodelpaquete99;
            else
                //	Ventas paquete 199 = cantidad vendida* precio, 200 nuevos soles
                if (paquetevendido==199)
                    ventas=cantidadvendida*preciodelpaquete199;


        //Calcular ventatotal
        System.out.println("El monto de ventas es:");


        System.out.println(ventas);

    }
}