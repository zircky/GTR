package com.zircky.gtceuadd.data.recipe.component.circuit;


import com.gregtechceu.gtceu.api.recipe.GTRecipeType;


import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.VA;
import static com.gregtechceu.gtceu.api.GTValues.LV;
import static com.gregtechceu.gtceu.api.GTValues.MV;
import static com.gregtechceu.gtceu.api.GTValues.HV;
import static com.gregtechceu.gtceu.api.GTValues.EV;
import static com.gregtechceu.gtceu.api.GTValues.IV;
import static com.gregtechceu.gtceu.api.GTValues.LuV;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.api.GTValues.UV;
import static com.gregtechceu.gtceu.api.GTValues.UHV;
import static com.gregtechceu.gtceu.api.GTValues.UEV;
import static com.gregtechceu.gtceu.api.GTValues.UIV;
import static com.gregtechceu.gtceu.api.GTValues.UXV;
import static com.gregtechceu.gtceu.api.GTValues.OpV;
import static com.gregtechceu.gtceu.api.GTValues.MAX;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_REFINED;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_REFINED;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_REFINED;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_REFINED;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIOD_REFINED;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_NANO;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_NANO;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_NANO;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_NANO;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_NANO;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_CRYSTAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_CRYSTAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_CRYSTAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_CRYSTAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_CRYSTAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_QUANTUM;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_QUANTUM;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_QUANTUM;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_QUANTUM;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_QUANTUM;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_WETWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_WETWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_WETWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_WETWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_WETWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_BIOWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_BIOWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_BIOWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_BIOWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_BIOWARE;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_OPTICAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_OPTICAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_OPTICAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_OPTICAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_OPTICAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_COSMIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_COSMIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_COSMIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_COSMIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_COSMIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_SUPRACAUSAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_SUPRACAUSAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_SUPRACAUSAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_SUPRACAUSAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_SUPRACAUSAL;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_EXOTIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_EXOTIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_EXOTIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_EXOTIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_EXOTIC;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_TRANSISTOR_UNKNOWN;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_RESISTOR_UNKNOWN;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_CAPACITOR_UNKNOWN;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_INDUCTOR_UNKNOWN;
import static com.zircky.gtceuadd.common.data.GTRItems.SMD_DIODE_UNKNOWN;






public class RecipesSMD {
  private static final int mL = 144;
  public static void recipesSMD(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("smd-transistor-refined")
        .inputItems(wireFine, AnnealedCopper, 6)
        .inputItems(plate, Silver, 2)
        .inputFluids(Polyethylene.getFluid(mL))
        .outputItems(SMD_TRANSISTOR_REFINED, 16)
        .duration(160).EUt(VA[LV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("smd-resistor-refined")
        .inputItems(wireFine, AnnealedCopper, 4)
        .inputItems(dust, Carbon)
        .outputItems(SMD_RESISTOR_REFINED, 12)
        .duration(160).EUt(VA[LV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("smd-capacitor-refined")
        .inputItems(foil, Rubber, 4)
        .inputItems(foil, Steel, 1)
        .inputFluids(Polyethylene.getFluid(mL))
        .outputItems(SMD_CAPACITOR_REFINED, 8)
        .duration(160).EUt(VA[LV]).save(provider);
//    ASSEMBLER_RECIPES.recipeBuilder("smd-inductor-refined")
//        .inputItems(foil, AnnealedCopper, 4)
//        .inputItems(foil, Steel, 1)
//        .inputFluids(Polyethylene.getFluid(mL))
//        .outputItems(SMD_INDUCTOR_REFINED, 8)
//        .duration(160).EUt(VA[LV]).save(provider);
    ASSEMBLER_RECIPES.recipeBuilder("smd-diode-refined")
        .inputItems(wireFine, Gold, 8)
        .inputItems(dust, Lithium, 2)
        .inputFluids(Polyethylene.getFluid(mL))
        .outputItems(SMD_DIOD_REFINED, 16)
        .duration(160).EUt(VA[LV]).save(provider);

  }
}
