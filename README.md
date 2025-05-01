# BibliotecaPOO

[![Repositorio en GitHub](https://img.shields.io/badge/GitHub-Repositorio-blue)](https://github.com/Hageend/BibliotecaPOO)

## Índice
1. [Descripción del proyecto](#descripción-del-proyecto)  
2. [Funcionalidades](#funcionalidades)  
3. [Conceptos a conocer](#conceptos-a-conocer)  
4. [Estructura del código](#estructura-del-código)  
5. [Archivos](#archivos)  
6. [Capturas de pantalla](#capturas-de-pantalla)  
7. [Instrucciones para compilar y ejecutar](#instrucciones-para-compilar-y-ejecutar)
8. [Enlace al repositorio de GitHub](#enlace-al-repositorio-de-github) 

---

## **Descripción del Proyecto**
**BibliotecaPOO** es un sistema de gestión de bibliotecas desarrollado en Java utilizando Programación Orientada a Objetos. Este programa permite administrar libros, usuarios y préstamos de manera eficiente, ofreciendo una interfaz de línea de comandos para interactuar con las funcionalidades principales.

---

## **Funcionalidades**
- **Gestión de Libros**:
  - Agregar nuevos libros (título, autor, ISBN, género).
  - Eliminar o modificar libros existentes.
  - Buscar libros por título, autor o ISBN.
  - Mostrar listados de libros disponibles y prestados.

- **Gestión de Usuarios**:
  - Registrar nuevos usuarios (nombre, ID, correo).
  - Eliminar o actualizar información de usuarios.
  - Consultar usuarios registrados.

- **Préstamos y Devoluciones**:
  - Registrar préstamos de libros a usuarios.
  - Gestionar devoluciones y calcular multas por retraso (si aplica).
  - Ver historial de préstamos activos y finalizados.

- **Persistencia de Datos**:
  - Guardar y cargar datos en archivos para conservar la información entre sesiones.

---

## Conceptos a conocer

Para comprender y trabajar con este proyecto, es fundamental dominar los siguientes conceptos de Programación Orientada a Objetos (POO):

### 1. Programación Orientada a Objetos (POO)
Paradigma de programación que organiza el código en "objetos" que contienen:
- **Atributos** (datos/propiedades)
- **Métodos** (funciones/comportamientos)
- Ejemplo en el proyecto: Clases `Libro` y `Usuario` como objetos centrales

### 2. Herencia
Mecanismo que permite crear nuevas clases basadas en clases existentes:
- **Reutilización** de código
- **Jerarquía** de clases (padre → hijo)
- Ejemplo aplicado: Posible herencia de `Usuario` a `UsuarioPremium` con funcionalidades extendidas

### 3. Polimorfismo
Capacidad de objetos de diferentes clases para responder al mismo mensaje/método:
- **Sobrecarga**: Múltiples métodos con mismo nombre pero diferentes parámetros
- **Sobrescritura**: Redefinición de métodos heredados
- Ejemplo práctico: Método `mostrarInfo()` podría comportarse distinto en `Libro` vs `Usuario`

```java
// Ejemplo de polimorfismo en el proyecto
public class Material {
    public void mostrarDetalles() { /*...*/ }
}

public class Libro extends Material {
    @Override
    public void mostrarDetalles() {
        // Implementación específica para libros
    }
}  
```

---

## **Estructura del Código**
El proyecto está organizado en las siguientes clases principales:

1. **`Libro`**:  
   Encapsula los atributos de un libro (título, autor, ISBN, género, estado de disponibilidad).

2. **`Usuario`**:  
   Gestiona la información de los usuarios (nombre, ID, correo, historial de préstamos).

3. **`Prestamo`**:  
   Controla las operaciones de préstamo y devolución, incluyendo fechas y multas.

4. **`Biblioteca`**:  
   Clase central que coordina las operaciones entre libros, usuarios y préstamos. Contiene métodos para:
   ```java
   public void agregarLibro(Libro libro) { ... }
   public void realizarPrestamo(String isbn, String usuarioId) { ... }
   public void mostrarLibrosDisponibles() { ... }
   ```
  
5. **`Main`**:  
    Inicia la aplicación y maneja el menú interactivo:
   ```java
   public static void main(String[] args) {  
    Biblioteca biblioteca = new Biblioteca();  
    biblioteca.cargarDatos(); // Carga datos desde archivos  
    mostrarMenu(biblioteca);
    }
    ```

## **Archivos**
Lista de archivos principales en el repositorio:  
- `Libro.java`: Define la clase `Libro` y sus atributos (título, autor, ISBN, género).  
- `Usuario.java`: Implementa la lógica para gestionar usuarios (registro, búsqueda y eliminación).  
- `Prestamo.java`: Maneja préstamos, devoluciones y cálculo de multas por retraso.  
- `Biblioteca.java`: Clase central con métodos para operaciones del sistema (agregar libros, gestionar préstamos).  
- `Main.java`: Punto de entrada del programa y menú interactivo.

---

## Capturas de pantalla

### Interfaz principal
![Menú principal del sistema](screenshots/main_menu.png)  
*Menú interactivo con las opciones disponibles*

### Gestión de libros
![Formulario para agregar libros](screenshots/add_book.png)  
*Registro de nuevos libros en el sistema*

![Listado completo de libros](screenshots/book_list.png)  
*Visualización de todos los libros registrados*


---

## **Instrucciones para compilar y ejecutar**

### Requisitos:  
- Java JDK 11+ instalado.  

### Pasos:  
1. Clona el repositorio:  
   ```bash  
   git clone https://github.com/Hageend/BibliotecaPOO.git
   ```


2. Navega al directorio:
   ```bash  
   cd BibliotecaPOO
   ```

3. Compila todos los archivos Java:
   ```bash  
   javac -d . src/*.java
   ```

4. Ejecuta el programa:
   ```bash  
   java Main
   ```
