package io.github.katykat5099.elyxion.worldgen;

import io.github.katykat5099.elyxion.Elyxion;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class ElyxionPlacedFeatures {

    public static final ResourceKey<PlacedFeature> COAL_ORE_PLACED_KEY = registerKey("coal_ore_placed");
    public static final ResourceKey<PlacedFeature> IRON_ORE_PLACED_KEY = registerKey("iron_ore_placed");
    public static final ResourceKey<PlacedFeature> COPPER_ORE_PLACED_KEY = registerKey("copper_ore_placed");
    public static final ResourceKey<PlacedFeature> GOLD_ORE_PLACED_KEY = registerKey("gold_ore_placed");
    public static final ResourceKey<PlacedFeature> REDSTONE_ORE_PLACED_KEY = registerKey("redstone_ore_placed");
    public static final ResourceKey<PlacedFeature> EMERALD_ORE_PLACED_KEY = registerKey("emerald_ore_placed");
    public static final ResourceKey<PlacedFeature> LAPIS_ORE_PLACED_KEY = registerKey("lapis_ore_placed");
    public static final ResourceKey<PlacedFeature> DIAMOND_ORE_PLACED_KEY = registerKey("diamond_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        // ORES
        register(context, COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_COAL_ORES),
            ElyxionOrePlacement.commonOrePlacement(12,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, IRON_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_IRON_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, COPPER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_COPPER_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, GOLD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_GOLD_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, REDSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_REDSTONE_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, EMERALD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_EMERALD_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, LAPIS_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_LAPIS_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
        register(context, DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ElyxionConfiguredFeatures.OVERWORLD_DIAMOND_ORES),
            ElyxionOrePlacement.commonOrePlacement(8,
            HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(Elyxion.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
