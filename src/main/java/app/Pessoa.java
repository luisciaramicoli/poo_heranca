package app;
import java.time.LocalDate;
public abstract class Pessoa{
    protected  String nome;
    protected String endereco;
    protected LocalDate dataCriacao;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setDataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataCriacao(){
        return dataCriacao;
    }
     public abstract String exibirInformacoes();
     
}