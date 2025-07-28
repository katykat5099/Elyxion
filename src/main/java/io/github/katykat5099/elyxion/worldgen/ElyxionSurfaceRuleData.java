package io.github.katykat5099.elyxion.worldgen;

import com.mojang.logging.LogUtils;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import org.slf4j.Logger;

public class ElyxionSurfaceRuleData {
    private static final SurfaceRules.RuleSource HARDSTONE = makeStateRule(ElyxionBlocks.HARDSTONE.get());
    private static final SurfaceRules.RuleSource DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final SurfaceRules.RuleSource OBDURITE = makeStateRule(ElyxionBlocks.OBDURITE.get());
    private static final SurfaceRules.RuleSource BEDROCK = makeStateRule(Blocks.BEDROCK);

    private static SurfaceRules.RuleSource makeStateRule(Block block) {
        return SurfaceRules.state(block.defaultBlockState());
    }

    public static SurfaceRules.RuleSource makeRules() {

        return SurfaceRules.sequence(overworld());
    }

    private static SurfaceRules.RuleSource overworld() {
        // Hardstone
        SurfaceRules.ConditionSource hardstoneLayer = SurfaceRules.verticalGradient("hardstone",VerticalAnchor.absolute(52), VerticalAnchor.absolute(56));

        // Deepslate
        SurfaceRules.ConditionSource deepslateLayer = SurfaceRules.verticalGradient("deepslate",VerticalAnchor.absolute(0), VerticalAnchor.absolute(8));

        // Obdurite
        SurfaceRules.ConditionSource obduriteLayer = SurfaceRules.verticalGradient("obdurite",VerticalAnchor.absolute(-30), VerticalAnchor.absolute(-20));

        // Bedrock
        SurfaceRules.ConditionSource bedrockLayer = SurfaceRules.verticalGradient("bedrock_floor",VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(5));


        return  SurfaceRules.sequence(
                    SurfaceRules.ifTrue(bedrockLayer,BEDROCK),
                    SurfaceRules.ifTrue(obduriteLayer,OBDURITE),
                    SurfaceRules.ifTrue(deepslateLayer, DEEPSLATE),
                    SurfaceRules.ifTrue(hardstoneLayer, HARDSTONE)
        );
    }
}
