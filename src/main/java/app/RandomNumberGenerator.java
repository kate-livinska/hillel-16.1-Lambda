package app;

public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
