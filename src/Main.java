import docs.HouseException;

public class Main extends SimGame {
    public static void main(String[] args) {
        try {
            SimGame SimI = new SimGame();
            Sim Cassandra = new Sim("Cassandra");
            Sim David = new Sim("David");
            SimI.buyHouse(David);
            SimI.haveFun(David);
            SimI.haveFun(David);
            SimI.payHouseKeeper(David);
            SimI.rest(David);
            SimI.showStats(David);
            // Different Sim & house
            SimI.buyHouse(Cassandra);
            SimI.eatPizza(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.rest(Cassandra);
            SimI.eatPizza(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.work(Cassandra);
            SimI.work(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.rest(Cassandra);
            SimI.work(Cassandra);
            SimI.showStats(Cassandra);
            // Had Fun ...

        }
        catch (HouseException exceptions){
            System.out.println(exceptions.getMessage());
        }
    }
}