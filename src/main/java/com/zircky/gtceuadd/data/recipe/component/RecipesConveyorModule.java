package com.zircky.gtceuadd.data.recipe.component;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.UV;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.cableGtQuadruple;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTItems.CONVEYOR_MODULE_UV;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;
import static com.zircky.gtceuadd.common.data.GTRMaterials.Bedrockium;
import static com.zircky.gtceuadd.common.data.GTRMaterials.CosmicNeutronium;

public class RecipesConveyorModule {
  public static void recipesConveyorModule(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("conveyor_module_luv")
        .inputItems(ELECTRIC_MOTOR_LuV, 2)
        .inputItems(plate, HSSS, 6)
        .inputItems(ring, HSSS, 4)
        .inputItems(round, HSSS, 16)
        .inputItems(screw, HSSS, 4)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 2)
        .inputFluids(SolderingAlloy.getFluid(L * 2))
        .inputFluids(Lubricant.getFluid(250))
        .inputFluids(StyreneButadieneRubber.getFluid(L * 8))
        .outputItems(CONVEYOR_MODULE_LuV)
        .scannerResearch(b->b
            .researchStack(CONVEYOR_MODULE_IV.asStack())
            .duration(1200)
            .EUt(VA[IV]))
        .duration(600).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("conveyor_module_zpm")
        .inputItems(ELECTRIC_MOTOR_ZPM, 2)
        .inputItems(plate, NaquadahAlloy, 6)
        .inputItems(ring, NaquadahAlloy, 4)
        .inputItems(round, NaquadahAlloy, 32)
        .inputItems(screw, NaquadahAlloy, 4)
        .inputItems(cableGtQuadruple, VanadiumGallium, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 2))
        .inputFluids(Lubricant.getFluid(500))
        .inputFluids(StyreneButadieneRubber.getFluid(L * 16))
        .outputItems(CONVEYOR_MODULE_ZPM)
        .scannerResearch(b->b
            .researchStack(CONVEYOR_MODULE_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1200).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("conveyor_module_uv")
        .inputItems(ELECTRIC_MOTOR_UV, 2)
        .inputItems(plate, Neutronium, 2)
        .inputItems(ring, Neutronium, 4)
        .inputItems(round, Neutronium, 32)
        .inputItems(screw, Neutronium, 4)
        .inputItems(cableGtQuadruple, NaquadahAlloy, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .inputFluids(Lubricant.getFluid(1000))
        .inputFluids(StyreneButadieneRubber.getFluid(L * 24))
        .inputFluids(Naquadria.getFluid(L * 4))
        .outputItems(CONVEYOR_MODULE_UV)
        .stationResearch(b->b
            .researchStack(CONVEYOR_MODULE_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("conveyor_module_uhv")
        .inputItems(ELECTRIC_MOTOR_UHV, 2)
        .inputItems(plate, CosmicNeutronium, 2)
        .inputItems(ring, CosmicNeutronium, 8)
        .inputItems(round, CosmicNeutronium, 64)
        .inputItems(screw, CosmicNeutronium, 4)
        .inputItems(cableGtQuadruple, Bedrockium, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 12))
        .inputFluids(Lubricant.getFluid(L * 10))
        .inputFluids(StyreneButadieneRubber.getFluid(L * 54))
        .inputFluids(Naquadria.getFluid(L * 10))
        .outputItems(CONVEYOR_MODULE_UHV)
        .stationResearch(b-> b
            .researchStack(CONVEYOR_MODULE_UV.asStack())
            .CWUt(128)
            .EUt(VA[UV]))
        .duration(2400).EUt(VA[UV]).save(provider);
  }

}
