package net.spamco.spamco_seals.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.RegistryObject;
import net.spamco.spamco_seals.SpamCoSeals;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.spamco.spamco_seals.entity.ModEntities;

public class ItemInit {
    public static final DeferredRegister<Item>  ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpamCoSeals.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> SEAL_SPAWN_EGG = ITEMS.register("seal_spawn_egg", () -> new ForgeSpawnEggItem(ModEntities.SEAL, 0x939393, 0xd4d4d4, new Item.Properties().stacksTo(16)));
}
