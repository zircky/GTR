package com.zircky.gtceuadd.data.recipe.addition;

import com.gregtechceu.gtceu.api.GTValues;
import com.zircky.gtceuadd.data.recipe.GTRCraftingComponent;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;

import static com.zircky.gtceuadd.common.data.GTRRecipeTypes.COMPRESSED_BLOCKS_RECIPES;

public class AllTheCompressedRecipes {
  public static void allTheCompressedRecipes(Consumer<FinishedRecipe> provider) {
//    recipesCompressed("", );
  }


  private static void recipesCompressed(String regName, ItemStack input, int configuration, ItemStack output, Consumer<FinishedRecipe> provider) {
    COMPRESSED_BLOCKS_RECIPES.recipeBuilder(regName)
        .inputItems(input)
        .circuitMeta(configuration)
        .outputItems(output)
        .duration(20).EUt(GTValues.VA[GTValues.ZPM]).save(provider);
  }
}
