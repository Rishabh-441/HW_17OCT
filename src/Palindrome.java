import java.util.Scanner;

public class Palindrome {
    String checking(String s1, String s2){
        if (s1.length() != s2.length()){
            return "NO";
        }
        for (int i = 0 ; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(s1.length()-i-1)){
                return "NO";
            }
        }
        return "YES";
    }
}
class Testing1{
    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        System.out.println(obj.checking(s1,s2));
    }
}
