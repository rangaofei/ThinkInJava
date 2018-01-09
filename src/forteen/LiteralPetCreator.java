//: typeinfo/pets/LiteralPetCreator.java
// Using class literals.
package forteen;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LiteralPetCreator extends PetCreator {
    // No try block needed.
    @SuppressWarnings("unchecked")
    public static final List<Class<? extends Pet>> allTypes =
            Collections.unmodifiableList(Arrays.asList(
                    forteen.Pet.class, forteen.Dog.class, forteen.Cat.class, forteen.Rodent.class,
                    forteen.Mutt.class, forteen.Pug.class, forteen.EgyptianMau.class, forteen.Manx.class,
                    forteen.Cymric.class, forteen.Rat.class, forteen.Mouse.class, forteen.Hamster.class));
    // Types for random creation:
    private static final List<Class<? extends Pet>> types =
            allTypes.subList(allTypes.indexOf(Mutt.class),
                    allTypes.size());

    public List<Class<? extends Pet>> types() {
        return types;
    }

    public static void main(String[] args) {
        System.out.println(types);
    }
} /* Output:
[class typeinfo.pets.Mutt, class typeinfo.pets.Pug, class typeinfo.pets.EgyptianMau, class typeinfo.pets.Manx, class typeinfo.pets.Cymric, class typeinfo.pets.Rat, class typeinfo.pets.Mouse, class typeinfo.pets.Hamster]
*///:~
