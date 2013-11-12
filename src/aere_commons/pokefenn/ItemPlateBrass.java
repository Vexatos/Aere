package aere_commons.pokefenn;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemPlateBrass extends Item {
	
	
	public ItemPlateBrass(int id){
		
		super(id - 256);
		this.setUnlocalizedName("plateBrass");
		this.setMaxStackSize(64);
		
		
	}


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {

        itemIcon = register.registerIcon("aere:plateBrass");


    }

}
