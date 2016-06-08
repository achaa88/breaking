package br.com.thiengo.thiengocalopsitafbexample.domain;

/**
 * Created by Vitor on 07/06/2016.
 */
public class Pergunta {
    String pergunta;

    //constructor
    public Pergunta(String pergunta){
        this.pergunta=pergunta;
    }

    //getters

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
}
