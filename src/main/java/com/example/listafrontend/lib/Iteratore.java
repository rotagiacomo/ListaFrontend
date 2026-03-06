package com.example.listafrontend.lib;

public class Iteratore {
    private Nodo cursor;
    public Iteratore(Nodo head){
        this.cursor = head;
    }

    public boolean hasNext(){
        return cursor != null;
    }

    public Nodo next(){
        Nodo thisNodo = cursor;
        cursor = cursor.getNextNodo();
        return thisNodo;
    }
}
