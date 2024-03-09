package com.zircky.gtceuadd.data.recipe.addition;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.*;

public class AppliedEnergistics2Recipe {
  public static void init(Consumer<FinishedRecipe> provider) {
    AE2Recipe(provider);
  }

  public static void AE2Recipe(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/blocks/inscribers", new ItemStack(AEBlocks.INSCRIBER), "FPF", "CMC", "FPF", 'F', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 'P', new ItemStack(GTItems.ELECTRIC_PISTON_EV), 'M', GTMachines.FORMING_PRESS[4], 'C', new ItemStack(GTItems.VOLTAGE_COIL_MV));
    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/wireless_access_point", new ItemStack(AEBlocks.WIRELESS_ACCESS_POINT), " W ", "SCS", "dGw", 'R', 'G', AEParts.GLASS_CABLE, 'W', new ItemStack(AEItems.WIRELESS_RECEIVER), 'C', new ItemStack(AEItems.CALCULATION_PROCESSOR), 'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Titanium));

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
        .inputItems(new UnificationEntry(TagPrefix.dust, GTMaterials.Glowstone), 8)
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

    CENTRIFUGE_RECIPES.recipeBuilder(GTCEuAdd.id("ae2/sky_dust_x1"))
        .inputItems(new ItemStack(AEItems.SKY_DUST))
        .circuitMeta(1)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.BasalticMineralSand, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Olivine, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Obsidian, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Basalt, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.Flint, 1, 2000, 0)
        .chancedOutput(TagPrefix.dustSmall, GTMaterials.RareEarth, 1, 2000, 0)
        .duration(64).EUt(GTValues.VA[GTValues.LV]).save(provider);

    CENTRIFUGE_RECIPES.recipeBuilder(GTCEuAdd.id("ae2/sky_dust_x9"))
        .inputItems(new ItemStack(AEItems.SKY_DUST, 18))
        .circuitMeta(2)
        .chancedOutput(TagPrefix.dust, GTMaterials.BasalticMineralSand, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Olivine, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Obsidian, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Basalt, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.Flint, 1, 9000, 0)
        .chancedOutput(TagPrefix.dust, GTMaterials.RareEarth, 1, 9000, 0)
        .duration(64).EUt(GTValues.VA[GTValues.MV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/misc/chests_sky_stone")
        .inputItems(new ItemStack(AEBlocks.SKY_STONE_BLOCK, 8))
        .inputItems(CustomTags.TAG_WOODEN_CHESTS)
        .outputItems(new ItemStack(AEBlocks.SKY_STONE_CHEST))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/misc/chests_smooth_sky_stone")
        .inputItems(new ItemStack(AEBlocks.SMOOTH_SKY_STONE_BLOCK, 8))
        .inputItems(CustomTags.TAG_WOODEN_CHESTS)
        .outputItems(new ItemStack(AEBlocks.SMOOTH_SKY_STONE_CHEST))
        .duration(200).EUt(GTValues.VA[GTValues.LV]).save(provider);


  }
}
