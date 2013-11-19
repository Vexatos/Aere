package aere_commons.pokefenn;

import cpw.mods.fml.common.registry.GameRegistry;
import ic2.api.item.Items;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 19/11/13
 * Time: 13:41
 */
public class Recipes {


    public static void init(){

       GameRegistry.addRecipe(new ShapedOreRecipe(Items.getItem("mixedMetalIngot"), new Object[]{"iii", "bbb", "ttt", ('i'), "plateIron", ('t'), "plateTin", ('b'), Aere.plateBrass}));

       GameRegistry.addRecipe(new ShapelessOreRecipe(Aere.plateBrass, "ingotBrass", "craftingToolForgeHammer"));

        //GameRegistry.addRecipe((Items.getItem("mixedMetalIngot")), new Object[]{"iii", "ttt", "bbb", ('i'), Items.getItem("plateIron"), ('t'), Items.getItem("plateTin"), ('b'), Aere.plateBrass });

    }
}
