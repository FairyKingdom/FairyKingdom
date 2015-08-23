package fairykingdom.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import cpw.mods.fml.common.FMLLog;
import fairykingdom.FairyKingdom;

public class UrlListHelper {
    /**
     * Creates a list from an url
     */
	public static ArrayList<String> loadListFromUrl(String urlString)
    {
    	try	{     
        	URL url = new URL(urlString);
    		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    		String urlLine;
    		ArrayList<String> list = new ArrayList<String>();

    		while ((urlLine = in.readLine()) != null){
    			list.add(urlLine);     
    		}
    		FMLLog.getLogger().info("[" + FairyKingdom.NAME + "] Succesfully loaded " + urlString);        

    		in.close();
        	return list;
    	}
    	catch (MalformedURLException e){
    		FMLLog.getLogger().info("[" + FairyKingdom.NAME + "] Couldn't read " + urlString + " MalformedURLException");
    	}
    	catch (IOException e){
    		FMLLog.getLogger().info("[" + FairyKingdom.NAME + "] Couldn't read " + urlString + " IOException");
    	}
		return null;
    }
}
