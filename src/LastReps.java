import java.util.Scanner;

public class LastReps {
    StringBuffer printing(String a , int n){
        n = a.length()-n;
        StringBuffer res = new StringBuffer();
        for (int i =0 ; i < n; i++){
            res.append(a.substring(n));
        }
        return res;
    }
}
class Testing5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        int n;
        a = sc.next();
        n = sc.nextInt();
        System.out.println(new LastReps().printing(a,n));
    }
}
