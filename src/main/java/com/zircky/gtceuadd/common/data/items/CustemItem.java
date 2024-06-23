package com.zircky.gtceuadd.common.data.items;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static com.zircky.gtceuadd.api.registries.GTRRegistries.REGISTRATE;
import static com.zircky.gtceuadd.common.data.GTRItems.*;

public class CustemItem {
  public static void register() {
    Hydronalium_Casing = registerItem("hydronalium_casing", "Hydronalium Casing");
    InfinityStar = registerItem("infinity_star", "Infinity Star");
    LOGIC_CHIP = registerItem("logic_chip", "Logic Chip");
    FLUID_LOGIC_CHIP = registerItem("fluid_logic_chip", "Fluid Logic Chip");
    MANA_LOGIC_CHIP = registerItem("mana_logic_chip", "Mana Logic Chip");
    FAN = registerItem("fan", "Turbine Fan");
    TUNGSTEN_CARBIDE_CASING = registerItem("tungsten_carbide_casing", "Tungsten Carbide Casing");
    NIMONIC_CASING = registerItem("nimonic_casing", "Nimonic Casing");
    HASTELLOY_CASING = registerItem("hastelloy_casing", "Hastelloy Casing");
    MAINE_CRAWLER_CASING = registerItem("maine_crawler_casing", "Maine Crawler Casing");
    IRON_CASING = registerItem("iron_casing", "Iron Casing");
    Cupronickel_Casing = registerItem("cupronickel_casing", "Cupronickel Casing");
    Aluminum_Casing = registerItem("aluminum_casing", "Aluminum Casing");
  }
}
