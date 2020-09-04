import java.util.Arrays;
import java.util.Scanner;
public class ques2{

  public static void main(String[] args) {

Scanner scan =new Scanner(System.in);
System.out.println("enter size of array");
int size=scan.nextInt();
int[] input=new int[size];
for(int i=0;i<size;i++){
	System.out.println("Enter the element");
	input[i]=scan.nextInt();
}
scan.close();
System.out.println("Printing the elements in an array");
for(int i=0; i<input.length;i++){
	System.out.println();
}
int k=21;   

    System.out.println("integer array before sorting");
    System.out.println(Arrays.toString(input));

    
    countingSort(input, k);

    System.out.println("integer array after sorting using counting sort algorithm");
    System.out.println(Arrays.toString(input));

  }

  public static void countingSort(int[] input, int k) {
   
    int counter[] = new int[k + 1];
    
   
    for (int i : input) {
      counter[i]++;
    }
    
  
    int ndx = 0;
    for (int i = 0; i < counter.length; i++) {
      while (0 < counter[i]) {
        input[ndx++] = i;
        counter[i]--;
      }
    }
  }

}