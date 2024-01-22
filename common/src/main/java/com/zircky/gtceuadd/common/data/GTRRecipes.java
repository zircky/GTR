package com.zircky.gtceuadd.common.data;

import com.zircky.gtceuadd.data.recipe.GTRNewMotorRecipes;
import com.zircky.gtceuadd.data.recipe.GTRRemoveRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GTRRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    GTRNewMotorRecipes.init(provider);
  }


  public static void recipeRemoval(Consumer<ResourceLocation> consumer) {
    GTRRemoveRecipes.init(consumer);
  }
}
