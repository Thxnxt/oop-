
public class Novice extends Player{
    public Novice(){
        super.setHP(10);
        super.setMP(10);
        super.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player p){
        p.attacked(this.getATK());
    }
    @Override
    public void attacked(double n){
        this.setHP(this.getHP()-n);
    }
}
