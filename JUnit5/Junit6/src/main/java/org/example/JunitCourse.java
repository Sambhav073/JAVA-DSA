package org.example;

public class JunitCourse implements Course{
    @Override
    public boolean coursePurchase() {
        System.out.println("Junit Course Purchased");
        return true;
    }
}
