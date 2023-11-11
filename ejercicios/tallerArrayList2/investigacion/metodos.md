
# Metodos ArrayList2

## contains()

Función: Comprueba si la colección contiene un elemento específico.
Uso: boolean contains(Object o)
Ejemplo:
```java
List<String> lista = Arrays.asList("A", "B", "C");
boolean contieneB = lista.contains("B");
```

## clear()
Función: Elimina todos los elementos de la colección.
Uso: void clear()
Ejemplo:
```java
List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
lista.clear();
```

## indexOf()
Función: Devuelve el índice de la primera aparición de un elemento en la lista.
Uso: int indexOf(Object o)
Ejemplo:
```java
List<String> lista = Arrays.asList("A", "B", "C");
int indiceB = lista.indexOf("B");
```

## lastIndexOf()
Función: Devuelve el índice de la última aparición de un elemento en la lista.
Uso: int lastIndexOf(Object o)
Ejemplo:
```java
List<String> lista = Arrays.asList("A", "B", "C", "B");
int ultimoIndiceB = lista.lastIndexOf("B");
```


## toArray()
Función: Convierte la lista en un array.
Uso: Object[] toArray()
Ejemplo:
```java
List<String> lista = Arrays.asList("A", "B", "C");
Object[] array = lista.toArray();
```

## addAll()
Función: Agrega todos los elementos de una colección a otra.
Uso: boolean addAll(Collection<? extends E> c)
Ejemplo:
```java
List<String> lista1 = new ArrayList<>(Arrays.asList("A", "B"));
List<String> lista2 = Arrays.asList("C", "D");
lista1.addAll(lista2);
```

## retainAll()
Función: Retiene solo los elementos presentes en la colección especificada.
Uso: boolean retainAll(Collection<?> c)
Ejemplo:
```java
List<String> lista1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
List<String> lista2 = Arrays.asList("B", "C", "D");
lista1.retainAll(lista2);
```

## subList()
Función: Devuelve una vista de la sublista en la colección.
Uso: List<E> subList(int fromIndex, int toIndex)
Ejemplo:

```java
List<String> lista = Arrays.asList("A", "B", "C", "D", "E");
List<String> subLista = lista.subList(1, 4);
```

## removeIf()
Función: Elimina los elementos que cumplen cierta condición.
Uso: boolean removeIf(Predicate<? super E> filter)
Ejemplo:

```java
List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
lista.removeIf(elemento -> elemento.startsWith("A"));
```

## replaceAll()
Función: Reemplaza cada elemento con el resultado de aplicar una función.
Uso: void replaceAll(UnaryOperator<E> operator)
Ejemplo:

```java
List<String> lista = new ArrayList<>(Arrays.asList("A", "B", "C"));
lista.replaceAll(String::toUpperCase);
```

## sort()

Función: Ordena los elementos de la colección.
Uso: void sort(Comparator<? super E> c)
Ejemplo:

```java
List<Integer> lista = Arrays.asList(3, 1, 4, 1, 5, 9, 2);
lista.sort(Comparator.naturalOrder());
```

## spliterator()
Función: Crea un iterador para recorrer elementos de la colección de manera paralela.
Uso: Spliterator<E> spliterator()
Ejemplo:
```java
List<String> lista = Arrays.asList("A", "B", "C");
Spliterator<String> spliterator = lista.spliterator();
```
