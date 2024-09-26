public class objects_classes {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.set_color("blue");
        p1.set_tip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
        p1.set_color("yellow");
        System.out.println(p1.color);
    }

}

class Pen {
    String color;
    int tip;

    void set_color(String newcolor) {
        color = newcolor;
    }

    void set_tip(int newtip) {
        tip = newtip;
    }
}