package edu.upb.ds.redblack;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n########################");
        System.out.println("\nBienvenido al programa del Árbol Rojo-Negro");
        System.out.println("\n########################");
        ArbolRN bst = new ArbolRN();
        bst.insertar(55);
        bst.insertar(40);
        bst.insertar(65);
        bst.insertar(60);
        bst.insertar(75);
        bst.insertar(57);
        bst.imprimirArbol();
        System.out.println("\n########################");
        System.out.println("\nGracias por utilizar");
        System.out.println("\nprograma del Árbol Rojo-Negro");
        System.out.println("\n########################");
    }
}
//Developed by Yireth Aldana - Estefany Rueda & Pedro Gomez