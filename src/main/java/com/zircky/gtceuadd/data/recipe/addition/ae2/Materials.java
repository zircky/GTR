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

public class Materials {
  public static void init(Consumer<FinishedRecipe> provider) {
    materials(provider);
  }

  public static void materials(Consumer<FinishedRecipe> provider) {
    ASSEMBLER_RECIPES.recipeBuilder("ae2/materials/annihilationcore")
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 4))
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.NetherQuartz), 4)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 2))
        .outputItems(new ItemStack(AEItems.ANNIHILATION_CORE))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);

    ASSEMBLER_RECIPES.recipeBuilder("ae2/materials/formationcore")
        .inputItems(new ItemStack(AEItems.LOGIC_PROCESSOR, 4))
        .inputItems(new UnificationEntry(TagPrefix.rod, GTMaterials.CertusQuartz), 4)
        .inputItems(new ItemStack(AEItems.FLUIX_CRYSTAL, 2))
        .outputItems(new ItemStack(AEItems.FORMATION_CORE))
        .duration(400).EUt(GTValues.VA[GTValues.EV]).save(provider);
  }
}
