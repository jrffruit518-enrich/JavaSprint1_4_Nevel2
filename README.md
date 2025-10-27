# JavaSprint1_4_Nevel2

## 📄 Descripción - Enunciado del ejercicio

Este proyecto contiene una serie de ejercicios de Java correspondientes al **Nivel 2** del módulo JavaSprint1_4, enfocados en el uso de la biblioteca **AssertJ** para realizar pruebas unitarias. Los ejercicios demuestran conceptos fundamentales como:

1. Verificación de igualdad y desigualdad de valores entre objetos enteros.
2. Comprobación de referencias de objetos (igualdad y diferencia).
3. Comparación de arrays de enteros.
4. Verificación del orden, contenido y unicidad de elementos en un `ArrayList`.
5. Validación de la existencia de claves en un `HashMap`.
6. Comprobación del lanzamiento de excepciones (`ArrayIndexOutOfBoundsException`).
7. Verificación de un objeto `Optional` vacío.

Cada ejercicio incluye clases de prueba que utilizan **JUnit 5** y **AssertJ** para validar los requisitos especificados.

## 💻 Tecnologías Utilizadas

- Java 17
- JUnit 5
- AssertJ
- IntelliJ IDEA (opcional, como entorno de desarrollo)

## 📋 Requisitos

- Java JDK 17 o superior instalado.
- Un IDE o editor de texto compatible con Java (IntelliJ IDEA, Eclipse, VS Code, etc.).

## 🛠️ Instalación

Clona este repositorio:
```
git clone https://github.com/jrffruit518-enrich/JavaSprint1_4_Nevel2.git
```
Accede al directorio del proyecto:
```
cd JavaSprint1_4_Nevel2
```
Asegúrate de tener el JDK configurado correctamente.

## ▶️ Ejecución

Compila los archivos Java:
```
javac sprint1Tasca_S104Nivell2_/.java
```
Ejecuta las pruebas unitarias de cada ejercicio utilizando un entorno de pruebas como JUnit (por ejemplo, desde un IDE como IntelliJ IDEA o ejecutando directamente con Maven/Gradle si está configurado). Para ejecutar un ejercicio específico, utiliza el comando correspondiente a la clase de prueba, por ejemplo:
```
java -cp . org.junit.runner.JUnitCore sprint1Tasca_S104Nivell2_1.TestInteger
```
Ejemplo para el ejercicio 7:
```
java -cp . org.junit.runner.JUnitCore sprint1Tasca_S104Nivell2_7.TestOptional
## 🌐 Desplegament

No aplica para este ejercicio, ya que son pruebas unitarias ejecutadas localmente.

Opcionalmente, se puede empaquetar como un archivo .jar ejecutable:
```
jar cfe JavaSprint1_4_Nevel2.jar sprint1Tasca_S104Nivell2_7.TestOptional -C out .
```
## 🤝 Contribucions

¡Las contribuciones son bienvenidas! Por favor, sigue los siguientes pasos para contribuir:

1. Haz un fork del repositorio.
2. Crea una nueva rama:
```
   git checkout -b feature/NuevaFuncionalidad
```
3. Realiza tus cambios y haz commit:
```
   git commit -m "Añade nueva funcionalidad"
```
4. Sube los cambios a tu rama:
```
   git push origin feature/NuevaFuncionalidad
```
5. Abre un pull request para revisión.