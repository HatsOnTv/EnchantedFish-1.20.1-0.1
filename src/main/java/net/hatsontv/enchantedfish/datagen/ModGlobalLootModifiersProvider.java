package net.hatsontv.enchantedfish.datagen;

import net.hatsontv.enchantedfish.EnchantedFish;
import net.hatsontv.enchantedfish.item.ModItems;
import net.hatsontv.enchantedfish.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, EnchantedFish.MOD_ID);
    }

    @Override
    protected void start() {

        add("mackerel_from_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build() }, ModItems.MACKEREL.get()));

    }
}
