package io.github.katykat5099.elyxion.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ElyxionOrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int perChunk, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(perChunk), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
