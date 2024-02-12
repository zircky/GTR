package com.zircky.gtceuadd.machines.electric;

import com.gregtechceu.gtceu.api.machine.IMachineBlockEntity;
import com.gregtechceu.gtceu.api.machine.TieredEnergyMachine;
import com.gregtechceu.gtceu.api.machine.feature.IFancyUIMachine;
import com.lowdragmc.lowdraglib.syncdata.field.ManagedFieldHolder;

public class ScannerMachines extends TieredEnergyMachine implements IFancyUIMachine {
  protected static final ManagedFieldHolder MANAGED_FIELD_HOLDER = new ManagedFieldHolder(ScannerMachines.class, TieredEnergyMachine.MANAGED_FIELD_HOLDER);

  public ScannerMachines(IMachineBlockEntity holder, int tier, Object... args) {
    super(holder, tier, args);
  }


}
