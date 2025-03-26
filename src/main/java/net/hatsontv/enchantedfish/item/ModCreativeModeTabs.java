package net.hatsontv.enchantedfish.item;

import net.hatsontv.enchantedfish.EnchantedFish;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnchantedFish.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ENCHANTED_FISH = CREATIVE_MODE_TABS.register("enchanted_fish_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOLY_MACKEREL.get()))
                    .title(Component.translatable("creativetab.enchanted_fish_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MACKEREL.get());
                        pOutput.accept(ModItems.COOKED_MACKEREL.get());
                        pOutput.accept(ModItems.HOLY_MACKEREL.get());
                        pOutput.accept(ModItems.SWORDFISH.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
