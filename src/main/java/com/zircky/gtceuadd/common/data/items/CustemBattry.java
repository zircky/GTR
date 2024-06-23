package com.zircky.gtceuadd.common.data.items;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.GTValues;
import com.gregtechceu.gtceu.api.addon.GTAddon;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.component.ElectricStats;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.zircky.gtceuadd.GTCEuAdd;
import com.zircky.gtceuadd.data.recipe.CustemTags;

import java.math.BigInteger;

import static com.gregtechceu.gtceu.common.data.GTItems.compassNodeExist;
import static com.gregtechceu.gtceu.common.data.GTItems.modelPredicate;
import static com.gregtechceu.gtceu.common.data.GTModels.overrideModel;
import static com.zircky.gtceuadd.api.registries.GTRRegistries.REGISTRATE;
import static com.zircky.gtceuadd.common.data.GTRItems.*;

public class CustemBattry {

  public static void register() {
    REALLY_ULTIMATE_BATTERY = registerBattery("battery_uxv", "Really Ultimate Battery", "really_ultimate_battery", Long.MAX_VALUE, GTValues.UXV);
    EXTREMELY_ULTIMATE_BATTERY = registerBattery("battery_opv", "Extremely Ultimate Battery", "exyremely_ultimate_battery", Long.MAX_VALUE, GTValues.OpV);
    INSANELY_ULTIMATE_BATTERY = registerBattery("battery_max", "Insanely Ultimate Battery", "insanely_ultimate_battery", Long.MAX_VALUE, GTValues.MAX);
    MEGA_ULTIMATE_BATTERY = REGISTRATE.item("battery_erv", ComponentItem::create)
        .lang("Mega Ultimate Battery")
        .model(overrideModel(GTCEuAdd.id("battery"), 8))
        .onRegister(compassNodeExist(GTCompassSections.BATTERIES, "mega_ultimate_battery"))
        .onRegister(modelPredicate(GTCEuAdd.id("battery"), ElectricStats::getStoredPredicate))
        .onRegister(attach(ElectricStats.create(Long.MAX_VALUE, 8_589_934_592L, true, true)))
        .tag(CustemTags.ERV_BATTERIES).register();
  }
}
