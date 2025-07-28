package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import io.github.katykat5099.elyxion.gameplay.ElyxionToolTiers;
import io.github.katykat5099.elyxion.util.ElyxionTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ElyxionBlockTagProvider extends BlockTagsProvider {
    public ElyxionBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Elyxion.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider p_256380_) {

        // Mineable (Pickaxe)
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(ElyxionBlocks.HARDSTONE.get(),
                 ElyxionBlocks.HARDCOBBLESTONE.get(),
                 ElyxionBlocks.HARDSTONE_COAL_ORE.get(),
                 ElyxionBlocks.HARDSTONE_IRON_ORE.get(),
                 ElyxionBlocks.HARDSTONE_COPPER_ORE.get(),
                 ElyxionBlocks.HARDSTONE_GOLD_ORE.get(),
                 ElyxionBlocks.HARDSTONE_REDSTONE_ORE.get(),
                 ElyxionBlocks.HARDSTONE_EMERALD_ORE.get(),
                 ElyxionBlocks.HARDSTONE_LAPIS_ORE.get(),
                 ElyxionBlocks.HARDSTONE_DIAMOND_ORE.get(),
                 ElyxionBlocks.OBDURITE.get(),
                 ElyxionBlocks.FRACTURED_OBDURITE.get(),
                 ElyxionBlocks.GLOWING_FRACTURED_OBDURITE.get(),
                 ElyxionBlocks.OBDURITE_COAL_ORE.get(),
                 ElyxionBlocks.OBDURITE_IRON_ORE.get(),
                 ElyxionBlocks.OBDURITE_COPPER_ORE.get(),
                 ElyxionBlocks.OBDURITE_GOLD_ORE.get(),
                 ElyxionBlocks.OBDURITE_REDSTONE_ORE.get(),
                 ElyxionBlocks.OBDURITE_EMERALD_ORE.get(),
                 ElyxionBlocks.OBDURITE_LAPIS_ORE.get(),
                 ElyxionBlocks.OBDURITE_DIAMOND_ORE.get()
        );

        // Hardstone Needs _ Tool
        this.tag(ElyxionTags.Blocks.NEEDS_COPPER_TOOL).add(ElyxionBlocks.HARDSTONE.get());
        this.tag(ElyxionTags.Blocks.NEEDS_COPPER_TOOL).add(ElyxionBlocks.HARDCOBBLESTONE.get());
        this.tag(ElyxionTags.Blocks.NEEDS_COPPER_TOOL).add(ElyxionBlocks.HARDSTONE_COAL_ORE.get());
        this.tag(ElyxionTags.Blocks.NEEDS_COPPER_TOOL).add(ElyxionBlocks.HARDSTONE_COPPER_ORE.get());
        this.tag(ElyxionTags.Blocks.NEEDS_COPPER_TOOL).add(ElyxionBlocks.HARDSTONE_IRON_ORE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ElyxionBlocks.HARDSTONE_GOLD_ORE.get());

        // Obdurite Needs _ Tool
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.OBDURITE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.FRACTURED_OBDURITE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.GLOWING_FRACTURED_OBDURITE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.OBDURITE_GOLD_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.OBDURITE_DIAMOND_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.OBDURITE_REDSTONE_ORE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ElyxionBlocks.OBDURITE_LAPIS_ORE.get());

        // Replaceables
        this.tag(ElyxionTags.Blocks.HARDSTONE_ORE_REPLACEABLES)
            .add(ElyxionBlocks.HARDSTONE.get(),
                Blocks.ANDESITE,
                Blocks.TUFF
        );
        this.tag(ElyxionTags.Blocks.OBDURITE_ORE_REPLACEABLES)
            .add(ElyxionBlocks.OBDURITE.get()
        );
    }
}
