public class Main {
    public static void main(String[] args) {
        try{
            CalculoSalario funcionario = new CalculoSalario(1100F, 100F);
            System.out.println("O salario bruto: " + funcionario.getSalarioBruto());
            System.out.println("O percentual de desconto: " + funcionario.percentualImposto()*100 + "%");
            System.out.println("O valor de beneficios: "+ funcionario.getBeneficios());
            System.out.println("O salário líquido do funcionario e: " + funcionario.calcularSalario());
        } catch (SalarioException e) {
            System.out.println("mensagem: " + e);
            System.out.println("Salario bruto: " + e.getSalario());
            System.out.println("Beneficios: "  + e.getBeneficio());
        }

    }
}