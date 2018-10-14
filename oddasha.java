 import java.util.*;
 public class oddasha
 {
 public static void main(String[] args)
 {
 Scanner w=new Scanner(System.in)
 int n1,n2;
 n1=w.nextInt();
  n2=w.nextInt();
 for(int i=n1+1;i<n2;i++)
 {
 if(i%2==0)
 {
 System.out.println(i);
 }
 }
}
}
