public class VariousStringMethods {
    public static void main(String[] args) {
        String sentance;
        String str1;
        String str2;
        String str3;
        int index;

        sentance = "Now is the time for the birthday party";

        System.out.println("sentance = \"" + sentance + "\"");
        System.out.println("The length of sentance = " + sentance.length());

        System.out.println("The character at index 16 in sentance = " + sentance.charAt(16));

        System.out.println("The index of the first t in sentance = " + sentance.indexOf("t"));
        System.out.println("The index of for in sentance = " + sentance.indexOf("for"));

        System.out.println("sentance.substring(0, 6) = \"" + sentance.substring(0, 6) + "\"");
        System.out.println("sentance.substring(7, 12) = \"" + sentance.substring(7, 12) + "\"");

        System.out.println("sentance.substring(7, 22) = \"" + sentance.substring(7, 22) + "\"");

        System.out.println("sentance.substring(4, 10) = \"" + sentance.substring(4, 10) + "\"");

        str1 = sentance.substring(0, 8);
        System.out.println("str1 = \"" + str1 + "\"");

        str2 = sentance.substring(2, 12);
        System.out.println("str2 = \"" + str2 + "\"");

        System.out.println("sentance in uppercase = \"" + sentance.toUpperCase() + "\"");

        index = sentance.indexOf("birthday");
        str1 = sentance.substring(index, index + 14);
        System.out.println("str1 = \"" + str1 + "\"");

        System.out.println("sentance.replace('t', 'T' ) = \"" + sentance.replace('t', 'T'));

    } // end main
}
