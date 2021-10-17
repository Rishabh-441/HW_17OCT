import java.util.Scanner;

public class NCopies {
    StringBuffer copied(String a){
        StringBuffer ans = new StringBuffer();
        for (int i=0 ; i < a.length(); i++){
            ans.append(a.substring(0,2));
        }
        return ans;
    }
}
class Testing3{
    public static void main(String[] args) {
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        System.out.println(new NCopies().copied(a));
    }
}
