public class Funcionario {
    private String nome;
    private String CPF;
    private double salario;
    private Departamento departamento;

    public Funcionario(String nome, String CPF, double salario, Departamento departamento) {
        this.setNome(nome);
        this.setCPF(CPF);
        this.setSalario(salario);
        this.setDepartamento(departamento);
    }
    public void mostrarDados(){
        System.out.println("\nDepartamento: " + this.departamento.getNome()+"-"+this.departamento.getSigla()+
                            "\nNome: " + this.nome+
                            "\nCPF: " + this.CPF+
                            "\nSalário: R$ " + this.salario);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
