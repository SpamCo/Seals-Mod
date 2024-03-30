package net.spamco.spamco_seals;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.spamco.spamco_seals.client.renderer.SealRenderer;
import net.spamco.spamco_seals.entity.ModEntities;
import net.spamco.spamco_seals.init.ItemInit;
import software.bernie.geckolib3.GeckoLib;

@Mod(SpamCoSeals.MOD_ID)
public class SpamCoSeals {
    public static final String MOD_ID = "spamco_seals";

    public SpamCoSeals() {
        IEventBus Modbus = FMLJavaModLoadingContext.get().getModEventBus();

        ModEntities.register(Modbus);

        GeckoLib.initialize();

        MinecraftForge.EVENT_BUS.register(this);
        ItemInit.ITEMS.register(Modbus);

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.SEAL.get(), SealRenderer::new);
        }
    }
}
