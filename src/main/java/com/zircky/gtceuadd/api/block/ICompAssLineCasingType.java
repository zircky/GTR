package com.zircky.gtceuadd.api.block;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

public interface ICompAssLineCasingType {
  int getTier();

  BlockEntry<Block> getCompAssLineCasing(int tier);

  String getName();

  ResourceLocation getResourceLocation();
}
