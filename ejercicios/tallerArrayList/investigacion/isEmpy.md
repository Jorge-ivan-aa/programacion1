# Investigación como se utiliza isEmpty

El metodo isEmpty sirve para saber si un arrayList
está vacio o no. El metodo devuelve **true** si la lista
está vacia o **false** si tiene elementos.

## Ejemplo:

Se puede ver el codigo completo en `Empty.java`.

``` java 
// ... codigo

ArrayList<String> lista = new ArrayList<>();
if (lista.isEmpty()) { // true
    System.out.println("la lista está vacia.")
} else {
    System.out.println("la lista tiene elementos.")
}
// return: "la lista está vacia"

// resto de codigo..
```
