package aere_commons.pokefenn;

import ic2.api.recipe.RecipeInputOreDict;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ${Pokefenn}
 * Date: 12/11/13
 * Time: 20:49
 */
public class OtherWeirdClassThingy extends RecipeInputOreDict {
    public OtherWeirdClassThingy(String input) {
        super("ingotBrass");

    }

    public OtherWeirdClassThingy(String input, int amount) {
        super("ingotBrass", amount);
    }

    @Override
    public boolean matches(ItemStack subject) {
        return super.matches(subject);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public List<ItemStack> getInputs() {
        return super.getInputs();
    }
}
