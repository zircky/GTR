package com.zircky.gtceuadd.api.block.multiblock;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.MetaMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.machine.multiblock.WorkableMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.MultiblockState;
import com.gregtechceu.gtceu.api.pattern.util.PatternMatchContext;
import com.gregtechceu.gtceu.api.recipe.GTRecipe;
import com.lowdragmc.lowdraglib.syncdata.annotation.DescSynced;
import com.lowdragmc.lowdraglib.syncdata.annotation.Persisted;
import com.lowdragmc.lowdraglib.syncdata.annotation.RequireRerender;
import com.lowdragmc.lowdraglib.syncdata.field.ManagedFieldHolder;
import com.zircky.gtceuadd.api.block.ICompAssLineCasingType;
import com.zircky.gtceuadd.api.recipe.CompAssLineCondition;
import lombok.Getter;

import javax.annotation.Nonnull;

public class ComponentAssemblyLineM extends CoilWorkableElectricMultiblockMachine implements IGTRCALMachine {
  private static final ManagedFieldHolder MANAGED_FIELD_HOLDER = new ManagedFieldHolder(ComponentAssemblyLineM.class, WorkableMultiblockMachine.MANAGED_FIELD_HOLDER);

  @Getter
  @Persisted
  @DescSynced
  @RequireRerender
  private int tier;
  private ICompAssLineCasingType compAssLineCasingType;

  public ComponentAssemblyLineM(IMachineBlockEntity holder) {
    super(holder);
  }

  @Override
  public void onStructureFormed() {
    scheduleRenderUpdate();
    super.onStructureFormed();

    MultiblockState multiblockState = getMultiblockState();
    PatternMatchContext matchContext = multiblockState.getMatchContext();

    ICompAssLineCasingType compAssLineCasingType = matchContext.get("CompAssLine") instanceof ICompAssLineCasingType ? (ICompAssLineCasingType) matchContext.get("CompAssLine") : null;

    this.compAssLineCasingType = compAssLineCasingType;

    this.tier = getCompAssLineTier();
  }

  @Override
  public void scheduleRenderUpdate() {
    scheduleRenderUpdate(this);
  }

  public int getCompAssLineTier() {
    if (this.compAssLineCasingType != null) {
      return this.compAssLineCasingType.getTier();
    }
    return 0;
  }

  public static GTRecipe componentAssemblyLineRecipe(MetaMachine machine, @Nonnull GTRecipe recipe) {
    if (machine instanceof ComponentAssemblyLineM componentAssemblyLineM) {
      if (recipe.conditions.get(0) instanceof CompAssLineCondition compAssLineCondition) {
        if (compAssLineCondition.getCompAssLineCasing().getTier() > componentAssemblyLineM.getCompAssLineTier()) {
          return null;
        }
      }
    }
    throw new RuntimeException("Machine is not a ComponentAssemblyLine");
  }

  @Override
  public ManagedFieldHolder getFieldHolder() {
    return MANAGED_FIELD_HOLDER;
  }
}
