package Service;

import com.bank.lesson.entity.Account;

public class SingIn {

    private Account account;

    public void singIn (Account account, int number){
        if(account.getPerson().getCode() == number){
            System.out.println("Вхід в систему");
        }else{
            System.out.println("Пробуйте ще");
        }
    }
}
