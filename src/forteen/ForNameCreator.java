//: typeinfo/pets/ForNameCreator.java
package forteen;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types = new ArrayList<>();
    // Types that you want to be randomly created:
    private static String[] typeNames = {
            "forteen.Mutt",
            "forteen.Pug",
            "forteen.EgyptianMau",
            "forteen.Manx",
            "forteen.Cymric",
            "forteen.Rat",
            "forteen.Mouse",
            "forteen.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
} ///:~
