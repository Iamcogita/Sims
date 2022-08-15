
public class Sim{
    private String name;
    private int peeIndex = 10;
    private int hungerIndex = 10;
    private int energyLevel = 100;
    private boolean hasHouse ;
    public Sim(String name){
        this.name=name;
        this.peeIndex = peeIndex;
        this.hungerIndex = hungerIndex;
        this.energyLevel = energyLevel;
        this.hasHouse = false;
    }

    public String getName() {
        return name;
    }

    public int getPeeIndex() {
        return peeIndex;
    }

    public void setPeeLevel(int amount) {
        this.peeIndex += amount;
    }

    public void pee(){
        this.peeIndex = 0;
    }

    public int getHungerIndex() {
        return hungerIndex;
    }

    public void setHungerLevel(int amount) {
        this.hungerIndex += amount;
    }

    public int getSleepIndex() {
        return energyLevel ;
    }

    public void setSleepLevel(int amount) {
        this.energyLevel -= amount;
    }

    public void setMyHouse(House myHouse) {
    }

    public boolean HasHouse() {
        return hasHouse;
    }

    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }
}
