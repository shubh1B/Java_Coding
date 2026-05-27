public class PrimeNumber {
    public static void main (String[]args){
        int num=9;
        int count=0;
        for(int i=1;i<=num;i++){
            int rem=num%i;
            if(rem==0){
                count++;
            }

        }
        if(count==2){
            System.out.println(num+"is prime number");
        }
        else{
            System.out.println(num+" "+"is composite number");

        }
    }
}
