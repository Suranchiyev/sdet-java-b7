package day44;

public class NullCheck {
    public static void main(String[] args) {
        printStr("hello");
        printStr(""); // Invalid input
        printStr(null); // Invalid input
    }

    // if str is null or "" string, print "Invalid input"
    // otherwise print str
    public static void printStr(String str) {
        //  null == null
        if (str == null || str.equals("")) {
            System.out.println("Invalid input");
        } else {
            System.out.println(str);
        }
    }
}
