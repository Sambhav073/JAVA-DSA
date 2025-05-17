class Calc{
    int add(int a, int b){
        
        return a + b;
    }
}

class AdvCalc extends Calc{
    int add(int a, int b){
        return a + b + 1;
    }
    
}

public class MethodOverriding {
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.add(2, 3)); // Output: 5
        AdvCalc ac = new AdvCalc();
        System.out.println(ac.add(2, 3)); // Output: 6
        Calc c2 = new AdvCalc();
        System.out.println(c2.add(2, 3)); // Output: 6
    }
}
