package com.zircky.gtceuadd.data.recipe.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class RecipeVanilla {
  public static void init(Consumer<FinishedRecipe> provider){
    vanilla(provider);
  }

  public static void vanilla(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "iron_door", new ItemStack(Items.IRON_DOOR), "PTh", "PRS", "PPd",
        'P', new UnificationEntry(TagPrefix.plate, GTMaterials.Iron),
        'T', new ItemStack(Blocks.IRON_TRAPDOOR),
        'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Steel),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Steel));

    VanillaRecipeHelper.addShapedRecipe(provider, "iron_trapdoor", new ItemStack(Blocks.IRON_TRAPDOOR), "SPS",
        "PTP", "sPd",
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron),
        'P', new UnificationEntry(TagPrefix.plate, GTMaterials.Iron),
        'T', ItemTags.TRAPDOORS);

    VanillaRecipeHelper.addShapedRecipe(provider, "maim/stick", new ItemStack(Items.STICK, 2), "P", "P",
        'P', ItemTags.PLANKS);
    VanillaRecipeHelper.addShapedRecipe(provider, "maim/stick_saw", new ItemStack(Items.STICK, 4), "s", "P", "P",
        'P', ItemTags.PLANKS);

    recipeWood(provider, "oak", new ItemStack(Blocks.OAK_PLANKS), ItemTags.OAK_LOGS);
    recipeWood(provider, "spruce", new ItemStack(Blocks.SPRUCE_PLANKS), ItemTags.SPRUCE_LOGS);
    recipeWood(provider, "birch", new ItemStack(Blocks.BIRCH_PLANKS), ItemTags.BIRCH_LOGS);
    recipeWood(provider, "jungle", new ItemStack(Blocks.JUNGLE_PLANKS), ItemTags.JUNGLE_LOGS);
    recipeWood(provider, "acacia", new ItemStack(Blocks.ACACIA_PLANKS), ItemTags.ACACIA_LOGS);
    recipeWood(provider, "cherry", new ItemStack(Blocks.CHERRY_PLANKS), ItemTags.CHERRY_LOGS);
    recipeWood(provider, "dark_oak", new ItemStack(Blocks.DARK_OAK_PLANKS), ItemTags.DARK_OAK_LOGS);
    recipeWood(provider, "mangrove", new ItemStack(Blocks.MANGROVE_PLANKS), ItemTags.MANGROVE_LOGS);
    recipeWood(provider, "crimson", new ItemStack(Blocks.CRIMSON_PLANKS), ItemTags.CRIMSON_STEMS);
    recipeWood(provider, "warped", new ItemStack(Blocks.WARPED_PLANKS), ItemTags.WARPED_STEMS);
    recipeWood(provider, "bamboo", new ItemStack(Blocks.BAMBOO_PLANKS), ItemTags.BAMBOO_BLOCKS);

    recipeWoodSaw(provider, "oak", new ItemStack(Blocks.OAK_PLANKS, 2), ItemTags.OAK_LOGS);
    recipeWoodSaw(provider, "spruce", new ItemStack(Blocks.SPRUCE_PLANKS, 2), ItemTags.SPRUCE_LOGS);
    recipeWoodSaw(provider, "birch", new ItemStack(Blocks.BIRCH_PLANKS, 2), ItemTags.BIRCH_LOGS);
    recipeWoodSaw(provider, "jungle", new ItemStack(Blocks.JUNGLE_PLANKS, 2), ItemTags.JUNGLE_LOGS);
    recipeWoodSaw(provider, "acacia", new ItemStack(Blocks.ACACIA_PLANKS, 2), ItemTags.ACACIA_LOGS);
    recipeWoodSaw(provider, "cherry", new ItemStack(Blocks.CHERRY_PLANKS, 2), ItemTags.CHERRY_LOGS);
    recipeWoodSaw(provider, "dark_oak", new ItemStack(Blocks.DARK_OAK_PLANKS, 2), ItemTags.DARK_OAK_LOGS);
    recipeWoodSaw(provider, "mangrove", new ItemStack(Blocks.MANGROVE_PLANKS, 2), ItemTags.MANGROVE_LOGS);
    recipeWoodSaw(provider, "crimson", new ItemStack(Blocks.CRIMSON_PLANKS, 2), ItemTags.CRIMSON_STEMS);
    recipeWoodSaw(provider, "warped", new ItemStack(Blocks.WARPED_PLANKS, 2), ItemTags.WARPED_STEMS);
    recipeWoodSaw(provider, "bamboo", new ItemStack(Blocks.BAMBOO_PLANKS, 2), ItemTags.BAMBOO_BLOCKS);

    recipeDoor(provider, "oak", new ItemStack(Blocks.OAK_DOOR), new ItemStack(Items.OAK_PLANKS), new ItemStack(Blocks.OAK_TRAPDOOR));
    recipeDoor(provider, "spruce", new ItemStack(Blocks.SPRUCE_DOOR), new ItemStack(Items.SPRUCE_PLANKS), new ItemStack(Blocks.SPRUCE_TRAPDOOR));
    recipeDoor(provider, "birch", new ItemStack(Blocks.BIRCH_DOOR), new ItemStack(Items.BIRCH_PLANKS), new ItemStack(Blocks.BIRCH_TRAPDOOR));
    recipeDoor(provider, "jungle", new ItemStack(Blocks.JUNGLE_DOOR), new ItemStack(Items.JUNGLE_PLANKS), new ItemStack(Blocks.JUNGLE_TRAPDOOR));
    recipeDoor(provider, "acacia", new ItemStack(Blocks.ACACIA_DOOR), new ItemStack(Items.ACACIA_PLANKS), new ItemStack(Blocks.ACACIA_TRAPDOOR));
    recipeDoor(provider, "cherry", new ItemStack(Blocks.CHERRY_DOOR), new ItemStack(Items.CHERRY_PLANKS), new ItemStack(Blocks.CHERRY_TRAPDOOR));
    recipeDoor(provider, "dark_oak", new ItemStack(Blocks.DARK_OAK_DOOR), new ItemStack(Items.DARK_OAK_PLANKS), new ItemStack(Blocks.DARK_OAK_TRAPDOOR));
    recipeDoor(provider, "mangrove", new ItemStack(Blocks.MANGROVE_DOOR), new ItemStack(Items.MANGROVE_PLANKS), new ItemStack(Blocks.MANGROVE_TRAPDOOR));
    recipeDoor(provider, "crimson", new ItemStack(Blocks.CRIMSON_DOOR), new ItemStack(Items.CRIMSON_PLANKS), new ItemStack(Blocks.CRIMSON_TRAPDOOR));
    recipeDoor(provider, "warped", new ItemStack(Blocks.WARPED_DOOR), new ItemStack(Items.WARPED_PLANKS), new ItemStack(Blocks.WARPED_TRAPDOOR));
    recipeDoor(provider, "warped", new ItemStack(Blocks.BAMBOO_DOOR), new ItemStack(Items.BAMBOO_PLANKS), new ItemStack(Blocks.BAMBOO_TRAPDOOR));
  }

  private static void recipeWood(Consumer<FinishedRecipe> provider, String regName, ItemStack result, TagKey<Item> input) {
    VanillaRecipeHelper.addShapelessRecipe(provider, regName + "_plank", result, input);
  }
  private static void recipeWoodSaw(Consumer<FinishedRecipe> provider, String regName, ItemStack result, TagKey<Item> input) {
    VanillaRecipeHelper.addShapedRecipe(provider, regName + "_plank_saw", result,
        "s", "P",
        'P', input);
  }
  private static void recipeDoor(Consumer<FinishedRecipe> provider, String regName, ItemStack result, ItemStack input1, ItemStack input2) {
    VanillaRecipeHelper.addShapedRecipe(provider, regName + "_door", result,
        "PTd", "PRS", "PPs",
        'P', input1,
        'T', input2,
        'R', new UnificationEntry(TagPrefix.ring, GTMaterials.Iron),
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron));
  }
}
