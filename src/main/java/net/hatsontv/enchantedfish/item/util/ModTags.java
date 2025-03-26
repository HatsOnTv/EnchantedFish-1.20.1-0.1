package net.hatsontv.enchantedfish.item.util;

import net.hatsontv.enchantedfish.EnchantedFish;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EnchantedFish.MOD_ID, name));
        }

    }
}
