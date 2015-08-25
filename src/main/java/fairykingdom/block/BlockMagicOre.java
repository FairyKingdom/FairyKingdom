package fairykingdom.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import fairykingdom.FairyKingdom;
import net.minecraft.block.Block;

public class BlockMagicOre extends Block{
	
	
	public BlockMagicOre(String name, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(FairyKingdom.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
