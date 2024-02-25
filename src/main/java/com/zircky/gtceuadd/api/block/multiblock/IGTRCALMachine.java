package com.zircky.gtceuadd.api.block.multiblock;

import com.gregtechceu.gtceu.api.machine.feature.multiblock.IMultiPart;
import com.gregtechceu.gtceu.api.machine.multiblock.MultiblockControllerMachine;

public interface IGTRCALMachine {
  int getTier();

  default void scheduleRenderUpdate(MultiblockControllerMachine machine) {
    for (IMultiPart part : machine.getParts()) {
      part.self().scheduleRenderUpdate();
    }
  }
}
