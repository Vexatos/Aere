package aere_commons.pokefenn;

import ic2.api.recipe.IMachineRecipeManager;
import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.RecipeOutput;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ${Pokefenn}
 * Date: 12/11/13
 * Time: 18:56
 */
public class WeirdIC2APIStuff implements IMachineRecipeManager {

    public static void init(){

        //A method to do all the API stuff for IC2 interaction






    }

    @Override
    public void addRecipe(IRecipeInput input, NBTTagCompound metadata, ItemStack... outputs) {



    }

    @Override
    public RecipeOutput getOutputFor(ItemStack input, boolean adjustInput) {

     return null;
    }

    @Override
    public Map<IRecipeInput, RecipeOutput> getRecipes() {
        return null;

    }


}
