package com.zircky.gtceuadd.data.recipe;

import appeng.core.definitions.AEParts;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.data.chemical.material.stack.UnificationEntry;
import com.gregtechceu.gtceu.api.data.tag.TagPrefix;
import com.gregtechceu.gtceu.common.data.GTMaterials;
import com.gregtechceu.gtceu.data.recipe.VanillaRecipeHelper;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.ItemStack;

import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.zircky.gtceuadd.data.recipe.addition.ae2.network.Parts.materials;

public class GTRCraftingComponent {
  public static GTRComponent ANCHOR = new GTRComponent(Stream.of(new Object[][]{
      {0, new UnificationEntry(TagPrefix.bolt, GTMaterials.Iron)},
      {1, new UnificationEntry(TagPrefix.bolt, GTMaterials.Copper)},
      {2, new UnificationEntry(TagPrefix.bolt, GTMaterials.Bronze)},
      {3, new UnificationEntry(TagPrefix.bolt, GTMaterials.Tin)},
      {4, new UnificationEntry(TagPrefix.bolt, GTMaterials.Steel)},
      {5, new UnificationEntry(TagPrefix.bolt, GTMaterials.Aluminium)},
      {6, new UnificationEntry(TagPrefix.bolt, GTMaterials.Lead)},
      {7, new UnificationEntry(TagPrefix.bolt, GTMaterials.Nickel)},
      {8, new UnificationEntry(TagPrefix.bolt, GTMaterials.Silver)},
      {9, new UnificationEntry(TagPrefix.bolt, GTMaterials.Brass)},
      {10, new UnificationEntry(TagPrefix.bolt, GTMaterials.Invar)},
      {11, new UnificationEntry(TagPrefix.bolt, GTMaterials.StainlessSteel)},
      {12, new UnificationEntry(TagPrefix.bolt, GTMaterials.Titanium)},

  }).collect(Collectors.toMap(data -> (Integer) data[0], data -> data[1])));

  public static void registerCableAnchorRecipes(Consumer<FinishedRecipe> provider, String regName, GTRCraftingComponent.GTRComponent input) {
    input.ingredients.entrySet().stream()
        .forEach(entry -> {
          int tier = entry.getKey();
          UnificationEntry ingredient = (UnificationEntry) entry.getValue();
          VanillaRecipeHelper.addShapedRecipe(provider, regName + materials[tier], new ItemStack(AEParts.CABLE_ANCHOR),
              "Af", "sA",
              'A', ingredient);
        });
  }

  public static class GTRComponent {
    private final Map<Integer, Object> ingredients;

    public GTRComponent(Map<Integer, Object> craftingComponents) {
      ingredients = craftingComponents;
    }

    public String getName() {
      Object firstIngredient = ingredients.values().stream().findFirst().orElse("Unknown");
      return firstIngredient.getClass().getSimpleName();
    }

    public Object getIngredient(int tier) {
      Object ingredient = ingredients.get(tier);
      return ingredient == null ? ingredients.get(GTValues.FALLBACK) : ingredient;
    }

    @SuppressWarnings("unused")
    public void appendIngredients(Map<Integer, Object> newIngredients) {
      ingredients.remove(GTValues.FALLBACK);
      newIngredients.forEach((key, value) -> ingredients.merge(key, value, (v1, v2) -> v2));
    }
  }
}
