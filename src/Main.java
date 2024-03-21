public class Main {
    public static void main(String[] args) {

        System.out.println("Departamentos!!");
        System.out.println();

        Departamento d1 = new Departamento("Centro de Tecnologia da Informação", "CTI");

        Funcionario f1 = new Funcionario("José", "216.460.698-12", 3.000,d1);
        Funcionario f2 = new Funcionario("Maria", "22.265.235-12", 5.000, d1);
        Funcionario f3 = new Funcionario("Jhony", "235.654.456.13",2.500, d1);

        d1.aciononarFuncionario(f1,f2,f3);

        System.out.println("Quadros de funcionários");
        d1.mostrarFuncionarios();

        System.out.println("Soma dos salários do departamento: ");
        d1.calcularFolhaPagamento();
    }
}