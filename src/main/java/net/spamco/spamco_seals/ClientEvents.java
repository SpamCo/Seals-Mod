package net.spamco.spamco_seals;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.spamco.spamco_seals.entity.seal.SealEntity;
import net.spamco.spamco_seals.entity.ModEntities;

@Mod.EventBusSubscriber(modid = SpamCoSeals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientEvents {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SEAL.get(), SealEntity.setAttributes().build());

    }
}

