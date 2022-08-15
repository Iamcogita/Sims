import docs.HouseException;

public class SimGame {
    private void checkExceptions(Sim sim) throws HouseException {
        if(!sim.HasHouse()){throw new HouseException("Must buy house first."); }
        if(sim.getSleepIndex() <= 0){throw new HouseException("Should go to sleep."); }
        if(sim.getPeeIndex() >= 100){throw new HouseException("Should go to the toilet."); }
        if(sim.getHungerIndex() >= 100){throw new HouseException("Should eat something."); }
        if(Division.getHouseDivisions().stream()
                .anyMatch(division -> division.getDirtIndex() >= 100 )){
            System.out.print("The " + Division.getHouseDivisions().stream().findFirst().get().getType());
            throw new HouseException(" is too dirty, should call HouseKeeper.");
        }
    }
    public String showStats(Sim sim){
        return sim.getName() + "'s Stats:\n"+ "-".repeat(40) + "\n|Sleep: " + sim.getSleepIndex()
                + " |Hunger: " + sim.getHungerIndex()+ " |Toilet: " + sim.getPeeIndex()+"\n"
                + "-".repeat(40);
    }

    public void goToToilet(Sim sim) throws HouseException{
        sim.pee();
        checkExceptions(sim);
        Division.getHouseDivisions().forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " went to the toilet.");

    }
    public void rest(Sim sim) throws HouseException{
        sim.setSleepLevel(-100);
        checkExceptions(sim);
        System.out.println(sim.getName() + " went to sleep.");
    }
    public void haveFun(Sim sim) throws HouseException{
        sim.setHungerLevel(10);
        sim.setSleepLevel(20);
        sim.setPeeLevel(20);
        checkExceptions(sim);
        Division.getHouseDivisions().forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " had lots of fun!");
    }
    public void eatPizza(Sim sim) throws HouseException{
        checkExceptions(sim);
        sim.setHungerLevel(-50);
        sim.setSleepLevel(50);
        sim.setPeeLevel(100);
        Division.getHouseDivisions().forEach(Division::dirtMultiplier);
        System.out.println(sim.getName() + " ate pizza.");
    }
    public void payHouseKeeper (Sim sim) throws HouseException{
        Division.getHouseDivisions().forEach(Division::cleanHouse);
        checkExceptions(sim);
        System.out.println("House was cleaned.");
    }
    public void buyHouse(Sim sim) throws HouseException {
        if(!sim.HasHouse()){
            sim.setMyHouse(new House());
            sim.setHasHouse(true);
            System.out.printf("%s bought a house.\n", sim.getName() );
            return;
        }
        throw new HouseException("Already have a house.");
    }
}