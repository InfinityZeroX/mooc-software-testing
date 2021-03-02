package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    /*
        A Caesar Cipher is a simply way to encrypt messages. There are two inputs: A message and a shift. The message can be any string containing lower case letters and spaces, any other characters will return 'invalid' The shift can be any positive or negative integer. Each letter of the message is then shifted by the specified amount (if shift is '3' then 'abc' becomes 'def' and 'xyz' becomes 'abc').

        See our implementation in the CaesarCipherShift class (package tudelft.caesarcipher). There's a bug in this implementation. Apply everything you learned and do your best to find the bug!! Write your automated tests inside CaeserCipherShiftTest class. At the end, push your solution to your GitHub repository.

        (This exercise is ungraded)
     */
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
