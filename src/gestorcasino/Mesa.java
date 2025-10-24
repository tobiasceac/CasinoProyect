package gestorcasino;

import exceptions.NotEnoughPlayersException;

import java.util.UUID;

public class Mesa {
    private static int contadorMesas = 0;

    private String codigo;
    private int numeroMesa;
    private int numeroJugadores;
    private double ganancias;
    private double perdidas;
    private double balance;
    private TipoJuego tipoJuego;

    //Constructor para generar mesas dentro del programa
    public Mesa (int numeroJugadores, TipoJuego tipoJuego){
        this.codigo = generarCodigo();
        this.numeroMesa = ++contadorMesas;
        validarNumeroJugadores(tipoJuego,numeroJugadores);
        this.numeroJugadores = numeroJugadores;
        setTipoJuego(tipoJuego);
    }

    //Metodo para generar un codigo
    private String generarCodigo(){
        return "MESA-" + UUID.randomUUID().toString().substring(0,5).toUpperCase();
    }

    //Metodo para validar el número máximo de jugadores por tipo de juego
    private void validarNumeroJugadores(TipoJuego tipo, int nJugadores){
        if (nJugadores <= 0){
            throw new NotEnoughPlayersException("No puede ser 0 o menos jugadores en la mesa");
        }
        switch (tipo){
            case BLACKJACK:
                if (nJugadores > 7){
                    throw new IllegalArgumentException("Una mesa de BLACKJACK no puede tener más de 7 jugadores");
                }
                break;
            case POKER:
                if (nJugadores >10){
                    throw new IllegalArgumentException("Una mesa de poker no puede tener más de 10 jugadores");
                }
                break;
        }
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumeroMesa(){
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa){
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public void setNumeroJugadores(int numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public double getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(double perdidas) {
        this.perdidas = perdidas;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public TipoJuego getTipoJuego() {
        return tipoJuego;
    }

    public void setTipoJuego(TipoJuego tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "codigo='" + codigo + '\'' +
                ", numeroMesa=" + numeroMesa +
                ", numeroJugadores=" + numeroJugadores +
                ", ganancias=" + ganancias +
                ", perdidas=" + perdidas +
                ", balance=" + balance +
                ", tipoJuego=" + tipoJuego +
                '}';
    }
}
