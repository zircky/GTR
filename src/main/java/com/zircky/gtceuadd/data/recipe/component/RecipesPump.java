package com.zircky.gtceuadd.data.recipe.component;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.cableGtQuadruple;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Naquadria;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class RecipesPump {
  public static void recipesPump(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("electric_pump_luv")
        .inputItems(ELECTRIC_MOTOR_LuV)
        .inputItems(pipeSmallFluid, NiobiumTitanium)
        .inputItems(plate, HSSS, 2)
        .inputItems(screw, HSSS, 8)
        .inputItems(ring, SiliconeRubber, 4)
        .inputItems(rotor, HSSS, 2)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 2)
        .inputFluids(SolderingAlloy.getFluid(L))
        .inputFluids(Lubricant.getFluid(250))
        .outputItems(ELECTRIC_PUMP_LuV)
        .scannerResearch(b->b
            .researchStack(ELECTRIC_PUMP_IV.asStack())
            .duration(1200)
            .EUt(VA[IV]))
        .duration(600).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("electric_pump_zpm")
        .inputItems(ELECTRIC_MOTOR_ZPM)
        .inputItems(pipeNormalFluid, Polybenzimidazole)
        .inputItems(plate, NaquadahAlloy, 2)
        .inputItems(screw, NaquadahAlloy, 8)
        .inputItems(ring, SiliconeRubber, 8)
        .inputItems(rotor, NaquadahAlloy, 2)
        .inputItems(cableGtQuadruple, VanadiumGallium, 2)
        .inputFluids(SolderingAlloy.getFluid(L * 2))
        .inputFluids(Lubricant.getFluid(500))
        .outputItems(ELECTRIC_PUMP_ZPM)
        .scannerResearch(b->b
            .researchStack(ELECTRIC_PUMP_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1200).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("electric_pump_uv")
        .inputItems(ELECTRIC_MOTOR_UV)
        .inputItems(pipeLargeFluid, Naquadah, 2)
        .inputItems(plate, Neutronium, 2)
        .inputItems(screw, Neutronium, 8)
        .inputItems(ring, SiliconeRubber, 16)
        .inputItems(rotor, Neutronium, 2)
        .inputItems(cableGtQuadruple, NaquadahAlloy, 2)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .inputFluids(Lubricant.getFluid(1000))
        .inputFluids(Naquadria.getFluid(L * 4))
        .outputItems(ELECTRIC_PUMP_UV)
        .stationResearch(b->b
            .researchStack(ELECTRIC_PUMP_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);
  }

}
