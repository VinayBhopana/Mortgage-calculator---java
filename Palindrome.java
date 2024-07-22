import java.util.Scanner;

class java{
    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println("Enter a no");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //System.out.println(num);
        int rev=0;
        int temp=num;
        while(num!=0){
            int digit = num %10;
            rev = (rev*10)+digit;
            num = num/10;
            
        }
        System.out.println(rev);
        if(rev==temp){
            System.out.println("True");
        }else{System.out.println("False");}
        




    }
}
