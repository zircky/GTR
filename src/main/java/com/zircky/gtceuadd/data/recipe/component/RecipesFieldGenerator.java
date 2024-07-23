package com.zircky.gtceuadd.data.recipe.component;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTItems.FIELD_GENERATOR_ZPM;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class RecipesFieldGenerator {
  public static void recipesFieldGenerator(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("field_generator_luv")
        .inputItems(frameGt, HSSS)
        .inputItems(plate, HSSS, 6)
        .inputItems(QUANTUM_STAR, 4)
        .inputItems(EMITTER_LuV, 4)
        .inputItems(CustomTags.ZPM_CIRCUITS, 4)
        .inputItems(wireFine, IndiumTinBariumTitaniumCuprate, 64)
        .inputItems(wireFine, IndiumTinBariumTitaniumCuprate, 64)
        .inputItems(wireFine, IndiumTinBariumTitaniumCuprate, 64)
        .inputItems(wireFine, IndiumTinBariumTitaniumCuprate, 64)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 8)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .outputItems(FIELD_GENERATOR_LuV)
        .scannerResearch(b->b
            .researchStack(FIELD_GENERATOR_IV.asStack())
            .duration(1200)
            .EUt(VA[IV]))
        .duration(600).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("field_generator_zpm")
        .inputItems(frameGt, NaquadahAlloy)
        .inputItems(plate, NaquadahAlloy, 6)
        .inputItems(QUANTUM_STAR)
        .inputItems(EMITTER_ZPM, 2)
        .inputItems(CustomTags.ZPM_CIRCUITS, 2)
        .inputItems(wireFine, UraniumRhodiumDinaquadide, 64)
        .inputItems(wireFine, UraniumRhodiumDinaquadide, 64)
        .inputItems(wireFine, UraniumRhodiumDinaquadide, 64)
        .inputItems(wireFine, UraniumRhodiumDinaquadide, 64)
        .inputItems(cableGtSingle, VanadiumGallium, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 8))
        .outputItems(FIELD_GENERATOR_ZPM)
        .scannerResearch(b->b
            .researchStack(FIELD_GENERATOR_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1200).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("field_generator_uv")
        .inputItems(frameGt, Neutronium)
        .inputItems(plate, Neutronium, 6)
        .inputItems(GRAVI_STAR)
        .inputItems(EMITTER_UV, 2)
        .inputItems(CustomTags.UV_CIRCUITS, 2)
        .inputItems(wireFine, EnrichedNaquadahTriniumEuropiumDuranide, 64)
        .inputItems(wireFine, EnrichedNaquadahTriniumEuropiumDuranide, 64)
        .inputItems(wireFine, EnrichedNaquadahTriniumEuropiumDuranide, 64)
        .inputItems(wireFine, EnrichedNaquadahTriniumEuropiumDuranide, 64)
        .inputItems(cableGtQuadruple, NaquadahAlloy, 6)
        .inputFluids(SolderingAlloy.getFluid(L * 12))
        .inputFluids(Naquadria.getFluid(L * 4))
        .outputItems(FIELD_GENERATOR_UV)
        .stationResearch(b->b
            .researchStack(FIELD_GENERATOR_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);
  }

}
