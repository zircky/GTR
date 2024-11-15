package com.zircky.gtceuadd.data.recipe.component;

import com.gregtechceu.gtceu.data.recipe.CustomTags;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.ZPM;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.cableGtQuadruple;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTItems.ROBOT_ARM_ZPM;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.Naquadria;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;

public class RecipesRobotArm {
  public static void recipesRobotArm(Consumer<FinishedRecipe> provider) {
    ASSEMBLY_LINE_RECIPES.recipeBuilder("robot_arm_luv")
        .inputItems(rodLong, HSSS, 4)
        .inputItems(gear, HSSS)
        .inputItems(gearSmall, HSSS, 3)
        .inputItems(ELECTRIC_MOTOR_LuV, 2)
        .inputItems(ELECTRIC_PISTON_LuV)
        .inputItems(CustomTags.LuV_CIRCUITS, 2)
        .inputItems(CustomTags.IV_CIRCUITS, 4)
        .inputItems(CustomTags.EV_CIRCUITS, 8)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 6)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .inputFluids(Lubricant.getFluid(250))
        .outputItems(ROBOT_ARM_LuV)
        .scannerResearch(b->b
            .researchStack(ROBOT_ARM_IV.asStack())
            .duration(1200)
            .EUt(VA[IV]))
        .duration(600).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("robot_arm_zpm")
        .inputItems(rodLong, NaquadahAlloy, 4)
        .inputItems(gear, NaquadahAlloy)
        .inputItems(gearSmall, NaquadahAlloy, 3)
        .inputItems(ELECTRIC_MOTOR_ZPM, 2)
        .inputItems(ELECTRIC_PISTON_ZPM)
        .inputItems(CustomTags.ZPM_CIRCUITS, 2)
        .inputItems(CustomTags.LuV_CIRCUITS, 4)
        .inputItems(CustomTags.IV_CIRCUITS, 8)
        .inputItems(cableGtQuadruple, VanadiumGallium, 6)
        .inputFluids(SolderingAlloy.getFluid(L * 8))
        .inputFluids(Lubricant.getFluid(500))
        .outputItems(ROBOT_ARM_ZPM)
        .scannerResearch(b->b
            .researchStack(ROBOT_ARM_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1800).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("robot_arm_uv")
        .inputItems(rodLong, Neutronium, 4)
        .inputItems(gear, Neutronium)
        .inputItems(gearSmall, Neutronium, 3)
        .inputItems(ELECTRIC_MOTOR_UV, 2)
        .inputItems(ELECTRIC_PISTON_UV)
        .inputItems(CustomTags.UV_CIRCUITS, 2)
        .inputItems(CustomTags.ZPM_CIRCUITS, 4)
        .inputItems(CustomTags.LuV_CIRCUITS, 8)
        .inputItems(cableGtQuadruple, NaquadahAlloy, 4)
        .inputFluids(SolderingAlloy.getFluid(L * 12))
        .inputFluids(Lubricant.getFluid(1000))
        .inputFluids(Naquadria.getFluid(L * 4))
        .outputItems(ROBOT_ARM_UV)
        .stationResearch(b->b
            .researchStack(ROBOT_ARM_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);
  }

}
