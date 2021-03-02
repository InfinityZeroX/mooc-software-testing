package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    /*
        We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Return true if all the g's in the given string are happy.

        Examples:

            gHappy("xxggxx") ==> true
            gHappy("xxgxx") ==> false
            gHappy("xxggyygxx") ==> false

        See our implementation in the GHappy class (package tudelft.ghappy). There's a bug in this implementation. Apply everything you learned and do your best to find the bug!! Write your automated tests inside GHappyTest class. At the end, push your solution to your GitHub repository.

        (This exercise is ungraded)

        (This exercise is based on this website: https://codingbat.com/prob/p198664)
     */

    @ParameterizedTest(name = "{0}: \"{1}\" = {2}")
    @CsvSource({"Single letter, g, false",
            "No G, abcde, true",
            "Edge Gs, gg, true", "Edge Gs, ggxg, false",
            "Middle Gs, xgx, false" , "Middle Gs, xggxgx, false", "Middle Gs, xggx, true"})
    public void testAlgorithm(String partition, String input, String expectedResult)
    {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expectedResult.equals("true"), result);
    }
}
