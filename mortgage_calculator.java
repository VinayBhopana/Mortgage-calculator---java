import java.text.NumberFormat;
import java.util.Scanner;

class mortgage{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = scanner.nextInt();
        
        System.out.print("Annual Interest Rate: ");
        float rate = scanner.nextFloat();
        
        System.out.print("Period (Years): ");
        int n = scanner.nextInt();
        int N = n*12;
        float actual_rate = rate/100/12;
        double mortgage = principle*actual_rate*((Math.pow(1+actual_rate,N))/(Math.pow(1+actual_rate,N)-1));
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String Mortgage = currency.format(mortgage);
        System.out.println("The Mortgage is " + Mortgage);



    }
}
