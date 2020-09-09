package bank;

public class AtmBank implements Wallet, Transaction {

    private int accountBalance;

  //  AtmBank(int accountBalance){

    //}

    public int depositMoney(int moneyIn){
        this.accountBalance+=moneyIn;
        return accountBalance;
    }

    public int withdrawMoney(int moneyOut){
        this.accountBalance-=moneyOut;
        return accountBalance;
    }

    public int showBalance(){
        return accountBalance;
    }


    public int usingMoney() {
        depositMoney(8);
        depositMoney(92);
        withdrawMoney(50);
        return showBalance();
    }
}


interface Wallet{

    int depositMoney(int moneyIn);
    int withdrawMoney(int moneyOut);

}

interface Transaction{

    int usingMoney();

}