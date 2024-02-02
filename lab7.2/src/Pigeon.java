
public class Pigeon extends Bird{
    private int numberOfPigeon;
    public Pigeon(){
        this(0, 0,0);
    }
    public Pigeon(double wingSize, double weight, double height){
        super(wingSize, weight, height);
        numberOfPigeon++;
    }
    public void eat(String food){
        if ("worm".equals(food)){
            setWeight(getWeight()+0.5);
        }else if ("seed".equals(food)){
            setWeight(getWeight()+0.2);
        }else{
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    public void fly(){
        if (getWeight() >= 5){
            System.out.println("Fly Fly");
            setWeight(getWeight()-0.25);
        }else{
            System.out.print("I'm hungry.");
        }
    }
    public void takeOff(){
        if (getWeight() >= 5){
            System.out.println("Take Off");
            setWeight(getWeight()-0.5);
        }else{
            System.out.print("I'm hungry.");
        }
    }
    public void landing(){
        if (getWeight() >= 5){
            System.out.println("Landing");
            setWeight(getWeight()-0.5);
        }else{
            System.out.print("I'm hungry.");
        }
    }
    @Override
    public String toString(){
        return "Pigeon "+getWeight()+" kg and "+getHeight()+" cm. There are "+numberOfPigeon+" pigeons.";
    }
}
