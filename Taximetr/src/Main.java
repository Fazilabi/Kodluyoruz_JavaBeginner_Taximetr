import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 0.25, total, startPrice = 1;
        System.out.println("km daxil edin: ");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();
        total = km*perKm;
        //total+=startPrice;
        total = (total<1.5)? 1.5 : total;
        System.out.println("total is : "+ total + " AZN");
    }
}
