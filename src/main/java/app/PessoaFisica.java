package app;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class PessoaFisica extends Pessoa{
    private LocalDate dataNascimento;
    private String cpf;

    

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento(){
        return dataNascimento;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

     public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }

   @Override
    public String exibirInformacoes(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: "+ this.getNome() + ","+ " Endereco: "+ this.getEndereco()+","+" Data da criacao: "+ this.getDataCriacao()+","+ " Data de nascimento: "+ this.getDataNascimento().format(formatador)+","+ " CPF: "+  this.getCpf();
    }
}