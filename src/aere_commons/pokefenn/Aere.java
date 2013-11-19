package aere_commons.pokefenn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.io.File;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "after:IndustrialCraft 2;")
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class Aere {

	
	
    @Instance(Reference.MOD_ID)
    public static Aere instance;
    
    //Client/Common proxy
    
    @SidedProxy(clientSide = "aere_commons.pokefenn.ClientProxy", serverSide = "aere_commons.pokefenn.CommonProxy")
    public static CommonProxy proxy;

    //Creative tab stuff
    
    public static CreativeTabs tabsAere = new CreativeTabAere(
            CreativeTabs.getNextID(), Reference.MOD_NAME);
    
    public static Item plateBrass;
    public static Item itemCasingBrass;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
    	
    	LocalizationHandler.loadLanguages();
    	
    	
    	Config.init(new File(event.getModConfigurationDirectory()
                .getAbsolutePath()
                + File.separator
                + Reference.MOD_NAME
                + File.separator + Reference.MOD_NAME + ".cfg"));
    	
    	
    	
    	plateBrass = new ItemPlateBrass(Config.PLATEBRASS);
        //itemCasingBrass = new ItemCasingBrass(Config.ITEMCASINGBRASS);
    	
    	
        
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	OreDictionary.registerOre("plateBrass", new ItemStack(plateBrass));
    	//OreDictionary.registerOre("plateBronze", new ItemStack(plateBrass));
        WeirdIC2APIStuff.init();
        Recipes.init();


    }
    
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        
    }

}
