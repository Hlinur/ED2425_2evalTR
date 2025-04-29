import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testSinDescuento() {
        double resultado = Descuento.calculateDiscount(3, 100, false);
        assertEquals(0.0, resultado);
    }

    @Test
    public void testProductosYPrecioMedio() {
        double resultado = Descuento.calculateDiscount(7, 300, false);
        assertEquals(45.0, resultado, 0.01); // 10% + 5% = 15% de 300 = 45
    }

    @Test
    public void testDescuentoMaximo() {
        double resultado = Descuento.calculateDiscount(12, 800, true);
        assertEquals(240.0, resultado); // Descuento total excede 30%, se limita a 30% de 800
    }

    @Test
    public void testJustoAlLimite30() {
        double resultado = Descuento.calculateDiscount(12, 600, true);
        assertEquals(180.0, resultado); // 30% exactos
    }

    @Test
    public void testSoloPremium() {
        double resultado = Descuento.calculateDiscount(4, 150, true);
        assertEquals(7.5, resultado); // 5% de 150
    }
}
