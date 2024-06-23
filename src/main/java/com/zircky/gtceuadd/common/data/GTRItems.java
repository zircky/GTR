package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.component.ElectricStats;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import com.zircky.gtceuadd.common.data.items.Circuit;
import com.zircky.gtceuadd.common.data.items.Components;
import com.zircky.gtceuadd.common.data.items.CustemItem;
import net.minecraft.world.item.Item;

import static com.gregtechceu.gtceu.common.data.GTItems.compassNodeExist;
import static com.gregtechceu.gtceu.common.data.GTItems.modelPredicate;
import static com.gregtechceu.gtceu.common.data.GTModels.overrideModel;
import static com.zircky.gtceuadd.api.registries.GTRRegistries.REGISTRATE;

public class GTRItems {
  public static ItemEntry<Item> Hydronalium_Casing;
  public static ItemEntry<Item> InfinityStar;
  public static ItemEntry<Item> LOGIC_CHIP;
  public static ItemEntry<Item> FLUID_LOGIC_CHIP;
  public static ItemEntry<Item> MANA_LOGIC_CHIP;
  public static ItemEntry<Item> FAN;
  public static ItemEntry<Item> TUNGSTEN_CARBIDE_CASING;
  public static ItemEntry<Item> NIMONIC_CASING;
  public static ItemEntry<Item> HASTELLOY_CASING;
  public static ItemEntry<Item> MAINE_CRAWLER_CASING;
  public static ItemEntry<Item> IRON_CASING;
  public static ItemEntry<Item> Cupronickel_Casing;
  public static ItemEntry<Item> Aluminum_Casing;

  // Battery
  public static ItemEntry<ComponentItem> REALLY_ULTIMATE_BATTERY;
  public static ItemEntry<ComponentItem> EXTREMELY_ULTIMATE_BATTERY;
  public static ItemEntry<ComponentItem> INSANELY_ULTIMATE_BATTERY;
  public static ItemEntry<ComponentItem> MEGA_ULTIMATE_BATTERY;

  //Component
  public static ItemEntry<Item> ELECTRIC_MOTOR_MAX;
  public static ItemEntry<Item> ELECTRIC_MOTOR_ERV;
  public static ItemEntry<Item> ELECTRIC_MOTOR_SERV;



  public static ItemEntry<Item> registerItem(String name, String langName) {
    return REGISTRATE.item(name, Item::new)
     .lang(langName)
     .defaultModel()
     .register();
  }
  public static ItemEntry<Item> registerItem(String name, String langName, String node) {
    return REGISTRATE.item(name, Item::new)
        .lang(langName)
        .onRegister(compassNodeExist(GTCompassSections.COMPONENTS, node))
        .register();
  }

  public static ItemEntry<ComponentItem> registerBattery(String name, String langName, String node, Long maxBattery, int energy) {
    return REGISTRATE.item(name, ComponentItem::create)
        .lang(langName)
        .model(overrideModel(GTCEu.id("battery"), 8))
        .onRegister(compassNodeExist(GTCompassSections.BATTERIES, node))
        .onRegister(modelPredicate(GTCEu.id("battery"), ElectricStats::getStoredPredicate))
        .onRegister(attach(ElectricStats.createRechargeableBattery(maxBattery, energy)))
        .register();
  }



  public static <T extends ComponentItem> NonNullConsumer<T> attach(IItemComponent... components) {
    return item -> item.attachComponents(components);
  }

  public static void init() {
    CustemItem.register();
    Circuit.register();
    Components.registerItems();

    //CustemBattry.register();
  }
}
