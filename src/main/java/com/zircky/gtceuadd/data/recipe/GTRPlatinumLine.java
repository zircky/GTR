package com.zircky.gtceuadd.data.recipe;

import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.common.data.GTRMaterials;
import net.minecraft.data.recipes.FinishedRecipe;

import static com.gregtechceu.gtceu.api.GTValues.*;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;
import static com.gregtechceu.gtceu.common.data.GTMaterials.FormicAcid;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;
import static com.zircky.gtceuadd.common.data.GTRMaterials.*;

import java.util.function.Consumer;

public class GTRPlatinumLine {
  public static void init(Consumer<FinishedRecipe> provider) {
    recipesPlatinumLin(provider);
  }

  public static void recipesPlatinumLin(Consumer<FinishedRecipe> provider) {
    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_platinum_metallic_powder"))
        .inputItems(dust, GTRMaterials.PalladiumMetallicPowder)
        .circuitMeta(1)
        .inputFluids(AquaRegia.getFluid(1000))
        .outputItems(dustSmall, GTRMaterials.PlatinumResidue)
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(1000))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_platinum_metallic_powder_9x"))
        .inputItems(dust, GTRMaterials.PalladiumMetallicPowder, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(9000))
        .outputItems(dust, GTRMaterials.PlatinumResidue)
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(9000))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_bornite_for_platline"))
        .inputItems(crushedPurified, Bornite, 9)
        .inputItems(dust, GTRMaterials.PalladiumMetallicPowder, 9)
        .inputFluids(AquaRegia.getFluid(10350))
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(10350))
        .duration(2250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_chalcopyrite_for_platline"))
        .inputItems(crushedPurified, Chalcopyrite, 9)
        .inputItems(dust, GTRMaterials.PlatinumMetallicPowder, 9)
        .inputFluids(AquaRegia.getFluid(10000))
        .outputItems(dust, GTRMaterials.PlatinumResidue)
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(10000))
        .duration(2250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_cooperite_for_platline"))
        .inputItems(crushedPurified, Cooperite, 9)
        .inputItems(dust, GTRMaterials.PlatinumMetallicPowder, 9)
        .inputFluids(AquaRegia.getFluid(10000))
        .outputItems(dust, GTRMaterials.PlatinumResidue)
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(10000))
        .duration(2250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_tetrahedrite_for_platline"))
        .inputItems(crushedPurified, Tetrahedrite, 9)
        .inputItems(dust, GTRMaterials.PlatinumMetallicPowder)
        .inputFluids(AquaRegia.getFluid(10000))
        .outputItems(dust, GTRMaterials.PlatinumResidue)
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(10000))
        .duration(2250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("dissolve_pentlandite_for_platline"))
        .inputItems(crushedPurified, Pentlandite, 9)
        .inputItems(dust, GTRMaterials.PlatinumMetallicPowder, 9)
        .inputFluids(AquaRegia.getFluid(10000))
        .outputItems(dust, GTRMaterials.PlatinumResidue)
        .outputFluids(GTRMaterials.PlatinumConcentrate.getFluid(10000))
        .duration(2250).EUt(VA[LV]).save(provider);


    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("tiny_platinum_dusts"))
        .inputFluids(GTRMaterials.PlatinumConcentrate.getFluid(2000))
        .inputFluids(AmmoniumChloride.getFluid(400))
        .circuitMeta(1)
        .outputItems(dustTiny, GTRMaterials.PlatinumSalt, 16)
        .outputItems(dustTiny, GTRMaterials.RepercipitatedPlatinum, 4)
        .outputFluids(GTRMaterials.PalladiumEnrichedAmmonia.getFluid(400))
        .outputFluids(NitrogenDioxide.getFluid(1000))
        .outputFluids(DilutedHydrochloricAcid.getFluid(1000))
        .duration(1200).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("large_platinum_dusts"))
        .inputFluids(GTRMaterials.PlatinumConcentrate.getFluid(18000))
        .inputFluids(AmmoniumChloride.getFluid(3600))
        .circuitMeta(2)
        .outputItems(dust, GTRMaterials.PlatinumSalt, 16)
        .outputItems(dust, GTRMaterials.RepercipitatedPlatinum, 4)
        .outputFluids(GTRMaterials.PalladiumEnrichedAmmonia.getFluid(3600))
        .outputFluids(NitrogenDioxide.getFluid(9000))
        .outputFluids(DilutedHydrochloricAcid.getFluid(9000))
        .duration(1400).EUt(VA[HV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("palladium_metallic_powder_conversion"))
        .inputItems(dust, GTRMaterials.PalladiumMetallicPowder)
        .circuitMeta(1)
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(GTRMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
        .duration(250).EUt(VA[LV]).save(provider);


    CHEMICAL_RECIPES.recipeBuilder("raw_platinum_separation")
        .inputItems(dust, GTRMaterials.RepercipitatedPlatinum, 4)
        .inputItems(dust, Calcium, 1)
        .outputItems(dust, Platinum, 2)
        .outputItems(dust, CalciumChloride, 3)
        .duration(30).EUt(VA[LV]).save(provider);


    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("low_yeild_palladium_salt"))
        .inputFluids(GTRMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
        .circuitMeta(2)
        .outputItems(dust, GTRMaterials.PalladiumSalt, 1)
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("tiny_palladium_dusts"))
        .inputItems(dust, GTRMaterials.PalladiumMetallicPowder, 1)
        .inputFluids(GTRMaterials.PalladiumEnrichedAmmonia.getFluid(1000))
        .circuitMeta(1)
        .outputItems(dustTiny, GTRMaterials.PalladiumSalt, 16)
        .outputItems(dustTiny, GTRMaterials.RepercipitatedPalladium, 4)
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("large_palladium_dusts"))
        .inputItems(dust, GTRMaterials.PalladiumMetallicPowder, 9)
        .inputFluids(GTRMaterials.PalladiumEnrichedAmmonia.getFluid(9000))
        .circuitMeta(9)
        .outputItems(dust, GTRMaterials.PalladiumSalt, 16)
        .outputItems(dust, GTRMaterials.RepercipitatedPalladium, 4)
        .duration(2250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("raw_palladium_separation")
        .inputItems(dust, GTRMaterials.RepercipitatedPalladium, 4)
        .inputFluids(GTRMaterials.FormicAcid.getFluid(4000))
        .outputItems(dust, Palladium, 2)
        .outputFluids(Ammonia.getFluid(4000))
        .outputFluids(Ethylene.getFluid(1000))
        .duration(250).EUt(VA[LV]).save(provider);

//    SIFTER_RECIPES.recipeBuilder("1")
//        .inputItems("")


    BLAST_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_sulfate"))
        .inputItems(dust, GTRMaterials.PlatinumResidue, 1)
        .circuitMeta(2)
        .inputFluids(PotassiumDisulfate.getFluid(360))
        .outputItems(dust, LeachResidue)
        .outputFluids(RhodiumSulfate.getFluid(360))
        .blastFurnaceTemp(775)
        .duration(200).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_sulfate_to_solution"))
        .circuitMeta(1)
        .inputFluids(Water.getFluid(10000))
        .inputFluids(RhodiumSulfate.getFluid(11000))
        .outputItems(dustTiny, LeachResidue, 10)
        .outputFluids(Potassium.getFluid(2000))
        .outputFluids(RhodiumSulfateSolution.getFluid(11000))
        .duration(300).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("bulk_rhodium_sulfate_to_solution"))
        .circuitMeta(3)
        .inputFluids(Water.getFluid(36000))
        .inputFluids(RhodiumSulfate.getFluid(39600))
        .outputItems(dust, LeachResidue, 4)
        .outputFluids(Potassium.getFluid(7200))
        .outputFluids(RhodiumSulfateSolution.getFluid(39600))
        .duration(1200).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("crude_rhodium_metallic_powder"))
        .inputItems(dust, Zinc, 1)
        .inputFluids(RhodiumSulfateSolution.getFluid(1000))
        .outputItems(dust, ZincSulfate, 6)
        .outputItems(dust, CrudeRhodiumMetal, 1)
        .duration(300).EUt(VA[LV]).save(provider);

    BLAST_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_salt_ebf"))
        .inputItems(dust, CrudeRhodiumMetal, 1)
        .inputItems(dust, Salt, 1)
        .inputFluids(Chlorine.getFluid(1000))
        .outputItems(dust, RhodiumSalt, 3)
        .blastFurnaceTemp(600)
        .duration(200).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_salt_solution"))
        .inputItems(dust, RhodiumSalt, 1)
        .inputFluids(Water.getFluid(200))
        .outputFluids(RhodiumSaltSolution.getFluid(200))
        .duration(30).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_nitrate"))
        .inputItems(dust, SodiumNitrate, 5)
        .inputFluids(RhodiumSaltSolution.getFluid(1000))
        .circuitMeta(1)
        .outputItems(dust, RhodiumNitrate, 1)
        .outputItems(dust, Salt, 2)
        .duration(300).EUt(VA[LV]).save(provider);

    SIFTER_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_filter_cake"))
        .inputItems(dust, RhodiumNitrate, 1)
        .chancedOutput(dust, RhodiumFilterCake, 1, 1000, 0)
        .chancedOutput(dust, RhodiumFilterCake, 1, 1000, 0)
        .chancedOutput(dust, RhodiumFilterCake, 1, 1000, 0)
        .chancedOutput(dust, RhodiumFilterCake, 1, 1000, 0)
        .chancedOutput(dust, RhodiumFilterCake, 1, 1000, 0)
        .chancedOutput(dust, RhodiumFilterCake, 1, 1500, 0)
        .duration(300).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("sodium_nitrate"))
        .inputItems(dust, Sodium, 1)
        .inputFluids(NitricAcid.getFluid(1000))
        .outputItems(dust, SodiumNitrate, 5)
        .outputFluids(Hydrogen.getFluid(1000))
        .duration(8).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("cobalt_II_Hydroxide_sodium_nitrate"))
        .circuitMeta(1)
        .inputItems(dust, CobaltIINitrate, 9)
        .inputItems(dust, SodiumHydroxide, 6)
        .outputItems(dust, CobaltIIHydroxide, 5)
        .outputItems(dust, SodiumNitrate, 10)
        .duration(8).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("thorium_hydroxid_sodium_nitrate"))
        .circuitMeta(1)
        .inputItems(dust, SodiumHydroxide, 12)
        .inputFluids(ThoriumNitrate.getFluid(1000))
        .outputItems(dust, SodiumNitrate, 20)
        .outputItems(dust, ThoriumHydroxide, 9)
        .duration(8).EUt(VA[MV]).save(provider);

    MIXER_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_salt_solution"))
        .inputItems(dust, RhodiumSalt, 1)
        .inputFluids(Water.getFluid(200))
        .outputFluids(RhodiumSaltSolution.getFluid(200))
        .duration(30).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("potassium_disulfate"))
        .inputItems(dust, Potassium, 2)
        .inputItems(dust, Sulfur, 2)
        .inputFluids(Oxygen.getFluid(7000))
        .outputItems(dust, PotassiumDisulfate, 11)
        .duration(42).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("ammonium_chloride"))
        .circuitMeta(1)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .inputFluids(Ammonia.getFluid(1000))
        .outputFluids(AmmoniumChloride.getFluid(1000))
        .duration(15).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("ammonium_chloride_9x"))
        .circuitMeta(9)
        .inputFluids(HydrochloricAcid.getFluid(64000))
        .inputFluids(Ammonia.getFluid(64000))
        .outputFluids(AmmoniumChloride.getFluid(64000))
        .duration(60).EUt(VA[HV]).save(provider);

    MIXER_RECIPES.recipeBuilder(GTCEuAdd.id("rhodium_filter_cake_solution"))
        .inputItems(dust, RhodiumFilterCake, 1)
        .inputFluids(Water.getFluid(1000))
        .outputFluids(RhodiumFilterCakeSolution.getFluid(1000))
        .duration(300).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("reprecipitated_rhodium"))
        .circuitMeta(2)
        .inputFluids(RhodiumFilterCakeSolution.getFluid(1000))
        .circuitMeta(2)
        .outputItems(dust, ReprecipitatedRhodium, 1)
        .duration(300).EUt(VA[LV]).save(provider);

    // Rhodium Dust Output <------------ Third Platline Dust also holy shit

    CHEMICAL_RECIPES.recipeBuilder("rhodium_dust")
        .inputItems(dust, ReprecipitatedRhodium, 1)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputItems(dust, Rhodium, 1)
        .outputFluids(Chlorine.getFluid(1000))
        .outputFluids(Ammonia.getFluid(1000))
        .duration(300).EUt(VA[LV]).save(provider);

    // Ruthenium time :skull:
    BLAST_RECIPES.recipeBuilder("rarest_metal_residue")
        .inputItems(dust, LeachResidue, 10)
        .inputItems(dust, Saltpeter, 10)
        .inputFluids(SaltWater.getFluid(1000))
        .outputItems(dust, SodiumRuthenate, 3)
        .outputItems(dust, RarestMetalResidue, 6)
        .outputFluids(Steam.getFluid(1000))
        .blastFurnaceTemp(775)
        .duration(200).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide")
        .inputItems(dust, SodiumRuthenate, 6)
        .inputFluids(Chlorine.getFluid(3000))
        .outputFluids(RutheniumTetroxideSolution.getFluid(9000))
        .duration(300).EUt(VA[LV]).save(provider);

    FLUID_HEATER_RECIPES.recipeBuilder(GTCEuAdd.id("hot_ruthenium_tetroxide"))
        .inputFluids(RutheniumTetroxideSolution.getFluid(50))
        .outputFluids(HotRutheniumTetroxideSolution.getFluid(50))
        .duration(18).EUt(VA[HV]).save(provider);

//    CRACKING_RECIPES.recipeBuilder(GTCEuAdd.id("hot_ruthenium_tetroxide"))
//        .inputFluids(RutheniumTetroxideSolution.getFluid(50))
//        .outputFluids(HotRutheniumTetroxideSolution.getFluid(50))
//        .duration(18).EUt(VA[HV]).save(provider);

    DISTILLATION_RECIPES.recipeBuilder(GTCEuAdd.id("hot_ruthenium_tetroxide_distill"))
        .inputFluids(HotRutheniumTetroxideSolution.getFluid(9000))
        .outputItems(dust, Salt, 6)
        .outputFluids(RutheniumTetroxide.getFluid(7200))
        .outputFluids(Water.getFluid(1000))
        .duration(1500).EUt(VA[HV]).save(provider);

    // Ruthenium Completion <----------  Fourth Platinum Line output (im still sane)

    FLUID_SOLIDFICATION_RECIPES.recipeBuilder(GTCEuAdd.id("ruthenium_tetroxide_dust"))
        .circuitMeta(1)
        .inputFluids(RutheniumTetroxide.getFluid(1000))
        .outputItems(dust, RutheniumTetroxide)
        .duration(33).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("ruthenium_tetroxide_separation")
        .inputItems(dust, RutheniumTetroxide,1)
        .inputFluids(HydrochloricAcid.getFluid(6000))
        .outputItems(dust, Ruthenium,1)
        .outputFluids(Water.getFluid(2000))
        .outputFluids(Chlorine.getFluid(6000))
        .duration(300).EUt(VA[LV]).save(provider);

    // Osmium Processing Time!

    BLAST_RECIPES.recipeBuilder(GTCEuAdd.id("rarest_metal_residue_ebf"))
        .inputItems(dust, RarestMetalResidue, 2)
        .circuitMeta(2)
        .inputFluids(HydrochloricAcid.getFluid(500))
        .outputItems(dust, IridiumMetalResidue, 1)
        .outputFluids(AcidicOsmiumSolution.getFluid(1000))
        .blastFurnaceTemp(775)
        .duration(100).EUt(VA[MV]).save(provider);

    DISTILLATION_RECIPES.recipeBuilder("acidic_osmium_solution_separation")
        .inputFluids(AcidicOsmiumSolution.getFluid(1000))
        .outputFluids(OsmiumSolution.getFluid(100))
        .outputFluids(Water.getFluid(900))
        .duration(150).EUt(VA[IV]).save(provider);

    // Osmium Completion <---- Fifth platline output

    CHEMICAL_RECIPES.recipeBuilder("osmium_tetroxide_separation")
        .inputFluids(HydrochloricAcid.getFluid(6000))
        .inputFluids(OsmiumSolution.getFluid(1000))
        .outputItems(dust, Osmium, 1)
        .outputFluids(Water.getFluid(2000))
        .outputFluids(Chlorine.getFluid(7000))
        .duration(300).EUt(VA[LV]).save(provider);

    // Iridium Processing!

    BLAST_RECIPES.recipeBuilder(GTCEuAdd.id("iridium_metal_residue_process"))
        .inputItems(dust, IridiumMetalResidue, 1)
        .circuitMeta(1)
        .outputItems(dust, SludgeDustResidue, 1)
        .outputItems(dust, IridiumDioxide, 1)
        .blastFurnaceTemp(775)
        .duration(200).EUt(VA[MV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("iridium_dioxide_dissolving"))
        .inputItems(dust, IridiumDioxide, 1)
        .inputFluids(HydrochloricAcid.getFluid(1000))
        .outputFluids(AcidicIridiumSolution.getFluid(1000))
        .duration(300).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("iridium_chloride"))
        .inputFluids(AmmoniumChloride.getFluid(3000))
        .inputFluids(AcidicIridiumSolution.getFluid(1000))
        .outputItems(dust, IridiumChloride, 1)
        .outputFluids(Ammonia.getFluid(3000))
        .duration(300).EUt(VA[LV]).save(provider);

    BLAST_RECIPES.recipeBuilder(GTCEuAdd.id("refined_platlinum_salt_to_metallic"))
        .inputItems(dust, RefinedPlatlinumSalt, 1)
        .circuitMeta(1)
        .outputItems(dust, PlatinumMetallicPowder, 1)
        .outputFluids(Chlorine.getFluid(87))
        .blastFurnaceTemp(900)
        .duration(200).EUt(VA[MV]).save(provider);

    // Iridium Completion <-------- Holy shit Platline Finally completed

    CHEMICAL_RECIPES.recipeBuilder("iridium_chloride_separation")
        .inputItems(dust, IridiumChloride, 1)
        .inputItems(dust, Calcium, 1)
        .outputItems(dust, MetallicSludgeResidue, 1)
        .outputItems(dust, Iridium, 1)
        .outputFluids(CalciumChloride.getFluid(3000))
        .duration(300).EUt(VA[EV]).save(provider);



    // Remaining Sifting Recipes
    SIFTER_RECIPES.recipeBuilder(GTCEuAdd.id("refined_platinum_salt"))
        .inputItems(dust, PlatinumSalt, 1)
        .chancedOutput(dust, RefinedPlatlinumSalt, 1000, 0)
        .chancedOutput(dust, RefinedPlatlinumSalt, 1000, 0)
        .chancedOutput(dust, RefinedPlatlinumSalt, 1000, 0)
        .chancedOutput(dust, RefinedPlatlinumSalt, 1000, 0)
        .chancedOutput(dust, RefinedPlatlinumSalt, 1000, 0)
        .chancedOutput(dust, RefinedPlatlinumSalt, 1500, 0)
        .duration(600).EUt(VA[LV]).save(provider);

    SIFTER_RECIPES.recipeBuilder(GTCEuAdd.id("salt_to_metallic_powder_palladium"))
        .inputItems(dust, PalladiumSalt, 1)
        .chancedOutput(dust, PalladiumMetallicPowder, 1000, 0)
        .chancedOutput(dust, PalladiumMetallicPowder, 1000, 0)
        .chancedOutput(dust, PalladiumMetallicPowder, 1000, 0)
        .chancedOutput(dust, PalladiumMetallicPowder, 1000, 0)
        .chancedOutput(dust, PalladiumMetallicPowder, 1000, 0)
        .chancedOutput(dust, PalladiumMetallicPowder, 1500, 0)
        .duration(600).EUt(VA[LV]).save(provider);


    // The Extra Stuff Overwriting Progression ETC


    ELECTROLYZER_RECIPES.recipeBuilder("raw_platinum_separation")
        .inputItems(dust, PlatinumRaw, 3)
        .outputItems(dust, PlatinumMetallicPowder, 1)
        .outputFluids(Chlorine.getFluid(800))
        .duration(2400).EUt(VA[MV]).save(provider);

    ELECTROLYZER_RECIPES.recipeBuilder("decomposition_electrolyzing_cooperite")
        .inputItems(dust, Cooperite, 6)
        .outputItems(dust, PlatinumMetallicPowder, 3)
        .outputItems(dust, Nickel, 1)
        .outputItems(dust, Sulfur, 1)
        .outputItems(dust, PalladiumSalt, 1)
        .duration(1200).EUt(VA[MV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_tetrahedrite")
        .inputItems(crushedPurified, Tetrahedrite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_bornite")
        .inputItems(crushedPurified, Bornite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcopyrite")
        .inputItems(crushedPurified, Chalcopyrite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_pentlandite")
        .inputItems(crushedPurified, Pentlandite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    // ?
    LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_cooperite")
        .inputItems(crushedPurified, Cooperite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(2700))
        .duration(250).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcocite")
        .inputItems(crushedPurified, Chalcocite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);


    CHEMICAL_RECIPES.recipeBuilder("pgs_from_tetrahedrite")
        .inputItems(crushedPurified, Tetrahedrite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pgs_from_bornite")
        .inputItems(crushedPurified, Bornite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcopyrite")
        .inputItems(crushedPurified, Chalcopyrite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pgs_from_pentlandite")
        .inputItems(crushedPurified, Pentlandite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pgs_from_cooperite")
        .inputItems(crushedPurified, Cooperite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(2700))
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("pgs_from_chalcocite")
        .inputItems(crushedPurified, Chalcocite, 9)
        .circuitMeta(9)
        .inputFluids(AquaRegia.getFluid(1350))
        .outputFluids(PlatinumConcentrate.getFluid(1350))
        .duration(250).EUt(VA[LV]).save(provider);


    CHEMICAL_RECIPES.recipeBuilder("inert_metal_mixture_separation")
        .inputItems(dust, InertMetalMixture, 1)
        .outputItems(dust, SodiumRuthenate, 1)
        .duration(250).EUt(VA[LV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("inert_metal_mixture_separation")
        .inputItems(dust, InertMetalMixture, 1)
        .outputItems(dust, SodiumRuthenate, 1)
        .duration(250).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder("rarest_metal_mixture_separation")
        .inputItems(dust, RarestMetalMixture, 1)
        .outputItems(dust, IridiumDioxide, 1)
        .duration(250).EUt(VA[UV]).save(provider);

    LARGE_CHEMICAL_RECIPES.recipeBuilder("rarest_metal_mixture_separation")
        .inputItems(dust, RarestMetalMixture, 1)
        .outputItems(dust, IridiumDioxide, 1)
        .duration(250).EUt(VA[UV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder("iridium_metal_residue_separation")
        .inputItems(dust, IridiumMetalResidue, 1)
        .outputItems(dust, PlatinumSludgeResidue, 1)
        .duration(250).EUt(VA[LV]).save(provider);

    // Formic Acid
    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("sodium_formate"))
        .inputItems(dust, SodiumHydroxide, 3)
        .inputFluids(CarbonMonoxide.getFluid(1000))
        .outputFluids(SodiumFormate.getFluid(1000))
        .duration(15).EUt(VA[LV]).save(provider);

    CHEMICAL_RECIPES.recipeBuilder(GTCEuAdd.id("formic_acid"))
        .inputFluids(SodiumFormate.getFluid(2000))
        .inputFluids(SulfuricAcid.getFluid(1000))
        .circuitMeta(1)
        .outputFluids(FormicAcid.getFluid(2000))
        .outputItems(dust, SodiumSulfate, 7)
        .duration(15).EUt(VA[LV]).save(provider);

    // Nickel Replacement

    CHEMICAL_BATH_RECIPES.recipeBuilder("bathe_nickel_crushed_ore_to_purified_ore")
        .inputItems(crushed, Nickel, 1)
        .inputFluids(Mercury.getFluid(100))
        .outputItems(crushedPurified, Nickel, 1)
        .chancedOutput(dust, PlatinumMetallicPowder, 1, 7000, 580)
        .chancedOutput(dust, Stone, 1, 4000, 650)
        .duration(600).EUt(VA[LV]).save(provider);
  }
}
