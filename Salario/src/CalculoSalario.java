public class CalculoSalario {
    private final Float salarioBruto;
    private final Float beneficios;

    public CalculoSalario(Float salarioBruto, Float beneficios) throws SalarioException{
        if(salarioBruto < 0){
            throw new SalarioException("O valor de salario deve ser maior que zero", salarioBruto, beneficios);
        }
        if(beneficios < 0){
            throw new SalarioException("O valor dos beneficios deve ser maior que zero", salarioBruto, beneficios);
        }
        this.salarioBruto = salarioBruto;
        this.beneficios = beneficios;
    }

    public Float getSalarioBruto() {
        return salarioBruto;
    }

    public Float getBeneficios() {
        return beneficios;
    }

    public Float percentualImposto(){
        if(salarioBruto > 0 && salarioBruto <= 1100.00){
            return 0.05F;
        } else if (salarioBruto >= 1100.01 && salarioBruto <= 2500.00) {
            return 0.1F;
        }
        return 0.15F;
    }

    public Float calcularSalario(){
        Float salarioLiquido = (salarioBruto - salarioBruto*percentualImposto()) + beneficios;
        return salarioLiquido;
    }
}
