import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape shape=new Shape();

    @Test
    void squareArea() {

        assertEquals(576,shape.squareArea(24));
    }

    @Test
    void circleArea(){
        assertEquals(12.56,shape.circleArea(2),"wrongly calculated");
    }
}