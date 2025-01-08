package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.component.ElectricStats;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import com.zircky.gtceuadd.common.data.items.Circuit;
import com.zircky.gtceuadd.common.data.items.Components;
import com.zircky.gtceuadd.common.data.items.CustemItem;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static com.gregtechceu.gtceu.common.data.GTItems.*;
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
  public static ItemEntry<Item> ELECTRIC_PISTON_MAX;
  public static ItemEntry<Item> ELECTRIC_PISTON_ERV;
  public static ItemEntry<Item> ELECTRIC_PISTON_SERV;
  public static ItemEntry<Item> FIELD_GENERATOR_MAX;
  public static ItemEntry<Item> FIELD_GENERATOR_ERV;
  public static ItemEntry<Item> FIELD_GENERATOR_SERV;
  public static ItemEntry<Item> EMITTER_MAX;
  public static ItemEntry<Item> EMITTER_ERV;
  public static ItemEntry<Item> EMITTER_SERV;
  public static ItemEntry<Item> SENSOR_MAX;
  public static ItemEntry<Item> SENSOR_ERV;
  public static ItemEntry<Item> SENSOR_SERV;

  public static ItemEntry<Item> SMD_TRANSISTOR_REFINED;
  public static ItemEntry<Item> SMD_RESISTOR_REFINED;
  public static ItemEntry<Item> SMD_CAPACITOR_REFINED;
  public static ItemEntry<Item> SMD_INDUCTOR_REFINED;
  public static ItemEntry<Item> SMD_DIOD_REFINED;

  public static ItemEntry<Item> SMD_TRANSISTOR_NANO;
  public static ItemEntry<Item> SMD_RESISTOR_NANO;
  public static ItemEntry<Item> SMD_CAPACITOR_NANO;
  public static ItemEntry<Item> SMD_INDUCTOR_NANO;
  public static ItemEntry<Item> SMD_DIODE_NANO;

  public static ItemEntry<Item> SMD_TRANSISTOR_CRYSTAL;
  public static ItemEntry<Item> SMD_CAPACITOR_CRYSTAL;
  public static ItemEntry<Item> SMD_RESISTOR_CRYSTAL;
  public static ItemEntry<Item> SMD_INDUCTOR_CRYSTAL;
  public static ItemEntry<Item> SMD_DIODE_CRYSTAL;

  public static ItemEntry<Item> SMD_TRANSISTOR_QUANTUM;
  public static ItemEntry<Item> SMD_CAPACITOR_QUANTUM;
  public static ItemEntry<Item> SMD_RESISTOR_QUANTUM;
  public static ItemEntry<Item> SMD_INDUCTOR_QUANTUM;
  public static ItemEntry<Item> SMD_DIODE_QUANTUM;

  public static ItemEntry<Item> SMD_TRANSISTOR_WETWARE;
  public static ItemEntry<Item> SMD_CAPACITOR_WETWARE;
  public static ItemEntry<Item> SMD_RESISTOR_WETWARE;
  public static ItemEntry<Item> SMD_INDUCTOR_WETWARE;
  public static ItemEntry<Item> SMD_DIODE_WETWARE;

  public static ItemEntry<Item> SMD_TRANSISTOR_BIOWARE;
  public static ItemEntry<Item> SMD_CAPACITOR_BIOWARE ;
  public static ItemEntry<Item> SMD_RESISTOR_BIOWARE ;
  public static ItemEntry<Item> SMD_DIODE_BIOWARE ;
  public static ItemEntry<Item> SMD_INDUCTOR_BIOWARE;

  public static ItemEntry<Item> SMD_TRANSISTOR_OPTICAL;
  public static ItemEntry<Item> SMD_CAPACITOR_OPTICAL ;
  public static ItemEntry<Item> SMD_RESISTOR_OPTICAL ;
  public static ItemEntry<Item> SMD_DIODE_OPTICAL ;
  public static ItemEntry<Item> SMD_INDUCTOR_OPTICAL;

  public static ItemEntry<Item> SMD_TRANSISTOR_COSMIC;
  public static ItemEntry<Item> SMD_CAPACITOR_COSMIC ;
  public static ItemEntry<Item> SMD_RESISTOR_COSMIC ;
  public static ItemEntry<Item> SMD_DIODE_COSMIC ;
  public static ItemEntry<Item> SMD_INDUCTOR_COSMIC;

  public static ItemEntry<Item> SMD_TRANSISTOR_SUPRACAUSAL;
  public static ItemEntry<Item> SMD_CAPACITOR_SUPRACAUSAL ;
  public static ItemEntry<Item> SMD_RESISTOR_SUPRACAUSAL ;
  public static ItemEntry<Item> SMD_DIODE_SUPRACAUSAL ;
  public static ItemEntry<Item> SMD_INDUCTOR_SUPRACAUSAL;

  public static ItemEntry<Item> SMD_TRANSISTOR_EXOTIC;
  public static ItemEntry<Item> SMD_CAPACITOR_EXOTIC ;
  public static ItemEntry<Item> SMD_RESISTOR_EXOTIC ;
  public static ItemEntry<Item> SMD_DIODE_EXOTIC ;
  public static ItemEntry<Item> SMD_INDUCTOR_EXOTIC;

  public static ItemEntry<Item> SMD_TRANSISTOR_UNKNOWN;
  public static ItemEntry<Item> SMD_RESISTOR_UNKNOWN;
  public static ItemEntry<Item> SMD_CAPACITOR_UNKNOWN;
  public static ItemEntry<Item> SMD_INDUCTOR_UNKNOWN;
  public static ItemEntry<Item> SMD_DIODE_UNKNOWN;

  public static ItemEntry<Item> BIOWARE_PROCESSOR;
  public static ItemEntry<Item> BIOWARE_ASSEMBL;
  public static ItemEntry<Item> BIOWARE_COMPUTER;
  public static ItemEntry<Item> BIOWARE_MAINFRAME;

  public static ItemEntry<Item> OPTICAL_PROCESSOR;
  public static ItemEntry<Item> OPTICAL_ASSEMBLY;
  public static ItemEntry<Item> OPTICAL_COMPUTER;
  public static ItemEntry<Item> OPTICAL_MAINFRAME;

  public static ItemEntry<Item> EXOTIC_PROCESSOR;
  public static ItemEntry<Item> EXOTIC_ASSEMBLY;
  public static ItemEntry<Item> EXOTIC_COMPUTER;
  public static ItemEntry<Item> EXOTIC_MAINFRAME;

  public static ItemEntry<Item> COSMIC_PROCESSOR;
  public static ItemEntry<Item> COSMIC_ASSEMBLY;
  public static ItemEntry<Item> COSMIC_COMPUTER;
  public static ItemEntry<Item> COSMIC_MAINFRAME;

  public static ItemEntry<Item> UNKNOWN_PROCESSOR;
  public static ItemEntry<Item> UNKNOWN_ASSEMBLY;
  public static ItemEntry<Item> UNKNOWN_COMPUTER;
  public static ItemEntry<Item> UNKNOWN_MAINFRAME;

//  public static ItemEntry<Item> SPACETIME_PROCESSOR;
//  public static ItemEntry<Item> SPACETIME_ASSEMBLY;
//  public static ItemEntry<Item> SPACETIME_COMPUTER;
//  public static ItemEntry<Item> SPACETIME_MAINFRAME;

  public static ItemEntry<Item> SUPRACAUSAL_PROCESSOR;
  public static ItemEntry<Item> SUPRACAUSAL_ASSEMBLY;
  public static ItemEntry<Item> SUPRACAUSAL_COMPUTER;
  public static ItemEntry<Item> SUPRACAUSAL_MAINFRAME;





  public static ItemEntry<Item> registerItem(String name, String langName) {
    return REGISTRATE.item(name, Item::new)
     .lang(langName)
     .defaultModel()
     .register();
  }
  public static ItemEntry<Item> registerItem(String name, String langName, TagKey<Item>... tags) {
    return REGISTRATE.item(name, Item::new)
        .lang(langName)
        .tag(tags)
        .defaultModel()
        .register();
  }
  public static ItemEntry<Item> registerItem(String name, String langName, String node) {
    return REGISTRATE.item(name, Item::new)
        .lang(langName)
        .register();
  }

  public static ItemEntry<ComponentItem> registerBattery(String name, String langName, String node, Long maxBattery, int energy) {
    return REGISTRATE.item(name, ComponentItem::create)
        .lang(langName)
        .model(overrideModel(GTCEu.id("battery"), 8))
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
