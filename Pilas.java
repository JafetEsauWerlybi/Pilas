package pipipilas;

public class Pilas<T> implements IPilas<T> {

    private Nodo<T> tope;

    public Pilas() {
        this.tope = null;
    }

    public void clear() {
        tope = null;
    }

    public boolean empty() {
        return (tope == null) ? true : false;
    }

    public T peek() {
        if (empty())return null;
        return tope.dato;
    }

    public T pop() {
        if (!empty()) {
            T dato = tope.dato;
            tope = tope.sig;
            return dato;
        }
        return null;
    }

    public T push(T dato) {
        tope = new Nodo(dato, tope);
        return dato;
    }

    public boolean search(T dato) {
        if (tope == null)return false;
        else {
            Nodo aux = tope;
            while (aux != null) {
                if (aux.dato.equals(dato))return true;
                else aux = aux.sig;
            }
            return false;
        }
    }

    @Override
    public String toString() {

        String cad = "[";
        Nodo aux = tope;

        while (aux != null) {
            cad += aux.dato + "\n";
            aux = aux.sig;
        }
        return cad + "]";
    }

    private class Nodo<T> {

        T dato;
        Nodo sig;

        public Nodo(T dato, Nodo sig) {
            this.dato = dato;
            this.sig = sig;
        }
    }

}
