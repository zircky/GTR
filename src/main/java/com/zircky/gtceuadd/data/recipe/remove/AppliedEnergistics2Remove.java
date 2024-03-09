package com.zircky.gtceuadd.data.recipe.remove;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AppliedEnergistics2Remove {
  public static void init(Consumer<ResourceLocation> consumer) {
    AE2Remove(consumer);
  }

  public static void AE2Remove(Consumer<ResourceLocation> consumer) {
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_block"));
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_glass"));
    consumer.accept(new ResourceLocation("ae2:decorative/cut_quartz_block"));
    consumer.accept(new ResourceLocation("ae2:decorative/certus_quartz_bricks"));
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_vibrant_glass"));
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_fixture"));
    consumer.accept(new ResourceLocation("ae2:decorative/fluix_block"));
    consumer.accept(new ResourceLocation("ae2:misc/chests_sky_stone"));
    consumer.accept(new ResourceLocation("ae2:misc/chests_smooth_sky_stone"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/inscribers"));
    consumer.accept(new ResourceLocation("ae2:network/wireless_access_point"));

  }
}
