package com.zircky.gtceuadd.data.recipe.addition.ae2.network;

import appeng.core.definitions.AEBlocks;
import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMachines;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static appeng.core.definitions.AEParts.STORAGE_MONITOR;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class Crafting {
  public static void init(Consumer<FinishedRecipe> provider) {
    crafting(provider);
  }

  public static void crafting(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_unit")
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(CustomTags.LV_CIRCUITS, 2)
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .circuitMeta(2)
        .outputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_accelerator")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR, 2))
        .inputItems(CustomTags.EV_CIRCUITS,2)
        .outputItems(new ItemStack(AEBlocks.CRAFTING_ACCELERATOR))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/cpu_crafting_monitor")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(STORAGE_MONITOR.asItem())
        .outputItems(new ItemStack(AEBlocks.CRAFTING_MONITOR))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/molecular_assembler")
        .inputItems(GTMachines.ASSEMBLER[5])
        .inputItems(new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide), 4)
        .inputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .inputItems(new ItemStack(AEItems.FORMATION_CORE))
        .circuitMeta(3)
        .inputFluids(GTMaterials.Glass.getFluid(288))
        .outputItems(new ItemStack(AEBlocks.MOLECULAR_ASSEMBLER))
        .duration(100).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/1k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_1K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_1K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/4k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_4K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_4K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/16k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_16K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_16K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/64k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_64K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_64K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/network/crafting/256k_cpu_crafting_storage")
        .inputItems(new ItemStack(AEBlocks.CRAFTING_UNIT))
        .inputItems(new ItemStack(AEItems.CELL_COMPONENT_256K))
        .outputItems(new ItemStack(AEBlocks.CRAFTING_STORAGE_256K))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "ae2/network/crafting/patterns_blank", new ItemStack(AEItems.BLANK_PATTERN),
        "GPG", "PCP", "ATA",
        'P', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.TitaniumTungstenCarbide),
        'G', new ItemStack(AEBlocks.QUARTZ_GLASS),
        'C', new UnificationEntry(TagPrefix.gem, GTMaterials.CertusQuartz),
        'A', new UnificationEntry(TagPrefix.plateDouble, GTMaterials.Aluminium),
        'T', new UnificationEntry(TagPrefix.plate, GTMaterials.TantalumCarbide));

  }


}
