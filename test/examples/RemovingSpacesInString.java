package test.examples;

public class RemovingSpacesInString {

    public static String removeSpaces(String str){
        return str.replaceAll("\\s","");
    }

    public static void main(String[] args) {
        System.out.println(removeSpaces("test data world"));
    }

}
