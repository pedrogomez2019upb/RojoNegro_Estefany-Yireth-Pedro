package edu.upb.ds.redblack;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n########################");
        System.out.println("\nBienvenido al programa del Árbol Rojo-Negro");
        System.out.println("\n########################");
        ArbolRN arbol = new ArbolRN();
        arbol.insertar(55);
        arbol.insertar(40);
        arbol.insertar(65);
        arbol.insertar(60);
        arbol.insertar(75);
        arbol.insertar(57);
        arbol.imprimirArbol();
        System.out.println("\n########################");
        System.out.println("\nGracias por utilizar");
        System.out.println("\nprograma del Árbol Rojo-Negro");
        System.out.println("\n########################");
    }
}
//Developed by Yireth Aldana - Estefany Rueda & Pedro Gomez