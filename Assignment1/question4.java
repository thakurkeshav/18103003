import java.util.*;
class question4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String s1=str1.replaceAll("\\s", "");
        String str2 = sc.nextLine();
        String s2=str2.replaceAll("\\s", "");
        char[] ArrayS1 = s1.toLowerCase().toCharArray();
        char[] ArrayS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(ArrayS1);
        Arrays.sort(ArrayS2);
        if (Arrays.equals(ArrayS1, ArrayS2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
        }
    }
}