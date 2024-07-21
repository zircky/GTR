package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.cover.CoverDefinition;
import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.registry.registrate.CompassNode;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.gregtechceu.gtceu.common.item.CoverPlaceBehavior;
import com.gregtechceu.gtceu.common.item.TooltipBehavior;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.zircky.gtceuadd.common.data.items.Components;
import net.minecraft.network.chat.Component;

import static com.gregtechceu.gtceu.common.data.GTItems.*;
import static com.zircky.gtceuadd.api.registries.GTRRegistries.REGISTRATE;

public class Covers {

  public static void init() {
    Components.registerComponents();
  }

  public static ItemEntry<ComponentItem> ELECTRIC_PUMP_MAX;
  public static ItemEntry<ComponentItem> ELECTRIC_PUMP_ERV;
  public static ItemEntry<ComponentItem> ELECTRIC_PUMP_SERV;
  public static ItemEntry<ComponentItem> FLUID_REGULATOR_MAX;
  public static ItemEntry<ComponentItem> FLUID_REGULATOR_ERV;
  public static ItemEntry<ComponentItem> FLUID_REGULATOR_SERV;
  public static ItemEntry<ComponentItem> CONCVEYOR_MODULE_MAX;
  public static ItemEntry<ComponentItem> CONCVEYOR_MODULE_ERV;
  public static ItemEntry<ComponentItem> CONCVEYOR_MODULE_SERV;
  public static ItemEntry<ComponentItem> ROBOT_ARM_MAX;
  public static ItemEntry<ComponentItem> ROBOT_ARM_ERV;
  public static ItemEntry<ComponentItem> ROBOT_ARM_SERV;


  public static ItemEntry<ComponentItem> registerComponent(String name, String langName, CoverDefinition coverDefinition, String tooltip, String tooltipInfo, int num, String node, CompassNode... preNodes) {
    return REGISTRATE.item(name, ComponentItem::create)
        .lang(langName)
        .onRegister(attach(new CoverPlaceBehavior(coverDefinition)))
        .onRegister(attach(new TooltipBehavior(lines -> {
          lines.add(Component.translatable(tooltip));
          lines.add(Component.translatable(tooltipInfo, num));
        })))
        .onRegister(compassNodeExist(GTCompassSections.COVERS, node, preNodes))
        .register();
  }
  public static ItemEntry<ComponentItem> registerComponent(String name, String langName, CoverDefinition coverDefinition, String tooltip, String tooltipInfo, int num) {
    return REGISTRATE.item(name, ComponentItem::create)
        .lang(langName)
        .onRegister(attach(new CoverPlaceBehavior(coverDefinition)))
        .onRegister(attach(new TooltipBehavior(lines -> {
          lines.add(Component.translatable(tooltip));
          lines.add(Component.translatable(tooltipInfo, num));
        })))
        .register();
  }
}
