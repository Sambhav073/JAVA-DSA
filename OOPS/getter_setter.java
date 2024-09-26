public class getter_setter {
    public static void main(String args[]) {
        Pencil p1 = new Pencil();
        p1.set_color("blue");
        p1.set_tip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
        p1.set_color("yellow");
        System.out.println(p1.getColor());
    }
}

class Pencil {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void set_color(String newcolor) {
        this.color = newcolor;
    }

    void set_tip(int newtip) {
        this.tip = newtip;
    }
}