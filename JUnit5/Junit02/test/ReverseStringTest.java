import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        ReverseString rs=new ReverseString();
        assertEquals("avaj",rs.reverse("java"));

    }
}