public class Sim {
    private String name;
    private int peeIndex = 10;
    private int hungerIndex = 10;
    private int energyLevel = 100;
    private boolean hasHouse = false;
    private House myHouse;
    public Sim(String name){this.name=name;}
    public String getName() {
        return name;
    }
    public void resetAllNeeds(){
        this.energyLevel=100;
        this.hungerIndex = 0;
        this.peeIndex = 0;
    }
    public int getPeeIndex() {
        return peeIndex;
    }
    public void peeLevelModifier(int amount) {
        this.peeIndex += amount;
    }
    public void pee(){
        this.peeIndex = 0;
    }
    public int getHungerIndex() {
        return hungerIndex;
    }
    public void hungerLevelModifier(int amount) {
        this.hungerIndex += amount;
    }
    public int getSleepIndex() {
        return energyLevel ;
    }
    public void sleepLevelModifier(int amount) {
        this.energyLevel -= amount;
    }
    public void setMyHouse() { myHouse = new House(); }
    public boolean HasHouse() {
        return hasHouse;
    }
    public void setHasHouse(boolean hasHouse) {
        this.hasHouse = hasHouse;
    }
}