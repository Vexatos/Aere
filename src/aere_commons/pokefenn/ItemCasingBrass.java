package aere_commons.pokefenn;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 18/11/13
 * Time: 17:47
 */
public class ItemCasingBrass extends Item {

    public ItemCasingBrass(int id){

        super(id - 256);
        this.setUnlocalizedName("itemCasingBrass");
        this.setMaxStackSize(64);


    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {

        itemIcon = register.registerIcon("aere:itemCasingBrass");


    }



}
