package fairykingdom.item;

import cpw.mods.fml.common.registry.GameRegistry;
import fairykingdom.FairyKingdom;
import net.minecraft.item.Item;

public class FairyKingdomItem extends Item {
	protected FairyKingdomItem(String name){
		setUnlocalizedName(name);
		setTextureName(FairyKingdom.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
	}
}
