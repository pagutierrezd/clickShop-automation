# clickShop Automation

### Descripción
- Proyecto de práctica en automatización de pruebas utilizando Selenium WebDriver y Cucumber, enfocado en la implementación
de un escenario del feature `Carrito de Compras`.

### Características del Proyecto
- Uso de BDD (Behavior-Driven Development) para escribir pruebas en un lenguaje natural (Gherkin).
- Automatización de un flujo típico de comercio electrónico.
- Manejo de variantes en el flujo: opciones de envío a domicilio y recogida en tienda.
- Implementación del patrón Page Object Model (POM) para mejorar la mantenibilidad y reutilización del código.

## Estructura
```
src
├── main
│   ├── java
│   │   └── co.tiendasjumbo
│   │       ├── driver          # Configuración del WebDriver
│   │       ├── pageObject      # Clases que representan las páginas del sitio web
│   │       ├── steps           # Métodos que definen la lógica de los pasos reutilizables
│   │       └── utils           # Métodos de utilidad generales para el proyecto
│   └── resources               # Archivos de recursos necesarios (por ahora vacío)
└── test
    ├── java
    │   └── co.tiendasjumbo
    │       ├── runners         # Clase(s) para ejecutar las pruebas con Cucumber
    │       └── stepDefinitions # Implementación de los pasos definidos en los archivos .feature
    └── resources
        └── features            # Archivos .feature que contienen los escenarios en Gherkin
```
# Cómo Ejecutar el Proyecto

## 1. Requisitos Previos:

- Java JDK 11 Correto.
- Gradle instalado.
- Navegador Chrome y su respectivo driver (configurado en el proyecto).

## 2. Clonar el Repositorio:
`git clone https://github.com/pagutierrezd/clickShop-automation.git`

## 3. Ejecutar desde el Runner:
- Navega a la clase en `src/test/java/co.tiendasjumbo/runners`.
- Haz clic derecho sobre la clase `agregarProductoRunner` y selecciona "Run".