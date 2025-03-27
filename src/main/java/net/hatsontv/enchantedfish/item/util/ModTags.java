package net.hatsontv.enchantedfish.item.util;

import net.hatsontv.enchantedfish.EnchantedFish;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_FISHTIER_TOOL = tag("needs_fishtier_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EnchantedFish.MOD_ID, name));
        }

    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EnchantedFish.MOD_ID, name));
        }

    }
}
