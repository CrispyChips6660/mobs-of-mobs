package net.potatocult.mobsofmobs.client.entity.render;


import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.entity.BipedRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.potatocult.mobsofmobs.client.entity.model.WightModel;
import net.potatocult.mobsofmobs.core.MobsOfMobs;
import net.potatocult.mobsofmobs.entities.monster.WightEntity;

@OnlyIn(Dist.CLIENT)
public abstract class AbstractWightRenderer<T extends WightEntity, M extends WightModel<T>> extends BipedRenderer<T, M> {
    private static final ResourceLocation field_217771_a = new ResourceLocation(MobsOfMobs.MODID,
            "textures/entity/wight.png");

    protected AbstractWightRenderer(EntityRendererManager p_i50974_1_, M p_i50974_2_, M p_i50974_3_, M p_i50974_4_) {
        super(p_i50974_1_, p_i50974_2_, 0.5F);
        this.addLayer(new BipedArmorLayer<>(this, p_i50974_3_, p_i50974_4_));
    }

    /**
     * Returns the location of an entity's texture.
     */
    public ResourceLocation getEntityTexture(WightEntity entity) {
        return field_217771_a;
    }

    protected void applyRotations(T entityLiving, MatrixStack matrixStackIn, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
    }
}