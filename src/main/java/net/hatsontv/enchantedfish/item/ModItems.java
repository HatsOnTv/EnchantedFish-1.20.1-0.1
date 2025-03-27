package net.hatsontv.enchantedfish.item;

import net.hatsontv.enchantedfish.EnchantedFish;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnchantedFish.MOD_ID);

    public static final RegistryObject<Item> MACKEREL = ITEMS.register("mackerel",
            () -> new Item(new Item.Properties().food(ModFoods.MACKEREL)));

    public static final RegistryObject<Item> COOKED_MACKEREL = ITEMS.register("cooked_mackerel",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_MACKEREL)));

    public static final RegistryObject<Item> HOLY_MACKEREL = ITEMS.register("holy_mackerel",
            () -> new SimpleFoiledItem(new Item.Properties().food(ModFoods.HOLY_MACKEREL).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> SWORDFISH = ITEMS.register("swordfish",
            () -> new SwordItem(ModToolTiers.FISHTIER, 3, -2.4f, new Item.Properties().rarity(Rarity.RARE)));
                    //AttackDamageModifier is based on tool tier, AttackSpeedModifier has to be NEGATIVE because it has a base value of 4

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
