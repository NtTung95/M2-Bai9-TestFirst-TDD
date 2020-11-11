import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testTriangleClassifier() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier2() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier3() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expected = "Is not Triangle";
        String result = TriangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void testTriangleClassifier4() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expected = "Is not Triangle";
        String result = TriangleClassifier.TriangleClassifier(a,b,c);
        assertEquals(expected,result);
    }
}