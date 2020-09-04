import java.util.Scanner;
public class ques1
{
	public static void main(String[] args)
	{
		System.out.println("Enter string 1:");
		Scanner scan= new Scanner(System.in);
		String s1,s2;
		s1=scan.nextLine();
		
		System.out.println("Enter string 2:");
		s2=scan.next();
		int k1=s1.length();
		int k2=s2.length();
		int z=0,ans=0;
		if(k1<k2)
		System.out.println("0");
		else {
			int [] a;
			int [] b;
			a= new int[500];
			b=new int[500];
			for (int i=0;i<k2;i++)
				 b[(int)s2.charAt(i)]++;
			for(int i=0;i<k2;i++){

		          int k=(int)s1.charAt(i);
		          if(a[k]<b[k])
		            z++;
		          a[k]++;

		          if(z==k2)
		            ans++;}

		          for(int i=k2;i<k1;i++){

		          int k=(int)s1.charAt(i);
		        int p=(int)s1.charAt(i-k2);

		        if(a[p]<=b[p])
		        z--;

		        a[p]--;

		        if(a[k]<b[k])
		        z++;

		        a[k]++;

		        if(z==k2)
		        ans++;}

		        System.out.println(ans);		
		}
			
	}
}
