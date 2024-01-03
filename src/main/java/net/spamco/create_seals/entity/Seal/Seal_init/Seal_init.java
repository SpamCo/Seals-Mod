package net.spamco.create_seals.entity.Seal.Seal_init;


import net.spamco.create_seals.CreateSeals;
import net.spamco.create_seals.entity.Seal.Seal_entity.Seal_entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Seal_init {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, CreateSeals.MOD_ID);

    public static final RegistryObject<EntityType<Seal_entity>> SEAL = ENTITIES.register("seal",
            () -> EntityType.Builder.of(Seal_entity::new, MobCategory.WATER_CREATURE).fireImmune().build( CreateSeals.MOD_ID + ":seal"));
}
