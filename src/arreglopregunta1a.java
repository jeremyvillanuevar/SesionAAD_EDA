public class arreglopregunta1a {

    public static void main(String[] args) {
        //Declarar arreglo
        int[] ventaheladospormes;
        //Establecer el tamaño del arreglo, cantidad de datos que tendrá
        ventaheladospormes=new int[3];//3 datos, uno por mes del trimestre
        ventaheladospormes[0]=18;//Helados vendidos de cada mes
        ventaheladospormes[1]=27;
        ventaheladospormes[2]=36;
        //declarar temporal de la operacion que haremos: mayor
        //y le damos el valor del primer mes
        int comparadomayor = ventaheladospormes[0];
        //Todos los elementos mes el valor ya puesto en el temporal
        // se realiza la acción de comparar

        for (int i = 1; i < ventaheladospormes.length; i++) {
            if (comparadomayor < ventaheladospormes[i])
            {
                comparadomayor=ventaheladospormes[i];
            }
        }
        System.out.println("El mayor de los elementos del arreglo es: " + comparadomayor);

        //declarar temporal de la operacion que haremos: promedio
        //y le damos el valor inicial
        int promedio = 0;
        int suma=0;
        //Todos los elementos mes
        // se realiza la acción de promedio

        for (int i = 0; i < ventaheladospormes.length; i++) {
            suma=suma+ventaheladospormes[i];
        }
        promedio=suma/3;
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);

    }

}