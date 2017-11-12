package hack;


public class Palyn {

    public static void main(String[] args) {
        System.out.println(isPalyndrome("kayak"));
        System.out.println(isPalyndrome("toto"));

    }

    private static boolean isPalyndrome(String input) {
        char[] arr = input.toCharArray();
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            char  one = arr[i];
            char two = arr[j];
            if (one != two) {
                return false;
            }
        }
        return true;
    }
}
