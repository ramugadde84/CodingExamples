package test.examples;

public class FindFirstNonRepeatingCharacterInString {

    public static  Character findFirstRepeatingCharacter(String s){
        Character c = null;
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                c = s.charAt(i);
                break;
            }
        }

        return c;
    }

    public static void main(String[] args) {
       System.out.println("First non repeating character:"+
               findFirstRepeatingCharacter("aaarmu"));
    }
}
