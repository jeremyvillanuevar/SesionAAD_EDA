
public class Lista {
    private Nodo inicio;

    public void main() {
        inicio = null;
    }

    public void insertarInicio(int valor) {

        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (inicio == null)
            inicio = nuevo;
        else {
            Nodo auxiliar=inicio;
            while (auxiliar.getSiguiente()!=null) {
                auxiliar=auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void Listar(){
        if(inicio==null) {
            System.out.println("La lista se encuentra vacía.");
        }
        else
        {
            Nodo auxiliar=inicio;
            while (auxiliar!=null) {
                System.out.println("Valor en la lista:"+auxiliar.getValor());
                auxiliar=auxiliar.getSiguiente();
            }

        }
    }

    public boolean estaVacio(){
        if (inicio==null) return true;
        else
            return false;
    }

    public void Buscar(int valorabuscar){
        if(inicio==null) {
            System.out.println("La lista se encuentra vacía.");
        }
        else
        {
            Nodo auxiliar=inicio;
            while (auxiliar!=null) {
                if (valorabuscar==auxiliar.getValor()) {
                    System.out.println("Valor encontrado en la lista:" + auxiliar.getValor());
                    break;
                }
                auxiliar=auxiliar.getSiguiente();
            }

        }
    }

}