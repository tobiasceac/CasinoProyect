# Diseño de Clases
1. GestorCasino: Clase que gestionara los clientes, los establecimientos y las mesas de juego
2. Cliente: Clase que registra a las personas que entran en el casino, atributo clave: DNI 
3. Mesa: Clase abstracta padre que contiene los atributos en común de las mesas de juego
   1. BlackJack: Clase hija, tendrá los atributos del padre y sus distintos (nJugadores)
4. Establecimiento: Clase padre abstracta de la que heredarán las clases Bar, restaurante, etc
   1. Bar: Clase hija, tendrá los atributos del padre y sus atributos disntintos (carta? productos? precios?)
## Atributos de las clases
### Cliente
Atributos:
- DNI
- Nombre
- Apellidos
- Ganancias
- Dinero Invertido
### Mesa
#### Blackjack
### Establecimiento
#### Bar
# Metodos Crud
- Creación de usuario/mesa
- Consulta de usuario/mesa
- Actualizar de usuario/mesa
- Borrar de usuario/mesa
# Metodos no Crud
- Balance económico por mesa de juego
- Dinero invertido del usuario en comidas/bebidas (¿2 métodos independiente o 1 con balance general y además con dinero en bebidas y en comida?)
- Dinero invertido del usuario en cada mesa de juego
- ¿Número de veces que ha jugado un usuario en cada mesa?
# Implementación obligatoria
Debemos usar un archivo JSON (Podemos usar JSON-B o JSON-P) y XML
