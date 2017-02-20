package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public enum OzWitch {
    WEST("Miss Gulch,aka the Wicked"),
    NORTH("Glinda"),
    EAST("Wicked"),
    SOUTH("Good");

    private String description;

    OzWitch(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for(OzWitch witch:OzWitch.values()){
            System.out.println(witch+":"+witch.getDescription());
        }
    }
}
