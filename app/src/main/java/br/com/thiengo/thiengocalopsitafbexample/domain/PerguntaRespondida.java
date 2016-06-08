package br.com.thiengo.thiengocalopsitafbexample.domain;

/**
 * Created by Vitor on 08/06/2016.
 */
public class PerguntaRespondida {

    String resposta;
    Pergunta pergunta;
    //constructor

    public PerguntaRespondida(Pergunta pergunta, String resposta) {
        this.pergunta.setPergunta(pergunta.getPergunta());
        this.resposta=resposta;
    }

    //getters and setters

    public String getPergunta(){
        return pergunta.getPergunta();
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
