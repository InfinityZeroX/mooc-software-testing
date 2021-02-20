package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest(name = "{0}: \"{1}\" = {2}")
    @CsvSource({"Single letter, g, false", "Single letter, x, false",
            "No G, abcde, false",
            "Edge Gs, gg, true", "Edge Gs, ggxg, false",
            "Middle Gs, xgx, false" , "Middle Gs, xggxgx, false", "Middle Gs, xggx, true"})
    public void testAlgorithm(String partition, String input, String expectedResult)
    {
        boolean result = new GHappy().gHappy(input);
        Assertions.assertEquals(expectedResult.equals("true"), result);
    }
}
