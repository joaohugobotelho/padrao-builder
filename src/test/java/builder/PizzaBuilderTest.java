package builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PizzaBuilderTest {

    @Test
    public void deveCriarPizzaSimples() {
        Pizza pizza = new PizzaBuilder()
                .setTamanho("Média")
                .build();

        assertEquals("Média", pizza.getTamanho());
        assertFalse(pizza.isQueijo());
        assertFalse(pizza.isPeperoni());
        assertFalse(pizza.isBacon());
    }

    @Test
    public void deveCriarPizzaCompleta() {
        Pizza pizza = new PizzaBuilder()
                .setTamanho("Grande")
                .addQueijo()
                .addPepperoni()
                .addBacon()
                .build();

        assertEquals("Grande", pizza.getTamanho());
        assertTrue(pizza.isQueijo());
        assertTrue(pizza.isPeperoni());
        assertTrue(pizza.isBacon());
    }
}
