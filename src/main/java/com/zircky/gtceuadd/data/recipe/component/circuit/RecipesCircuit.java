package com.zircky.gtceuadd.data.recipe.component.circuit;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class RecipesCircuit {

  public static void init(Consumer<FinishedRecipe> provider) {
    RecipesSMDRefined.recipesSMDRefined(provider);
    RecipesSMDNamo.recipesSMDRefined(provider);
    RecipesSMDCrystal.recipesSMDCrystal(provider);
    RecipesSMDQuantum.recipesSMDQuantum(provider);
    RecipesSMDWetware.recipesSMDWetware(provider);
    RecipesSMDBioware.recipesSMDBioware(provider);
    RecipesSMDOptical.recipesSMDOptical(provider);
    RecipesSMDCosmic.recipesSMDCosmic(provider);
    RecipesSMDSupracausal.recipesSMDSupracausal(provider);
    RecipesSMDUnknown.recipesSMDUnknown(provider);
    RecipesSMDExotic.recipesSMDExotic(provider);
  }
}
