package com.zircky.gtceuadd.data.recipe.component;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Naquadria;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;
import static com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper.*;

public class RecipesPiston {
  public static void recipesPiston(Consumer<FinishedRecipe> provider) {
    addShapedRecipe(provider, "electric_piston_mv", ELECTRIC_PISTON_MV.asStack(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Aluminium), 'C', new UnificationEntry(cableGtSingle, AnnealedCopper), 'R', new UnificationEntry(rod, Aluminium), 'G', new UnificationEntry(gearSmall, Aluminium), 'M', ELECTRIC_MOTOR_MV.asStack());

    ASSEMBLY_LINE_RECIPES.recipeBuilder("electric_piston_luv")
        .inputItems(ELECTRIC_MOTOR_LuV)
        .inputItems(plate, HSSS, 6)
        .inputItems(ring, HSSS, 4)
        .inputItems(round, HSSS, 32)
        .inputItems(rod, HSSS, 4)
        .inputItems(gear, HSSS)
        .inputItems(gearSmall, HSSS, 2)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 4)
        .inputFluids(SolderingAlloy.getFluid(L))
        .inputFluids(Lubricant.getFluid(250))
        .outputItems(ELECTRIC_PISTON_LuV)
        .scannerResearch(b -> b
            .researchStack(ELECTRIC_PISTON_IV.asStack())
            .duration(1800)
            .EUt(VA[IV]))
        .duration(600).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("electric_piston_zpm")
        .inputItems(ELECTRIC_MOTOR_ZPM)
        .inputItems(plate, NaquadahAlloy, 6)
        .inputItems(ring, NaquadahAlloy, 4)
        .inputItems(round, NaquadahAlloy, 32)
        .inputItems(rod, NaquadahAlloy, 4)
        .inputItems(gear, NaquadahAlloy)
        .inputItems(gearSmall, NaquadahAlloy, 2)
        .inputItems(cableGtQuadruple, VanadiumGallium, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 2))
        .inputFluids(Lubricant.getFluid(500))
        .outputItems(ELECTRIC_PISTON_ZPM)
        .scannerResearch(b -> b
            .researchStack(ELECTRIC_PISTON_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1200).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("electric_piston_uv")
        .inputItems(ELECTRIC_MOTOR_UV)
        .inputItems(plate, Neutronium, 6)
        .inputItems(ring, Neutronium, 4)
        .inputItems(round, Neutronium, 32)
        .inputItems(rod, Neutronium, 4)
        .inputItems(gear, Neutronium)
        .inputItems(gearSmall, Neutronium, 2)
        .inputItems(cableGtQuadruple, NaquadahAlloy, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .inputFluids(Lubricant.getFluid(2500))
        .inputFluids(Naquadria.getFluid(L * 4))
        .outputItems(ELECTRIC_PISTON_UV)
        .stationResearch(b -> b
            .researchStack(ELECTRIC_PISTON_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);
  }

}
