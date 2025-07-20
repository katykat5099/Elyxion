package io.github.katykat5099.elyxion.util;

import io.github.katykat5099.elyxion.Elyxion;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ElyxionTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_COPPER_TOOL = tag("needs_copper_tool");
        public static final TagKey<Block> HARDSTONE_ORE_REPLACEABLES = tag("hardstone_ore_replaceables");
        public static final TagKey<Block> OBDURITE_ORE_REPLACEABLES = tag("obdurite_ore_replaceables");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(Elyxion.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(Elyxion.MODID, name));
        }
    }
}
