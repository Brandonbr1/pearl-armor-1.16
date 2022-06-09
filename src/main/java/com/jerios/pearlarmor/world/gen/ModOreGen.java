package com.jerios.pearlarmor.world.gen;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import com.jerios.pearlarmor.world.gen.OreType;

public class ModOreGen {
    public static void generateOres(final BiomeLoadingEvent event) {
        for (OreType ore : OreType.values()) {
            OreFeatureConfig oreFeatureConfig = new OreFeatureConfig(
                    OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                    ore.getBlock().get().defaultBlockState(), ore.getMaxHeight());

            ConfiguredPlacement<TopSolidRangeConfig> configuredPlacement = Placement.RANGE.configured(
                    new TopSolidRangeConfig(ore.getMinHeight(), ore.getMinHeight(), ore.getMaxHeight()));


        }
    }
    //private static ConfiguredFeature<?, ?> registerOreFeature(OreType ore, OreFeatureConfig oreFeatureConfig,
    //                                                          ConfiguredPlacement configuredPlacement, BlockWithContextConfig blockWithContextConfig) {
    //    return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, ore.getBlock().get().getRegistryName(),
    //            Feature.ORE.withConfiguration(oreFeatureConfig).withPlacement(configuredPlacement) // line that is giving trouble fix soon
    //                    .square().count(ore.getMaxVeinSize()));
    //}
}
