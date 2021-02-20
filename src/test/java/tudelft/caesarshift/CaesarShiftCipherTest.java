package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name = "{0}: \"{1}\" -> {2} = \"{3}\"")
    @CsvSource({"Single letter forward, a, 25, z", "Single letter forward, a, 26, a",
            "Single letter backward, a, -2, y", "Single letter backward, a, -26, a",
            "Multiple letters forward, abc, 25, zab",
            "Multiple letters backward, abc, -2, yza",
            "No shift, abc, 0, abc",
            "Big shift, abc, 260, abc",
            "Invalid characters, abc!abc, 1, invalid", "Invalid characters, abc1abc, 1, invalid", "Invalid characters, abcAabc, 1, invalid"})
    public void testAlgorithm(String partition, String message, int shift, String expectedResult)
    {
        String result = new CaesarShiftCipher().cipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
