/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package vscode.gradle.protobuf.repro;

import com.example.tutorial.protos.Person;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println(Person.class);
    }
}
