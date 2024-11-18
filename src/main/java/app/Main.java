package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        int total;
        MathOperation addition = new MathOperation() {
            public int operate(int a, int b) {
                return a + b;
            }
        };
        total = addition.operate(1, 2);
        System.out.println(total);

        String initialText = "Some random string";
        StringManipulator makeUpperCase = s -> s.toUpperCase();
        String upperCaseText = makeUpperCase.manipulate(initialText);
        System.out.println(upperCaseText);

        Function<String, Integer> countUpperCaseChars;
        countUpperCaseChars = StringListProcessor::countUppercase;
        System.out.println(countUpperCaseChars.apply(upperCaseText));

        Supplier<Integer> randomIntegerInRangeSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println(randomIntegerInRangeSupplier.get());
    }
}
