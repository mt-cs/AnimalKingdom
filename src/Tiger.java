import java.awt.*;

public class Tiger extends Critter{
    private int countMove;
    public Tiger(){
        countMove=0;
    }

    /**
     * Randomly picks one of three colors (Color.RED, Color.GREEN, Color.BLUE)
     * and uses that color for three moves, then randomly picks one of those colors again
     * for the next three moves,then randomly picks another one of those colors for the next three moves, and so on.
     */
    public Color getColor() {
        int i=0;
        Color[]tigerColor = {Color.RED , Color.GREEN , Color.BLUE};
        if(countMove%3==0){i = (int) (Math.random()*3);}
        return tigerColor[i];
    }

    @Override
    public String toString() {
        return "TGR";
    }

    /**
     * 	always infect if an enemy is in front, otherwise if a wall is in front or to the right, then turn left,
     * 	otherwise if a fellow Tiger is in front, then turn right, otherwise hop.
     * @param info information of surrounding
     */

    public Action getMove(CritterInfo info){
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
            return Action.LEFT;
        } else if (info.getFront()==Neighbor.SAME){
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }

    }

}
