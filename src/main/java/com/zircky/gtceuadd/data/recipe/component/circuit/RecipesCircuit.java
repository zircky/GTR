package com.zircky.gtceuadd.data.recipe.component.circuit;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class RecipesCircuit {

  public static void init(Consumer<FinishedRecipe> provider) {
    RecipesSMDRefined.recipesSMDRefined(provider);
  }
}
