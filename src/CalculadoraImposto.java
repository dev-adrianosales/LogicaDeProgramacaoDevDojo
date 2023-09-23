public class CalculadoraImposto {
    public static void main(String[] args) {
         float salario = 2800.00F;
         float porcentagem = 30;
         float resultadoPorcentagemSalario = salario - ((salario * porcentagem) / 100);
         salario = resultadoPorcentagemSalario;

        System.out.println(salario);
    }
}
