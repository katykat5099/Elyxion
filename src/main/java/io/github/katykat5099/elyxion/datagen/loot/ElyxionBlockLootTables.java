package io.github.katykat5099.elyxion.datagen.loot;

import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ElyxionBlockLootTables extends BlockLootSubProvider {
    public ElyxionBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ElyxionBlocks.BIRD_POST.get());
        this.dropSelf(ElyxionBlocks.HOME_PERCH.get());
        this.dropSelf(ElyxionBlocks.MAILBOX.get());
        this.dropSelf(ElyxionBlocks.BULLETIN_BOARD.get());
        this.dropSelf(ElyxionBlocks.CARPENTRY_STATION.get());
        this.dropSelf(ElyxionBlocks.JEWEL_CUTTER.get());
        this.dropSelf(ElyxionBlocks.SEWING_MACHINE.get());
        this.dropSelf(ElyxionBlocks.TRAP.get());
        this.dropSelf(ElyxionBlocks.ANIMAL_TOTEM.get());

        // Hardstone
        this.add(ElyxionBlocks.HARDSTONE.get(), block -> createSingleItemTableWithSilkTouch(block, ElyxionBlocks.HARDCOBBLESTONE.get()));
        this.dropSelf(ElyxionBlocks.HARDBRICKSTONE.get());
        this.dropSelf(ElyxionBlocks.ROUGHLYSMOOTHSTONE.get());
        this.dropSelf(ElyxionBlocks.HARDCOBBLESTONE.get());
        this.add(ElyxionBlocks.HARDSTONE_COAL_ORE.get(), block -> createOreDrop(block, Items.COAL));
        this.add(ElyxionBlocks.HARDSTONE_IRON_ORE.get(), block -> createOreDrop(block, Items.RAW_IRON));
        this.add(ElyxionBlocks.HARDSTONE_COPPER_ORE.get(), block -> createCopperOreDrops(block));
        this.add(ElyxionBlocks.HARDSTONE_GOLD_ORE.get(), block -> createOreDrop(block, Items.RAW_GOLD));
        this.add(ElyxionBlocks.HARDSTONE_REDSTONE_ORE.get(), block -> createRedstoneOreDrops(block));
        this.add(ElyxionBlocks.HARDSTONE_EMERALD_ORE.get(), block -> createOreDrop(block, Items.EMERALD));
        this.add(ElyxionBlocks.HARDSTONE_LAPIS_ORE.get(), block -> createLapisOreDrops(block));
        this.add(ElyxionBlocks.HARDSTONE_DIAMOND_ORE.get(), block -> createOreDrop(block, Items.DIAMOND));

        // Obdurite
        this.add(ElyxionBlocks.OBDURITE.get(), block -> createSingleItemTableWithSilkTouch(block, ElyxionBlocks.FRACTURED_OBDURITE.get()));
        this.dropSelf(ElyxionBlocks.OBDURITE_BRICKS.get());
        this.dropSelf(ElyxionBlocks.SMOOTH_OBDURITE.get());
        this.dropSelf(ElyxionBlocks.FRACTURED_OBDURITE.get());
        this.add(ElyxionBlocks.GLOWING_FRACTURED_OBDURITE.get(), block -> createSingleItemTable(ElyxionBlocks.FRACTURED_OBDURITE.get()));
        this.add(ElyxionBlocks.OBDURITE_COAL_ORE.get(), block -> createOreDrop(block, Items.COAL));
        this.add(ElyxionBlocks.OBDURITE_IRON_ORE.get(), block -> createOreDrop(block, Items.RAW_IRON));
        this.add(ElyxionBlocks.OBDURITE_COPPER_ORE.get(), block -> createCopperOreDrops(block));
        this.add(ElyxionBlocks.OBDURITE_GOLD_ORE.get(), block -> createOreDrop(block, Items.RAW_GOLD));
        this.add(ElyxionBlocks.OBDURITE_REDSTONE_ORE.get(), block -> createRedstoneOreDrops(block));
        this.add(ElyxionBlocks.OBDURITE_EMERALD_ORE.get(), block -> createOreDrop(block, Items.EMERALD));
        this.add(ElyxionBlocks.OBDURITE_LAPIS_ORE.get(), block -> createLapisOreDrops(block));
        this.add(ElyxionBlocks.OBDURITE_DIAMOND_ORE.get(), block -> createOreDrop(block, Items.DIAMOND));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ElyxionBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
