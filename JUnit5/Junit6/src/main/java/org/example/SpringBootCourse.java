package org.example;

public class SpringBootCourse implements Course{
    @Override
    public boolean coursePurchase() {
        System.out.println("SpringBoot Course Purchased");
        return true;
    }
}
