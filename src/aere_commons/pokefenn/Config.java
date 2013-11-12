package aere_commons.pokefenn;

import java.io.File;
import java.util.logging.Level;


import cpw.mods.fml.common.FMLLog;
import net.minecraftforge.common.Configuration;

public class Config {
	
	
    public static Configuration configuration;
    //public static final String CATEGORY_GAMEPLAY = "gameplay";

    public static int PLATEBRASS;
    public static int PLATEBRASS_DEFAULT = 28000;
	
	public static void init(File configFile) {
        
        configuration = new Configuration(configFile);
        
        try {
        	
        	
        	PLATEBRASS = configuration.getItem("plateBrass", PLATEBRASS_DEFAULT).getInt(PLATEBRASS_DEFAULT);
        	
        	
        	
        	
        }
        
        
        catch (Exception e) {
            
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration, go ask on the forums :p");
            
        }
        
        finally {
            configuration.save(); 
        }
    }
        
        public static void set(String categoryName, String propertyName, String newValue) {

            configuration.load();
            if (configuration.getCategoryNames().contains(categoryName)) {
                if (configuration.getCategory(categoryName).containsKey(propertyName)) {
                    configuration.getCategory(categoryName).get(propertyName).set(newValue);
                }
            }
            configuration.save();
        
        
    }

}
