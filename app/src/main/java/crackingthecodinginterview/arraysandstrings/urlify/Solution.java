package crackingthecodinginterview.arraysandstrings.urlify;

public class Solution {
    public String urlify(String str, int length) {
        var sb = new StringBuilder();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (count >= length) {
                break;
            }

            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
            count++;
        }

        return sb.toString();
    }

    void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) {
            str[trueLength] = '\0'; // End array
        }

        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        var s = new Solution();
        System.out.println(s.urlify("Mr John Smith   ", 13).equals("Mr%20John%20Smith"));
        System.out.println(s.urlify("a", 1).equals("a"));
        System.out.println(s.urlify("   ", 0).equals(""));
        System.out.println(s.urlify("Hello, world!   ", 13).equals("Hello,%20world!"));
    }
}
