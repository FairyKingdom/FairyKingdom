package fairykingdom.block;

import fairykingdom.FairyKingdom;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockMagicPortal extends Block {

	protected BlockMagicPortal(Material material, String name) {
		super(material);
		this.setBlockTextureName(FairyKingdom.MODID + ":" + name);
		this.setBlockName(name);
	}

}
