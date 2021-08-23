public class listaenlazadapregunta0bx {

    public static void main(String[] args) {
        Lista lista = new Lista();

        int _dato;  // elemento a ingresar

        _dato = 99;

        System.out.println("NUMERO A INSERTAR: " + _dato);
        lista.insertarInicio(_dato);
        System.out.println("Insertado dato al inicio.");

        int _dato2=252;
        lista.insertarInicio(_dato2);
        lista.insertarInicio(42);
        lista.insertarInicio(53);

        if (lista.estaVacio())
            System.out.println("La lista esta vacía");

        lista.Listar();

        lista.Buscar(252);
    }

}