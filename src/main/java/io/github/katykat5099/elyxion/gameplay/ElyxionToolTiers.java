package io.github.katykat5099.elyxion.gameplay;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.registries.ForgeRegistries;

public class ElyxionToolTiers {
    public static final Tier COPPER = new ForgeTier(
            2,
            190,
            5.0F,
            4.0F,
            30,
            TagKey.create(ForgeRegistries.BLOCKS.getRegistryKey(), ResourceLocation.fromNamespaceAndPath("elyxion", "needs_copper_tool")),
            () -> Ingredient.of(Items.COPPER_INGOT)
    );
}
