import java.awt.*;

public class Bear extends Critter {
        private boolean polar;
        private int move;

    public Bear(boolean Polar){
        polar = Polar;
    }

    @Override
    public Color getColor() {
        if (polar){
            return Color.WHITE;
        }
        return Color.BLACK;
    }

    /**
     * Should alternate on each different move between a slash character (/)
     * and a backslash character () starting with a slash.
     * @return s
     */
    @Override
    public String toString() {
        if(move%2==0){ return "/"; }
        return  "\\";
    }

    /**
     * Always infect if an enemy is in front, otherwise hop if possible, otherwise turn left.
     * @param info information of surrounding
     */
    @Override
    public Action getMove(CritterInfo info) {
        move++;
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if(info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        } else{
            return super.getMove(info);
        }
    }
}
