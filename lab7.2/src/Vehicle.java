
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    public Vehicle(){
        
    }
    public Vehicle(double fuel){
        
    }
    public void addFuel(double fuel){
        
    }
    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return fuel;
    }
    public abstract void honk();
}
