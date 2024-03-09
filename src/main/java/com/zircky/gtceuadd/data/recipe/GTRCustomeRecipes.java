package com.zircky.gtceuadd.data.recipe;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_ASSEMBLY_CONTROL;
import static com.gregtechceu.gtceu.common.data.GTBlocks.CASING_GRATE;
import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.gregtechceu.gtceu.common.data.GTMachines.ASSEMBLY_LINE;
import static com.gregtechceu.gtceu.common.data.GTMachines.FLUID_SOLIDIFIER;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLY_LINE_RECIPES;
import static com.zircky.gtceuadd.common.data.GTRMachines.COMPONENT_ASSEMBLY_LINE;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

public class GTRCustomeRecipes {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesComponent(provider);
  }

  public static void recipesComponent(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder(GTCEu.id("electric_motor_mv"))
        .inputItems(cableGtSingle, Copper, 2)
        .inputItems(rod, Aluminium, 2)
        .inputItems(rod, SteelMagnetic)
        .inputItems(wireGtDouble, Cupronickel, 4)
        .inputItems(ELECTRIC_MOTOR_LV, 1)
        .outputItems(ELECTRIC_MOTOR_MV)
        .duration(100).EUt(VA[LV]).save(provider);

//    ComponentAssemblyLineRecipes.recipeBuilder("compassline_electric_motor_lv")
//            .inputItems()


    ASSEMBLY_LINE_RECIPES.recipeBuilder(GTCEu.id("electric_motor_hv"))
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
        .outputItems(ELECTRIC_MOTOR_LuV)
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
        .duration(2400).EUt(VA[UV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "electric_piston_mv", ELECTRIC_PISTON_MV.asStack(), "PPP", "CRR", "CMG", 'P', new UnificationEntry(plate, Aluminium), 'C', new UnificationEntry(cableGtSingle, AnnealedCopper), 'R', new UnificationEntry(rod, Aluminium), 'G', new UnificationEntry(gearSmall, Aluminium), 'M', ELECTRIC_MOTOR_MV.asStack());

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
        .outputItems(ELECTRIC_PISTON_LUV)
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
        .duration(1800).EUt(VA[ZPM]).save(provider);

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
        .duration(2400).EUt(VA[UV]).save(provider);

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
        .duration(1800).EUt(VA[ZPM]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("robot_arm_luv")
        .inputItems(rodLong, HSSS, 4)
        .inputItems(gear, HSSS)
        .inputItems(gearSmall, HSSS, 3)
        .inputItems(ELECTRIC_MOTOR_LuV, 2)
        .inputItems(ELECTRIC_PISTON_LUV)
        .inputItems(CustomTags.LuV_CIRCUITS, 2)
        .inputItems(CustomTags.IV_CIRCUITS, 4)
        .inputItems(CustomTags.EV_CIRCUITS, 8)
        .inputItems(cableGtSingle, YttriumBariumCuprate, 6)
        .inputFluids(SolderingAlloy.getFluid(L * 4))
        .inputFluids(Lubricant.getFluid(250))
        .outputItems(ROBOT_ARM_LuV)
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
        .duration(1800).EUt(VA[ZPM]).save(provider);

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
        .duration(1800).EUt(VA[ZPM]).save(provider);

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
        .duration(1800).EUt(VA[ZPM]).save(provider);

    ASSEMBLY_LINE_RECIPES.recipeBuilder("component_assembly_line")
        .inputItems(ASSEMBLY_LINE, 16)
        .inputItems(CASING_GRATE.asStack(16))
        .inputItems(CASING_ASSEMBLY_CONTROL.asStack(32))
        .inputItems(ROBOT_ARM_UV, 16)
        .inputItems(CONVEYOR_MODULE_UV, 32)
        .inputItems(ELECTRIC_MOTOR_UHV, 32)
        .inputItems(pipeNormalFluid, Polybenzimidazole, 16)
        .inputItems(TagPrefix.plateDense, Iridium, 32)
        .inputItems(FLUID_SOLIDIFIER[7].asStack(16))
        .inputItems(CustomTags.UV_CIRCUITS, 16)
        .inputItems(CustomTags.ZPM_CIRCUITS, 20)
        .inputItems(CustomTags.LuV_CIRCUITS, 24)
        .inputFluids(CSolder.getFluid(1700))
        .inputFluids(Naquadria.getFluid(2304))
        .inputFluids(Lubricant.getFluid(10000))
        .outputItems(COMPONENT_ASSEMBLY_LINE)
        .duration(2400).EUt(VA[UHV]).save(provider);

  }
}
