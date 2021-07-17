import ListasEnlazadas.ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaSimplementeEnlazada = new ListaEnlazada();
        System.out.println(listaSimplementeEnlazada.estaVacia());
        //insertar elementos a nuestras lista
        listaSimplementeEnlazada.insertar(1);
        listaSimplementeEnlazada.insertar(2);
        listaSimplementeEnlazada.insertar(3);
        listaSimplementeEnlazada.insertar(4);
        listaSimplementeEnlazada.mostrar();
        System.out.println();
        listaSimplementeEnlazada.eliminar();
        listaSimplementeEnlazada.mostrar();
        System.out.println();
        System.out.println(listaSimplementeEnlazada.estaVacia());






    }

}
