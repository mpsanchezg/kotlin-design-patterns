# Abstract Factory

Es otro nivel del Factory Method, más "abstracto". jaja
Supongamos que tenemos varios tipos de fuente de datos (DataSources).
Muchas de estas tienen cosas en común, como por ejemplo el cómo se muestra la data.
La clase que necesite esta data no debe preocuparse de esto ni de qué tipo de factory necesita. Para ello, se crea una clase abstracta que permite mostrar esta data, para que así esta clase no tenga que llamar a cada factory.
Al final, el objetivo de la clase es mostrar, no preocuparse a cuál DataSource debe acceder.

- Provee una forma de acceder a la funcionalidad sin tener que preocuparse cómo implementar dicha funcionalidad
- Un nivel de abstracción bajo el factory pattern
- Permite una separación de preocupaciones mayor al factory method.
