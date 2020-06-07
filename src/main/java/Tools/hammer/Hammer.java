package Tools.hammer;

import Tools.Tools;

public abstract class Hammer implements Tools {

    @Override
    public String makeSound() {
        return "Bang!";
    }
    @Override
    public abstract String usedFor();
}
