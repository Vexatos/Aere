package aere_commons.pokefenn;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabAere extends CreativeTabs{
	
	
    public CreativeTabAere(int par1, String par2Str) {
        
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex() {
        
        return Block.wood.blockID;
    }

}
