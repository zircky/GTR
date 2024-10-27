package com.zircky.gtceuadd.worldgen;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import net.minecraft.resources.ResourceLocation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GTOreVein {
  private static final Set<ResourceLocation> OreVeinsRemoved = new HashSet<>();

  static {
    OreVeinsRemoved.addAll(Arrays.asList(
        GTCEu.id("bauxite_vein_end"),
        GTCEu.id("mica_vein")
    ));
  }

  public static void OreRemove() {
    for (ResourceLocation id : OreVeinsRemoved) {
      GTRegistries.ORE_VEINS.remove(id);
    }
  }

}
