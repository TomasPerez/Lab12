/**
 * Created by DELL on 7/27/2017.
 */
public class SillyWilly extends Player {

    String Name = "SillyWilly";

    public String getName() {

        return Name;
    }

    public void setName(String name) {
       this.Name = name;
    }

    @Override
    public Roshambo generateRoshambo() {
        Roshambo r1 = Roshambo.ROCK;
                return r1;

    }
}
