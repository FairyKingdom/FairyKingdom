package fairykingdom.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyKingdomBlocks {
	
	//public static Block stony;
	//public static Block oreTest;
	
	public static Block magicOre = new BlockMagicOre("MagicOre", Material.rock);
	public static Block magicPortal = new BlockMagicPortal(Material.portal, "MagicPortal");
	
	public static void initBlocks() {
		//stony = new FairyKingdomBlock("stony", Material.rock);
		//oreTest = new FairyKingdomBlock("TestOre", Material.rock);
	}
}
