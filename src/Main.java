import Service.DepositService;
import Service.PaymentService;
import Service.TransferService;
import com.bank.lesson.entity.Account;
import com.bank.lesson.entity.Bill;
import com.bank.lesson.entity.Person;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Person igor = new Person("Igor","Martyniuk","+380634892104");
        Bill igorBill = new Bill(10000);
        Account igorAccount = new Account(igorBill,igor);

        Person svitlana = new Person("Svitlana","Ruzhnitska","+380635794928");
        Bill svitlanaBill = new Bill(9000);
        Account svitlanaAccount = new Account(svitlanaBill,svitlana);

        PaymentService paymentService = new PaymentService();
        DepositService depositService = new DepositService();
        TransferService transferService = new TransferService ();

        int work = 0;

        while (work ==0){
            System.out.println("Виберіть операцію: ");
            System.out.println("1 - оплатити");
            System.out.println("2 - поповнити");
            System.out.println("3 - Перерахунок");
            System.out.println("4 - Вийти");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:{
                    System.out.println("Введіть суму оплати");
                    paymentService.pay(igorAccount,scanner.nextInt ());
                    break;
                }
                case 2:{

                    System.out.println("Введіть суму поповнення");
                    depositService.deposit(igorAccount,scanner.nextInt ());
                    break;
                }
                case 3:{
                    System.out.println("Введіть суму");
                    transferService.transfer (igorAccount,svitlanaAccount,scanner.nextInt ());
                    break;
                }
                case 4:work = 1;
                break;
            }
        }


    }
}
