package test.examples;

public class RemoveConsecutiveDuplicatesString {


    //raammmmuuu = ramu
    public static String removeConsecutiveDuplicates(String name) {
        if (name.length() <= 1)
            return name;
        //
        if (name.charAt(0) == name.charAt(1)) {
            return removeConsecutiveDuplicates(name.substring(1));
        } else {
            return name.charAt(0) + removeConsecutiveDuplicates(name.substring(1));
        }
    }


    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("raammmmuuu"));
    }
}
