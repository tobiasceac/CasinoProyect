package proyecto.casino;

import exceptions.NotEnoughPlayersException;

public class CasinoMain {
    public static void main(String[] args) {
        Mesa m = null;
        try {
            m = new Mesa(1, TipoJuego.BLACKJACK);
        } catch (NotEnoughPlayersException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(m.toString());
    }
}
