package com.zircky.gtceuadd.data.recipe.generator;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.zircky.gtceuadd.common.data.GTRRecipeTypes.SC_STEAM_TURBINE_FUELS;

public class GTRGenerator {

  public static void init(Consumer<FinishedRecipe> provider) {
    generator(provider);
  }

  public static void generator(Consumer<FinishedRecipe> provider) {
    SC_STEAM_TURBINE_FUELS.recipeBuilder("sc-steam")
        .inputFluids(GTRMaterials.SupercriticalSteam.getFluid(1500))
        .outputFluids(GTMaterials.Steam.getFluid(650))
        .duration(500)
        .EUt(-GTValues.VA[GTValues.ZPM])
        .save(provider);
  }
}
