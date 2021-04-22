
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
 
    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if(this.euros > compared.euros()) {
            return false;
        }
        if(this.euros == compared.euros()) {
            if(this.cents > compared.cents()) {
                return false;
            }
        }
        return true;
    }
    
    public Money minus(Money decreaser) {
        int nEuros = this.euros - decreaser.euros();
        int nCents = this.cents - decreaser.cents();
        if (nCents < 0) {
            nEuros = nEuros - 1;
            nCents = 100 + nCents;
        }
        if(nEuros < 0) {
            nEuros = 0;
            nCents = 0;
        }
        Money newMoney = new Money(nEuros, nCents);
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
