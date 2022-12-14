import docs.HouseException;

public class SimGame {
    private void checkExceptions(Sim sim) throws HouseException {
        if(!sim.HasHouse()){ throw new HouseException("Must buy house first."); }
        if(sim.getSleepIndex() <= 0){ throw new HouseException("Should go to sleep."); }
        if(sim.getPeeIndex() >= 100){ throw new HouseException("Should go to the toilet."); }
        if(sim.getHungerIndex() >= 100){ throw new HouseException("Should eat something."); }
        if(Division.getHouseDivisions().stream()
                .anyMatch(division -> division.getDirtIndex() >= 100 )){
            System.out.print(sim.getName()+ "'s" + " " + Division.getHouseDivisions().stream()
                    .filter(division -> division.getDirtIndex() >= 100).findFirst().get().getType());
            throw new HouseException(" is too dirty, should call HouseKeeper.");
        }
    }
    private String Stats(Sim sim){
        return sim.getName() + "'s Stats:\n"+ "-".repeat(40) + "\n|Sleep: " + sim.getSleepIndex()
                + " |Hunger: " + sim.getHungerIndex()+ " |Toilet: " + sim.getPeeIndex()+"\n"
                + "-".repeat(40);
    }
    public void showStats(Sim sim){
        System.out.println(Stats(sim));
    }
    public void goToToilet(Sim sim) throws HouseException{
        sim.pee();
        checkExceptions(sim);
        Division.getHouseDivisions().stream().filter(division -> division.getType()
                .equalsIgnoreCase("bathroom")).forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " went to the toilet.");

    }
    public void rest(Sim sim) throws HouseException{
        sim.sleepLevelModifier(-100);
        checkExceptions(sim);
        Division.getHouseDivisions().stream().filter(division -> division.getType()
                .equalsIgnoreCase("bedroom")).forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " went to sleep.");
    }
    public void haveFun(Sim sim) throws HouseException{
        sim.hungerLevelModifier(10);
        sim.sleepLevelModifier(20);
        sim.peeLevelModifier(20);
        checkExceptions(sim);
        Division.getHouseDivisions().forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " had lots of fun!");
    }
    public void eatPizza(Sim sim) throws HouseException{
        sim.hungerLevelModifier(-50);
        checkExceptions(sim);
        sim.peeLevelModifier(100);
        Division.getHouseDivisions().stream().filter(division -> division.getType()
                .equalsIgnoreCase("living_room")).forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " ate pizza.");
    }
    public void work(Sim sim) throws HouseException{
        checkExceptions(sim);
        sim.hungerLevelModifier(25);
        sim.sleepLevelModifier(25);
        sim.peeLevelModifier(25);
        Division.getHouseDivisions().stream().filter(division -> division.getType()
                .equalsIgnoreCase("office")).forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " worked for a few hours.");
    }
    public void takeCareOfYourself(Sim sim) throws HouseException {
        sim.resetAllNeeds();
        checkExceptions(sim);
    }
    public void payHouseKeeper (Sim sim) throws HouseException{
        Division.getHouseDivisions().forEach(Division::cleanHouse);
        checkExceptions(sim);
        System.out.println("House was cleaned.");
    }
    public void buyHouse(Sim sim) throws HouseException {
        if(!sim.HasHouse()){
            sim.setMyHouse();
            sim.setHasHouse(true);
            System.out.printf("%s bought a house.\n", sim.getName() );
            return;
        }
        throw new HouseException("Already have a house.");
    }
}