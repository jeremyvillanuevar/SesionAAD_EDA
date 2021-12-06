public class AAD8_E2_Jeremy {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 2, 4, 6, 9, 9, 14, 18, 18};

        int cantidadmultiplos;
        cantidadmultiplos = DevolverMultiplosde3o7(numeros);


        System.out.println("La cantidad de los múltiplos de 3 o 7 del arreglo es: " + cantidadmultiplos);

        double promedioimpares = DevolverPromedioImparesArreglo(numeros);
        System.out.println("El promedio de los impares del arreglo es: " + promedioimpares);

        int[] nuevoarreglo = CrearArregloNoDuplicado(numeros);
        System.out.println("Los valores del arreglo sin duplicados son: " );

        for (int i = 0; i < nuevoarreglo.length; i++) {
            if (nuevoarreglo[i]!=0)
                System.out.print(", "+nuevoarreglo[i]);

        }
    }

    private static int[] CrearArregloNoDuplicado(int[] numeros) {
        int[] temporalarreglo=new int[numeros.length];
        int temporalcontador=0;
        temporalarreglo[temporalcontador]=numeros[0];
        temporalcontador=temporalcontador+1;

        for (int i=1;i<numeros.length;i++) {
            if (EncontrarDuplicado(numeros[i],temporalarreglo)) {


            }else {
                temporalarreglo[temporalcontador]=numeros[i];
                temporalcontador=temporalcontador+1;
            }
        }
        return temporalarreglo;
    }

    private static boolean EncontrarDuplicado(int numero,int[]numeros){

        for (int i=0;i<numeros.length;i++) {
            if (numero==numeros[i]) {
                return true;
            }
        }
        return false;
    }



    private static double DevolverPromedioImparesArreglo(int[] numeros) {
        double temporalpromedio=0;
        double temporalsuma=0;
        double temporalelementos=0;

        for (int i=0;i<numeros.length;i++) {
            if (i%2!=0) {
                temporalsuma=temporalsuma+numeros[i];
                temporalelementos=temporalelementos+1;
            }


        }
        temporalpromedio=temporalsuma/temporalelementos;
        return temporalpromedio;
    }

    private static int DevolverMultiplosde3o7(int[] numeros) {
        int cantidadtemporalmultiplos=0;
        for (int i=0;i<numeros.length;i++) {
            if ((numeros[i]%3==0)||(numeros[i]%7==0)) {
                cantidadtemporalmultiplos=cantidadtemporalmultiplos+1;
            }

        }
        return cantidadtemporalmultiplos;

    }

}