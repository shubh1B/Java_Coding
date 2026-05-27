public class PalindromeNumber {
    public static void main (String[]args){
        int num=23569;
        int rev=0;
        int rem=0;
        while(num!=0){
            num=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==num){
            System.out.println("Palindrome number");
        }

    }
}
