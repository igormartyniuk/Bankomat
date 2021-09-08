package Service;

import com.bank.lesson.entity.Account;

public class SingIn {

    private Account account;

    public boolean login (Account account, int number){
        if(account.getPerson().getCode() == number){
            System.out.println("Вхід в систему");
            return true;
        }else{
            System.out.println("Пробуйте ще");
            return false;
        }

    }
}
