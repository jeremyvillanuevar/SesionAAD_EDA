public class ejemplopc1fdppregunta0 {

    public static void main(String[] args){

        String tipodeservicio="U";
        int numerocanciones=99;
        String idiomadecanciones="Inglés";

        int preciomensual=0;
        if (tipodeservicio=="U") {
            preciomensual=30;
        }
        if (tipodeservicio=="F") {
            preciomensual=70;
        }
        double preciocanciones=0;
        preciocanciones=CalcularPrecioUnico(idiomadecanciones,numerocanciones);
        System.out.println("Precio Mensual="+preciomensual);
        System.out.println("Precio Canciones="+preciocanciones);

    }
    public static double CalcularPrecioUnico(String idioma,int numerocanciones){
        double preciotemporal=0;
        if (idioma.equals("Español")) {
            for (int i = 1; i <= numerocanciones; i++) {
                if (i > 30) preciotemporal = preciotemporal + 1;
                else if (i > 0 && i <= 30) preciotemporal = preciotemporal + 3;
            }
        }

        if (idioma.equals("Inglés")) {
            for (int i = 1; i <= numerocanciones; i++) {
                if (i > 10) preciotemporal = preciotemporal + 1.50;
                else if (i > 0 && i <= 10) preciotemporal = preciotemporal + 3;
            }
        }
        return preciotemporal;
    }

}
