import java.util.Scanner;

public class interestMoney {
    public static void main(String[] args) {
//        Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a money:");
        money = input.nextDouble();
        System.out.println("Enter a month:");
        month = input.nextInt();
        System.out.println("Enter number interset:");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money*(interestRate/100)/12*month;
            System.out.println("Total money of interest: "+ totalInterest);
        }
    }
}
