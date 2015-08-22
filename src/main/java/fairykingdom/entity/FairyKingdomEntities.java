package fairykingdom.entity;

import org.lwjgl.util.Color;

import cpw.mods.fml.common.registry.EntityRegistry;
import fairykingdom.FairyKingdom;
import net.minecraft.entity.EntityList;

public class FairyKingdomEntities {
	
	private static int startEntityID;
	private static Color color = new Color();
	
	public static void init(){
		EntityRegistry.registerGlobalEntityID(FairyKingdomTibi.class, "tibi", EntityRegistry.findGlobalUniqueEntityId(), 0x7AE8FF, 0x47FFE2);
	}	
	
	
	public static void registerModProjectile(Class entityClass, String name){
		
		EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, 
				FairyKingdom.instance, 64, 10, true);
	}
	
	
	/**
	 * For Mobs without a spawn egg
	 */
	public static void registerModEntity(Class entityClass, String name){
		
		EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, 
				FairyKingdom.instance, 64, 10, true);
		
	}
	
	/**
	 * Registers a spawn egg for the given Entity
	 */
	public static void registerModEntityEgg(Class entityClass, String name, int primary, int secondary){
		
		registerModEntity(entityClass, name);
		
		registerSpawnEgg(name, primary, secondary);

		
	}

	
	public static void registerSpawnEgg(String name, int primary, int secondary){
		
	}
	
	
	/**
	 * Gets an unique mob ID to prevent conflicts with other entities
	 */
	public static int getUniqueEntityId(){
		
		do{
			startEntityID++;
		}
		while(EntityList.getStringFromID(startEntityID) != null);
		return startEntityID;
	}
	
	
	
	
	
}
