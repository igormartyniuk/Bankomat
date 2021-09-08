import Service.DepositService;
import Service.PaymentService;
import Service.SingIn;
import Service.TransferService;
import com.bank.lesson.entity.Account;
import com.bank.lesson.entity.Bill;
import com.bank.lesson.entity.Person;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Person igor = new Person("Igor", "Martyniuk", 2580);
        Bill igorBill = new Bill(10000);
        Account igorAccount = new Account(igorBill, igor);

        Person svitlana = new Person("Svitlana", "Ruzhnitska", 4646);
        Bill svitlanaBill = new Bill(9000);
        Account svitlanaAccount = new Account(svitlanaBill, svitlana);

        Person oleg = new Person("Oleg", "Martyniuk", 8063);
        Bill olegBill = new Bill(7000);
        Account olegAccount = new Account(olegBill, oleg);

        Account [] accounList = new Account[3];
        accounList [0] = igorAccount;
        accounList [1] = svitlanaAccount;
        accounList [2] = olegAccount;

        PaymentService paymentService = new PaymentService();
        DepositService depositService = new DepositService();
        TransferService transferService = new TransferService();
        SingIn singIn = new SingIn();

        System.out.println("Привіт");
        int tryLogin = 0;
        for (int i = 0; i<3; i++) {
            System.out.println("Введіть пароль");
            if (singIn.login(igorAccount, scanner.nextInt()) == true) {
                while (true) {

                    System.out.println("Виберіть операцію: ");
                    System.out.println("1 - Перевірка балансу");
                    System.out.println("2 - оплатити");
                    System.out.println("3 - поповнити");
                    System.out.println("4 - Перерахунок");
                    System.out.println("5 - Вийти");

                    int choice = scanner.nextInt();
                    switch (choice) {
                        case 1: {
                            System.out.println(igorAccount.getPerson().getFirsName() + " " + igorAccount.getPerson().getSecondName() + ". Поточний стан рахунку: " + igorAccount.getBill().getAmount() + " грн.");
                            System.out.println("_____________");
                            break;
                        }
                        case 2: {
                            System.out.println("Введіть суму оплати");
                            paymentService.pay(igorAccount, scanner.nextInt());
                            break;
                        }
                        case 3: {

                            System.out.println("Введіть суму поповнення");
                            depositService.deposit(igorAccount, scanner.nextInt());
                            break;
                        }
                        case 4: {
                            System.out.println("Введіть імя користувача якому перераховуєте кошти");
                            String check = scanner.next();
                            boolean checkname = false;
                            for (Account account:accounList) {
                                if (check.equals(account.getPerson().getFirsName())) {
                                    System.out.println("Введіть суму");
                                    transferService.transfer(igorAccount, account, scanner.nextInt());
                                    System.out.println("________________");
                                    checkname = true;
                                }
                            }
                            break;
                        }
                        case 5:
                            for (Account account:accounList) {
                                System.out.println(account.getPerson().getFirsName() +" "+account.getBill().getAmount());
                            }
                            return;
                    }
                }
            } else {
                tryLogin++;
                System.out.println("У вас залишилось " + (3 - tryLogin) + " спроб.");
                if (tryLogin == 3){
                    System.out.println("Ваш акаунт заблоковано!");
                }
            }
        }
    }
}