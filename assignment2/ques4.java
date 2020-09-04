public class ques4 {
    public static void main(String[] args) {
    long n= Integer.MAX_VALUE;
        while(n>0){
          long sum = (n * (n + 1))/2;
          if(sum == n * n){
             System.out.println(n);
                 }
              n--;
            }
          }
}