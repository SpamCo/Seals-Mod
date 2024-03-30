package net.spamco.spamco_seals.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.spamco.spamco_seals.SpamCoSeals;
import net.spamco.spamco_seals.entity.seal.SealEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class SealModel extends AnimatedGeoModel<SealEntity> {
    @Override
    public ResourceLocation getModelResource(SealEntity object) {
        return new ResourceLocation(SpamCoSeals.MOD_ID, "geo/seal.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SealEntity object) {
        return new ResourceLocation(SpamCoSeals.MOD_ID, "textures/entity/seal.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SealEntity animatable) {
        return new ResourceLocation(SpamCoSeals.MOD_ID, "animations/seal.animation.json");
    }
    @Override
    public void setCustomAnimations(SealEntity animatable, int instanceId, AnimationEvent animationEvent) {
        super.setCustomAnimations(animatable, instanceId, animationEvent);
        IBone head = this.getAnimationProcessor().getBone("Head");

        EntityModelData extraData = (EntityModelData) animationEvent.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * Mth.DEG_TO_RAD);
            head.setRotationY(extraData.netHeadYaw * Mth.DEG_TO_RAD);
        }
    }
}
