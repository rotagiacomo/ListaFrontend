package com.example.listafrontend.lib;

public class Tecnica implements Comparable{
    private Difficolta difficolta;

    public enum Difficolta{
        UNO, DUE, TRE, QUATTRO, CINQUE; //sempre maiuscolo per enum
    }

    public Tecnica(Difficolta difficolta){
        this.difficolta = difficolta;
    }

    public void setDifficolta(Difficolta difficolta){
        this.difficolta = difficolta;
    }

    public Difficolta getDifficolta() {
        return difficolta;
    }

    @Override
    public int compareTo(Comparable other) {
        Tecnica otherTecnica = (Tecnica) other;
        return difficolta.compareTo(otherTecnica.difficolta);
    }

    public String toString(){
        return difficolta.toString();
    }
}