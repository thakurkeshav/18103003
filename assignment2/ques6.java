import java.util.*;

public class ques6{
public static void main(String[] args){
 int i,n;
 Scanner in = new Scanner(System.in);
 int[] arr = new int[20];
 System.out.println("Enter the number from which Hailstone sequence is to be found:");
 n = in.nextInt();
 System.out.println("The Hailstone sequence is:");
 while(n!=1){
  if(n%2==0)
  { n =n/2;
   System.out.println(n);
  }
  else
  {
   n = ((n*3)+1);
   System.out.println(n);
  }
 }
 }
}