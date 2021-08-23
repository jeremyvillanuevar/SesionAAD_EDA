public class arreglopregunta0a {

    public static void main(String[] args) {
        // 1.	Sumar los elementos de un arreglo.

        int[] numeros;
        numeros=new int[9];
        numeros[0]=1;
        numeros[1]=2;
        numeros[2]=3;
        numeros[3]=4;
        numeros[4]=5;
        numeros[5]=6;
        numeros[6]=7;
        numeros[7]=8;
        numeros[8]=9;

        //Las líneas de arriba es igual a realizar la siguiente
        //asignación inicial del arreglo de esta forma:
        //int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // indices 0 a 8; 9 posiciones

        //arreglo.length es la cantidad de elementos del arreglo
        //Ejemplo: numeros.length
        System.out.println("La cantidad de los elementos del arreglo es: " + numeros.length);
        int suma = 0;
        //Desde el elemento 0 al elemento final realiza la acción de sumar
        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }
        System.out.println("La suma de los elementos del arreglo es: " + suma);


    }

}