package fairykingdom;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
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

@Mod(name = FairyKingdom.NAME, modid = FairyKingdom.MODID, version = FairyKingdom.VERSION)
public class FairyKingdom
{
	public static final String NAME = "Fairy Kingdom";
    public static final String MODID = "fairykingdom";
    public static final String VERSION = "0.1";
    
    public static final List<String> authorsCurrentVersion = Arrays.asList(new String[] {"Ruukas"});
    public static List<String> authorsFromGithub;


    @Metadata(MODID)
    public static ModMetadata meta;

	//@SidedProxy(clientSide = "fairykingdom.proxy.ClientProxy", serverSide = "fairykingdom.proxy.CommonProxy")
	//public static CommonProxy proxy;
	
	@Instance(MODID)
	public static FairyKingdom instance;
    
    @EventHandler
    public void preInit(FMLInitializationEvent event){
    	authorsFromGithub = loadListFromUrl("https://raw.githubusercontent.com/FairyKingdom/FairyKingdom/master/lists/authors.txt");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
    
    /**
     * Creates a list from a url
     */
    @SuppressWarnings("null")
	private List loadListFromUrl(String urlString)
    {
    	try	{     
        	URL url = new URL(urlString);
    		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    		String urlLine;
    		List<String> list = null;
    		while ((urlLine = in.readLine()) != null){
    			list.add(urlLine);     
    		}
    		FMLLog.getLogger().info("[" + NAME + "] Succesfully loaded " + urlString);        

    		in.close();
        	return list;
    	}
    	catch (MalformedURLException e){
    		FMLLog.getLogger().info("[" + NAME + "] Couldn't read " + urlString + " MalformedURLException");
    	}
    	catch (IOException e){
    		FMLLog.getLogger().info("[" + NAME + "] Couldn't read " + urlString + " IOException");
    	}
		return null;
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
        if(authorsFromGithub != null)
        	meta.authorList = authorsFromGithub;
        else
        	meta.authorList = authorsCurrentVersion;
        meta.credits = "";
        meta.autogenerated = false;
    }
}
