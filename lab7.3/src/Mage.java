
public class Mage extends Player{
    public Mage(){
        super.setHP(10);
        super.setMP(20);
        super.setATK(5);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    @Override
    public void attack(Player p){
        p.attacked(this.getATK()*2.5);
        this.setMP(this.getMP()-5);
    }
    @Override
    public void attacked(double n){
        this.setHP(this.getHP()-n);
    }
}
