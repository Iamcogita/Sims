import java.util.Arrays;
import java.util.List;

public class Division extends House {
    private String type;
    private int dirtIndex;
    private int dirtMultiplier;
    private Division(String type, int dirtIndex, int dirtMultiplier ) {
        this.type = type;
        this.dirtIndex = dirtIndex;
        this.dirtMultiplier = dirtMultiplier;
    }
    private static List<Division> houseDivisions = Arrays.asList(
            new Division("BATHROOM", 0,30),
            new Division("LIVING_ROOM", 0 , 20),
            new Division("BEDROOM" , 0, 10),
            new Division("OFFICE", 0, 25)
    );

    public String getType() {return type;}

    public int getDirtIndex() {return dirtIndex;}

    public void cleanHouse() {this.dirtIndex = 0 ;}

    public int dirtMultiplier() {return dirtIndex += dirtMultiplier;}

    public static List<Division> getHouseDivisions() {return houseDivisions;}
}
