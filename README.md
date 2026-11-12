# POO – Ejercicios (Semana 11)

Ejercicios del curso de **Programación Orientada a Objetos** en Java, desarrollados en IntelliJ IDEA.
Esta semana se trabaja con **colecciones (`List` / `ArrayList`)**, formas de recorrerlas, búsqueda y eliminación de elementos, y la sobrescritura de los métodos `toString()` y `equals()`.

## Tecnologías

- Java 21
- Maven
- IntelliJ IDEA

## Estructura del proyecto

```
src/main/java/pe/edu/isil/
├── Estudiante.java   # Clase modelo: nombre y edad
├── Producto.java     # Clase modelo: nombre y precio, con equals() propio
├── Ejemplo1.java
├── Ejemplo2.java
├── Ejemplo3.java
├── Ejemplo4.java
├── Ejemplo5.java
├── Ejemplo6.java
├── Ejemplo7.java
└── Main.java         # Plantilla inicial de IntelliJ
```

## Clases modelo

| Clase | Atributos | Qué se practica |
|-------|-----------|-----------------|
| `Estudiante` | `nombre`, `edad` | Encapsulamiento (atributos `private` + getters) y `toString()` sobrescrito |
| `Producto` | `nombre`, `precio` | `toString()` y `equals()` sobrescritos: dos productos son iguales si tienen el mismo nombre |

## Ejercicios

| Ejemplo | Tema | Descripción |
|---------|------|-------------|
| `Ejemplo1` | Crear una lista | Agrega 5 estudiantes a un `ArrayList` y muestra cuántos hay con `size()` |
| `Ejemplo2` | Recorrer con for-each | Imprime cada estudiante usando `for (Estudiante e : lista)` |
| `Ejemplo3` | Recorrer con `Iterator` | Recorre la lista con `hasNext()` y `next()` |
| `Ejemplo4` | Búsqueda | Busca un estudiante por nombre y avisa si no lo encuentra |
| `Ejemplo5` | Eliminar con `Iterator` | Elimina a un estudiante de forma segura con `iterator.remove()` |
| `Ejemplo6` | Eliminar con `removeIf` | Elimina a los menores de 30 años usando una expresión lambda |
| `Ejemplo7` | Comparar objetos | Compara productos con `equals()` para ver cuándo dos objetos se consideran iguales |

## Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/adrianbasurco/POO-Ejercicios.git
   ```
2. Ábrelo en IntelliJ IDEA (**File → Open** y selecciona la carpeta).
3. Abre cualquier `EjemploX.java` y pulsa el botón ▶ junto al método `main`.

## Autor

**Adrián Basurco**