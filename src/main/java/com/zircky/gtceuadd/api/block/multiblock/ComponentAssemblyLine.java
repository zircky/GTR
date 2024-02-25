package com.zircky.gtceuadd.api.block.multiblock;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.multiblock.CoilWorkableElectricMultiblockMachine;
import com.gregtechceu.gtceu.api.pattern.MultiblockState;
import com.gregtechceu.gtceu.api.pattern.util.PatternMatchContext;
import com.lowdragmc.lowdraglib.syncdata.annotation.DescSynced;
import com.lowdragmc.lowdraglib.syncdata.annotation.Persisted;
import com.lowdragmc.lowdraglib.syncdata.annotation.RequireRerender;
import com.zircky.gtceuadd.api.block.ICompAssLineCasingType;
import lombok.Getter;

public class ComponentAssemblyLine extends CoilWorkableElectricMultiblockMachine implements IGTRCALMachine {

  @Getter
  @Persisted
  @DescSynced
  @RequireRerender
  private int tier;
  private ICompAssLineCasingType compAssLineCasingType;

  public ComponentAssemblyLine(IMachineBlockEntity holder) {
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

    this.tier = getCompAssLine();
  }

  @Override
  public void scheduleRenderUpdate() {
    scheduleRenderUpdate(this);
  }

  public int getCompAssLine() {
    if (this.compAssLineCasingType != null) {
      return this.compAssLineCasingType.getTier();
    }
    return 0;
  }


}
