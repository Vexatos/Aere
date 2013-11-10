package aere_commons.pokefenn;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL_NAME }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class Aere {

	//Instance of vineacraft
	
    @Instance(Reference.MOD_ID)
    public static Aere instance;
    
    //Client/Common proxy
    
    @SidedProxy(clientSide = "pokefenn.proxy.ClientProxy", serverSide = "pokefenn.proxy.CommonProxy")
    public static CommonProxy proxy;

    //Creative tab stuff
    
    public static CreativeTabs tabsAere = new CreativeTabAere(
            CreativeTabs.getNextID(), Reference.MOD_NAME);


}
