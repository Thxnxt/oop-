//lab10

import java.util.*;

public class CustomerAPI {

    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;

    public CustomerAPI() {
        this("", "");
    }

    public CustomerAPI(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
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

    public void addAccount(Account acct) {
        this.acct.add(acct);
    }

    public Account getAccount(int index) {
        return (Account)acct.get(index);
    }

    public int getNumOfAccount() {
        return acct.size();
    }

    @Override
    public String toString() {
        if (acct == null) {
            return (getFirstName() + " " + getLastName() + " does’t have account.");
        } else {
            return (getFirstName() + " " + getLastName() + " has " + getNumOfAccount() + " account.");
        }
    }

    public boolean equals(CustomerAPI c) {
        if (this.firstName.equals(c.firstName) && this.lastName.equals(c.lastName)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        CustomerAPI cust = new CustomerAPI("Somsri", "Boonjing");
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
