package com.zircky.gtceuadd.data.recipe.remove.mods;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class DivineRPGRemove {
  public static void init(Consumer<ResourceLocation> consumer) {
    divineRPGRemove(consumer);
  }

  public static void divineRPGRemove(Consumer<ResourceLocation> consumer) {
    consumer.accept(new ResourceLocation("divinerpg:shaped/frozen_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/cobbled_frozen_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/cobaltite_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/coalstone_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/asphalt_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/frozen_brick_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/coalstone_brick_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/polished_coalstone_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/polished_cobaltite_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/cut_oxdrite_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/ancient_brick_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/degraded_brick_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/divine_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/shiverspine_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/auroraoak_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/cozybark_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/streamleaf_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/eucalyptus_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/eden_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/wildwood_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/apalachia_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/skythern_slab"));
    consumer.accept(new ResourceLocation("divinerpg:shaped/mortum_slab"));

  }
}
