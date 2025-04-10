import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test public void test1() {
        assertEquals("Saturday", Main.findDay(1, 1, 2000));
    }

    @Test public void test2() {
        assertEquals("Friday", Main.findDay(15, 8, 1947));
    }

    @Test public void test3() {
        assertEquals("Thursday", Main.findDay(10, 4, 2025));
    }

    @Test public void test4() {
        assertEquals("Monday", Main.findDay(1, 1, 1900));
    }

    @Test public void test5() {
        assertEquals("Sunday", Main.findDay(31, 12, 2023));
    }
}
