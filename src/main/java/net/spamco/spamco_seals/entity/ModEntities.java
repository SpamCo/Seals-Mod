package net.spamco.spamco_seals.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.spamco.spamco_seals.SpamCoSeals;
import net.spamco.spamco_seals.entity.seal.SealEntity;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SpamCoSeals.MOD_ID);

    public static final RegistryObject<EntityType<SealEntity>> SEAL =
            ENTITY_TYPES.register("seal",
            () -> EntityType.Builder.of(SealEntity::new, MobCategory.CREATURE)
                    .sized(1.7f, 2.0f)
                    .build(new ResourceLocation(SpamCoSeals.MOD_ID, "seal").toString()));
    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
