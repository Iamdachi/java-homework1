# welcometojava


### Using Anonymous classes and lambdas
Last task is to replace all previous classes with anonymous classes and lambdas. I did this, but not to have a very long
main file, I broke up all of this logic into handler classes with static methods. All handlers use anonymous classes and
lambda expressions to implement their respective interfaces.

WelcomeMain calls handlers for:

- Matrix operations (MatrixHandler)
- Notifications (NotificationHandler)
- Sorting (Sorter)
- Payments (PaymentHandler)


### Dependencies
- Java 25
- commons-math3-3.6.1.jar ([Download link](https://dlcdn.apache.org//commons/math/binaries/commons-math3-3.6.1-bin.zip))

### Project Structure
```bash 
src/
└── welcometojava/
    ├── WelcomeMain.java
    ├── interfaces/
    │   ├── MatrixOperation
    │   ├── MatrixPrinter
    │   ├── Notifier
    │   └── Payment
    └── handlers/
        ├── MatrixHandler
        ├── NotificationHandler
        ├── PaymentHandler
        └── Sorter
lib/
└── commons-math3-3.6.1.jar
```

### Java version
```bash
openjdk 25 2025-09-16
OpenJDK Runtime Environment (build 25+36-Ubuntu-124.04.2)
OpenJDK 64-Bit Server VM (build 25+36-Ubuntu-124.04.2, mixed mode, sharing)
```

### Install Dependencies
1. Make a directory `/lib` in the project root:
```bash
cd /path/to/project/root
mkdir lib
cd lib
```

2. Install the dependency in the `/lib` directory:
```bash
curl -O https://dlcdn.apache.org/commons/math/binaries/commons-math3-3.6.1-bin.zip
unzip commons-math3-3.6.1-bin.zip
rm commons-math3-3.6.1-bin.zip

mv commons-math3-3.6.1/commons-math3-3.6.1.jar .
rm -r commons-math3-3.6.1
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

`welcometojava.WelcomeMain` - fully qualified main cl
