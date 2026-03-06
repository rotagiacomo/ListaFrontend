package com.example.listafrontend;

import com.example.listafrontend.lib.Comparable;
import com.example.listafrontend.lib.Iteratore;
import com.example.listafrontend.lib.Nodo;
import com.example.listafrontend.lib.Tecnica;
import javafx.fxml.FXML;
import com.example.listafrontend.lib.Lista;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;


public class ListaController {
    private Lista lista;
    private boolean firstTime = true;

    @FXML
    private TextArea zonaPerStampaLista;

    @FXML
    private ChoiceBox<String> sceltaTecnica;

    public ListaController(){
        lista = new Lista();
    }

    @FXML
    public void addElement(){
        String sceltaDifficolta = sceltaTecnica.getValue();
        Tecnica primaTecnica = new Tecnica(Tecnica.Difficolta.valueOf(sceltaDifficolta));
        lista.aggiungiOrdinato(new Nodo(primaTecnica));
        mostraLista();
    }

    @FXML
    public void removeElement(){
        String sceltaDifficolta = sceltaTecnica.getValue();
        Tecnica.Difficolta difficolta = Tecnica.Difficolta.valueOf(sceltaDifficolta);
        Comparable tecnicaDaRimuovere = new Tecnica(difficolta);
        Nodo nodoDaRimuovere = new Nodo(tecnicaDaRimuovere);
        lista.rimuovi((Comparable) nodoDaRimuovere);
        mostraLista();
    }

    @FXML
    private void mostraLista(){
        if(firstTime){
            zonaPerStampaLista.clear();
            firstTime = false;
        }
        zonaPerStampaLista.setText(lista.toString());
    }

    @FXML
    public void initialize(){
        sceltaTecnica.getItems().addAll("UNO", "DUE", "TRE", "QUATTRO", "CINQUE");
        sceltaTecnica.setValue("UNO");
        zonaPerStampaLista.setText("Lista vuota");
    }
}
