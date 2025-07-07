package org.example;

public class JavaCourse implements Course{

    @Override
    public boolean coursePurchase() {
        System.out.println("Java Course Purchased");
        return true;
    }
}
