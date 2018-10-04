package calculator.model;

/**
 * Created by User on 04.10.2018
 */
public class Digit {
    private final byte digit;

    public Digit(byte digit) {
        if (digit < 0 || digit > 9) throw new IllegalArgumentException("Число должно быть от 0 до 9");
        this.digit = digit;
    }

    public byte getDigit() {
        return digit;
    }
}
