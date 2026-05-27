public class CountOfDigit {

        public static void main (String[]args){
            int n=123456;
            int rem=0;
            int sum=0;
            int count=0;
            while(n!=0){
                rem=n%10;
                if(rem>0){
count++;
                }
                n=n/10;

            }
            System.out.println("count of digit is:"+ count);
        }
    }


