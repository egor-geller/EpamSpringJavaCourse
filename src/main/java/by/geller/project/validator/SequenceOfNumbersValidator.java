package by.geller.project.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SequenceOfNumbersValidator {
    public boolean isValidMassive(String line) {
        String regex = "\\d\\.+\\d+.*\\s*([a-z]*)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line.trim());

        return matcher.matches();
    }
}
