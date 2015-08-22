package fairykingdom.client.renderer.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fairykingdom.FairyKingdom;
import fairykingdom.entity.FairyKingdomTibi;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderTibi extends RenderLiving
{
    private static final ResourceLocation tibiTextures = new ResourceLocation("fairykingdom:textures/entity/tibi.png");

    public RenderTibi(ModelBase model, float shadowSize)
    {
        super(model, shadowSize);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(FairyKingdomTibi tibi)
    {
        return tibiTextures;
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.getEntityTexture((FairyKingdomTibi)entity);
    }
}