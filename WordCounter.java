import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = getSentenceInput();

        int wordCount = countWords(sentence);

        System.out.println("The sentence contains " + wordCount + " words.");
    }

    public static String getSentenceInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        return sentence;
    }

    public static int countWords(String sentence) {
        if (sentence.isEmpty()) {
            return 0;
        }
        
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
}
