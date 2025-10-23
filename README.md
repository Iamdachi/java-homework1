# WelcomeToJava

Java project demonstrating compilation, running, and creating an executable JAR.

### Project Structure
```bash 
src/
└── WelcomeToJava/
    └── WelcomeMain.java


### Compilation
Navigate to `src` directory (where `WelcomeToJava` package is) and run:
```bash
javac WelcomeToJava/WelcomeMain.java
```

### Execution
```bash 
java WelcomeToJava.WelcomeMain
```

### Building an Executable JAR
1. Create manifest.txt with the content:
```bash
Main-Class: WelcomeToJava.WelcomeMain
```
2. Build JAR:
```bash
jar cfm WelcomeApp.jar manifest.txt WelcomeToJava/*.class
```

### Run JAR:
```bash
java -jar WelcomeApp.jar
```