package aere_commons.pokefenn;

import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.Recipes;
import aere_commons.pokefenn.ItemPlateBrass;
import net.minecraft.item.ItemStack;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 12/11/13
 * Time: 18:56
 */
public class WeirdIC2APIStuff {

    public static void init(){

        //A method to do all the API stuff for IC2 interaction


        Recipes.metalformerRolling.addRecipe(new RecipeInputOreDict("ingotBrass", 1), null, new ItemStack(Aere.plateBrass));




    }




}
