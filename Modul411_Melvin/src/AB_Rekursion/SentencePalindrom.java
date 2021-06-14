package AB_Rekursion;

public class SentencePalindrom {
    private String text;

    /**
     * Constructs a sentence.
     *
     * @param aText the stripped sentence
     */
    public SentencePalindrom(String aText) {
        text = aText;
    }

    public static void main(String[] args) {
        SentencePalindrom asd = new SentencePalindrom("h'el l e'h'");
        System.out.println(asd.isPalindrome());
    }

    /**
     * Tests for a palindrome.
     *
     * @return true if is a palindrome
     */
    public boolean isPalindrome() {
        int length = text.length();
        // Separate case for shortest strings.
        if (length <= 1) {
            return true;
        }
        // Get first and last characters, converted to lowercase.
        char first = Character.toLowerCase(text.charAt(0));
        char last = Character.toLowerCase(text.charAt(length - 1));

        if (Character.isLetter(first) && Character.isLetter(last)) {
            // Both are letters.
            if (first == last) {
                // Remove both first and last character.
                SentencePalindrom shorter = new SentencePalindrom(text.substring(1, length - 1));
                return shorter.isPalindrome();
            } else {
                return false;
            }
        } else if (!Character.isLetter(last)) {
            // Remove last character.
            SentencePalindrom shorter = new SentencePalindrom(text.substring(0, length - 1));
            return shorter.isPalindrome();
        } else {
            // Remove first character.
            SentencePalindrom shorter = new SentencePalindrom(text.substring(1));
            return shorter.isPalindrome();
        }
    }
}
