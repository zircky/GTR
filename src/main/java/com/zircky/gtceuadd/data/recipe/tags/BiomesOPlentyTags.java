package com.zircky.gtceuadd.data.recipe.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class BiomesOPlentyTags {
  public BiomesOPlentyTags() {
  }

  public static class ModTags {

    /**
     * Biomes O' Plenty
     */
    public static final TagKey<Block> DEAD_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "dead_logs"));
    public static final TagKey<Block> FIR_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "fir_logs"));
    public static final TagKey<Block> HELLBARK_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "hellbark_logs"));
    public static final TagKey<Block> JACARANDA_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "jacaranda_logs"));
    public static final TagKey<Block> MAGIC_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "magic_logs"));
    public static final TagKey<Block> MAHOGANY_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "mahogany_logs"));
    public static final TagKey<Block> PALM_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "palm_logs"));
    public static final TagKey<Block> REDWOOD_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "redwood_logs"));
    public static final TagKey<Block> UMBRAN_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "umbran_logs"));
    public static final TagKey<Block> WILLOW_LOGS = BlockTags.create(new ResourceLocation("biomesoplenty", "willow_logs"));
  }
}