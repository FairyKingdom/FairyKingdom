package fairykingdom.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTibi extends ModelBase
{
    ModelRenderer head;
    ModelRenderer rightEar;
    ModelRenderer rightFrontEar;
    ModelRenderer leftEar;
    ModelRenderer leftFrontEar;
    ModelRenderer body;
    ModelRenderer leftLeg;
    ModelRenderer rightLeg;
    ModelRenderer leftArm;
    ModelRenderer rightArm;
    ModelRenderer tail;
  
  public ModelTibi()
  {
    textureWidth = 32;
    textureHeight = 32;
    
    head = new ModelRenderer(this, 0, 7);
    head.addBox(-2.5F, -4F, -2F, 5, 4, 4);
    head.setRotationPoint(0F, 15F, 0F);

    rightEar = new ModelRenderer(this, 24, 0);
    rightEar.addBox(-0.5F, -3F, 0F, 1, 3, 1);
    rightEar.setRotationPoint(-1.5F, 11F, 1F);
    setRotation(rightEar, -0.8F, -0.4F, 0F);
    
    rightFrontEar = new ModelRenderer(this, 20, 0);
    rightFrontEar.addBox(-0.5F, -2F, -1F, 1, 3, 1);
    rightFrontEar.setRotationPoint(-1.5F, 11F, 1F);
    setRotation(rightFrontEar, -0.8F, -0.4F, 0F);
    
    leftEar = new ModelRenderer(this, 24, 0);
    leftEar.addBox(-0.5F, -3F, 0F, 1, 3, 1);
    leftEar.setRotationPoint(1.5F, 11F, 1F);
    setRotation(leftEar, -0.8F, 0.4F, 0F);
    leftEar.mirror = true;
    
    leftFrontEar = new ModelRenderer(this, 20, 0);
    leftFrontEar.addBox(-0.5F, -2F, -1F, 1, 3, 1);
    leftFrontEar.setRotationPoint(1.5F, 11F, 1F);
    setRotation(leftFrontEar, -0.8F, 0.4F, 0F);
    leftFrontEar.mirror = true;

    body = new ModelRenderer(this, 0, 0);
    body.addBox(-2F, 0F, -1F, 4, 5, 2);
    body.setRotationPoint(0F, 15F, 0F);

    leftLeg = new ModelRenderer(this, 16, 0);
    leftLeg.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
    leftLeg.setRotationPoint(1F, 20F, 0F);
    leftLeg.mirror = true;
    
    rightLeg = new ModelRenderer(this, 16, 0);
    rightLeg.addBox(-0.5F, 0F, -0.5F, 1, 4, 1);
    rightLeg.setRotationPoint(-1F, 20F, 0F);

    leftArm = new ModelRenderer(this, 12, 0);
    leftArm.addBox(0F, 0F, -0.5F, 1, 4, 1);
    leftArm.setRotationPoint(2F, 15F, 0F);
    leftArm.mirror = true;
    
    rightArm = new ModelRenderer(this, 12, 0);
    rightArm.addBox(-1F, 0F, -0.5F, 1, 4, 1);
    rightArm.setRotationPoint(-2F, 15F, 0F);
      
    tail = new ModelRenderer(this, 18, 10);
    tail.addBox(-0.5F, -0.5F, -1F, 1, 1, 4);
    tail.setRotationPoint(0F, 19F, 1F);
    setRotation(tail, 0.5F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    rightEar.render(f5);
    rightFrontEar.render(f5);
    leftEar.render(f5);
    leftFrontEar.render(f5);
    body.render(f5);
    leftLeg.render(f5);
    rightLeg.render(f5);
    leftArm.render(f5);
    rightArm.render(f5);
    tail.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
      this.rightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
      this.leftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
      this.rightArm.rotateAngleZ = 0.0F;
      this.leftArm.rotateAngleZ = 0.0F;
      this.rightLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.leftLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.rightLeg.rotateAngleY = 0.0F;
      this.leftLeg.rotateAngleY = 0.0F;
  }
}
