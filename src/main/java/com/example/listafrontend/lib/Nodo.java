package com.example.listafrontend.lib;

public class Nodo implements Comparable {
    private Nodo nextNodo;
    private Comparable contenuto;

    public Nodo(Comparable contenuto) {
        this.contenuto = contenuto;
    }

    public void setNextNodo(Nodo nextNodo) {
        this.nextNodo = nextNodo;
    }

    public void setContenuto(Comparable contenuto) {
        this.contenuto = contenuto;
    }

    public Nodo getNextNodo() {
        return nextNodo;
    }

    public Comparable getContenuto() {
        return contenuto;
    }

    public String toString() {
        return contenuto.toString();
    }

    public int compareTo(Comparable other) {
        Nodo otherNodo = (Nodo) other;
        return contenuto.compareTo(otherNodo.contenuto);
    }
}
