
public class Employee {
    private static String nationality = "Thai";
    private String name;
    private Wallet wallet;
    private int energy;
    public boolean equals(Employee e){
        return this.name.equals(e);
    }
    @Override
    public String toString(){
        return "My name is "+name+". \nI have "+energy+" energy left.\nI have a balance of "+getWallet().getBalance()+" baht.";
    }
    public boolean buyFood(Seller s){
        Food n = s.sell(this);
        if (n != null){
            eat(n);
            return true;
        }
        else{
            return false;
        }
    }
    public void eat(Food f){
        energy += Food.getEnergy();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Wallet getWallet(){
        return wallet;
    }
    public void setWallet(Wallet wallet){
        this.wallet = wallet;
    }
    public int getEnergy(){
        return energy;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public static String getNationality(){
        return nationality;
    }
    public static void setNationality(String nationality){
        Employee.nationality = nationality;
    }
    public static void main(String[] args) {
        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet();
        w1.setBalance(200);
        w2.setBalance(100);

        Programmer p1 = new Programmer();
        p1.setName("Boy");
        p1.setEnergy(100);
        p1.setWallet(w1);
        p1.setHappiness(100);

        SeniorProgrammer sp1 = new SeniorProgrammer();
        sp1.setName("Ploy");
        sp1.setEnergy(100);
        sp1.setWallet(w2);
        sp1.setHappiness(100);

        System.out.println(sp1 + "\nHappiness : " +sp1.getHappiness());
        sp1.coding('A');
        sp1.coding("Bugggggg");
        sp1.coding("Bugggggg",2);
        System.out.println(sp1 + "\nHappiness : " +sp1.getHappiness());
        System.out.println("---------------------------------");
        System.out.println(p1 + "\nHappiness : " +p1.getHappiness());
        p1.coding('B');
        p1.coding("Deathhhhhhhh");
        System.out.println(p1 + "\nHappiness : " +p1.getHappiness());
    }
}
