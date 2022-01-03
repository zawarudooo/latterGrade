import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class testTest {
    @Test
    public void TestEquivalencePartitioning() {
        char level = test.letterGrade(-1);
        assertEquals('X', level);
        level = test.letterGrade(101);
        assertEquals('X', level);
        level = test.letterGrade(0);
        assertEquals('F', level);
        level = test.letterGrade(10);
        assertEquals('F', level);
        level = test.letterGrade(20);
        assertEquals('F', level);
        level = test.letterGrade(30);
        assertEquals('F', level);
        level = test.letterGrade(40);
        assertEquals('F', level);
        level = test.letterGrade(50);
        assertEquals('F', level);
        level = test.letterGrade(60);
        assertEquals('D', level);
        level = test.letterGrade(70);
        assertEquals('C', level);
        level = test.letterGrade(80);
        assertEquals('B', level);
        level = test.letterGrade(90);
        assertEquals('A', level);
        level = test.letterGrade(100);
        assertEquals('A', level);
    }

    @Test
    public void TestboundaryValue() {
        char level = test.letterGrade(-1);
        assertEquals('X', level);
        level = test.letterGrade(101);
        assertEquals('X', level);
        level = test.letterGrade(0);
        assertEquals('F', level);
        level = test.letterGrade(10);
        assertEquals('F', level);
        level = test.letterGrade(59);
        assertEquals('F', level);
        level = test.letterGrade(60);
        assertEquals('D', level);
        level = test.letterGrade(69);
        assertEquals('D', level);
        level = test.letterGrade(70);
        assertEquals('C', level);
        level = test.letterGrade(79);
        assertEquals('C', level);
        level = test.letterGrade(80);
        assertEquals('B', level);
        level = test.letterGrade(89);
        assertEquals('B', level);
        level = test.letterGrade(90);
        assertEquals('A', level);
        level = test.letterGrade(99);
        assertEquals('A', level);
        level = test.letterGrade(100);
        assertEquals('A', level);
    }
}