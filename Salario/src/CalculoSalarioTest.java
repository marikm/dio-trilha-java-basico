import org.junit.jupiter.api.Assertions;


class CalculoSalarioTest {

    @org.junit.jupiter.api.Test
    void validarSalarioBeneficios(){
        Assertions.assertThrows(SalarioException.class, () -> new CalculoSalario(-1.0F, 100F));
        Assertions.assertThrows(SalarioException.class, () -> new CalculoSalario(0.0F, -100F));

    }

    @org.junit.jupiter.api.Test
    void percentualImposto() throws SalarioException {
        Assertions.assertEquals(0.05F, new CalculoSalario(100F, 200F).percentualImposto());
        Assertions.assertEquals(0.10F, new CalculoSalario(1200F, 200F).percentualImposto());
        Assertions.assertEquals(0.15F, new CalculoSalario(3100F, 200F).percentualImposto());

    }

    @org.junit.jupiter.api.Test
    void calcularSalario() throws SalarioException {
        Assertions.assertEquals(1450F, new CalculoSalario(1000F, 500F).calcularSalario());
        Assertions.assertEquals(1580F, new CalculoSalario(1200F, 500F).calcularSalario());
        Assertions.assertEquals(3135F, new CalculoSalario(3100F, 500F).calcularSalario());

    }
}