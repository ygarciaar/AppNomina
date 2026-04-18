// Sistema de Nómina con Vaadin

// Descripción

Este proyecto es una aplicación web desarrollada en **Java** utilizando el framework **Vaadin**, que permite calcular la nómina de diferentes tipos de empleados mediante una interfaz gráfica sencilla.

El sistema aplica conceptos de **Programación Orientada a Objetos (POO)** como herencia, polimorfismo y abstracción para calcular el salario según el tipo de contrato.


// Estructura del proyecto

El proyecto está organizado en paquetes, destacando:

```
views.nomina
│
├── Nomina.java
├── INomina.java
├── NominaEmpleadoFijo.java
├── NominaPorHoras.java
├── NominaComision.java
├── NominasPredefinidas.java
└── NominaView.java
```

---------------

* Conceptos aplicados

  * Herencia

Las clases de empleados heredan de la clase base `Nomina`.

  * Polimorfismo

Cada tipo de empleado implementa el método `calcularSalario()` de forma diferente.

  * Encapsulamiento

Los atributos son privados y se accede a ellos mediante métodos.

  * Abstracción

La clase `Nomina` define una estructura general para todos los empleados.

-----------------

* Tipos de nómina implementados

  * Empleado Fijo

    Cálculo:
    `salario = salarioBase + bonificación`

  * Empleado por Horas

    * Cálculo:
    `salario = horasTrabajadas × valorHora`

  * Empleado por Comisión

    * Cálculo:
    `salario = ventas × porcentaje`

----------------

* Interfaz de usuario

La aplicación cuenta con una interfaz web desarrollada con Vaadin que permite:

* Seleccionar un tipo de empleado
* Ingresar datos (horas o ventas)
* Calcular el salario
* Visualizar el resultado

---

* Ejecución del proyecto

1. Clonar el repositorio:

```
git clone <URL_DEL_REPOSITORIO>
```

2. Abrir el proyecto en IntelliJ o VS Code

3. Ejecutar la clase principal:

```
Application.java
```

4. Abrir en el navegador:

```
http://localhost:8080
```

----------------

* Ejemplo de uso

1. Seleccionar un empleado
2. Ingresar valor:

   * Horas (empleado por horas)
   * Ventas (empleado por comisión)
3. Presionar **Calcular**
4. Visualizar el salario

-----------------

* Posibles mejoras

* Conexión a base de datos
* Cálculo de prestaciones (salud, pensión)
* Gestión de empleados (CRUD)
* Mejoras en el diseño de la interfaz

------------------

// Autores 

 - Hendris Urbina
 - Ariel De La Rosa
 - Yeison Arbey García Mesa

