package gestorcasino;

public class Mesa {
    private String codigo;
    private int numeroMesa;
    private int numeroJugadores;
    private double ganancias;
    private double perdidas;
    private double balance;
    private TipoJuego tipoJuego;

    public Mesa (String codigo, int numeroMesa ,int numeroJugadores, double ganancias, double perdidas, double balance){
        setCodigo(codigo);
        setNumeroMesa(numeroMesa);
        setNumeroJugadores(numeroJugadores);
        setGanancias(ganancias);
        setPerdidas(perdidas);
        setBalance(balance);
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

    public void setNumeroMesa(int nMesa){
        this.numeroMesa = nMesa;
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
}
