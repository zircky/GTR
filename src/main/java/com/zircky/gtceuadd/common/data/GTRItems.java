package com.zircky.gtceuadd.common.data;

import com.gregtechceu.gtceu.api.item.ComponentItem;
import com.gregtechceu.gtceu.api.item.component.IItemComponent;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import net.minecraft.world.item.Item;

import static com.zircky.gtceuadd.api.registries.GTRRegistries.REGISTRATE;

public class GTRItems {
  public static ItemEntry<Item> LOGIC_CHIP = REGISTRATE.item("logic_chip", Item::new)
    .lang("Logic Chip")
    .defaultModel()
    .register();
  public static ItemEntry<Item> ADVANCED_LOGIC_CHIP = REGISTRATE.item("advanced_logic_chip", Item::new)
    .lang("Advanced Logic Chip")
    .defaultModel()
    .register();
  public static ItemEntry<Item> BOUNDARY_LOGIC_CHIP = REGISTRATE.item("boundary_logic_chip", Item::new)
    .lang("Boundary Logic Chip")
    .defaultModel()
    .register();
  public static ItemEntry<Item> FAN = REGISTRATE.item("fan", Item::new)
    .lang("Turbine Fan")
    .defaultModel()
    .register();
  public static ItemEntry<Item> TUNGSTEN_CARBIDE_CASING = REGISTRATE.item("tungsten_carbide_casing", Item::new)
    .lang("Tungsten Carbide Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> NIMONIC_CASING = REGISTRATE.item("nimonic_casing", Item::new)
    .lang("Nimonic Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> HASTELLOY_CASING = REGISTRATE.item("hastelloy_casing", Item::new)
    .lang("Hastelloy Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> MAINE_CRAWLER_CASING = REGISTRATE.item("mine_crawler_casing", Item::new)
    .lang("Mine Crawler Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> Hydronalium_Casing = REGISTRATE.item("hydronalium_casing", Item::new)
    .lang("Hydronalium Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> IRON_CASING = REGISTRATE.item("iron_casing", Item::new)
    .lang("Iron Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> Cupronickel_Casing = REGISTRATE.item("cupronickel_casing", Item::new)
    .lang("Cupronickel Casing")
    .defaultModel()
    .register();
  public static ItemEntry<Item> Aluminum_Casing = REGISTRATE.item("aluminum_casing", Item::new)
    .lang("Aluminum Casing")
    .defaultModel()
    .register();

  public static ItemEntry<Item> InfinityCatalyst = REGISTRATE.item("infinity_catalyst", Item::new)
      .lang("Infinity Catalyst")
      .defaultModel()
      .register();

  public static ItemEntry<Item> ItemChipCore = REGISTRATE.item("item_chip_core", Item::new)
      .lang("Item Chip core")
      .defaultModel()
      .register();
  public static ItemEntry<Item> FluidChipCore = REGISTRATE.item("fluid_chip_core", Item::new)
      .lang("Fluid Chip core")
      .defaultModel()
      .register();

  public static ItemEntry<Item> InfinityStar = REGISTRATE.item("infinity_star", Item::new)
      .lang("Infinity Star")
      .defaultModel()
      .register();


  public static <T extends ComponentItem> NonNullConsumer<T> attach(IItemComponent... components) {
    return item -> item.attachComponents(components);
  }

  public static void init() {

  }
}
