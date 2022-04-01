# Reto ChoucairTesting S.A.

---
![image](https://user-images.githubusercontent.com/52754373/161196629-7b0d224e-c918-4334-8d01-837e1aa3309a.png)
![image](https://user-images.githubusercontent.com/52754373/161196664-4770caa3-2706-4326-939e-2979873ced9c.png)


**Cucumber**

Es una herramienta **para** implementar metodologías como el Behaviour Driven Development (BDD), que permite ejecutar descripciones funcionales en texto plano como pruebas **de** software automatizadas.

**Serenity**

Es una herramienta que nos facilita hacer BDD centralizando los test de nuestra aplicación. El reporte generado nos indica el estado funcional de nuestra aplicación con gran detalle.

**BDD**

Es una estrategia de desarrollo dirigido por comportamiento, nacido desde el desarrollo guiado por pruebas. La idea básica del Behaviour-Driven Development (**BDD**) es explorar, descubrir y luego desarrollar el comportamiento deseado del software, usando conversaciones, ejemplos concretos y pruebas automatizadas.

---

Para el desarrollo de las pruebas se requiere que se de cumplimiento a cada uno de los principios SOLID, principalmente de S y O, donde la responsabilidad única y el no depender de futuros cambios o modificaciones bruscas al código son importantes

Cuando se habla de cumplir con los principios SOLID también hay que entrar a estudiar la estructuración que se dará a un Test, donde no se trata de realizar testeos en bruto a la sección en especifico, sino en asignar una metodología de trabajo donde se estructure el Test a la sección o caso de uso, es aquí cuando se da a conocer ScreenPlay, que plantea una estructura que implemente POM, POO y los principios SOLID a los Test no orientados a interfaces en si mismas, sino a las tareas a realizar para el caso de uso

ScreenPlay se caracteriza por tener una estructura de la siguiente forma:

- Features+Runner
- StepDefinitions
- Tasks
- Interactions
- Questions
- User Interface

Donde en el caso del reto presentado Features y StepDefinitions caracterizaran lo relacionado al Registro del usuario; Tasks viene a tener como objetivo el registro del usuario y las interacciones serán las acciones a realizar para llevar a cabo el registro (Completar los formularios correctamente)

Esto facilita la abstraccion de la automatizacion, para sistematizar y ordenar el Test en relaciona a la POO.

A su vez, estamos categorizando el desarrollo en capas:

- Capa Model: Objetos o entidades a tener en cuenta
- Capa Util: Acciones potenciales de los objetos o entidades
- Capa Exceptions: Control a incidencias en el comportamiento no parametrizado de la aplicación

---

Pasos realizados para ejecutar la prueba

- Parametrización de dependencias Gradle (build.gradle)
- Parametrización de configuraciones para Serenity (serenity.properties)
- Crear las **features** en relaciona al testeo (caso_de_uso.feature)
    - Se indica de que forma las acciones explicita que haran el actor para el caso de uso en cuestión
- De los **features** se generan los métodos abstraídos (runners:: ActionActor )
- Se ejecuta el runner en cuestión, la consola enviara los métodos abstraídos los cuales se copian para ser instanciados en los **StepDefinitions**
- Se instancian los métodos relacionados a la abstracción de los features (stepdefinitions:: ActionActorStepDefinitios )
    - Se pegan los métodos y se importan sus referentes de las utilidades de **cucumber** y demás requerimientos de **serenity**
    - En los métodos se instancian las referencias de las tareas a realizar por el actor orientadas al caso de uso en cuestión
- Se implementan las acciones para la prueba del caso de uso ( tasks:: ActionActor)
    - Se implementa **Task** para la clase y se instancias las acciones en referencia a la prueba, lo que permite que a través **instrumented**, se pueda encapsular las clase y las acciones definiditas, para luego retornar y operarlas por los métodos de **StepDefinitions**. Esto gracias a **serenity**
- Se crean las diferentes interfaces que hacen referencia en las secciones que el aplicativo web se despliega
    - Para cada accion en cada una de las interfaces se define el mapeo a los id, clases o siguientes parámetros que permitan ubicar el elemento en cuestión al que se quiere aplicar una accion en concreto. Esto gracias a la utilidad Target de **Serenity**-**ScreenPlay**
