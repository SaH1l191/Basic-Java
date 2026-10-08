
class Stringg {

    public static void main(String[] args) {
        String a = new String("Hello");//immutable object
        String b = new String("Hello"); //immutable object

        System.out.println(a == b); //compares the actual string content
        System.out.println(a.equals(b));

        //For objects, == compares references
        //Are a and b pointing to the exact same object
        char c = a.charAt(0); //get char at index 0
        String ttt = a.substring(0, 5); //ending is excluded
        int firstPos = a.indexOf('o'); //get first position of char

        //startsWith
        // endsWith
        //toLowerCase()
        // toUpperCase()
        // trim()
        //StringBuilder is mutable
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");
        System.out.println(sb);
        sb.insert(5, " World");
        System.out.println(sb);
        sb.delete(5, 11); //delete till end-1
        System.out.println(sb);

        sb.reverse();
        sb.setCharAt(0, 'Y');
        sb.length();
        String sstt = sb.toString();

        String result = sb.toString().replace('o', 'a');
    }
}
