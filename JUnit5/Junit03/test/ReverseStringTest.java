import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ReverseStringTest {

    ReverseString rs=new ReverseString();
    @Test
    void reverseOneWord() {

        assertEquals("avaj",rs.reverse("java"));
    }

    @Test
    void reverseMultipleWords(){

        assertEquals("ysae si avaj",rs.reverse("java is easy"));
    }
}