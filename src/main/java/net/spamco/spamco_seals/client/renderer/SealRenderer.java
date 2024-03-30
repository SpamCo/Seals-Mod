package net.spamco.spamco_seals.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.spamco.spamco_seals.SpamCoSeals;
import net.spamco.spamco_seals.entity.seal.SealEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SealRenderer extends GeoEntityRenderer<SealEntity> {
    public SealRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SealModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public ResourceLocation getTextureLocation(SealEntity instance) {
        return new ResourceLocation(SpamCoSeals.MOD_ID, "textures/entity/seal.png");
    }

    @Override
    public RenderType getRenderType(SealEntity animatable, float partialTicks, PoseStack Stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        Stack.scale(1.0f, 1.0f, 1.0f);
        return super.getRenderType(animatable, partialTicks, Stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
