package proyecto.casino;

public enum TipoServicio {
    MESAPOKER(10),
    MESABLACKJACK(7),
    BAR (20),
    RESTAURANTE(50);

    private final int capacidadMaxima;

    TipoServicio(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
}
