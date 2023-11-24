import java.util.*;
public class String_Rank{
    public static int rank=0;
    public static void PossibleString(String input,String curr,int N,int R) {
        if (curr.length()==N) {
            rank++;
            if(rank==R){
                System.out.println(curr);
                return;
            }
            return;
        }
        for (int i=0;i<input.length();i++) {
            if (!curr.contains(String.valueOf(input.charAt(i)))) {
                PossibleString(input,curr+input.charAt(i),N,R);
            }
        }
    }
    public static void main(String[] args) {
        String str="abcdefghijklmnopqrstuvwxyz";
        Scanner sc=new Scanner(System.in);
      	int N,R;
        R=sc.nextInt();
      	N=sc.nextInt();
        PossibleString(str,"",N,R);
    }
}
