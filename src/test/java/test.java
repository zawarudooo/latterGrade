import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class test {
    @Test
    public void TestEquivalencePartitioning() {
        char level = letter.letterGrade(-1);
        assertEquals('X', level);
        level = letter.letterGrade(101);
        assertEquals('X', level);
        level = letter.letterGrade(0);
        assertEquals('F', level);
        level = letter.letterGrade(10);
        assertEquals('F', level);
        level = letter.letterGrade(20);
        assertEquals('F', level);
        level = letter.letterGrade(30);
        assertEquals('F', level);
        level = letter.letterGrade(40);
        assertEquals('F', level);
        level = letter.letterGrade(50);
        assertEquals('F', level);
        level = letter.letterGrade(60);
        assertEquals('D', level);
        level = letter.letterGrade(70);
        assertEquals('C', level);
        level = letter.letterGrade(80);
        assertEquals('B', level);
        level = letter.letterGrade(90);
        assertEquals('A', level);
        level = letter.letterGrade(100);
        assertEquals('A', level);
    }

    @Test
    public void TestboundaryValue() {
        char level = letter.letterGrade(-1);
        assertEquals('X', level);
        level = letter.letterGrade(101);
        assertEquals('X', level);
        level = letter.letterGrade(0);
        assertEquals('F', level);
        level = letter.letterGrade(10);
        assertEquals('F', level);
        level = letter.letterGrade(59);
        assertEquals('F', level);
        level = letter.letterGrade(60);
        assertEquals('D', level);
        level = letter.letterGrade(69);
        assertEquals('D', level);
        level = letter.letterGrade(70);
        assertEquals('C', level);
        level = letter.letterGrade(79);
        assertEquals('C', level);
        level = letter.letterGrade(80);
        assertEquals('B', level);
        level = letter.letterGrade(89);
        assertEquals('B', level);
        level = letter.letterGrade(90);
        assertEquals('A', level);
        level = letter.letterGrade(99);
        assertEquals('A', level);
        level = letter.letterGrade(100);
        assertEquals('A', level);
    }
}