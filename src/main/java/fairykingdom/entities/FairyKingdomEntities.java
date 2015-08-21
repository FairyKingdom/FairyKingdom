package fairykingdom.entities;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;
import fairykingdom.FairyKingdom;

public class FairyKingdomEntities {
	
	static int startEntityID;
	static int i;
	
	public static void init(){
		
		
	}
	
	/*
	 * For Mobs without a spawn egg
	 */
	public static void registerModEntity(Class entityClass, String name){
		
		EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, 
				FairyKingdom.instance, 64, 10, true);
		
	}
	
	/*
	 * for mobs with a spawn egg
	 */
	public static void registerModEntityEgg(Class entityClass, String name, int primary, int secondary){
		
		registerModEntity(entityClass, name);
		
		if (i == 0){
			registerSpawnEgg(name, primary, secondary);
			++i;
		}
		
	}

	
	public static void registerSpawnEgg(String name, int primary, int secondary){
		
	}
	
	
	/*
	 * gets a unique mob ID to prevent conflicts with other mods/entities
	 */
	public static int getUniqueEntityId(){
		
		do{
			startEntityID++;
		}
		while(EntityList.getStringFromID(startEntityID) != null);
		return startEntityID;
	}
	
	
	
	
	
}
