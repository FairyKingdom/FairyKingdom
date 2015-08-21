package fairykingdom.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyKingdomBlocks {
	
	public static Block oreTest = new FairyKingdomBlock("TestOre", Material.rock);
	public static Block stony = new FairyKingdomBlock("blocky", Material.rock);
	
	
	public static void initBlocks() {
		GameRegistry.registerBlock(oreTest, "TestOre");
	}
}
