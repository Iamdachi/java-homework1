# WelcomeToJava

Java project demonstrating compilation, running, and creating an executable JAR.

### Dependencies
- commons-math3-3.6.1.jar ([Download link](https://dlcdn.apache.org//commons/math/binaries/commons-math3-3.6.1-bin.zip))

### Project Structure
```bash 
src/
└── WelcomeToJava/
    └── MatrixUtils.java
    └── WelcomeMain.java
    └── NotificationSystem.java
    └── PaymentProcessor.java
lib/
└── commons-math3-3.6.1.jar
```

### Compilation
Create the bytecode from the source code. `.java` files to `.class` files.
```bash
javac -cp lib/commons-math3-3.6.1.jar -d out src/WelcomeToJava/*.java
```
`-cp lib/commons-math3-3.6.1.jar` -  include external Commons Math library 

`-d out` - put compiled .class files in `out/`

`src/WelcomeToJava/*.java` - compile all source files in that package


### Execution from Bytecode
```bash 
java -cp "out:lib/commons-math3-3.6.1.jar" WelcomeToJava.WelcomeMain
```
`out` - contains compiled .class files

`lib/commons-math3-3.6.1.jar` - the external library

`WelcomeToJava.WelcomeMain` - fully qualified class name of the main class


### Building an Executable JAR
1. Create manifest.txt with the content:
```bash
Main-Class: WelcomeToJava.WelcomeMain
```
2. Build JAR:
```bash
jar cfm WelcomeApp.jar manifest.txt -C out .
```
`c` - create a new JAR

`f` - specify file name (`WelcomeApp.jar`)

`m` - include manifest (`manifest.txt`)

`-C out .` - include all files from `out/`


### Run JAR:
```bash
java -cp "WelcomeApp.jar:lib/commons-math3-3.6.1.jar" WelcomeToJava.WelcomeMain
```

`-cp` - sets the classpath for JVM

`WelcomeApp.jar` - your compiled program

`lib/commons-math3-3.6.1.jar` - external Commons Math library

`WelcomeToJava.WelcomeMain` - fully qualified main class

### Learning about classes
This project also demonstrates different types of classes:

1. **Inner Class**
    - Example: `NotificationSystem.EmailNotification`
    - Tied to an instance of the outer class, can access its fields.

2. **Static Nested Class**
    - Example: `NotificationSystem.SMSNotification`
    - Works independently of the outer class instance.

3. **Anonymous Class**
    - Example: custom comparators or runnables
    - Allows inline, one-off behavior without creating a separate class.

4. **Local Class**
    - Example: `PaymentProcessor.processPayment()` -> `Receipt`
    - Defined inside a method, used only within that method.