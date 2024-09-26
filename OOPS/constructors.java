public class constructors {
    public static void main(String args[]) {
        student s1 = new student();
        // student s2 = new student("Sambhav");
        // System.out.println(s2.name);
        // student s3 = new student(16);
        // System.out.println(s3.roll);
        s1.name = "Sambhav";
        s1.roll = 16;
        student s2 = new student(s1);
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class student {
    String name;
    int roll;

    // non parameterised constructor
    student() {// constructor it is as same name as class name and is called directly in time
               // of object creation.
        System.out.println("constructor is called....");
    }

    // copy constructor
    student(student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
    }

    // parameterised constructor
    student(String name) {
        this.name = name;
    }

    student(int roll) {
        this.roll = roll;
    }
}