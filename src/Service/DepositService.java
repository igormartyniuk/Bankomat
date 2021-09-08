package Service;

import com.bank.lesson.entity.Account;

public class DepositService {

    public void deposit (Account account, int amount){
        int currentAmount = account.getBill().getAmount();
        if (amount <= 0){
            System.out.println("Ви ввели некоректну суму");
        }else {
            currentAmount = currentAmount + amount;
            System.out.println("Ваш рахунок поповнено на "+amount);
            System.out.println("На вашому разунку "+currentAmount);
            account.getBill().setAmount(currentAmount);
        }
    }
}
