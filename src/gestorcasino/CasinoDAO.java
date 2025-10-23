package gestorcasino;

import java.util.List;

public interface CasinoDAO {
    //Metodos CRUD
    /**
     * Crea un objeto usuario
     */
    public void crearUsuario();

    /**
     * Crea un objeto Mesa
     */
    public void crearMesa();

    /**
     * Consulta toda la información de la mesa
     *
     * @param codigo único de la mesa de la que se quiere consultar la información
     *
     * @return información de la mesa solicitada
     */
    public String consultaMesa(String codigo);

    /**
     * Consulta toda la información de un usuario
     * 
     * @param dni Identificador único de cada usuario
     *            
     * @return Toda la información del usuario solicitado
     */
    public String consultaUsuario(String dni);

    /**
     * Actualiza la información de una mesa
     *
     * @param codigo único de una mesa
     *
     * @return True si se ha podido actualizar los datos de la mesa
     */
    public boolean actualizarMesa(String codigo);

    /**
     * Actualiza la información de un usuario
     *
     * @param dni único que permite identificar al usuario
     *
     * @return True si se ha podido actualizar los datos del usuario
     */
    public boolean actualizarUsuario(String dni);

    /**
     * Borra una mesa
     *
     * @param mesa, recibe el objeto Mesa
     *
     * @return True si se ha podido eliminar el objeto
     */
    public boolean borrarMesa(Mesa mesa);

    /**
     * Borra un cliente completamente
     *
     * @param cliente, recibe el objeto Cliente
     *
     * @return True si se ha podido eliminar la mesa
     */
    public boolean borrarUsuario(Cliente cliente);

    //Metodos no CRUD
    /**
     * Devuelve el valor del dinero invertido en comida/bebida de un cliente
     *
     * @param cliente a devolver lo invertido en comida
     *
     * @return Lo gastado en alimentos por cliente
     */
    public double dineroInvertidoAlimentos(Cliente cliente);

    /**
     * Devuelve el valor del dinero invertido por un cliente en el casino
     *
     * @param cliente a devolver lo invertido en el casino
     *
     * @return Lo gastado en el casino por cliente
     */
    public double dineroInvertido(Cliente cliente);

    /**
     * Devuelve la cantidad de veces que un cliente ha jugado en una mesa
     * 
     * @param cliente Objeto cliente sobre el que se quiera consultar
     *
     * @param mesa Objeto Mesa sobre la que ha jugado cliente
     *
     * @return La cantidad de veces que ha jugado cliente en una mesa
     */
    public int vecesJugadasMesa(Cliente cliente, Mesa mesa);


    /**
     * Devuelve el total de lo ganado en mesas
     *
     * @return Lo ganado en todas las mesas
     */
    public double ganadoMesas();

    /**
     * Devuelve el total de lo ganado en establecimientos
     *
     * @return La suma de lo ganado en todos los establecimientos
     */
    public double ganadoEstablecimientos();

    /**
     * Devuelve el cliente que mas ha gastado en el casino
     *
     * @return El cliente que más ha gastado en el casino
     */
    public Cliente mayorCliente();

    /**
     * Devuelve una lista con las mesas que sean de tipoJuego
     *
     * @param tipoJuego TipoJuego a buscar en el archivo
     *
     * @return Lista con las mesas de tipoJuego
     */
    public List<Mesa> mesaPorJuego(TipoJuego tipoJuego);
}
