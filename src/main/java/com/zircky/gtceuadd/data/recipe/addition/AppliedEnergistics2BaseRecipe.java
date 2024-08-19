package com.zircky.gtceuadd.data.recipe.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.machine.multiblock.CleanroomType;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.CIRCUIT_ASSEMBLER_RECIPES;

public class AppliedEnergistics2BaseRecipe {
  public static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, ItemStack input2, ItemStack input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }
  public static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, ItemStack input2, TagKey<Item> input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }
  public static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, UnificationEntry input1, ItemStack input2, TagKey<Item> input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }
  public static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, UnificationEntry input2, ItemStack input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }
  public static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, UnificationEntry input2, TagKey<Item> input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }
  public static void vanillaRecipeHelper(Consumer<FinishedRecipe> provider, String id, ItemStack result, ItemStack input1, ItemStack input2, UnificationEntry input3) {
    VanillaRecipeHelper.addShapedRecipe(provider, id, result,
        "UPU", "PIP", "UPU",
        'P', input1,
        'I', input2,
        'U', input3);
  }

  public static void circuitAssemblerRecipes(String id, TagKey<Item> input1, int count1, UnificationEntry input2, int count2, ItemStack input3, ItemStack input4,  ItemStack output, int duration, int eut, Consumer<FinishedRecipe> provider) {
    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(id)
        .inputItems(input1, count1)
        .inputItems(input2, count2)
        .inputItems(input3)
        .inputItems(input4)
        .circuitMeta(1)
        .outputItems(output)
        .duration(duration).EUt(eut).save(provider);
  }

  public static void circuitAssemblerRecipes(String id, TagKey<Item> input1, int count1, TagKey<Item> input2, int count2, ItemStack input3, ItemStack input4,  ItemStack output, int duration, int eut, Consumer<FinishedRecipe> provider) {
    CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder(id)
        .inputItems(input1, count1)
        .inputItems(input2, count2)
        .inputItems(input3)
        .inputItems(input4)
        .circuitMeta(1)
        .outputItems(output)
        .cleanroom(CleanroomType.CLEANROOM)
        .duration(duration).EUt(eut).save(provider);
  }
}