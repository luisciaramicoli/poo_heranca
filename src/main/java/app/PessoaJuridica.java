package app;
import java.time.LocalDate;
public class PessoaJuridica extends Pessoa{
    private String nomeFantasia;
    private String cnpj;


    public void setNomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeFantasia(){
        return nomeFantasia;
    }

    public void setcnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

     public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setNomeFantasia(nomeFantasia);
        this.setcnpj(cnpj);
    }

    @Override
    public String exibirInformacoes(){
        return this.getNome() + ","+ this.getEndereco()+","+ this.getDataCriacao()+","+ this.getNomeFantasia()+","+ this.getCnpj();
    }
}