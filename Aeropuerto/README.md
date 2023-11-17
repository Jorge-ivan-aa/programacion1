# Proyecto final: controlador de aeropuerto

El proyecto final de la asignatura programación 1
se basa en el desarrollo de un software de control 
o gestion de vuelos para un aeropuerto. Para alcanzar
tal objetivo se plantearon las siguientes clases:

- **Main:** Es la clase principal donde se instancian las
clases y se arma el menu principal desde donde se coordinan
las funciones requeridas por el proyecto.

- **Directorio:** Es la clase donde se obtiene la informacion
de las instancias de los objetos almacenados en la clase 
BaseDeDatos, de forma legible.

- **Modificador:** Es la clase donde se modifica o genera la 
informacion de las instancias de los objetos almacenados en la 
clase BaseDeDatos.

- **BaseDeDatos:** Es la clase donde se instancian y se almacena
la informacion de las clases Aerolinea, Piloto, Torre y Vuelo.
Ademas, se crean listas con los objetos del mismo tipo para un facil
acceso.

- **ListaAtributos:** Se trata de una clase de utilidad que recibe
listas de objetos y genera nueva listas con solo atributos del mismo
tipo de ese objeto.

- **Aerolinea, Piloto, Torre y Vuelo:** Son las clases base donde se
crean los atributos y metodos utiles del proyecto. Con lo que mas adelante
se va a instanciar clases para el funcionamiento correcto del controlador.

# Estructura del proyecto
```
src
├── main
│   └── java
│       └── aeropuerto
│           ├── Main.java
│           └── modules
│               ├── Directorio.java
│               ├── Modificador.java
│               ├── objects
│               │   ├── BaseDeDatos.java
│               │   └── ListaAtributos.java
│               └── templates
│                   ├── Aerolinea.java
│                   ├── Categoria.java
│                   ├── Piloto.java
│                   ├── Torre.java
│                   └── Vuelo.java
└── test
    └── java
        └── aeropuerto
            ├── AerolineaTest.java
            ├── PilotoTest.java
            └── VueloTest.java
```