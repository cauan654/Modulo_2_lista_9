interface Alimento {
}

class Liquidificador<T extends Alimento> {
    private T alimento;

    public void bater() {
        System.out.println("O alimento foi batido");
    }

    public T getAlimento() {
        return alimento;
    }

    public void setAlimento(T alimento) {
        this.alimento = alimento;
    }
}

class Banana implements Alimento {
}

public class Main {
    public static void main(String[] args) {
        Liquidificador<Banana> liquidificador = new Liquidificador<>();

        Banana banana = new Banana();

        liquidificador.setAlimento(banana);

        liquidificador.bater();
    }
}
