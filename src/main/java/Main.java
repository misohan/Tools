import Tools.Tools;
import Tools.brush.BrushOnACar;
import Tools.brush.BrushOnMetal;
import Tools.drill.DrillOnTheWall;
import Tools.drill.DrillOnTheWood;
import Tools.hammer.HammerOnConcrete;
import Tools.hammer.HammerOnWood;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tools> tools = new ArrayList<>();

        tools.add(new HammerOnConcrete());
        tools.add(new HammerOnWood());
        tools.add(new DrillOnTheWall());
        tools.add(new DrillOnTheWood());
        tools.add(new BrushOnACar());
        tools.add(new BrushOnMetal());

        try {
            for (Tools tool: tools){
                System.out.println("This tool makes sound: "+ tool.makeSound()+ " and is used for: " + tool.usedFor());
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}


