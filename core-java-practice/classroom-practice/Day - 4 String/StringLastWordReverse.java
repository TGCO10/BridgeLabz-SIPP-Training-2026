public class StringLastWordReverse {
    public static void main(String[] args) {
        String str = "I Love coding";

        int lastIndexSpace = str.lastIndexOf(' ');

        if (lastIndexSpace != -1) {
            String prefix = str.substring(0, lastIndexSpace + 1);
            String lastWord = str.substring(lastIndexSpace + 1);

            String lastWordReversed = new StringBuilder(lastWord).reverse().toString();

            String result = prefix + lastWordReversed;

            System.out.println(result);
        } else {
            String result = new StringBuilder(str).reverse().toString();
            System.out.println(result);
        }
    }
}
