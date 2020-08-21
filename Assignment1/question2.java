import java.util.Scanner;
class question2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String p = (sc.nextLine()).toLowerCase();
        System.out.println("Enter the size of replacement vector:");
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("enter the string to be replaced");
            String r = sc.nextLine();
            String re = "";
            re = re + r.charAt(0);
            for (int j=0;j<r.length()-1;j++){
                re+="*";
            }
            p = p.replaceAll(r,re);
        }
        System.out.println(p);
    }
}