import java.util.Locale;
import java.util.Scanner;

public class Concatenate {
    StringBuffer add(String a , String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        StringBuffer res = new StringBuffer(a);
        if (a.charAt(a.length()-1) == b.charAt(0)){
            res.append(b.substring(1));
        }
        return res;
    }
}
class Testing2{
    public static void main(String[] args) {
        String a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        System.out.println(new Concatenate().add(a,b));
    }
}
