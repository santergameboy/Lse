package ListasEnlazadas;

public class ListaEnlazada {
    Nodo primero;
    Nodo ultimo;


    public ListaEnlazada() {
        primero = null;
        ultimo = null;


    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void insertar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setDato(dato);

        if (estaVacia()) {

            primero = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(primero);
        } else {

            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(primero);
            ultimo = nuevo;
        }

    }

    public void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();

        }
    }



    public void mostrar() {
        Nodo actual = new Nodo(ultimo);
        actual = primero;
        do {
            System.out.print("    " + actual.getDato());
            actual = actual.getSiguiente();

        } while (actual != primero);

    }
}
