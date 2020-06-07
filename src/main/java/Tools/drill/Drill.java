package Tools.drill;

import Tools.Tools;

public abstract class Drill implements Tools {

    @Override
    public String makeSound() {
        return "Whirrr";
    }
    public abstract String usedFor();
}
