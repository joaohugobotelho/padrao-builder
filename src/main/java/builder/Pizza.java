package builder;

public class Pizza {
    private String tamanho;
    private boolean queijo;
    private boolean pepperoni;
    private boolean bacon;

    public Pizza(String tamanho, boolean queijo, boolean peperoni, boolean bacon) {
        this.tamanho = tamanho;
        this.queijo = queijo;
        this.pepperoni = peperoni;
        this.bacon = bacon;
    }

    public String getTamanho() {
        return tamanho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public boolean isPeperoni() {
        return pepperoni;
    }

    public boolean isBacon() {
        return bacon;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tamanho='" + tamanho + '\'' +
                ", queijo=" + queijo +
                ", pepperoni=" + pepperoni +
                ", bacon=" + bacon +
                '}';
    }
}

