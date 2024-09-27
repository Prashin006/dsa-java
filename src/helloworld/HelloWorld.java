// The below line tells the java compiler "javac" that the given .java class is inside the "helloworld" package.
// A package groups related classes and interfaces.
// Convention is to name our packages in lowercase
// The advantage of declaring packages is that it avoids name conflicts. Two or more files can have the same name as long as they belong to different packages
// Java also comes with a bunch of pre-written packages which we can import to use the code. Eg, java.io to handle input/output related queries and java.awt for graphical user interfaces

package helloworld;

public class HelloWorld {
//    The main method is the starting point of all java applications. "String[] args" means that this method can take in an array of strings as input
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
