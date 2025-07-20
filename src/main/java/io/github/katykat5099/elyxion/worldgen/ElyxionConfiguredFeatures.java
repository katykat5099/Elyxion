package io.github.katykat5099.elyxion.worldgen;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import io.github.katykat5099.elyxion.util.ElyxionTags;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ElyxionConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COAL_ORES = registerKey("coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_IRON_ORES = registerKey("iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_COPPER_ORES = registerKey("copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GOLD_ORES = registerKey("gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_REDSTONE_ORES = registerKey("redstone_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_EMERALD_ORES = registerKey("emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_LAPIS_ORES = registerKey("lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DIAMOND_ORES = registerKey("diamond_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        // Replace Ores
        RuleTest hardstoneReplaceable = new TagMatchTest(ElyxionTags.Blocks.HARDSTONE_ORE_REPLACEABLES);
        RuleTest obduriteReplaceable = new TagMatchTest(ElyxionTags.Blocks.OBDURITE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldCoalOres = List.of(OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_COAL_ORE.get().defaultBlockState())/*,
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_COAL_ORE.get().defaultBlockState())*/
        );
        List<OreConfiguration.TargetBlockState> overworldIronOres = List.of(OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_IRON_ORE.get().defaultBlockState())/*,
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_IRON_ORE.get().defaultBlockState())*/
        );
        List<OreConfiguration.TargetBlockState> overworldCopperOres = List.of(OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_COPPER_ORE.get().defaultBlockState())/*,
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_COPPER_ORE.get().defaultBlockState())*/
        );
        List<OreConfiguration.TargetBlockState> overworldGoldOres = List.of(OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_GOLD_ORE.get().defaultBlockState()),
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_GOLD_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworldRedstoneOres = List.of(/*OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_REDSTONE_ORE.get().defaultBlockState()),*/
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_REDSTONE_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworldEmeraldOres = List.of(/*OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_EMERALD_ORE.get().defaultBlockState()),
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_EMERALD_ORE.get().defaultBlockState())*/
        );
        List<OreConfiguration.TargetBlockState> overworldLapisOres = List.of(/*OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_LAPIS_ORE.get().defaultBlockState()),*/
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_LAPIS_ORE.get().defaultBlockState())
        );
        List<OreConfiguration.TargetBlockState> overworldDiamondOres = List.of(/*OreConfiguration.target(hardstoneReplaceable,
                ElyxionBlocks.HARDSTONE_DIAMOND_ORE.get().defaultBlockState()),*/
                OreConfiguration.target(obduriteReplaceable, ElyxionBlocks.OBDURITE_DIAMOND_ORE.get().defaultBlockState())
        );

        register(context, OVERWORLD_COAL_ORES, Feature.ORE, new OreConfiguration(overworldCoalOres, 15));
        register(context, OVERWORLD_IRON_ORES, Feature.ORE, new OreConfiguration(overworldIronOres, 6));
        register(context, OVERWORLD_COPPER_ORES, Feature.ORE, new OreConfiguration(overworldCopperOres, 6));
        register(context, OVERWORLD_GOLD_ORES, Feature.ORE, new OreConfiguration(overworldGoldOres, 6));
        register(context, OVERWORLD_REDSTONE_ORES, Feature.ORE, new OreConfiguration(overworldRedstoneOres, 6));
        register(context, OVERWORLD_EMERALD_ORES, Feature.ORE, new OreConfiguration(overworldEmeraldOres, 6));
        register(context, OVERWORLD_LAPIS_ORES, Feature.ORE, new OreConfiguration(overworldLapisOres, 6));
        register(context, OVERWORLD_DIAMOND_ORES, Feature.ORE, new OreConfiguration(overworldDiamondOres, 6));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(Elyxion.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
