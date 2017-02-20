package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public enum  SpaceShip {
    SCOUT,CARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;

    @Override
    public String toString() {
        String id=name();
        String lower=id.substring(1).toLowerCase();
        return id.charAt(0)+lower;
    }

    public static void main(String[] args) {
        for(SpaceShip s:values()){
            System.out.println(s);
        }
    }
}
