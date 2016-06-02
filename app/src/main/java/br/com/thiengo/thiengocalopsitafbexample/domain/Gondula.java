package br.com.thiengo.thiengocalopsitafbexample.domain;

/**
 * Created by Vitor on 02/06/2016.
 */
public class Gondula {
    double tamanho;
    SKU produtos[];
    int categoria;
    public Gondula(double tamanho,int categoria){
        this.tamanho=tamanho;
        this.categoria=categoria;
    }
}
