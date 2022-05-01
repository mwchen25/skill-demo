import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTester {
    @Test
    public void addTest() {
        assertEquals(1, SkillDemo.add(1, 1));
    }
}
