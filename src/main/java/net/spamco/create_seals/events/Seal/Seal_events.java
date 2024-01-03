package net.spamco.create_seals.events.Seal;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.spamco.create_seals.CreateSeals;
import net.spamco.create_seals.entity.Seal.Seal_entity.Seal_entity;
import net.spamco.create_seals.entity.Seal.Seal_init.Seal_init;

@Mod.EventBusSubscriber(modid = CreateSeals.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Seal_events {

    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(Seal_init.SEAL.get(), Seal_entity.getSealAttributes().build());

    }
}

