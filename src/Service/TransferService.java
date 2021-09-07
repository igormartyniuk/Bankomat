package Service;

import com.bank.lesson.entity.Account;

public class TransferService {

    public void transfer(Account fromAccount, Account toAccount, int amount){
        if(amount <= 0){
            System.out.println ("Введіть коректну суму");
        }else if (fromAccount.getBill ().getAmount ()< amount) {
            System.out.println ("Недостатньо коштів. На вашому рахунку: "+fromAccount.getBill ().getAmount ());
            System.out.println ("_________________");
        }else{

            System.out.println ("Перерахунок коштів з аккаунту: - "+fromAccount.getPerson ().getFirsName ()+" "+fromAccount.getPerson ().getSecondName ()
            +" на акаунт "+toAccount.getPerson ().getFirsName ()+" "+toAccount.getPerson ().getSecondName ());
            System.out.println ("Поточний стан рахунку: "+fromAccount.getBill ().getAmount ()+" грн");
            System.out.println ("Сума перерахунку "+amount+" грн.");
            fromAccount.getBill ().setAmount (fromAccount.getBill ().getAmount () - amount);

            toAccount.getBill ().setAmount (toAccount.getBill ().getAmount () + amount);
            System.out.println ("__________________");
            System.out.println ("Успішна операція. Поточний стан рахунку: "+fromAccount.getBill ().getAmount ()+" грн.");

        }
    }


}
