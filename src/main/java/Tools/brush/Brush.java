package Tools.brush;

import Tools.Tools;

public abstract class Brush implements Tools {

    @Override
    public String makeSound() {
        return "Slosh, slosh….";
    }
    @Override
    public abstract String usedFor();

}
