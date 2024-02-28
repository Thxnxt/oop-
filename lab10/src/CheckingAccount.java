//lab10

public class CheckingAccount extends Account {

    private double credit;

    public CheckingAccount() {
        this(0, "", 0);
    }

    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }

    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        } else {
            System.out.println("Input number must be a positive integer.");
        }
    }

    public double getCredit() {
        return credit;
    }

    @Override
    public void withdraw(double a) {
        if (a > 0 && balance - a >= 0) {
            setBalance(getBalance() - a);
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else if ((a > 0 && balance - a < 0) && balance - a + credit >= 0) {
            a = a - getBalance();
            setBalance(0);
            setCredit(getCredit() - a);
            System.out.println(a + " baht is withdrawn from " + name + " and your credit balance is " + credit + ".");
        } else if ((a > 0 && balance - a < 0) && balance - a + credit < 0) {
            System.out.println("Not enough money!");
        }
    }

    public void withdraw(String a) {
        this.withdraw(Double.parseDouble(a));
    }

    @Override
    public String toString() {
        return ("The " + getName() + " account has " + getBalance() + " baht and " + getCredit() + " credits.");
    }
}
