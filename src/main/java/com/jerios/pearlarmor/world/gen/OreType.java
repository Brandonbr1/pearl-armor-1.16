package com.jerios.pearlarmor.world.gen;

import com.jerios.pearlarmor.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraftforge.common.util.Lazy;

public enum OreType {

    PEARL(Lazy.of(ModBlocks.PEARL_ORE), 8, 4, 25, 50);

    private final Lazy<Block> block;
    private final int maxVeinSize;
    private final int minVeinSize;
    private final int minHeight;
    private final int maxHeight;


    OreType(Lazy<Block> block, int maxVeinSize, int minVeinSize, int minHeight, int maxHeight) {
        this.block = block;
        this.maxVeinSize = maxVeinSize;
        this.minVeinSize = minVeinSize;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public Lazy<Block> getBlock() {
        return block;
    }

    public int getMaxVeinSize() {
        return maxVeinSize;
    }

    public int getMinVeinSize() {
        return minVeinSize;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static OreType get(Block block) {
        for (OreType ore : values()) {
            if(block == ore.block){
                return ore;
            }
        }
        return null;
    }
}
