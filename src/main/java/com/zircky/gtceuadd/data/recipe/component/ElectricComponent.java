package com.zircky.gtceuadd.data.recipe.component;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class ElectricComponent {

  public static void init(Consumer<FinishedRecipe> provider) {
    RecipesMotor.recipesMotor(provider);
    RecipesConveyorModule.recipesConveyorModule(provider);
    RecipesFieldGenerator.recipesFieldGenerator(provider);
    RecipesPiston.recipesPiston(provider);
    RecipesPump.recipesPump(provider);
    RecipesRobotArm.recipesRobotArm(provider);
    RecipesSensor.recipesSensor(provider);
  }







}
