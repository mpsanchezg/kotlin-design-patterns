# Factory Method

Factory method hace referencia a un método que crea.

Aquí se utilizará para proveer alguna funcionalidad o crear la instancia de una clase.

Por ejemplo, si tenemos la relación entre clases Currency y Country, Country necesitará saber cómo crear una Currency, sin embargo como son entidades distintas, no es necesario que esta sepa de lle o cómo hacerlo.
Para ello, se provee la funcionalidad CurrencyFactory que permitirá crear esta clase, sin que Country sepa acerca de esta, para así separar las responsabilidades.

Entonces, Factory Method provee un forma de acceder a la funcionalidad sin tener que preocuparse de la implementación.
Esto permite generar un separación de responsabilidades para que no hayan impactos gigantes en caso de que cambie la clase involucrada.

Finalmente, ayuda a testear mejor.