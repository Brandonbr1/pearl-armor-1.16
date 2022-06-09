package com.jerios.pearlarmor.world;

import com.jerios.pearlarmor.world.gen.ModOreGen;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModWorldEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGen.generateOres(event);
    }
}
