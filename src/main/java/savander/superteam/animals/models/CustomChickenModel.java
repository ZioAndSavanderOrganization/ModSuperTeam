package savander.superteam.animals.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CustomChickenModel extends ModelBase {

    private ModelRenderer hatPane;
    private ModelRenderer hat;
    private ModelRenderer head;
    private ModelRenderer body;
    private ModelRenderer rightLeg;
    private ModelRenderer leftLeg;
    private ModelRenderer rightWing;
    private ModelRenderer leftWing;
    private ModelRenderer bill;
    private ModelRenderer chin;


    public CustomChickenModel() {
        this.hat = new ModelRenderer(this, 38, 0);
        this.hat.addBox(-2.5F, -7.0F, -2.5F, 5, 1, 5, 0.0F);
        this.hat.setRotationPoint(0.0F, 15.0F, -4.0F);

        this.hatPane = new ModelRenderer(this, 38, 5);
        this.hatPane.addBox(-1.5F, -9.0F, -1.5F, 3, 1, 3, 0.0F);
        this.hatPane.setRotationPoint(0.0F, 15.0F, -4.0F);

        this.head = new ModelRenderer(this, 0, 0);
        this.head.addBox(-2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F);
        this.head.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.bill = new ModelRenderer(this, 14, 0);
        this.bill.addBox(-2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F);
        this.bill.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.chin = new ModelRenderer(this, 14, 4);
        this.chin.addBox(-1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F);
        this.chin.setRotationPoint(0.0F, 15.0F, -4.0F);
        this.body = new ModelRenderer(this, 0, 9);
        this.body.addBox(-3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F);
        this.body.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.rightLeg = new ModelRenderer(this, 26, 0);
        this.rightLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3);
        this.rightLeg.setRotationPoint(-2.0F, 19.0F, 1.0F);
        this.leftLeg = new ModelRenderer(this, 26, 0);
        this.leftLeg.addBox(-1.0F, 0.0F, -3.0F, 3, 5, 3);
        this.leftLeg.setRotationPoint(1.0F, 19.0F, 1.0F);
        this.rightWing = new ModelRenderer(this, 24, 13);
        this.rightWing.addBox(0.0F, 0.0F, -3.0F, 1, 4, 6);
        this.rightWing.setRotationPoint(-4.0F, 13.0F, 0.0F);
        this.leftWing = new ModelRenderer(this, 24, 13);
        this.leftWing.addBox(-1.0F, 0.0F, -3.0F, 1, 4, 6);
        this.leftWing.setRotationPoint(4.0F, 13.0F, 0.0F);
    }


    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);

        if (this.isChild) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0F, 5.0F * scale, 2.0F * scale);
            this.hat.render(scale);
            this.hatPane.render(scale);
            this.head.render(scale);
            this.bill.render(scale);
            this.chin.render(scale);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            GlStateManager.translate(0.0F, 24.0F * scale, 0.0F);
            this.body.render(scale);
            this.rightLeg.render(scale);
            this.leftLeg.render(scale);
            this.rightWing.render(scale);
            this.leftWing.render(scale);
            GlStateManager.popMatrix();
        } else {
            this.hat.render(scale);
            this.hatPane.render(scale);
            this.head.render(scale);
            this.bill.render(scale);
            this.chin.render(scale);
            this.body.render(scale);
            this.rightLeg.render(scale);
            this.leftLeg.render(scale);
            this.rightWing.render(scale);
            this.leftWing.render(scale);
        }
    }


    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.head.rotateAngleX = headPitch * 0.017453292F;
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.hatPane.rotateAngleX = this.head.rotateAngleX;
        this.hatPane.rotateAngleY = this.head.rotateAngleY;
        this.hat.rotateAngleX = this.head.rotateAngleX;
        this.hat.rotateAngleY = this.head.rotateAngleY;
        this.bill.rotateAngleX = this.head.rotateAngleX;
        this.bill.rotateAngleY = this.head.rotateAngleY;
        this.chin.rotateAngleX = this.head.rotateAngleX;
        this.chin.rotateAngleY = this.head.rotateAngleY;
        this.body.rotateAngleX = ((float) Math.PI / 2F);
        this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.leftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount;
        this.rightWing.rotateAngleZ = ageInTicks;
        this.leftWing.rotateAngleZ = -ageInTicks;
    }
}