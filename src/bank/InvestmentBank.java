package bank;

public class InvestmentBank {

    private int accountbalance;

    public int showBalance(){
        return accountbalance;
    }

    InvestmentBank (int balance){

        this.accountbalance = balance;

    }
}
