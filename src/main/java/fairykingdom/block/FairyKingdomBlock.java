package fairykingdom.block;

import cpw.mods.fml.common.registry.GameRegistry;
import fairykingdom.FairyKingdom;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FairyKingdomBlock extends Block{
	protected FairyKingdomBlock(String name, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(FairyKingdom.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
	}
}
