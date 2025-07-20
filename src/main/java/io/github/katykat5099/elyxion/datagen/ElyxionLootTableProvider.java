package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.datagen.loot.ElyxionBlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class ElyxionLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(ElyxionBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}
