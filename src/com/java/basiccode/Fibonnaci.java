public class Fibonnaci {
    public static void main (String[]args){
        int n1=1;
        int n2=2;
        int next;
        int n=10;
        int sum=0;
        for(int i=0;i<=n;i++){
            System.out.print(n1+ " ");
            next=n1+n2;
            n1=n2;
            n2=next;
        }

    }

}
