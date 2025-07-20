package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.worldgen.ElyxionBiomeModifiers;
import io.github.katykat5099.elyxion.worldgen.ElyxionConfiguredFeatures;
import io.github.katykat5099.elyxion.worldgen.ElyxionPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ElyxionWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ElyxionConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ElyxionPlacedFeatures::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ElyxionBiomeModifiers::bootstrap);

    public ElyxionWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Elyxion.MODID));
    }
}
