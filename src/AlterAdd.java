import java.util.Scanner;

public class AlterAdd {
    StringBuffer addAlter(String a,String b){
        StringBuffer res = new StringBuffer();
        int x = 0;
        int y = 0;
        int count = 0;
        while(x < a.length() && y < b.length()){
            if (count%2 == 0){
                res.append(a.charAt(x));
                x++;
            }
            else{
                res.append(b.charAt(y));
                y++;
            }
            count++;
            System.out.println("res ="+res);
        }
        if (a.length() > b.length()){
            res.append(a.substring(x));
        }
        else{
            res.append(b.substring(y));
        }
        return res;
    }
}
class Testing4{
    public static void main(String[] args) {
        String a,b ;
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        System.out.println(new AlterAdd().addAlter(a,b));
    }
}
