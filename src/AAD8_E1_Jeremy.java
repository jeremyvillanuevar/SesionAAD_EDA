//package paquete;

//Es para traer valores de consola


public class AAD8_E1_Jeremy {


    public static void main (String[] args) {


        //Entrar valores de vendedores
        //String alumno = "Hugo";
        String[] alumnos = {"Hugo", "Mariana", "Luis", "Jennifer", "Jorge", "Valeria", "Manuel"};
        //Entrar valores de ventas
        int[] notas = {15, 16, 19, 20, 14, 15, 13};
        String[] cursos = {"DBD", "FDP", "FDP", "DBD", "DBD", "FDP", "FDP"};
        String[] ciclos = {"2021-2", "2021-2", "2021-2", "2021-1", "2021-1", "2021-2", "2021-2"};
        //El tamaño del arreglo es cantidad de posiciones = arreglo.length
        //Las posiciones del arreglo comienzan en 0 hasta la cantidad-1

        String curso = "DBD";
        int promedio = CalculoPromedioNotasAlumnosporCurso(curso, cursos, notas);


        int posalumnomayorpromedio = CalculoAlumnoMayorNotaporCurso(curso, cursos, notas);


        System.out.println("El promedio del curso " + curso + ": " + promedio);
        System.out.println("El alumno del curso " + curso + " con mayor promedio es: " + alumnos[posalumnomayorpromedio]);


    }
    //Calculo de promedio
    static int CalculoAlumnoMayorNotaporCurso(String curso,String cursos[],int [] notas) {
        //        Variable sumatemporal=0
        int sumatemporal = -1;
        int mayortemporal=-1;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=notas.length-1;i++) {
            if (curso.equals(cursos[i]))
            {
                if (sumatemporal < notas[i]){
                    sumatemporal=notas[i];
                    mayortemporal=i;
                }
            }
            //Fin Incremento
        }
        //Retornar mayortemporal
        return mayortemporal;
    }


    //Calculo de promedio
    static int CalculoAlumnoMayorNotaporCiclo(String ciclo,String ciclos[],int [] notas) {
        //        Variable sumatemporal=0
        int sumatemporal = -1;
        int mayortemporal=-1;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=notas.length-1;i++) {
            if (ciclo.equals(ciclos[i]))
            {
                if (sumatemporal < notas[i]){
                    sumatemporal=notas[i];
                    mayortemporal=i;
                }
            }
            //Fin Incremento
        }
        //Retornar mayortemporal
        return mayortemporal;
    }

    static int CalculoPromedioNotasAlumnosporCiclo(String ciclo,String ciclos[],int [] notas) {
        //        Variable sumatemporal=0
        int sumatemporal = 0;
        int numeroelementostemporal=0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=notas.length-1;i++) {
            if (ciclo.equals(ciclos[i]))
            {
                sumatemporal = sumatemporal+notas[i];
                numeroelementostemporal++;
            }
            //Fin Incremento
        }
        //Retornar sumatemporal
        if (numeroelementostemporal==0) return 0;
        return sumatemporal/numeroelementostemporal;
    }
    //Calculo de promedio
    static int CalculoPromedioNotasAlumnosporCurso(String curso,String cursos[],int [] notas) {
        //        Variable sumatemporal=0
        int sumatemporal = 0;
        int numeroelementostemporal=0;
        //        Variable contador =0
        //        Para cada incremento del contador siempre que sea menor que el numero de ventas-1
        for (int i=0;i<=notas.length-1;i++) {
            if (curso.equals(cursos[i]))
            {
                    sumatemporal = sumatemporal+notas[i];
                    numeroelementostemporal++;
            }
            //Fin Incremento
        }
        //Retornar sumatemporal
        return sumatemporal/numeroelementostemporal;
    }




}