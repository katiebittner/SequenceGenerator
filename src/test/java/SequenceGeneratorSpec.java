import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by katie on 2/8/16.
 */
public class SequenceGeneratorSpec {
    SequenceGenerator testSequenceGenerator = new SequenceGenerator();

    @Test
    public void testCreateSequenceLetters() {
        String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z ";
        String actual = testSequenceGenerator.createSequence(97, 122, "all", "letters");
        assertEquals("Counter method test", actual, expected);

    }


    @Test
    public void testCreateSequenceOdd() {
        String expected = "1 3 5 7 9 11 13 15 17 19 21 23 25 ";
        String actual = testSequenceGenerator.createSequence(1, 26, "odd", "numbers");
        assertEquals("Odds method test", expected, actual);

    }

    @Test
    public void testCreateSequenceNumbers() {
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 ";
        String actual = testSequenceGenerator.createSequence(1, 26, "all", "numbers");
        assertEquals("All numbers method test", expected, actual);
    }


}
