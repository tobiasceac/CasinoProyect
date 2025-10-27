package proyecto.casino;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private double ganancias = 0;
    private double gastos = 0;

    public Cliente(String dni, String nombre, String apellidos){
        setDni(dni);
        setNombre(nombre);
        setApellidos(apellidos);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni == null) {
            throw new IllegalArgumentException("ERROR: El DNI no puede estar vacio");
        }

        dni = dni.trim().toUpperCase();

        if(!validarDni(dni)){
            throw new IllegalArgumentException("ERROR: DNI no valido");
        }
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre no puede estar vacío o ser nulo.");
        }
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        if (apellidos == null || apellidos.trim().isEmpty()) {
            throw new IllegalArgumentException("Apellidos no puede estar vacío o ser nulo.");
        }
        this.apellidos = apellidos;
    }

    public double getGanancias() {
        return ganancias;
    }

    public void setGanancias(double ganancias) {
        if (ganancias < 0) {
            throw new IllegalArgumentException("Las ganancias no puede ser negativo.");
        }
        this.ganancias = ganancias;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        if (gastos > 0) {
            throw new IllegalArgumentException("height no puede ser negativo.");
        }
        this.gastos = gastos;
    }

    private boolean validarDni(String dni){
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X","B",
                "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        if (!dni.matches("^[0-9]{8}[A-Z]$")){
            return false;
        }

        String let = dni.substring(dni.length() -1);
        String numeros = dni.replaceAll("[^0-9]", "");
        int resto = Integer.parseInt(numeros) % 23;

        return let.equals(letras[resto]);
    }
}
