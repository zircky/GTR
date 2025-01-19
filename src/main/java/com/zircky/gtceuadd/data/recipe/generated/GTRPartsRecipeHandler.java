package com.zircky.gtceuadd.data.recipe.generated;

import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.DustProperty;
import com.gregtechceu.gtceu.api.data.chemical.material.properties.PropertyKey;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.IS_MAGNETIC;
import static com.gregtechceu.gtceu.api.data.tag.TagPrefix.*;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.BENDER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.COMPRESSOR_RECIPES;
import static com.zircky.gtceuadd.api.data.tag.GTRTagPrefix.*;
import static com.zircky.gtceuadd.common.data.GTRRecipeTypes.NEUTRONIUM_COMPRESSED_RECIPES;


public class GTRPartsRecipeHandler {
  private GTRPartsRecipeHandler() {}

  public static void init(Consumer<FinishedRecipe> provider) {
    plateTriple.executeHandler(provider, PropertyKey.DUST, GTRPartsRecipeHandler::processPlateTriple);
    plateQuadruple.executeHandler(provider, PropertyKey.DUST, GTRPartsRecipeHandler::processPlateQuadruple);
    plateQuintuple.executeHandler(provider, PropertyKey.DUST, GTRPartsRecipeHandler::processPlateQuintuple);
    superdense.executeHandler(provider, PropertyKey.DUST, GTRPartsRecipeHandler::processPlateSuperdense);
    singularity.executeHandler(provider, PropertyKey.DUST, GTRPartsRecipeHandler::processSingularity);
  }

  private static void processPlateTriple(TagPrefix tagPrefix, Material material, DustProperty property, Consumer<FinishedRecipe> provider) {
    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_plate_to_triple_plate")
        .inputItems(plate, material, 3)
        .circuitMeta(3)
        .outputItems(tagPrefix, magMaterial)
        .duration((int) Math.max(material.getMass() * 3L, 1L))
        .EUt(96)
        .save(provider);

    if (material.hasProperty(PropertyKey.INGOT)) {
      BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_triple_plate")
          .inputItems(ingot, material, 3)
          .circuitMeta(3)
          .outputItems(tagPrefix, magMaterial)
          .duration((int) Math.max(material.getMass() * 3L, 1L))
          .EUt(96)
          .save(provider);
    }
  }
  
  private static void processPlateQuadruple(TagPrefix tagPrefix, Material material, DustProperty property, Consumer<FinishedRecipe> provider) {
    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_plate_to_quadruple_plate")
        .inputItems(plate, material, 4)
        .circuitMeta(4)
        .outputItems(tagPrefix, magMaterial)
        .duration((int) Math.max(material.getMass() * 4L, 1L))
        .EUt(96)
        .save(provider);

    if (material.hasProperty(PropertyKey.INGOT)) {
      BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_quadruple_plate")
          .inputItems(ingot, material, 4)
          .circuitMeta(4)
          .outputItems(tagPrefix, magMaterial)
          .duration((int) Math.max(material.getMass() * 4L, 1L))
          .EUt(96)
          .save(provider);
    }
  }

  private static void processPlateQuintuple(TagPrefix tagPrefix, Material material, DustProperty property, Consumer<FinishedRecipe> provider) {
    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_plate_to_quintuple_plate")
        .inputItems(plate, material, 5)
        .circuitMeta(5)
        .outputItems(tagPrefix, magMaterial)
        .duration((int) Math.max(material.getMass() * 5L, 1L))
        .EUt(96)
        .save(provider);

    if (material.hasProperty(PropertyKey.INGOT)) {
      BENDER_RECIPES.recipeBuilder("bend_" + material.getName() + "_ingot_to_quintuple_plate")
          .inputItems(ingot, material, 5)
          .circuitMeta(5)
          .outputItems(tagPrefix, magMaterial)
          .duration((int) Math.max(material.getMass() * 5L, 1L))
          .EUt(96)
          .save(provider);
    }
  }

  private static void processPlateSuperdense(TagPrefix tagPrefix, Material material, DustProperty property, Consumer<FinishedRecipe> provider) {
    var magMaterial = material.hasFlag(IS_MAGNETIC) ?
        material.getProperty(PropertyKey.INGOT).getMacerateInto() : material;
    COMPRESSOR_RECIPES.recipeBuilder("compressor_" + material.getName() + "_plate_to_superdense_plate")
        .inputItems(plate, material, 64)
        .outputItems(tagPrefix, magMaterial)
        .duration((int) Math.max(material.getMass() * 64L, 1L))
        .EUt(GTValues.UIV)
        .save(provider);
  }

  private static void processSingularity(TagPrefix tagPrefix, Material material, DustProperty property, Consumer<FinishedRecipe> provider) {
    if (block != null) {
      NEUTRONIUM_COMPRESSED_RECIPES.recipeBuilder("neutron_" + material.getName() + "_block_to_singularity")
          .inputItems(block, material, 15000)
          .outputItems(tagPrefix, material)
          .duration(20 * 60 * 10)
          .EUt(GTValues.V[GTValues.UEV])
          .save(provider);
    }
  }


}
