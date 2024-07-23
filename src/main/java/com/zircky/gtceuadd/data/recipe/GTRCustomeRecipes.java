package com.zircky.gtceuadd.data.recipe;

import com.zircky.gtceuadd.data.recipe.component.ElectricComponent;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class GTRCustomeRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesComponent(provider);
    ElectricComponent.init(provider);
  }

  public static void recipesComponent(Consumer<FinishedRecipe> provider) {

  }


}
