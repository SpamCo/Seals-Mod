package net.spamco.create_seals.renderer;

import net.spamco.create_seals.CreateSeals;
import net.spamco.create_seals.models.Seal.SealModel;
import net.spamco.create_seals.entity.Seal.Seal_entity.Seal_entity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class Seal_renderer extends MobRenderer<Seal_entity, SealModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(CreateSeals.MOD_ID, "assets/create_seals/models/seal/seal.png");

    public Seal_renderer(EntityRendererProvider.Context ctx) {
        super(ctx, new SealModel(ctx.bakeLayer(SealModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Seal_entity entity) {
        return TEXTURE;
    }
}
