import java.util.Scanner;
import java.util.Arrays;
class AnagramExample{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first string");
    String s1=sc.nextLine();
    System.out.println("Enter second string");
    String s2=sc.nextLine();

if(s1.length()==s2.length()){
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();  
    char ch1[] = s1.toCharArray();
    char ch2[]= s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    boolean f = true;
    for(int i=0;i<ch1.length-1;i++){
        if(!(ch1[i]==ch2[i])){
            f = false;
        }

    }
    if(f){
        System.out.println("It's an anagram");
    }
    else{
        System.out.println("It's not an anagram");
    }
}
else{
    System.out.println("Not an anagram");
}
}
}