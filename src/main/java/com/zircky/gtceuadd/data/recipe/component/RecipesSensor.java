package com.zircky.gtceuadd.data.recipe.component;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTItems.SENSOR_ZPM;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class RecipesSensor {
  public static void recipesSensor(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("sensor_luv")
        .inputItems(frameGt, HSSS)
        .inputItems(ELECTRIC_MOTOR_LuV)
        .inputItems(plate, Ruridit, 4)
        .inputItems(QUANTUM_STAR)
        .inputItems(CustomTags.LuV_CIRCUITS, 2)
        .inputItems(foil, Palladium, 64)
        .inputItems(foil, Palladium, 32)
        .inputItems(cableGtSingle, NiobiumTitanium, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 2))
        .outputItems(SENSOR_LuV)
        .scannerResearch(b->b
            .researchStack(SENSOR_IV.asStack())
            .duration(1200)
            .EUt(VA[IV]))
        .duration(600).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("sensor_zpm")
        .inputItems(frameGt, NaquadahAlloy)
        .inputItems(ELECTRIC_MOTOR_ZPM)
        .inputItems(plate, Osmiridium, 4)
        .inputItems(QUANTUM_STAR, 2)
        .inputItems(CustomTags.ZPM_CIRCUITS, 2)
        .inputItems(foil, Trinium, 64)
        .inputItems(foil, Trinium, 32)
        .inputItems(cableGtSingle, VanadiumGallium, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .outputItems(SENSOR_ZPM)
        .scannerResearch(b->b
            .researchStack(SENSOR_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1200).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("sensor_uv")
        .inputItems(frameGt, Tritanium)
        .inputItems(ELECTRIC_MOTOR_UV)
        .inputItems(plate, Tritanium, 4)
        .inputItems(GRAVI_STAR)
        .inputItems(CustomTags.UV_CIRCUITS, 2)
        .inputItems(foil, Naquadria, 64)
        .inputItems(foil, Naquadria, 32)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 8))
        .inputFluids(Naquadria.getFluid(L * 4))
        .outputItems(SENSOR_UV)
        .stationResearch(b->b
            .researchStack(SENSOR_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);
  }

}
