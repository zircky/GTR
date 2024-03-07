package com.zircky.gtceuadd.api.recipe;

import com.google.gson.JsonObject;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.feature.multiblock.IMultiController;
import com.gregtechceu.gtceu.api.machine.trait.RecipeLogic;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.gregtechceu.gtceu.api.recipe.RecipeCondition;
import com.zircky.gtceuadd.api.block.ICompAssLineCasingType;
import com.zircky.gtceuadd.common.block.CompAssLineCasingB;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.util.GsonHelper;
import org.jetbrains.annotations.NotNull;


public class CompAssLineCondition extends RecipeCondition {
  public final static CompAssLineCondition INSTANCE = new CompAssLineCondition();

  private CompAssLineCasingB compAssLine = CompAssLineCasingB.Compassline_Casing_LV;

  public CompAssLineCondition(CompAssLineCasingB compAssLine) {
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
    return Component.translatable("gtceuadd.recipe.condition.comp_ass_line_casing.tooltip", compAssLine.getTier() + 1, compAssLine.getName());
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

  @NotNull
  @Override
  public JsonObject serialize() {
    JsonObject value = super.serialize();
    value.addProperty("compAssLine", compAssLine.getName());
    return value;
  }

  @Override
  public RecipeCondition deserialize(@NotNull JsonObject config) {
    super.deserialize(config);
    this.compAssLine = CompAssLineCasingB.getByName(
        GsonHelper.getAsString(config, "compAssLine", "compAssLine"));
    return this;
  }

  @Override
  public void toNetwork(FriendlyByteBuf buf) {
    super.toNetwork(buf);
    buf.writeUtf(this.compAssLine.getName());
  }

  @Override
  public RecipeCondition fromNetwork(FriendlyByteBuf buf) {
    super.fromNetwork(buf);
    this.compAssLine = CompAssLineCasingB.getByNameOrDefault(buf.readUtf());
    return this;
  }

  public ICompAssLineCasingType getCompAssLineCasing() {
    return null;
  }
}
