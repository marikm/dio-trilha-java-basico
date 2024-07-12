public class SalarioException extends Exception{

    private final Float salario;
    private final Float beneficio;

    public SalarioException(String mensagem, Float salariobruto, Float beneficio){
        super(mensagem);
        this.salario = salariobruto;
        this.beneficio = beneficio;
    }


    public Float getBeneficio() {
        return beneficio;
    }

    public Float getSalario() {
        return salario;
    }
}
