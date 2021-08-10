package gradle.jar.lib.utils;


public class StringUtils {
    public boolean isPositiveNumber(String str) {
        return org.apache.commons.lang3.StringUtils.isNumeric(str);
    }
}

