
public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        this("", null);
    }
    public Owner(String name){
        this(name, null);
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    public String getName(){
        return name;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return animal;
    }
    public void feedFood(Food f){
        animal.setPower(animal.getPower()+f.getPower());
    }
    @Override
    public String toString(){
        return ("Owner : name = "+getName()+", Animal : name = "+animal.getName()+", power = "+animal.getPower()+", age = "+animal.getAge());
    }
    public void protectOwnerFrom(Animal a){
        if ((animal instanceof Dog)){
            Dog d = (Dog) animal;
            d.kick(a);
        }else if ((animal instanceof Bird)){
            Bird b = (Bird) animal;
            b.wingAttack(a);
        }
    }
    public static void main(String[] args) {
        Pigeous p = new Pigeous("Pee",5);
        Owner bank = new Owner("Bank",p);

        Dog d = new Dog("Qee",4);
        Owner ice = new Owner("Ice",d);

        Meat m = new Meat();

        System.out.println(bank);
        System.out.println(ice);

        bank.protectOwnerFrom(ice.getAnimal());
        System.out.println(bank);
        System.out.println(ice);

        ice.feedFood(m);
        System.out.println(bank);
        System.out.println(ice);

        p.fly();
    }
}