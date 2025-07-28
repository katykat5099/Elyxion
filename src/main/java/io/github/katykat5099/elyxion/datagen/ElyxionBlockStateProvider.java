package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ElyxionBlockStateProvider extends BlockStateProvider {
    public ElyxionBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Elyxion.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ElyxionBlocks.HARDSTONE);
        blockWithItem(ElyxionBlocks.HARDCOBBLESTONE);
        blockWithItem(ElyxionBlocks.HARDSTONE_COAL_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_IRON_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_COPPER_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_GOLD_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_REDSTONE_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_EMERALD_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_LAPIS_ORE);
        blockWithItem(ElyxionBlocks.HARDSTONE_DIAMOND_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE);
        blockWithItem(ElyxionBlocks.FRACTURED_OBDURITE);
        blockWithItem(ElyxionBlocks.GLOWING_FRACTURED_OBDURITE);
        blockWithItem(ElyxionBlocks.OBDURITE_COAL_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_IRON_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_COPPER_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_GOLD_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_REDSTONE_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_EMERALD_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_LAPIS_ORE);
        blockWithItem(ElyxionBlocks.OBDURITE_DIAMOND_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
