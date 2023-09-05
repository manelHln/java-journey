import com.banksys.Exceptions.InsufficientBalanceException;
import com.banksys.bank.Bank;


public class Main {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        try {
            bank.init();
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }
}