# welcometojava

Project demonstrating compilation, running, and creating an executable JAR of a simple Java program.

### Learning about classes
This project also demonstrates different types of classes:

1. **Inner Class**
    - Example: `NotificationSystem.EmailNotification`
    - Tied to an instance of the outer class, can access its fields.

2. **Static Nested Class**
    - Example: `NotificationSystem.SMSNotification`
    - Works independently of the outer class instance.

3. **Anonymous Class**
    - Example: custom comparator in `handleSorting` method
    - Allows inline, one-off behavior without creating a separate class.

4. **Local Class**
    - Example: `PaymentProcessor.processPayment()` -> `Receipt`
    - Defined inside a method, used only within that method.


### Dependencies
- Java 25
- commons-math3-3.6.1.jar ([Download link](https://dlcdn.apache.org//commons/math/binaries/commons-math3-3.6.1-bin.zip))

### Project Structure
```bash 
src/
└── welcometojava/
    ├── MatrixUtils.java
    ├── WelcomeMain.java
    ├── NotificationSystem.java
    └── PaymentProcessor.java
lib/
└── commons-math3-3.6.1.jar
```

### This project was tested using given Java version
```bash
openjdk 25 2025-09-16
OpenJDK Runtime Environment (build 25+36-Ubuntu-124.04.2)
OpenJDK 64-Bit Server VM (build 25+36-Ubuntu-124.04.2, mixed mode, sharing)
```

### Install Dependencies
Make a directory `/lib` in the project root:
```bash
cd /path/to/project/root
mkdir lib
cd lib
```

Install the dependency in the `/lib` directory:
```bash
curl -O https://dlcdn.apache.org/commons/math/binaries/commons-math3-3.6.1-bin.zip
unzip commons-math3-3.6.1-bin.zip
rm commons-math3-3.6.1-bin.zip
```

### Compilation and execution of bytecode
1. Move to the project root and create the bytecode from the source code.
```bash
cd /path/to/project/root
javac -cp lib/commons-math3-3.6.1.jar -d out src/welcometojava/*.java
```
`-cp lib/commons-math3-3.6.1.jar` -  include external Commons Math library

`-d out` - put compiled .class files in `out/`

`src/welcometojava/*.java` - compile all source files in that package


2. Execute the bytecode
```bash 
java -cp "out:lib/commons-math3-3.6.1.jar" welcometojava.WelcomeMain
```
`out` - contains compiled .class files

`lib/commons-math3-3.6.1.jar` - the external library

`welcometojava.WelcomeMain` - fully qualified class name of the main class


### Building an Executable JAR
1. Move to the project root:
```bash 
cd /path/to/project/root
```

2. Create manifest.txt in the project root with the content:
```bash
Main-Class: welcometojava.WelcomeMain
```
3. Build JAR:
```bash
jar cfm WelcomeApp.jar manifest.txt -C out .
```
`c` - create a new JAR

`f` - specify file name (`WelcomeApp.jar`)

`m` - include manifest (`manifest.txt`)

`-C out .` - include all compiled .class files from `out/`


4. Run the JAR:
```bash
java -cp "WelcomeApp.jar:lib/commons-math3-3.6.1.jar" welcometojava.WelcomeMain
```

`-cp` - sets the classpath for JVM

`WelcomeApp.jar` - your compiled program

`lib/commons-math3-3.6.1.jar` - external Commons Math library

`welcometojava.WelcomeMain` - fully qualified main class
