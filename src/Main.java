import docs.HouseException;

public class Main extends SimGame {
    public static void main(String[] args) {
        try {
            SimGame SimI = new SimGame();
            Sim Cassandra = new Sim("Cassandra");
            SimI.buyHouse(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.rest(Cassandra);
            SimI.eatPizza(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.rest(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(Cassandra);
            System.out.println(SimI.showStats(Cassandra));
            // Had Fun ...

        }
        catch (HouseException exceptions){
            System.out.println(exceptions.getMessage());
        }
    }
}