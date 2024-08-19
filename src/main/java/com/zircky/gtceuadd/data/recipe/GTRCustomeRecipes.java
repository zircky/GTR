package com.zircky.gtceuadd.data.recipe;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTBlocks;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.gtceuadd.data.recipe.component.ElectricComponent;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import com.zircky.gtceuadd.common.data.GTRRecipes;

import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class GTRCustomeRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesHull(provider);
    ElectricComponent.init(provider);
  }

  public static void recipesHull(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("hull_luv")
        .inputItems(GTBlocks.MACHINE_CASING_LuV.asStack()).inputItems(TagPrefix.cableGtSingle, IndiumTinBariumTitaniumCuprate, 4).circuitMeta(1)
        .inputFluids(GTMaterials.Polytetrafluoroethylene.getFluid(576))
        .outputItems(GTMachines.HULL[6])
        .scannerResearch(b -> b
            .researchStack(GTMachines.HULL[5].asStack())
            .duration(GTRRecipes.hour * 3).EUt(GTValues.VA[GTValues.EV]))
        .duration(GTRRecipes.hour).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("hull_zpm")
        .inputItems(GTBlocks.MACHINE_CASING_ZPM.asStack()).inputItems(TagPrefix.wireGtSingle, UraniumRhodiumDinaquadide, 4).circuitMeta(1)
        .inputFluids(GTMaterials.Polytetrafluoroethylene.getFluid(576))
        .outputItems(GTMachines.HULL[7])
        .scannerResearch(b -> b
            .researchStack(GTMachines.HULL[6].asStack())
            .duration(GTRRecipes.hour * 3).EUt(GTValues.VA[GTValues.EV]))
        .duration(GTRRecipes.hour).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("hull_uv")
        .inputItems(GTBlocks.MACHINE_CASING_UV.asStack()).inputItems(TagPrefix.cableGtSingle, EnrichedNaquadahTriniumEuropiumDuranide, 4).circuitMeta(1)
        .inputFluids(GTMaterials.Polytetrafluoroethylene.getFluid(576))
        .outputItems(GTMachines.HULL[8])
        .scannerResearch(b -> b
            .researchStack(GTMachines.HULL[7].asStack())
            .duration(GTRRecipes.hour * 3).EUt(GTValues.VA[GTValues.EV]))
        .duration(GTRRecipes.hour).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }

  public static void recipesMachineCasing(Consumer<FinishedRecipe> provider) {

  }

}
