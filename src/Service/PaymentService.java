package Service;

import com.bank.lesson.entity.Account;

public class PaymentService {

    public void pay (Account account, int amount) throws InterruptedException {
        account.getBill();
        int currentAmmount = account.getBill().getAmount();
        if (currentAmmount < amount){
            System.out.println("Недостатньо коштів");
        }else {
            currentAmmount = currentAmmount - amount;
            System.out.println("Виконується операція списання коштів");
            System.out.println("на вашому рахунку "+currentAmmount);
            account.getBill().setAmount(currentAmmount);
        }
    }
}
