import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Departamento {
    private String nome;
    private String sigla;

    private List<Funcionario> funcionarios = new ArrayList<>();

    public double calcularFolhaPagamento(){
        double soma = 0;
        for (Funcionario f : this.funcionarios)
            soma = soma+f.getSalario();

        return soma;
    }


    public Departamento(String nome, String sigla) {
        this.setNome(nome);
        this.setSigla(sigla);
        this.setFuncionarios(new ArrayList<>());
    }
    public void aciononarFuncionario(Funcionario...funcionario){
        Collections.addAll(this.funcionarios,funcionario);
    }
    public void removerFuncionario(Funcionario funcionario){ this.funcionarios.remove(funcionario);

    }
    public void mostrarFuncionarios(){
        for (Funcionario f : funcionarios){
            f.mostrarDados();

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
