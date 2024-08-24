package com.zircky.gtceuadd.common.data;

import com.zircky.gtceuadd.data.recipe.GTRCustomeRecipes;
import com.zircky.gtceuadd.data.recipe.addition.ae2.AppliedEnergistics2Recipe;
import com.zircky.gtceuadd.data.recipe.generator.GTRGenerator;
import com.zircky.gtceuadd.data.recipe.remove.AppliedEnergistics2Remove;
import com.zircky.gtceuadd.data.recipe.remove.GTRRemoveRecipes;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class GTRRecipes {
  public static int seconds = 20;
  public static int hour = seconds * 60;
  public static int day = 24 * hour;

  public static void init(Consumer<FinishedRecipe> provider) {
    GTRCustomeRecipes.init(provider);
    //GTRPlatinumLine.init(provider);
    AppliedEnergistics2Recipe.init(provider);
    GTRGenerator.init(provider);
  }


  public static void recipeRemoval(Consumer<ResourceLocation> consumer) {
    GTRRemoveRecipes.init(consumer);
    AppliedEnergistics2Remove.init(consumer);
  }
}
