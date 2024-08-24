package com.zircky.gtceuadd.data.recipe.addition.ae2;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class Decorative {
  public static void init(Consumer<FinishedRecipe> provider) {
    decorative(provider);
  }

  public static void decorative(Consumer<FinishedRecipe> provider) {
    COMPRESSOR_RECIPES.recipeBuilder("ae2/decorative/quartz_block")
        .inputItems(new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz), 4)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_BLOCK))
        .duration(600).EUt(16).save(provider);

    ALLOY_SMELTER_RECIPES.recipeBuilder("ae2/decorative/quartz_glass_alloy")
        .inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.CertusQuartz), 5)
        .inputItems(TagPrefix.block, GTMaterials.Glass, 4)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_GLASS, 4))
        .duration(400).EUt(16).save(provider);

    BLAST_RECIPES.recipeBuilder("ae2/decorative/quartz_glass_blast")
        .inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.CertusQuartz), 5)
        .inputItems(TagPrefix.block, GTMaterials.Glass, 4)
        .outputItems(new ItemStack(AEBlocks.QUARTZ_GLASS, 4))
        .blastFurnaceTemp(1000)
        .duration(400).EUt(16).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/decorative/quartz_vibrant_glass")
        .inputItems(new ItemStack(AEBlocks.QUARTZ_GLASS))
        .inputFluids(GTMaterials.Glowstone.getFluid(1152))
        .outputItems(new ItemStack(AEBlocks.QUARTZ_VIBRANT_GLASS))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/decorative/quartz_fixture")
        .inputItems(new ItemStack(AEItems.CERTUS_QUARTZ_CRYSTAL_CHARGED))
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.Tantalum))
        .outputItems(new ItemStack(AEBlocks.QUARTZ_FIXTURE))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    COMPRESSOR_RECIPES.recipeBuilder("ae2/decorative/fluix_block")
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 4))
        .outputItems(new ItemStack(AEBlocks.FLUIX_BLOCK))
        .duration(600).EUt(16).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2:decorative/light_detector")
        .inputItems(new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz))
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.Aluminium))
        .outputItems(new ItemStack(AEBlocks.LIGHT_DETECTOR))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }
}
