package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.capability.recipe.IO;
import com.gregtechceu.gtceu.api.gui.GuiTextures;
import com.gregtechceu.gtceu.api.recipe.GTRecipeSerializer;
import com.gregtechceu.gtceu.api.recipe.GTRecipeType;
import com.gregtechceu.gtceu.api.registry.GTRegistries;
import com.gregtechceu.gtceu.common.data.GTSoundEntries;
import com.gregtechceu.gtceu.utils.ResearchManager;
import com.zircky.gtceuadd.GTCEuAdd;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeType;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.GENERATOR;
import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.MULTIBLOCK;
import static com.lowdragmc.lowdraglib.gui.texture.ProgressTexture.FillDirection.LEFT_TO_RIGHT;

public class GTRRecipeTypes {
  public static final String ELECTRIC = "electric";

  public static final GTRecipeType NEUTRONIUM_COMPRESSED_RECIPES = register("compressed_blocks", MULTIBLOCK).setMaxIOSize(2, 2, 2, 2).setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.COMPRESSOR);


  public static final GTRecipeType CIRCUIT_ASSEMBLER_R_RECIPES = register("circuit_assembler_r", ELECTRIC)
      .setMaxIOSize(10, 1, 1, 0).setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSlotOverlay(false, false, GuiTextures.DATA_ORB_OVERLAY)
      .setSound(GTSoundEntries.ASSEMBLER)
      .setHasResearchSlot(true)
      .onRecipeBuild(ResearchManager::createDefaultResearchRecipe);

  public static final GTRecipeType CIRCUIT_ASSEMBLER_R_M_RECIPES = register("circuit_assembler_r_m", MULTIBLOCK)
      .setMaxIOSize(16, 1, 6, 0).setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER)
      .setHasResearchSlot(true)
      .setMaxTooltips(4)
      .onRecipeBuild(ResearchManager::createDefaultResearchRecipe);

  public static final GTRecipeType MEGA_MIXER_RECIPES = register("mega_mixer", MULTIBLOCK)
      .setMaxIOSize(81, 1, 8, 4)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.MIXER);

  public static final GTRecipeType ENDGAME_RECIPES = register("endgame", MULTIBLOCK)
      .setMaxIOSize(81, 8, 12, 8)
      .setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final GTRecipeType ENDGAME_GENERATOR_RECIPES = register("endgame_generator", GENERATOR)
      .setMaxIOSize(32, 0, 12, 0)
      .setEUIO(IO.OUT)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER);

  public static final GTRecipeType ESSENCE_ASSEMBLER_RESIPES = register("essence_assenbler", MULTIBLOCK)
      .setMaxIOSize(16, 4, 2, 2).setEUIO(IO.IN)
      .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW, LEFT_TO_RIGHT)
      .setSound(GTSoundEntries.ASSEMBLER);

  public static GTRecipeType register(String name, String group, RecipeType<?>... proxyRecipes) {
    var recipeType = new GTRecipeType(GTCEuAdd.id(name), group, proxyRecipes);
    GTRegistries.register(BuiltInRegistries.RECIPE_TYPE, recipeType.registryName, recipeType);
    GTRegistries.register(BuiltInRegistries.RECIPE_SERIALIZER, recipeType.registryName, new GTRecipeSerializer());
    GTRegistries.RECIPE_TYPES.register(recipeType.registryName, recipeType);
    return recipeType;
  }



  public static void init(){}
}
