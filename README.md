# Tarea #1 – Principios de Diseño (SOLID)

## Información General

**Curso:** IF-0004 – Desarrollo de Software II  
**Universidad:** Universidad de Costa Rica – Sede Occidente  
**Profesora:** Angélica María Ulate Céspedes  
**Fecha de entrega:** 19 de enero de 2025  

### Estudiantes
- Sebastián Marín Fernández — C24530  
- Juan Pablo Jiménez Vargas — C5G523  
- Keylor Barrantes Gómez — C5D024  

---

## Descripción General

En esta tarea se analizan diferentes ejemplos de código en Java que violan los principios SOLID.  
Cada caso cuenta con:

- **Código original**, ubicado en la carpeta `bad` el cual presenta la violación del principio.
- **Código refactorizado**, ubicado dentro de la carpeta `good`, donde se aplica correctamente el principio correspondiente.

---

## Áreas donde el código viola los principios SOLID >

### 1. Principio de Responsabilidad Única (SRP)

La clase `UserDataManager` está manejando los datos de usuario como la validación y además está manejando varios procesos, y esa misma clase está funcionando como clase `Main` dando la salida.

Lo que se realizó fue separar las clases para que no haga todo una sola clase.

---

### 2. Principio Abierto/Cerrado (OCP)

Para añadir otra forma había que añadir otro `if-else` en la clase.

Lo que se hizo fue darles un método `calculateArea()` a cada clase de formas y extenderlas de la clase `Shape` para llamar al método sin tener en cuenta la forma.

---

### 3. Principio de Sustitución de Liskov (LSP)

`SquareOriginal` hereda de `RectangleOriginal`, pero no se comporta como un rectángulo.  
Cuando se usan `setWidth()` y `setHeight()`, el cuadrado cambia ambos valores, lo que da un área diferente a la que debería dar.

Esto viola Liskov porque la clase hija no puede usarse en lugar de la clase padre sin causar errores.

---

### 4. Principio de Segregación de Interfaces (ISP)

La interfaz `WorkerOriginal` está dando métodos que no necesitan algunas clases, lo cual no tiene sentido.

Lo que se hizo fue dividir la interfaz en interfaces específicas para que las clases no tengan métodos que no necesitan.

---

### 5. Dependency Inversion Principle (DIP)

`CarOriginal` depende al 100% de `EngineOriginal`.

Lo que se hizo fue crear un `Engine` que se pasa por parámetros en la clase `CarOriginal`, reduciendo el acoplamiento.
