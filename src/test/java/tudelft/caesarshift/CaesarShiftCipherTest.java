package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "{0} shifted by {1} = {2}")
    @CsvSource({
            "abc, 3, def",
            "xyz, 3, abc",
            "def, 1, efg",
    })
    public void testAlgorithm(String input, int shift, String output) {
        String result = new CaesarShiftCipher().CaesarShiftCipher(input, shift);
        Assertions.assertEquals(output, result);
    }
}
