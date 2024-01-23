package com.zircky.gtceuadd.data.recipe;


//import com.gregtechceu.gtceu.common.data.GTItems;
//import com.gregtechceu.gtceu.data.recipe.misc.ComponentRecipes;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GTRRemoveRecipes {
  public static void init(Consumer<ResourceLocation> consumer) {
    generalRemovals(consumer);
  }

  public static void generalRemovals(Consumer<ResourceLocation> consumer) {
    consumer.accept(new ResourceLocation("gtceu:mv_electric_motor"));
  }

}
