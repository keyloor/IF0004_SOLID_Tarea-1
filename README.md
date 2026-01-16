- Tarea #1 Principios de diseño 

- Estudiantes: 

    Sebastián Marín Fernández C24530,
    Juan Pablo Jiménez Vargas C5G523,
    Keylor Barrantes Gomez C5D024.

Universidad de Costa Rica, Sede Occidente 

    IF-0004 Desarrollo de Software ll 

Profesora: Angélica María Ulate Céspedes 

        19 de enero de 2025 

 

Áreas donde el código viola los siguientes principios:

 

1. Principios de Responsabilidad única: 

La clase userDataManager está manejando los datos de usuario como la validación y además está manejando varios procesos y esa misma clase está funcionando como clase Main dando la salida (Lo que se realizo fue separar las clases para que no haga todo una sola clase). 

 

2. Principio de Abierto/Cerrado: 

Para añadir otra forma había que añadir otro if-else en la clase (Lo que se hizo fue darles un método de calcularArea() a cada clase de formas y extenderlas de la clase Shape para llamar al método sin tener en cuenta la forma). 

 

3. Principios de Sustitución de Liskov: 

SquareOriginal hereda de RectangleOriginal, pero no se comporta como un rectángulo. Cuando se usan setWidth() y setHeight(), el cuadrado cambia ambos valores, lo que da un área diferente a la que deberia dar. Esto viola Liskov porque la clase hija no puede usarse en lugar de la clase padre sin causar errores. 

 

4. Principios de Segregación de interfaces: 

La interfaz WorkerOriginal está dando métodos que no necesitas las clases sin sentido (Lo que se hizo fue dividir la interfaz en interfaces específicas para que las clases no tengan metodos que no necesitan). 

 

5. Dependency Inversion Principle: 

CarOriginal depende al 100% de EngineOriginal (Lo que se hizo fue crear un Engine por parámetros en la clase CarOriginal). 

 