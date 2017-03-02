//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package forteen;
import typeinfo.pets.*;
import typeinfo.pets.LiteralPetCreator;
import typeinfo.pets.Pet;

import java.util.*;

public class Pets {
  public static final typeinfo.pets.PetCreator creator =
    new LiteralPetCreator();
  public static typeinfo.pets.Pet randomPet() {
    return creator.randomPet();
  }
  public static typeinfo.pets.Pet[] createArray(int size) {
    return creator.createArray(size);
  }
  public static ArrayList<Pet> arrayList(int size) {
    return creator.arrayList(size);
  }
} ///:~
