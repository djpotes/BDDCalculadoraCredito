# Tyba QA Engineer test

Las pruebas fueron automatizadas usando el poderoso framework serenity para la generación
de reportes. Con el objetivo de ser mas organizado, los scripts de automatización son
separados en definiciones, steps y pages (POM pattern).
Tambien usé Jbejave para escribir las historias usando Gherkin como lenguaje.

### Herramientas utilizadas ###

* IntelliJ IDEA
    * Con Plugin : Jbejave Support v1.53
* Java v11.07
* Maven v3.6.3
* Jbejave
* Chromedriver v84.0.4147.30
* JUnit

### Framework ###

* Serenity BDD

### Escenarios de prueba / Historias

* Ruta: _**../BDDCalculadoraCredito/src/test/resources/stories/calcular_credito**_

### Correr las pruebas ###

* Correr el comando: _**mvn clean verify**_

### Reportes ###

* Despues de correr las pruebas, consultar el reporte accediento la ruta:
    * Ruta: _**../BDDCalculadoraCredito/target/site/serenity/index.html**_
    