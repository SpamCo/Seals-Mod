package net.spamco.create_seals.events.Seal;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.spamco.create_seals.models.Seal.SealModel;
import net.spamco.create_seals.renderer.Seal_renderer;
import net.spamco.create_seals.CreateSeals;
import net.spamco.create_seals.entity.Seal.Seal_init.Seal_init;

@Mod.EventBusSubscriber(modid = CreateSeals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Seal_Client_events {

    @SubscribeEvent
    public static void SealRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(Seal_init.SEAL.get(), Seal_renderer::new);
    }
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
       event.registerLayerDefinition(SealModel.LAYER_LOCATION, SealModel::createBodyLayer);
    }
}
