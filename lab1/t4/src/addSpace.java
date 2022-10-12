public class addSpace {
    public static String make(String str, int newLength){
        StringBuilder liner = new StringBuilder(str.trim());//remove spaces at the beginning and end of a string

        for (int temp = 0; liner.length() != newLength; temp++) {
            temp = liner.indexOf(" ", temp);

            if(temp == -1)
                temp = liner.indexOf(" ");

            for ( ; liner.charAt(temp) == ' '; temp++) {}

            liner.insert(temp," ");
        }
        return liner.toString();
    }
}
