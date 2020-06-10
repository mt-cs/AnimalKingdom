import java.awt.*;

public class WhiteTiger extends Tiger{
    boolean infected;
    public WhiteTiger(){
        infected=false;
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String toString() {
        if(infected){return super.toString();}
        return "tgr";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront()==Neighbor.OTHER){
            infected=true;
        }
        return super.getMove(info);
    }
}
