package day8;

import javax.swing.*;

public class MethodDemo2 {

    //<access modifier> <data type> <method name> (zero or any num of arguments) {
    /// ======
    // }
    public String greet() {
        String g = "Hello good morning";
        return g;

    }

    public int findmax(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        MethodDemo2 ob = new MethodDemo2();
        String s = ob.greet();
        System.out.println(s);

        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter a: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter b: "));
        int m = ob.findmax(a, b);
        System.out.println(" Max number = " + m);


    }
}