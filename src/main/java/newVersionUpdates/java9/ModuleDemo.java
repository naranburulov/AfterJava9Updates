package newVersionUpdates.java9;

import java.util.List;
import java.util.Scanner;

public class ModuleDemo {

    public static void main(String[] args) {

        //Modules were created with Java9. Before - jar package structure. With about 4000 classes. Compiler did not see if, another class had a problem, and was given an exception. Now it gives warning. Compiler sees better.
        //Main advantage is encapsulation of packages and classes from different modules - better security, better compiler, better organisation the relationship among them


        System.out.println(String.class.getModule());
        System.out.println(List.class.getModule());
        System.out.println(Scanner.class.getModule());







    }
}
