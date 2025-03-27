package net.hatsontv.enchantedfish.item;

import net.hatsontv.enchantedfish.EnchantedFish;
import net.hatsontv.enchantedfish.item.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier FISHTIER = TierSortingRegistry.registerTier(
            new ForgeTier(4, 1500, 8.0F, 3.0F, 10,
                    ModTags.Blocks.NEEDS_FISHTIER_TOOL, () -> Ingredient.of(ModItems.MACKEREL.get())),
            new ResourceLocation(EnchantedFish.MOD_ID, "mackerel"), List.of(Tiers.DIAMOND), List.of());
}
