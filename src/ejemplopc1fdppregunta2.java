
//Es para traer valores de consola
import java.util.Scanner;

public class ejemplopc1fdppregunta2 {

        public static void main (String[] args)
        {
            //Se necesita siempre esta inicialización-
            //para obtener valores ingresados por usuario en consola
            Scanner sc = new Scanner(System.in);

            // Inicializar las Constantes y Datos Precalculados
            int MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo1 = 10000;
            double    PorcentajedeBonificacionenViajeNacionalTipo1 = 0.1061;
            int MinimodeCantidaddeKmparaBonificacionenViajeNacionalTipo2 = 10001;
            int MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo2 = 16000;
            double   PorcentajedeBonificacionenViajeNacionalTipo2 = 0.2052;
            int MinimodeCantidaddeKmparaBonificacionenViajeNacionalTipo3 = 16001;
            int MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo3 = 18000;
            double    PorcentajedeBonificacionenViajeNacionalTipo3 =0.3043;
            int MinimodeCantidaddeKmparaBonificacionenViajeNacionalTipo4 = 18001;
            double   PorcentajedeBonificacionenViajeNacionalTipo4 = 0.4011;

            //Declaramos fuera del alcance del if, en el alcance de la clase.
            double porcentajedebonificacion=0;

            //Leer kilómetros que el cliente tiene acumulados en su estado de cuenta
            double kmacumulados=30000;
            //    Leer viajes nacionales o internacionales
            String tipodeviaje="Internacional";
            //    Si el viajes nacionales o internacionales=”Nacional”
            switch (tipodeviaje){
                case "Nacional":
                    //if (tipodeviaje.equals("Nacional"))//CONDICIONAL DOS IGUAL ==
                    //Si kilómetros que el cliente tiene acumulados en su estado de cuenta <= MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo1
                {
                    if (kmacumulados <= MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo1)
                        porcentajedebonificacion = PorcentajedeBonificacionenViajeNacionalTipo1;
                    else if ((kmacumulados <= MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo2) && (kmacumulados >= MinimodeCantidaddeKmparaBonificacionenViajeNacionalTipo2))
                        porcentajedebonificacion = PorcentajedeBonificacionenViajeNacionalTipo2 ;
                    else if ((kmacumulados <= MaximodeCantidaddeKmparaBonificacionenViajeNacionalTipo3) && (kmacumulados >= MinimodeCantidaddeKmparaBonificacionenViajeNacionalTipo3))
                        porcentajedebonificacion = PorcentajedeBonificacionenViajeNacionalTipo3 ;
                    else if ((kmacumulados >= MinimodeCantidaddeKmparaBonificacionenViajeNacionalTipo4))
                        porcentajedebonificacion = PorcentajedeBonificacionenViajeNacionalTipo4 ;
                    break;
                }
                //De lo Contrario Si el viajes nacionales o internacionales=”Internacional”
                //else if (tipodeviaje.equals("Internacional"))
                case "Internacional":
                {
                    if (kmacumulados <= 25000 )
                        porcentajedebonificacion = 45.34 ;
                    else if ((kmacumulados <= 30000) && (kmacumulados >= 25001))
                        porcentajedebonificacion = 55.25;
                    else if ((kmacumulados <= 45000) && (kmacumulados >= 30001))
                        porcentajedebonificacion = 65.16;
                    else if ((kmacumulados >= 45000))
                        porcentajedebonificacion = 75.13;
                    break;
                }
                // else
                //    porcentajedebonificacion = 0;
            }
            //Mostrar porcentaje de bonificación
            System.out.println(porcentajedebonificacion);


        }
    }