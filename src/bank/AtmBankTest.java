package bank;

import static org.junit.jupiter.api.Assertions.*;

class AtmBankTest {



    @org.junit.jupiter.api.Test
    void depositMoney() {
        AtmBank capitec = new AtmBank();

        capitec.depositMoney(70);
        capitec.depositMoney(8);
        assertEquals(78, capitec.showBalance());

    }


    @org.junit.jupiter.api.Test
    void withdrawMoney() {
        AtmBank capitec = new AtmBank();

        capitec.depositMoney(100);
        capitec.withdrawMoney(50);
        assertEquals(50, capitec.showBalance());
    }

    @org.junit.jupiter.api.Test
    void showBalance() {
        AtmBank capitec = new AtmBank();

        capitec.showBalance();
        assertEquals(0,capitec.showBalance());
    }

    @org.junit.jupiter.api.Test
    void usingMoney(){
        AtmBank capitec = new AtmBank();

        capitec.usingMoney();
        assertEquals(50,capitec.showBalance());

    }

    @org.junit.jupiter.api.Test
    void test(){
        Wallet bankTest = new AtmBank();
        Transaction bankTest2 = (Transaction) bankTest;
        assertEquals(0,bankTest.depositMoney(0));
        assertEquals(50,bankTest2.usingMoney());
    }
}