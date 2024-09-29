package com.zircky.gtceuadd.data.recipe.remove.mods;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class ArsNouveauRemoves {
  public static void init(Consumer<ResourceLocation> consumer) {
    arsNouveauRemoves(consumer);
  }

  public static void arsNouveauRemoves(Consumer<ResourceLocation> consumer) {
    consumer.accept(new ResourceLocation("ars_nouveau:archwood_slab"));
  }
}
