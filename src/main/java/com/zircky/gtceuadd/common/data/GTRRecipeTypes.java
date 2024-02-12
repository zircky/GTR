package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.api.registry.registrate.GTRegistrate;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.lowdragmc.lowdraglib.gui.texture.ProgressTexture;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;

public class GTRRecipeTypes {
  public static final String ELECTRIC = "electric";

  public static final GTRecipeType SCANNER_RECIPES = register("scanner", ELECTRIC).setMaxIOSize(2, 1, 0, 0).setEUIO(IO.IN)
      .setSlotOverlay(false, false, GuiTextures.PRESS_OVERLAY_1)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
      .setSteamProgressBar(GuiTextures.PROGRESS_BAR_ARROW_STEAM, ProgressTexture.FillDirection.LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.FURNACE);

  public static GTRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
    var recipeType = new GTRecipeType(GTCEuAdd.id(name), group, proxyRecipes);
    GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
    GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
    GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
    return recipeType;
  }

  public static void init(){}
}