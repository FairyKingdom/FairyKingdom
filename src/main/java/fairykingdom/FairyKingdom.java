package fairykingdom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import fairykingdom.block.FairyKingdomBlocks;
import fairykingdom.entity.FairyKingdomEntities;
import fairykingdom.helpers.UrlListHelper;
import fairykingdom.item.FairyKingdomItems;
import fairykingdom.proxy.CommonProxy;

@Mod(name = FairyKingdom.NAME, modid = FairyKingdom.MODID, version = FairyKingdom.VERSION)
public class FairyKingdom
{
	public static final String NAME = "Fairy Kingdom";
    public static final String MODID = "fairykingdom";
    public static final String VERSION = "0.1";
    
    public static final List<String> authorsCurrentVersion = Arrays.asList(new String[] {"Ruukas", "PirateCody"});
    public static ArrayList<String> authorsFromGithub;


    @Metadata(MODID)
    public static ModMetadata meta;

	@SidedProxy(clientSide = "fairykingdom.proxy.ClientProxy", serverSide = "fairykingdom.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(MODID)
	public static FairyKingdom instance;
    
    @EventHandler
    public void preInit(FMLInitializationEvent event){
    	authorsFromGithub = UrlListHelper.loadListFromUrl("https://raw.githubusercontent.com/FairyKingdom/FairyKingdom/master/lists/authors.txt");
    	setModMeta();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	FairyKingdomEntities.init();
    	FairyKingdomBlocks.initBlocks();
    	FairyKingdomItems.initItems();
    	
    	proxy.registerRenderers();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
    
    
    /**
     * Fills the mcmod.info file
     */
    private void setModMeta()
    {
        meta.modId = MODID;
        meta.name = NAME;
        meta.description = "Under construction";
        //meta.url = "";
        meta.logoFile = "";
        meta.version = VERSION;
        if(authorsFromGithub != null && !authorsCurrentVersion.isEmpty()){
        	meta.authorList = authorsFromGithub;
    		FMLLog.getLogger().info("[" + NAME + "] Using author list loaded from GitHub.");
        }
        else{
        	meta.authorList = authorsCurrentVersion;
        	FMLLog.getLogger().info("[" + NAME + "] Using hardcoded author list.");
        }
        
        meta.credits = "";
        meta.autogenerated = false;
    }
}
