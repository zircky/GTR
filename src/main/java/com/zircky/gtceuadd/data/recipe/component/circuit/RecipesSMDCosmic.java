package com.zircky.gtceuadd.data.recipe.component.circuit;

import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.dust;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.zircky.gtceuadd.common.data.GTRItems.*;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_NANO;

public class RecipesSMDCosmic {
  private static final int mL = 144;
  public static void recipesSMDCosmic(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("smd-transistor-cosmic")
        .inputItems(wireFine, AnnealedCopper, 6)
        .inputItems(plate, Silver, 2)
        .inputFluids(Polyethylene.getFluid(mL))
        .outputItems(SMD_TRANSISTOR_COSMIC, 16)
        .duration(160).EUt(VA[LV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("smd-resistor-cosmic")
        .inputItems(wireFine, AnnealedCopper, 4)
        .inputItems(dust, Carbon)
        .outputItems(SMD_RESISTOR_COSMIC, 12)
        .duration(160).EUt(VA[LV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("smd-capacitor-cosmic")
        .inputItems(foil, Rubber, 4)
        .inputItems(foil, Steel, 1)
        .inputFluids(Polyethylene.getFluid(mL))
        .outputItems(SMD_CAPACITOR_COSMIC, 8)
        .duration(160).EUt(VA[LV]).save(provider);
//    ASSEMBLER_RECIPES.recipeBuilder("smd-inductor-cosmic")
//        .inputItems(foil, AnnealedCopper, 4)
//        .inputItems(foil, Steel, 1)
//        .inputFluids(Polyethylene.getFluid(mL))
//        .outputItems(SMD_INDUCTOR_COSMIC, 8)
//        .duration(160).EUt(VA[LV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("smd-diode-cosmic")
        .inputItems(wireFine, Gold, 8)
        .inputItems(dust, Lithium, 2)
        .inputFluids(Polyethylene.getFluid(mL))
        .outputItems(SMD_DIODE_COSMIC, 16)
        .duration(160).EUt(VA[LV]).save(provider);

  }
}
