
public class Lista {
    private Nodo inicio;

    public void main() {
        inicio = null;
    }

    void insertarInicio(int valor) {

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (inicio == null)
            inicio = nuevo;
        else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

}