import java.awt.*;
import java.util.Random;

public class NinjaCat extends Critter {
    Action[] actions = {Action.LEFT, Action.RIGHT};
    Random rand = new Random();

    public NinjaCat(){}

    @Override
    public Color getColor() {
        return Color.CYAN;
    }

    @Override
    public String toString() {
        return "NC";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT; }
        else if(info.getFront()==Neighbor.WALL || info.getFront()==Neighbor.SAME){
            return actions[rand.nextInt(actions.length)];
        }
        return Action.HOP;
    }
}
