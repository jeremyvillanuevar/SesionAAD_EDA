
//Este es un arreglo de tipo nodo, que tiene un valor (Dato) y el nodo siguiente
public class Nodo
{
    private int nro;        // en este caso es un numero entero
    private Nodo sgte;
    public void main(){
        this.nro=0;
        this.sgte=null;
    }
    public int getValor(){
        return nro;
    }
    public void setValor(int valor){
        nro=valor;
    }
    public Nodo getSiguiente(){
        return sgte;
    }
    public void setSiguiente(Nodo siguiente){
        this.sgte=siguiente;
    }
}