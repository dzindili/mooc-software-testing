package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name = "{0} -> {1}")
    @CsvSource({
            "xxggxx, true",
            "xxgxx, false",
            "xxggyygxx, false"
    })
    public void testAlgorithm(String word, boolean outcome) {
        boolean result = new GHappy().gHappy(word);
        Assertions.assertEquals(outcome, result);
    }
}
