package com.zircky.gtceuadd.data.recipe.remove;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class VanillaRemove {
  public static void init(Consumer<ResourceLocation> consumer) {
    vanillaRemove(consumer);
  }

  private static void vanillaRemove(Consumer<ResourceLocation> consumer) {
    consumer.accept(new ResourceLocation("minecraft:oak_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/oak_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:spruce_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/spruce_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:birch_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/birch_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:jungle_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/jungle_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:acacia_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/acacia_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:cherry_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/cherry_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:dark_oak_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/dark_oak_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:mangrove_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/mangrove_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:bamboo_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/bamboo_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:crimson_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/crimson_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:warped_planks"));
    consumer.accept(new ResourceLocation("gtceu:shaped/warped_planks_saw"));
    consumer.accept(new ResourceLocation("minecraft:oak_slab"));
    consumer.accept(new ResourceLocation("minecraft:spruce_slab"));
    consumer.accept(new ResourceLocation("minecraft:birch_slab"));
    consumer.accept(new ResourceLocation("minecraft:jungle_slab"));
    consumer.accept(new ResourceLocation("minecraft:acacia_slab"));
    consumer.accept(new ResourceLocation("minecraft:cherry_slab"));
    consumer.accept(new ResourceLocation("minecraft:dark_oak_slab"));
    consumer.accept(new ResourceLocation("minecraft:mangrove_slab"));
    consumer.accept(new ResourceLocation("minecraft:bamboo_slab"));
    consumer.accept(new ResourceLocation("minecraft:crimson_slab"));
    consumer.accept(new ResourceLocation("minecraft:warped_slab"));
  }



}
