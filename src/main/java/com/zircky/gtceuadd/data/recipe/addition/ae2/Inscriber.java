package com.zircky.gtceuadd.data.recipe.addition.ae2;

import appeng.core.definitions.AEItems;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.FORMING_PRESS_RECIPES;

public class Inscriber {
  public static void init(Consumer<FinishedRecipe> provider) {
    inscriber(provider);
  }

  public static void inscriber(Consumer<FinishedRecipe> provider) {
    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor_print")
        .notConsumable(AEItems.CALCULATION_PROCESSOR_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.CertusQuartz))
        .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor_print")
        .notConsumable(AEItems.ENGINEERING_PROCESSOR_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.Diamond))
        .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/logic_processor_print")
        .notConsumable(AEItems.LOGIC_PROCESSOR_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.RoseGold))
        .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    FORMING_PRESS_RECIPES.recipeBuilder("ae2/inscriber/silicon_print")
        .notConsumable(AEItems.SILICON_PRESS.asItem())
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.Silicon))
        .outputItems(new ItemStack(AEItems.SILICON_PRINT.asItem()))
        .duration(250).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/calculation_processor")
        .inputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR_PRINT))
        .inputItems(new ItemStack(AEItems.SILICON_PRINT))
        .inputFluids(GTMaterials.Redstone.getFluid(144))
        .outputItems(new ItemStack(AEItems.CALCULATION_PROCESSOR))
        .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/engineering_processor")
        .inputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR_PRINT))
        .inputItems(new ItemStack(AEItems.SILICON_PRINT))
        .inputFluids(GTMaterials.Redstone.getFluid(144))
        .outputItems(new ItemStack(AEItems.ENGINEERING_PROCESSOR))
        .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/inscriber/logic_processor")
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR_PRINT))
        .inputItems(new ItemStack(AEItems.SILICON_PRINT))
        .inputFluids(GTMaterials.Redstone.getFluid(144))
        .outputItems(new ItemStack(AEItems.LOGIC_PROCESSOR))
        .duration(300).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }
}