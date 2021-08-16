
public class recursividadpregunta0a {

    public static void main (String[] args) {

       
        
        // Inicio
        int kwconsumidos;
        // 		Leer Consumo Kw/h en Cada Departamento del Condominio
        kwconsumidos=358;
        double precio;
        precio=0;
        // 		Calcular Precio
        // Variable contador =1
        // Variable preciotemporal=0.0
        // Para cada incremento del contador hasta el Consumo
           for (int i=1;i<=kwconsumidos;i++) {
         // 	Si Contador>150
           if (i>150)
         // 		preciotemporal=preciotemporal+2.00;
                precio=precio+2.00;
        // 	SI Contador>50 Y Contador <=150
            if ((i>50)&&(i<=150))
        // 		preciotemporal=preciotemporal+1.50;
                precio=precio+1.50;
        // 	SI Contador>0 Y Contador <=50
            if((i>0)&&(i<=50))
         // 		preciotemporal=preciotemporal+0.50;
                precio=precio+0.50;
        // Fin Incremento
        // 	Fin
           }

        System.out.println("El precio final es:");
        System.out.println(precio);
    }
}
