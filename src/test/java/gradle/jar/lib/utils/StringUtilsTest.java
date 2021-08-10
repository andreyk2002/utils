package gradle.jar.lib.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    public void isPositiveNumberShouldNotAcceptNegativeNumber() {
        StringUtils stringUtils = new StringUtils();
        boolean result = stringUtils.isPositiveNumber("-10");
        assertFalse(result, "Method should not accept negative numbers");
    }

}