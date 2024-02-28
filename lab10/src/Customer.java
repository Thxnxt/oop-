
public class Customer {

    private String firstName;
    private String lastName;
    private Account acct[];
    private int numOfAccount;

    public Customer() {
        this("", "");
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new Account[5];
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAcct(CheckingAccount[] acct) {
        this.acct = acct;
    }

    public void addAccount(Account acct) {
        this.acct[numOfAccount] = acct;
        numOfAccount++;
    }

    public Account getAccount(int index) {
        return acct[index];
    }

    public int getNumOfAccount() {
        return numOfAccount;
    }

    @Override
    public String toString() {
        if (acct[0] == null) {
            return (getFirstName() + " " + getLastName() + " does’t have account.");
        } else {
            return (getFirstName() + " " + getLastName() + " has " + getNumOfAccount() + " account.");
        }
    }

    public boolean equals(Customer c) {
        if (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        // ทดลองฝากเงิน ถอนเงินในบัญชีต่างๆ
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        // แสดงข้อมูลของลูกค้า เช่น Somsri Boonjing has 2 accounts.
        System.out.println(cust);
        // ทดลองสร้างบัญชีและเพิEมบัญชีนัFนๆ ให้กับลูกค้า มากกว่า 5 บัญชี
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
            cust.getAccount(i).showAccount();
        }
    }
}
