# tp2eva3
## Descripcion
Realizar test JUnit sobre un proyecto Maven que incluye una clase basica (math.java) con un metodo que realiza una suma, y un test (testMath.java) que verifica la validez de la clase.
## Ejecutando los tests mediante maven
Una vez realizado *git clone* del proyecto, puedes ejecutar desde el raíz,

    mvn -Dtest=testMath test       
## Pasos para realizar el test JUnit en eclipse
1. crear un nuevo proyecto Maven
2. incorporar a src/main la clase Math.java
3. incorporar a src/test la clase testMah.java
4. ejecutar testMath.java como test JUnit
## Resultado
```
JunitTest.testMath,testMath [ejecutor:Junit 4](0,000s)
  testadd(0'000s) validado
  testNegativePositiveAddition(0,000s) no validado
  testnegativeAddition(0,000s) validado
  testPositiveNegativeAddition(0,000s) validado
```
