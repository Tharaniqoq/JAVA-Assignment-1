import java.util.ArrayList;
import java.util.List;

public class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int totalChars = words[index].length();
            int last = index + 1;


            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            StringBuilder sb = new StringBuilder();
            int numOfWords = last - index;
            int numOfSpaces = maxWidth - totalChars + (numOfWords - 1);


            if (last == words.length || numOfWords == 1) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {

                int spaces = (maxWidth - totalChars) / (numOfWords - 1);
                int extraSpaces = (maxWidth - totalChars) % (numOfWords - 1);

                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]);
                    sb.append(" ");


                    for (int j = 0; j < spaces + (i - index < extraSpaces ? 1 : 0); j++) {
                        sb.append(" ");
                    }
                }
                sb.append(words[last - 1]);
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }

    public static void main(String[] args) {
        TextJustification tj = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        List<String> justifiedText = tj.fullJustify(words, maxWidth);

        for (String line : justifiedText) {
            System.out.println("\"" + line + "\"");
        }
    }
}
