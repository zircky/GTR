package com.zircky.gtceuadd.api.recipe;

import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IMultiController;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.RecipeCondition;
import com.zircky.gtceuadd.common.block.CompAssLineCasing;
import net.minecraft.network.chat.Component;
import org.jetbrains.annotations.NotNull;

public class CompAssLineCondition extends RecipeCondition {
  public final static CompAssLineCondition INSTANCE = new CompAssLineCondition();

  private CompAssLineCasing compAssLine = CompAssLineCasing.Compassline_Casing_LV;

  public CompAssLineCondition(CompAssLineCasing compAssLine) {
    super();
    this.compAssLine = compAssLine;
  }

  public CompAssLineCondition() {
    super();
  }

  @Override
  public String getType() {
    return "comp_ass_line_casing";
  }

  @Override
  public Component getTooltips() {
    return Component.translatable("gtnn.recipe.condition.plant_casing.tooltip", compAssLine.getTier() + 1, compAssLine.getName());
  }

  @Override
  public boolean test(@NotNull GTRecipe recipe, @NotNull RecipeLogic recipeLogic) {
    MetaMachine machine = recipeLogic.getMachine();
    return machine instanceof IMultiController && this.compAssLine != null;
  }

  @Override
  public RecipeCondition createTemplate() {
    return new CompAssLineCondition();
  }
}
