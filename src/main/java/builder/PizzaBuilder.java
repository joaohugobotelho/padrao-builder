package builder;

public class PizzaBuilder {
    private String tamanho;
    private boolean queijo;
    private boolean pepperoni;
    private boolean bacon;

    public PizzaBuilder setTamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder addQueijo() {
        this.queijo = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addBacon() {
        this.bacon = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(tamanho, queijo, pepperoni, bacon);
    }
}


