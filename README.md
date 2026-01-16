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

## Descripción

En esta tarea se analizó y refactorizó código Java que violaba los principios de diseño **SOLID**, con el objetivo de mejorar la calidad del diseño orientado a objetos, manteniendo la funcionalidad original del sistema.

Cada principio fue trabajado de forma independiente, separando el **código original (bad)** del **código refactorizado (fixed)**, aplicando buenas prácticas como **KISS**, **DRY** y **YAGNI**.

---

## Análisis de Violaciones y Refactorización

### 1. Principio de Responsabilidad Única (SRP)

La clase `UserDataManager` manejaba múltiples responsabilidades:
- Validación de datos del usuario  
- Procesamiento de información  
- Ejecución como clase principal (`main`)  
- Salida de información  

**Solución:**  
Se separaron las responsabilidades en distintas clases, asegurando que cada una tenga un único motivo de cambio, cumpliendo así con el SRP.

---

### 2. Principio Abierto/Cerrado (OCP)

Para agregar una nueva forma geométrica era necesario modificar la lógica existente mediante estructuras `if-else`, lo que violaba el principio de estar abierto a extensión pero cerrado a modificación.

**Solución:**  
Se creó una clase abstracta `Shape` con el método `calculateArea()`, el cual es implementado por cada forma concreta. De esta manera, se pueden agregar nuevas formas sin modificar el código existente.

---

### 3. Principio de Sustitución de Liskov (LSP)

La clase `SquareOriginal` heredaba de `RectangleOriginal`, pero alteraba el comportamiento esperado. Al usar los métodos `setWidth()` y `setHeight()`, el cuadrado modificaba ambos valores simultáneamente, produciendo resultados incorrectos en el cálculo del área.

Esto viola el LSP, ya que un objeto de la clase hija no puede sustituir correctamente a uno de la clase padre.

**Solución:**  
Se refactorizó el diseño creando una superclase común `Shape`, permitiendo que `Rectangle` y `Square` sean independientes y correctamente sustituibles sin romper el comportamiento esperado.

---

### 4. Principio de Segregación de Interfaces (ISP)

La interfaz `WorkerOriginal` obligaba a las clases a implementar métodos que no eran necesarios para su funcionalidad, como en el caso de la clase `Robot`.

**Solución:**  
La interfaz fue dividida en interfaces más pequeñas y específicas, de modo que cada clase implemente únicamente los métodos que realmente necesita.

---

### 5. Principio de Inversión de Dependencias (DIP)

La clase `CarOriginal` dependía directamente de la clase concreta `EngineOriginal`, generando un alto acoplamiento.

**Solución:**  
Se creó una interfaz `Engine`, la cual es inyectada por parámetro en la clase `Car`. Esto permite desacoplar el código y facilitar la extensión mediante diferentes tipos de motores sin modificar la clase `Car`.

---

## Conclusión

La refactorización permitió aplicar correctamente los cinco principios SOLID, mejorando la modularidad, mantenibilidad y extensibilidad del sistema, sin afectar su funcionamiento original.

El proyecto demuestra un diseño orientado a objetos con alta cohesión, bajo acoplamiento y uso adecuado de abstracciones.
