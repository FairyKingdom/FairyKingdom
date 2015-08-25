package fairykingdom.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import fairykingdom.client.model.ModelTibi;
import fairykingdom.client.renderer.entity.RenderTibi;
import fairykingdom.entity.FairyKingdomTibi;

public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(FairyKingdomTibi.class, new RenderTibi(new ModelTibi(), 0.2F));
	}
}
