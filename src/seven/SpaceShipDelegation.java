package seven;

/**
 * Created by saka on 2017/2/11.
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls=new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name=name;
    }

    public void up(int vellocity) {
        controls.up(vellocity);
    }

    public void down(int vellocity) {
        controls.down(vellocity);
    }

    public void left(int vellocity) {
        controls.left(vellocity);
    }

    public void right(int vellocity) {
        controls.right(vellocity);
    }

    public void forward(int vellocity) {
        controls.forward(vellocity);
    }

    public void back(int vellocity) {
        controls.back(vellocity);
    }

    public void turboBoost() {
        controls.turboBoost();
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector=new SpaceShipDelegation("NSEA Protector");
        protector.forward(100);
    }
}
