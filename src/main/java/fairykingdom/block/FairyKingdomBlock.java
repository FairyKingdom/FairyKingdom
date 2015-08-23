package fairykingdom.block;

import cpw.mods.fml.common.registry.GameRegistry;
import fairykingdom.FairyKingdom;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class FairyKingdomBlock extends Block{
	public FairyKingdomBlock(String name, Material material) {
		super(material);
		setBlockName(name);
		setBlockTextureName(FairyKingdom.MODID + ":" + name);
		GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public FairyKingdomBlock(String name, Material material, boolean register) {
		super(material);
		setBlockName(name);
		setBlockTextureName(FairyKingdom.MODID + ":" + name);
		if(register)
			GameRegistry.registerBlock(this, name);
		setCreativeTab(CreativeTabs.tabBlock);
	}
}
