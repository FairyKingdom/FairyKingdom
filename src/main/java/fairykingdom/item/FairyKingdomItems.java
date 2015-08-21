package fairykingdom.item;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class FairyKingdomItems {
	public static Item advancedIronSword;

	public static void initItems() {
		advancedIronSword = new KingdomItemAdvancedSword("kingdomIronSword", ToolMaterial.IRON);
	}
}
