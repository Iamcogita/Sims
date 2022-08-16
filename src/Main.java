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
            SimI.haveFun(David);
            SimI.haveFun(David);
            SimI.payHouseKeeper(David);
            SimI.rest(David);
            SimI.goToToilet(David);
            SimI.haveFun(David);
            SimI.buyHouse(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.rest(Cassandra);
            SimI.eatPizza(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(David);
            SimI.haveFun(Cassandra);
            SimI.goToToilet(Cassandra);
            SimI.payHouseKeeper(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.rest(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.haveFun(Cassandra);
            SimI.showStats(Cassandra);
            SimI.showStats(David);
            // Had Fun ...

        }
        catch (HouseException exceptions){
            System.out.println(exceptions.getMessage());
        }
    }
}