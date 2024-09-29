package com.zircky.gtceuadd.data.recipe;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CustemTags {
  public static final TagKey<Item> UXV_BATTERIES = TagUtil.createModItemTag("batteries/uiv");
  public static final TagKey<Item> OpV_BATTERIES = TagUtil.createModItemTag("batteries/opv");
  public static final TagKey<Item> MAX_BATTERIES = TagUtil.createModItemTag("batteries/max");
  public static final TagKey<Item> ERV_BATTERIES = TagUtil.createModItemTag("batteries/ERV");

  public static final TagKey<Item> ERV_CIRCUITS = TagUtil.createModItemTag("circuits/erv.json");

  public static final TagKey<Block> ARSNOUVEAU_ARCHWOOD = BlockTags.create(new ResourceLocation("forge", "logs/archwood"));

//  public static final TagKey<Item> CABLES_COLORS = TagUtil.createModItemTag("ae2/cables_colors");
}
