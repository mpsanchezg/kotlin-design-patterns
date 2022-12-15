# Singleton Pattern

Network Communication Service necesita de cierta forma que exista una única instancia de este. 
Singleton es un tipo de patrón creacional, el que nos permitirá tener una única instancia.

Es el "single point of acces for a resource", es decir el que nos entregará la instancia del recurso que necesitamos.

Usos:
- Network manager
- Database access
- Logging
- Utility class(es)

Hay que tener ojo de no sobre usar este patrón sólo usarlo si es necesario. Solo es necesario cuando se necesita una única instancia del recurso. 

OJO que esto utiliza memoria del dispositivo.
