package inheritence;

public abstract class TranslatorBase {
    public String[] writtenNumbers;

    public String unknown;

    public TranslatorBase(String[] writtenNumbers, String unknown) {
        this.writtenNumbers = writtenNumbers;
        this.unknown = unknown;
    }

    public String getText(int number) {
        if (number >= 0 && number < writtenNumbers.length) {
            return writtenNumbers[number];
        }
        return unknown;
    }

    public int getNumber(String numberText) {
        for (int i = 0; i < writtenNumbers.length; i++) {
            if (writtenNumbers[i].equals(numberText)) {
                return i;
            }
        }
        return -10;
    }

}

