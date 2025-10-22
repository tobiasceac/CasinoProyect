package gestorcasino;

public interface CasinoDAO {
    //Metodos CRUD

    /**
     * Crea un objeto usuario
     */
    public void crearUsuario();

    /**
     * Crea un objeto Gestor_Casino.Mesa
     */

    public void crearMesa();



    public String consultaMesa();

    public String consultaUsuario();

    public boolean actualizarMesa();

    public boolean actualizarUsuario();

    public boolean borrarMesa();

    public boolean borrarUsuario();



    //Metodos no CRUD

    /**
     * Devuelve el valor de
     * @return
     */
    public float balancePorMesa();

    /**
     *
     * @return
     */
    public float dineroInvertidoAlimentos();

    public float dineroInvertido();

    public int vecesJugadasMesa();
}
