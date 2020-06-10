import java.awt.*;

public class Giant extends Critter{
    private int movement;
    public Giant(){ }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        int remain=movement%24;
        if(remain<6){
            return "fee";
        } else if (remain<12){
            return "fie";
        } else if (remain>=18){
            return "foe";
        } else {
            return "fum";
        }
    }

    public Action getMove(CritterInfo info){
        movement++;
        if (info.getFront() == Neighbor.OTHER) { return Action.INFECT; }
        else if(info.getFront() == Neighbor.EMPTY) { return Action.HOP;}
        return Action.RIGHT;
    }
}
