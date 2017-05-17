# JUnit-Testing

Creamos una clase Math.java, con un metodo para realizar sumas. A continuacion realizamos un test para comprobar los posibles resultados.

Compilamos la clase Math.java para ello es necesario tener el .jar de JUnit para realizar la compilacion.

javac -cp /home/alumnado/jars/*:. Math.java


Compilamos el testMath.java

javac -cp /home/alumnado/jars/*:. testMath.java

A continuacion hacemos ejecutar el testmath

$ java -cp /home/alumnado/jars/*:. org.junit.runner.JUnitCore  MathTest

#Test Suite

generamos un testSuite que nos permite realizar 2 test a la vez. testMath y TestPerson.
Compilamos y realizamos el Test Suite

$ javac -cp /home/alumnado/jars/*:.  JunitTestSuite.java

$ java -cp /home/alumnado/jars/*:. org.junit.runner.JUnitCore  JunitTestSuite
