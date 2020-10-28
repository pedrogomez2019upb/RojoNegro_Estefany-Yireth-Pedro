package edu.upb.ds.redblack;

public class ArbolRN {

    public Nodo root;
    public Nodo TNULL;

    public void rotacionIzquierda(Nodo nodo) {
        Nodo y = nodo.der;
        nodo.der = y.izq;
        if (y.izq != TNULL) {
            y.izq.padre = nodo;
        }
        y.izq = nodo.padre;
        if (nodo.padre == null) {
            this.root = y;
        } else if (nodo == nodo.padre.izq) {
            nodo.padre.izq = y;
        } else {
            nodo.padre.der = y;
        }
        y.izq = nodo;
        nodo.padre = y;
    }

    public void rotacionDerecha(Nodo nodo) {
        Nodo y = nodo.izq;
        nodo.izq = y.der;
        if (y.der != TNULL) {
            y.der.padre = nodo;
        }
        y.padre = nodo.padre;
        if (nodo.padre == null) {
            this.root = y;
        } else if (nodo == nodo.padre.der) {
            nodo.padre.der = y;
        } else {
            nodo.padre.izq = y;
        }
        y.der = nodo;
        nodo.padre= y;
    }
    public void insertar(int llave){
        Nodo nodo = new Nodo();
        nodo.padre = null;
        nodo.data = llave;
        nodo.izq = TNULL;
        nodo.der = TNULL;
        nodo.color = 1;

        Nodo y = null;
        Nodo x = this.root;

        while (x != TNULL) {
            y = x;
            if (nodo.data < x.data) {
                x = x.izq;
            } else {
                x = x.der;
            }
        }

        nodo.padre = y;
        if (y == null) {
            root = nodo;
        } else if (nodo.data < y.data) {
            y.izq = nodo;
        } else {
            y.der = nodo;
        }

        if (nodo.padre == null) {
            nodo.color = 0;
            return;
        }

        if (nodo.padre.padre == null) {
            return;
        }

        arreglarInsercion(nodo);
    }

    private void arreglarInsercion(Nodo nodo) {
        Nodo u;
        while (nodo.padre.color == 1) {
            if (nodo.padre == nodo.padre.padre.der) {
                u = nodo.padre.padre.izq;
                if (u.color == 1) {
                    u.color = 0;
                    nodo.padre.color = 0;
                    nodo.padre.padre.color = 1;
                    nodo = nodo.padre.padre;
                } else {
                    if (nodo == nodo.padre.izq) {
                        nodo = nodo.padre;
                        rotacionDerecha(nodo);
                    }
                    nodo.padre.color = 0;
                    nodo.padre.padre.color= 1;
                    rotacionIzquierda(nodo.padre.padre);
                }
            } else {
                u = nodo.padre.padre.der;

                if (u.color == 1) {
                    u.color = 0;
                    nodo.padre.color = 0;
                    nodo.padre.padre.color = 1;
                    nodo = nodo.padre.padre;
                } else {
                    if (nodo == nodo.padre.der) {
                        nodo = nodo.padre;
                        rotacionIzquierda(nodo);
                    }
                    nodo.padre.color = 0;
                    nodo.padre.padre.color = 1;
                    rotacionDerecha(nodo.padre.padre);
                }
            }
            if (nodo == root) {
                break;
            }
        }
        root.color = 0;
    }

    public void imprimirArbol() {
        asistenteImpresion(this.root, "", true);
    }

    private void asistenteImpresion(Nodo root, String identacion, boolean boolUltimo) {
        if (root != TNULL) {
            System.out.print(identacion);
            if (boolUltimo) {
                System.out.print("Derecha----");
                identacion += "   ";
            } else {
                System.out.print("Izquierda----");
                identacion += "|  ";
            }

            String sColor = root.color == 1 ? "ROJO" : "NEGRO";
            System.out.println(root.data + "(" + sColor + ")");
            asistenteImpresion(root.izq, identacion, false);
            asistenteImpresion(root.der, identacion, true);
        }
    }
    public void eliminar (Nodo nodo){

    }

}
//Developed by Yireth Aldana - Estefany Rueda & Pedro Gomez