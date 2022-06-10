package com.jerios.pearlarmor.common;

import com.jerios.pearlarmor.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGenUtil {

    public static void addOres(final  BiomeLoadingEvent event) {
        addOre(event, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.PEARL_ORE.get().getBlock().defaultBlockState(), 4,0,60,2);
    }

    public static void addOre(final BiomeLoadingEvent event, RuleTest ruleTest, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        event.getGeneration().addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
                Feature.ORE.configured(new OreFeatureConfig(ruleTest, state, veinSize))
                        .decorated(Placement.RANGE.configured(new TopSolidRangeConfig(veinSize, minHeight, maxHeight))).squared().count(amount) );
    }
}
