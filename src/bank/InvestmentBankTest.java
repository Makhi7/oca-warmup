package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentBankTest {

    @Test
    void shouldShowBalance() {
        InvestmentBank investAmount = new InvestmentBank(100);
        assertEquals(100,investAmount.showBalance());

    }


}