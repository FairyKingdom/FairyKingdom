package fairykingdom.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyKingdomBlocks {
	
	//public static Block stony;
	public static Block oreTest;
	
	public static void initBlocks() {
		//stony = new FairyKingdomBlock("stony", Material.rock);
		oreTest = new FairyKingdomBlock("TestOre", Material.rock);
	}
}
