package io.github.katykat5099.elyxion.worldgen;

import com.mojang.logging.LogUtils;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import org.slf4j.Logger;

public class ElyxionSurfaceRuleData {
    private static final SurfaceRules.RuleSource HARDSTONE = makeStateRule(ElyxionBlocks.HARDSTONE.get());

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    public static SurfaceRules.RuleSource makeRules() {
        // Hardstone
        //SurfaceRules.ConditionSource isAboveN13 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(-13), 0);
        //SurfaceRules.ConditionSource isBelow25 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(25), 0));

        // Deepslate
        //SurfaceRules.ConditionSource isAboveN52 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(-52), 0);
        //SurfaceRules.ConditionSource isBelowN14 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(-14), 0));

        // Obdurite
        //SurfaceRules.ConditionSource isAboveN91 = SurfaceRules.yStartCheck(VerticalAnchor.absolute(-91), 0);
        //SurfaceRules.ConditionSource isBelowN53 = SurfaceRules.not(SurfaceRules.yStartCheck(VerticalAnchor.absolute(-53), 0));

        //SurfaceRules.ConditionSource hardstoneLayer = SurfaceRules.verticalGradient("hardstone",VerticalAnchor.absolute(20), VerticalAnchor.absolute(25));
        //SurfaceRules.ConditionSource deepslateLayer = SurfaceRules.verticalGradient("deepslate",VerticalAnchor.absolute(-9), VerticalAnchor.absolute(-14));
        //SurfaceRules.ConditionSource obduriteLayer = SurfaceRules.verticalGradient("obdurite",VerticalAnchor.absolute(-48), VerticalAnchor.absolute(-53));

        return SurfaceRules.sequence(overworld());
    }

    private static SurfaceRules.RuleSource overworld() {
        return SurfaceRules.sequence(
            SurfaceRules.ifTrue(
                SurfaceRules.verticalGradient("hardstone",VerticalAnchor.absolute(20), VerticalAnchor.absolute(25)),
                HARDSTONE
            )
        );
    }
}
