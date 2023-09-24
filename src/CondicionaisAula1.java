public class CondicionaisAula1 {
    public static void main(String[] args) {

        float salario = 4700.5f;
        float resultado = 0;

        if(salario > 4500){
            resultado = (salario * 30) / 100;
            System.out.println("30% do salario eh: "+resultado);
        }else {
            resultado = (salario * 15) / 100;
            System.out.println("Salario abaixo de R$4,500.00,sendo assim desconto de 15%, sendo: "+resultado);
        }

    }
}
