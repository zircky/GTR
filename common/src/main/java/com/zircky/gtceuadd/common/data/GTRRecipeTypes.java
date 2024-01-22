package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.api.registries.GTRRegistries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;
import static com.lowdragmc.lowdraglib.gui.texture.ProgressTexture.FillDirection.LEFT_TO_RIGHT;

public class GTRRecipeTypes {

  public final static GTRecipeType COMPONENT_ASSEMBLY_LINE_RECIPE = register("assembly_line", MULTIBLOCK)
      .setMaxIOSize(16, 1, 4, 0).setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER);

  public static GTRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
    var recipeType = new GTRecipeType(GTCEuAdd.id(name), group, proxyRecipes);
    GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
    GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
    GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
    return recipeType;
  }

  public static void init() {

  }

}
