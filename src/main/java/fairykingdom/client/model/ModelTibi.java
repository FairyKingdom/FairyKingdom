package fairykingdom.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTibi extends ModelBase
{
    ModelRenderer head;
    ModelRenderer RightEar;
    ModelRenderer RightFrontEar;
    ModelRenderer LeftEar;
    ModelRenderer LeftFrontEar;
    ModelRenderer Body;
    ModelRenderer LeftLeg;
    ModelRenderer RightLeg;
    ModelRenderer LeftArm;
    ModelRenderer RightArm;
    ModelRenderer Tail;
  
  public ModelTibi()
  {
    textureWidth = 32;
    textureHeight = 32;
    
    head = new ModelRenderer(this, 0, 7);
    head.addBox(-2.5F, -4F, -2F, 5, 4, 4);
    head.setRotationPoint(0F, 15F, 0F);

    RightEar = new ModelRenderer(this, 24, 0);
    RightEar.addBox(-0.5F, -3F, 0F, 1, 3, 1);
    RightEar.setRotationPoint(-1.5F, 11F, 1F);
    setRotation(RightEar, -0.8F, -0.4F, 0F);
    
    RightFrontEar = new ModelRenderer(this, 20, 0);
    RightFrontEar.addBox(-0.5F, -2F, -1F, 1, 3, 1);
    RightFrontEar.setRotationPoint(-1.5F, 11F, 1F);
    setRotation(RightFrontEar, -0.8F, -0.4F, 0F);
    
    LeftEar = new ModelRenderer(this, 24, 0);
    LeftEar.addBox(-0.5F, -3F, 0F, 1, 3, 1);
    LeftEar.setRotationPoint(1.5F, 11F, 1F);
    setRotation(LeftEar, -0.8F, 0.4F, 0F);
    LeftEar.mirror = true;
    
    LeftFrontEar = new ModelRenderer(this, 20, 0);
    LeftFrontEar.addBox(-0.5F, -2F, -1F, 1, 3, 1);
    LeftFrontEar.setRotationPoint(1.5F, 11F, 1F);
    setRotation(LeftFrontEar, -0.8F, 0.4F, 0F);
    LeftFrontEar.mirror = true;

    Body = new ModelRenderer(this, 0, 0);
    Body.addBox(-2F, 0F, -1F, 4, 5, 2);
    Body.setRotationPoint(0F, 15F, 0F);

    LeftLeg = new ModelRenderer(this, 16, 0);
    LeftLeg.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
    LeftLeg.setRotationPoint(1F, 20F, 0F);
    LeftLeg.mirror = true;
    
    RightLeg = new ModelRenderer(this, 16, 0);
    RightLeg.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
    RightLeg.setRotationPoint(-1F, 20F, 0F);

    LeftArm = new ModelRenderer(this, 12, 0);
    LeftArm.addBox(0F, 0F, -0.5F, 1, 4, 1);
    LeftArm.setRotationPoint(2F, 15F, 0F);
    LeftArm.mirror = true;
    
    RightArm = new ModelRenderer(this, 12, 0);
    RightArm.addBox(-1F, 0F, -0.5F, 1, 4, 1);
    RightArm.setRotationPoint(-2F, 15F, 0F);
      
    Tail = new ModelRenderer(this, 18, 10);
    Tail.addBox(-0.5F, -0.5F, -1F, 1, 1, 4);
    Tail.setRotationPoint(0F, 19F, 1F);
    setRotation(Tail, 0.5F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    RightEar.render(f5);
    RightFrontEar.render(f5);
    LeftEar.render(f5);
    LeftFrontEar.render(f5);
    Body.render(f5);
    LeftLeg.render(f5);
    RightLeg.render(f5);
    LeftArm.render(f5);
    RightArm.render(f5);
    Tail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
