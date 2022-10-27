public class Main {
    public static void main(String[] args) {
        String delim = "\\s+";
        String[] str = args[0].split(delim);
        int neededLen = Integer.parseInt(args[1]);

        int wordsLen = 0;
        for (int i = 0; i < str.length; i++)
            wordsLen += str[i].length();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < neededLen - wordsLen; j++) {
                if (i > str.length - 1) i = 0;
                str[i] += " ";
                i++;
            }
        }

        System.out.print('"');
        for (int i = 0; i < str.length; i++)
            System.out.print(str[i]);
        System.out.print('"');
    }
}
