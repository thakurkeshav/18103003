import java.sql.Time;

public class ques2 extends Thread{

    private int range1;
    private int range2;

    static int answer = 0,number=0;

    public ques2(int range1,int range2){
        this.range1 = range1;
        this.range2 = range2;
    }
    public int countDivisors(int n){ 
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++){ 
            if (n % i == 0) { 
                if (n / i == i) count++; 
                else count = count + 2; 
            } 
        } 
        return count;
    } 
 
    public void run(){
        int most_divisors = 0;
        int ans = 1;
        for(int i=range1;i<=range2;i++){
            int current_divisors = countDivisors(i);
            if(current_divisors>most_divisors){
                ans = i;
                most_divisors = current_divisors;
            }
        }
        if(most_divisors > number){
            synchronized(this){
                answer = ans;
                number = most_divisors;
            }
        }
    }

    public static void main(String[] args){ 
        long start = System.currentTimeMillis();
        int range1 = 1; 
        int range2 = 5000; 

        ques2 thread_object1 = new ques2(range1,range2);

        range1 = 5001; 
        range2 = 10000; 

        ques2 thread_object2 = new ques2(range1,range2);


        thread_object1.start();
        thread_object2.start();

        try{
            thread_object1.join();
            thread_object2.join();
        }catch(InterruptedException excptn){
            System.out.println(excptn);
        }

        System.out.println("The nubmer with most divisors is: " + answer + " with " + number + " divisiors");
        long end = System.currentTimeMillis();
        System.out.println("Caclulated with two threads in "+ (end-start)+ "ms");

    }
}