## Patrón de Diseño: Factory
El patrón Factory es un patrón de creación que proporciona una interfaz para crear objetos en una superclase, pero permite a las subclases alterar el tipo de objetos que se crearán. Esto se logra definiendo una interfaz para crear un objeto, pero permitiendo que las subclases alteren el tipo de objeto que se crea.

### Ejemplo de Implementación:
Imagina que estás desarrollando una aplicación de gestión de vehículos. En este escenario, puedes utilizar el patrón Factory para crear diferentes tipos de vehículos, como coches, motocicletas o camiones, según las necesidades del usuario.


## Patrón de Diseño: Factory Method
El patrón Factory Method es un patrón de creación que define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar. De esta manera, el Factory Method permite a una clase diferir la creación de instancias a las subclases.

### Ejemplo de Implementación:
Imagina que estás desarrollando un juego de estrategia en tiempo real (RTS) donde los jugadores pueden elegir diferentes tipos de unidades militares. En este caso, puedes utilizar el patrón Factory Method para permitir que cada facción del juego (por ejemplo, humanos, orcos, elfos) tenga su propio método para crear unidades militares.

## Patrón de Diseño: Builder
El patrón Builder es un patrón de creación que se utiliza para construir objetos complejos paso a paso. Permite crear diferentes tipos y representaciones de un objeto utilizando el mismo proceso de construcción.

### Ejemplo de Implementación:
Imagina que estás desarrollando un sistema de generación de informes donde los usuarios pueden crear informes personalizados con diferentes secciones, como encabezado, cuerpo y pie de página. En este caso, puedes utilizar el patrón Builder para construir informes con diferentes secciones de manera flexible.

### Patrón de Diseño: Prototype
El patrón Prototype es un patrón de creación que se utiliza para crear nuevos objetos basados en un prototipo existente. En lugar de crear objetos desde cero, el patrón Prototype clona un objeto existente y luego modifica los detalles según sea necesario.

## Ejemplo de Implementación:
Imagina que estás desarrollando un sistema de gestión de documentos donde los usuarios pueden crear diferentes tipos de documentos, como cartas, contratos o informes. En este caso, puedes utilizar el patrón Prototype para clonar un documento existente y luego personalizarlo según las necesidades del usuario.

## Patrón de Diseño: Singleton
El patrón Singleton es un patrón de creación que garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia. Es útil cuando solo se necesita una instancia de una clase en toda la aplicación.

### Ejemplo de Implementación:
Imagina que estás desarrollando un sistema de registro de eventos donde necesitas un registro centralizado para almacenar todos los eventos del sistema. En este caso, puedes utilizar el patrón Singleton para garantizar que solo haya una instancia del registro de eventos en toda la aplicación.

## Patrón de Diseño: Adapter
El patrón Adapter es un patrón estructural que permite que interfaces incompatibles trabajen juntas. Convierte la interfaz de una clase en otra interfaz que un cliente espera encontrar. El Adapter permite que clases con interfaces incompatibles puedan colaborar entre sí.

### Ejemplo de Implementación:
Imagina que estás integrando una biblioteca de terceros en tu aplicación que tiene una interfaz incompatible con el resto de tu código. En este caso, puedes utilizar el patrón Adapter para crear un adaptador que convierta la interfaz de la biblioteca de terceros en una interfaz compatible con tu código existente.

## Patrón de Diseño: Bridge
El patrón Bridge es un patrón estructural que separa la abstracción de su implementación, de modo que ambas puedan variar independientemente. Permite que las clases abstractas y sus implementaciones puedan cambiarse y extenderse de forma independiente.

### Ejemplo de Implementación:
Imagina que estás desarrollando un sistema de dibujo donde tienes diferentes formas geométricas (como círculos y cuadrados) y diferentes tipos de implementaciones de dibujo (como dibujar en una ventana de aplicaciones gráficas o en una ventana de terminal). En este caso, puedes utilizar el patrón Bridge para separar las formas geométricas de las implementaciones de dibujo, permitiendo que cambien independientemente.