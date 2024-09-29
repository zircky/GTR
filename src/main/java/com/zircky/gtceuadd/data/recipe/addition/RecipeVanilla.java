package com.zircky.gtceuadd.data.recipe.addition;

import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.common.data.GTRecipeTypes;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

import static com.gregtechceu.gtceu.common.data.GTRecipeTypes.ASSEMBLER_RECIPES;

public class RecipeVanilla {
  public static void init(Consumer<FinishedRecipe> provider) {
    vanilla(provider);
  }

  public static void vanilla(Consumer<FinishedRecipe> provider) {
    VanillaRecipeHelper.addShapedRecipe(provider, "heavy_weighted_pressure_plate", new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE),
        "ShS", "IPI", "SdS",
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Steel),
        'I', new UnificationEntry(TagPrefix.plate, GTMaterials.Iron),
        'P', new UnificationEntry(TagPrefix.spring, GTMaterials.Steel));

    ASSEMBLER_RECIPES.recipeBuilder("heavy_weighted_pressure_plate_alt")
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.Iron))
        .inputItems(new UnificationEntry(TagPrefix.spring, GTMaterials.Steel))
        .outputItems(new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE))
        .duration(200).EUt(16).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "light_weighted_pressure_plate", new ItemStack(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE),
        "ShS", "IPI", "SdS",
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Steel),
        'I', new UnificationEntry(TagPrefix.plate, GTMaterials.Gold),
        'P', new UnificationEntry(TagPrefix.spring, GTMaterials.Steel));

    ASSEMBLER_RECIPES.recipeBuilder("light_weighted_pressure_plate_alt")
        .inputItems(new UnificationEntry(TagPrefix.plate, GTMaterials.Gold))
        .inputItems(new UnificationEntry(TagPrefix.spring, GTMaterials.Steel))
        .outputItems(new ItemStack(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE))
        .duration(200).EUt(16).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "stone_pressure_plate", new ItemStack(Blocks.STONE_PRESSURE_PLATE),
        "ShS", "IPI", "SdS",
        'S', new UnificationEntry(TagPrefix.screw, GTMaterials.Iron),
        'I', ItemTags.SLABS,
        'P', new UnificationEntry(TagPrefix.spring, GTMaterials.Iron));

    ASSEMBLER_RECIPES.recipeBuilder("light_weighted_pressure_plate_alt")
        .inputItems(ItemTags.SLABS, 2)
        .inputItems(new UnificationEntry(TagPrefix.spring, GTMaterials.Iron))
        .outputItems(new ItemStack(Blocks.STONE_PRESSURE_PLATE, 2))
        .duration(200).EUt(16).save(provider);

    VanillaRecipeHelper.addShapedRecipe(provider, "bowl", new ItemStack(Items.BOWL),
        "k", "P",
        'P', ItemTags.PLANKS);

  }

}
