package com.zircky.gtceuadd.data.recipe;

import com.gregtechceu.gtceu.api.data.tag.TagUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class CustemTags {
  public static final TagKey<Item> UXV_BATTERIES = TagUtil.createModItemTag("batteries/uiv");
  public static final TagKey<Item> OpV_BATTERIES = TagUtil.createModItemTag("batteries/opv");
  public static final TagKey<Item> MAX_BATTERIES = TagUtil.createModItemTag("batteries/max");
  public static final TagKey<Item> ERV_BATTERIES = TagUtil.createModItemTag("batteries/ERV");

  public static final TagKey<Item> ERV_CIRCUITS = TagUtil.createModItemTag("circuits/erv");
}
