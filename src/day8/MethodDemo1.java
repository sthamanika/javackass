package day8;

import javax.swing.*;

public class MethodDemo1 {
//actually day 10
    //<access modifier> kei nalekhnu vaneko default type <method name> (zero to any num of arguments) {
    // =============
    // }
    //method declaration
    public void greet()
    {
        System.out.println("Hello, ");
        System.out.println("Good morning!!!");
    }

           public void displayInfo (String name,int age)
           {
               System.out.println("Name is: " + name);
               System.out.println("Age is: " + age);
           }
           public static void main(String[]args)
           {
               System.out.println("main");
               MethodDemo1 ob = new MethodDemo1();
               //method calling
               ob.greet();

               String name = JOptionPane.showInputDialog("Enter name: ");
               int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age: "));
               //method calling
               ob.displayInfo(name,age);
               //order and type matters

           }
}


// OOPS CONCEPT
//Phase -1
//class & object
// static/ non-static concept
//constructor and method
//this concept


//phase - 2
//Encapsulation (getter/setter)
//inheritance
//super
//abstract class
//interface
//polymorphism

//access modifier (private public protected default) 4 types ---- default we dont type