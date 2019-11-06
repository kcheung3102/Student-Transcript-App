public class Validator {

    private static boolean isLettervalid(String str){

        if(str.length() !=1) {
            return false;
        }
        char c = Character.toLowerCase(str.charAt(0));
        return c >= 'a' && c <= 'f';
    }

    private static boolean isCreditValid(int num) {
        final int maxLength = 1;
        if(num )
    }
}
