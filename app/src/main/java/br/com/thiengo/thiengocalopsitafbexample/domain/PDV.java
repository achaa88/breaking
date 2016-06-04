package br.com.thiengo.thiengocalopsitafbexample.domain;

/**
 * Created by Vitor on 02/06/2016.
 */
public class PDV {

    private Gondula gondulas[];

    private String CNPJ;
    private String nome;
    private String GPA;
    private String bandeira;
    private String endereco;
    private String bairro;
    private String CEP;
    private String cidade;
    private String UF;
    private String telefone;

    private String latitude;
    private String longitude;

    // Constructors
    public PDV(String endereco){
        this.endereco=endereco;
    }
    public PDV(String CNPJ, String nome, String GPA, String bandeira, String endereco, String bairro, String cidade, String UF) {
        this.CNPJ = CNPJ;
        this.nome = nome;
        this.GPA = GPA;
        this.bandeira = bandeira;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
    }
    //
    public void showinMap(){}
    public boolean checkin(){return true;} // eu acho que nao tem que ficar aqui
    public boolean checkout(){return true;}  // eu acho que nao tem que ficar aqui

    // Getters and Setters
    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    public  String getFullEndereco() { return (endereco+" "+bairro+" "+cidade+" "+UF);}

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Gondula[] getGondulas() {
        return gondulas;
    }

    public void setGondulas(Gondula[] gondulas) {
        this.gondulas = gondulas;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getbandeira() {
        return bandeira;
    }

    public void setbandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }


}
