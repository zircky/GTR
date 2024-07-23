package com.zircky.gtceuadd.data.recipe.component;

import com.gregtechceu.gtceu.GTCEu;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.GTValues.UV;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTItems.ELECTRIC_MOTOR_UV;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;
import static com.zircky.gtceuadd.common.data.GTRMaterials.Bedrockium;
import static com.zircky.gtceuadd.common.data.GTRMaterials.CosmicNeutronium;

public class RecipesMotor {
  public static void recipesMotor(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("electric_motor_mv"))
        .inputItems(cableGtSingle, Copper, 2)
        .inputItems(rod, Aluminium, 2)
        .inputItems(rod, SteelMagnetic)
        .inputItems(wireGtDouble, Cupronickel, 4)
        .inputItems(ELECTRIC_MOTOR_LV, 1)
        .outputItems(ELECTRIC_MOTOR_MV)
        .duration(100).EUt(VA[LV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("electric_motor_hv"))
        .inputItems(cableGtQuadruple, Silver, 2)
        .inputItems(rod, StainlessSteel, 2)
        .inputItems(rod, SteelMagnetic)
        .inputItems(wireGtDouble, Electrum, 4)
        .inputItems(ELECTRIC_MOTOR_MV)
        .outputItems(ELECTRIC_MOTOR_HV)
        .duration(150).EUt(VA[MV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("electric_motor_ev"))
        .inputItems(cableGtQuadruple, Aluminium, 2)
        .inputItems(rod, Titanium, 2)
        .inputItems(rod, NeodymiumMagnetic)
        .inputItems(wireGtQuadruple, BlackSteel, 4)
        .inputItems(ELECTRIC_MOTOR_HV)
        .outputItems(ELECTRIC_MOTOR_EV)
        .duration(200).EUt(VA[HV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("electric_motor_iv"))
        .inputItems(cableGtQuadruple, Tungsten, 2)
        .inputItems(rod, TungstenSteel, 2)
        .inputItems(rod, NeodymiumMagnetic)
        .inputItems(wireGtQuadruple, Graphene, 4)
        .inputItems(ELECTRIC_MOTOR_EV)
        .outputItems(ELECTRIC_MOTOR_IV)
        .duration(250).EUt(VA[EV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder(GTCEu.id("electric_motor_luv"))
        .inputItems(ELECTRIC_MOTOR_IV)
        .inputItems(rod, SamariumMagnetic)
        .inputItems(rodLong, HSSS, 2)
        .inputItems(ring, HSSS, 2)
        .inputItems(round, HSSS, 4)
        .inputItems(wireFine, Ruridit, 64)
        .inputItems(wireFine, Ruridit, 64)
        .inputItems(cableGtOctal, YttriumBariumCuprate, 6)
        .inputFluids(SolderingAlloy.getFluid(L))
        .inputFluids(Lubricant.getFluid(250))
        .scannerResearch(b -> b
            .researchStack(ELECTRIC_MOTOR_IV.asStack())
            .duration(1200)
            .EUt(VA[IV]))
        .outputItems(ELECTRIC_MOTOR_LuV.asStack())
        .duration(650).EUt(VA[IV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder(GTCEu.id("electric_motor_zpm"))
        .inputItems(ELECTRIC_MOTOR_LuV)
        .inputItems(rod, SamariumMagnetic, 2)
        .inputItems(rodLong, NaquadahAlloy, 4)
        .inputItems(ring, NaquadahAlloy, 8)
        .inputItems(round, NaquadahAlloy, 16)
        .inputItems(wireFine, Europium, 64)
        .inputItems(wireFine, Europium, 64)
        .inputItems(wireFine, Europium, 64)
        .inputItems(cableGtOctal, VanadiumGallium, 6)
        .inputFluids(SolderingAlloy.getFluid(L * 3))
        .inputFluids(Lubricant.getFluid(L))
        .outputItems(ELECTRIC_MOTOR_ZPM)
        .scannerResearch(b -> b
            .researchStack(ELECTRIC_MOTOR_LuV.asStack())
            .duration(2400)
            .EUt(VA[LuV]))
        .duration(1200).EUt(VA[LuV]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder(GTCEu.id("electric_motor_uv"))
        .inputItems(ELECTRIC_MOTOR_ZPM)
        .inputItems(rodLong, SamariumMagnetic)
        .inputItems(rodLong, Neutronium, 4)
        .inputItems(ring, Neutronium, 4)
        .inputItems(round, Neutronium, 16)
        .inputItems(wireFine, Americium, 64)
        .inputItems(wireFine, Americium, 64)
        .inputItems(wireFine, Americium, 64)
        .inputItems(wireFine, Americium, 64)
        .inputItems(wireFine, Americium, 64)
        .inputItems(wireFine, Americium, 64)
        .inputItems(cableGtOctal, NaquadahAlloy, 6)
        .inputFluids(SolderingAlloy.getFluid(L * 5))
        .inputFluids(Lubricant.getFluid(L * 2))
        .inputFluids(Naquadria.getFluid(L * 5))
        .outputItems(ELECTRIC_MOTOR_UV)
        .stationResearch(b -> b
            .researchStack(ELECTRIC_MOTOR_ZPM.asStack())
            .CWUt(32)
            .EUt(VA[ZPM]))
        .duration(1800).EUt(VA[ZPM]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder(GTCEu.id("electric_motor_uhv"))
        .inputItems(ELECTRIC_MOTOR_UV)
        .inputItems(rodLong, SamariumMagnetic, 4)
        .inputItems(rodLong, CosmicNeutronium, 8)
        .inputItems(ring, CosmicNeutronium, 8)
        .inputItems(round, CosmicNeutronium, 32)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(wireFine, Neutronium, 64)
        .inputItems(cableGtOctal, Bedrockium, 2)
        .inputFluids(SolderingAlloy.getFluid(L * 15))
        .inputFluids(Lubricant.getFluid(L * 6))
        .inputFluids(Naquadria.getFluid(L * 10))
        .outputItems(ELECTRIC_MOTOR_UHV)
        .stationResearch(b -> b
            .researchStack(ELECTRIC_MOTOR_UV.asStack())
            .CWUt(128)
            .EUt(VA[UV]))
        .duration(2400).EUt(VA[UV]).save(provider);
  }

}
