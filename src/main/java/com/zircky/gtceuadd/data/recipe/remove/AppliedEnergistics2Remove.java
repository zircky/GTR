package com.zircky.gtceuadd.data.recipe.remove;

import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;

public class AppliedEnergistics2Remove {
  public static void init(Consumer<ResourceLocation> consumer) {
    AE2Remove(consumer);
  }

  public static void AE2Remove(Consumer<ResourceLocation> consumer) {
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_block"));
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_glass"));
    consumer.accept(new ResourceLocation("ae2:decorative/cut_quartz_block"));
    consumer.accept(new ResourceLocation("ae2:decorative/certus_quartz_bricks"));
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_vibrant_glass"));
    consumer.accept(new ResourceLocation("ae2:decorative/quartz_fixture"));
    consumer.accept(new ResourceLocation("ae2:decorative/fluix_block"));
    consumer.accept(new ResourceLocation("ae2:misc/chests_sky_stone"));
    consumer.accept(new ResourceLocation("ae2:misc/chests_smooth_sky_stone"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/inscribers"));
    consumer.accept(new ResourceLocation("ae2:network/wireless_access_point"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/crystal_processing_charger"));
    consumer.accept(new ResourceLocation("ae2:inscriber/calculation_processor_print"));
    consumer.accept(new ResourceLocation("ae2:inscriber/engineering_processor_print"));
    consumer.accept(new ResourceLocation("ae2:inscriber/logic_processor_print"));
    consumer.accept(new ResourceLocation("ae2:inscriber/silicon_print"));
    consumer.accept(new ResourceLocation("ae2:inscriber/calculation_processor"));
    consumer.accept(new ResourceLocation("ae2:inscriber/engineering_processor"));
    consumer.accept(new ResourceLocation("ae2:inscriber/logic_processor"));
    consumer.accept(new ResourceLocation("ae2:misc/tiny_tnt"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/quantum_ring"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/quantum_link"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/spatial_io_pylon"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/spatial_io_port"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/controller"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/storage_drive"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/storage_chest"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/interfaces_interface"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/pattern_providers_interface"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/cell_workbench"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/io_port"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/io_condenser"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/energy_energy_acceptor"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/energy_vibration_chamber"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/crystal_processing_growth_accelerator"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/energy_energy_cell"));
    consumer.accept(new ResourceLocation("ae2:network/blocks/energy_dense_energy_cell"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/1k_cpu_crafting_storage"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/4k_cpu_crafting_storage"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/16k_cpu_crafting_storage"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/64k_cpu_crafting_storage"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/256k_cpu_crafting_storage"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/cpu_crafting_accelerator"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/cpu_crafting_monitor"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/cpu_crafting_unit"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/molecular_assembler"));
    consumer.accept(new ResourceLocation("ae2:network/crafting/patterns_blank"));


  }
}
