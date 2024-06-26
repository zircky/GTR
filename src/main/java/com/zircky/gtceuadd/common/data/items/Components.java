package com.zircky.gtceuadd.common.data.items;

import com.gregtechceu.gtceu.common.data.GTCompassNodes;
import com.gregtechceu.gtceu.common.data.GTCovers;

import static com.zircky.gtceuadd.common.data.Covers.*;
import static com.zircky.gtceuadd.common.data.GTRItems.registerItem;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_MOTOR_MAX;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_MOTOR_ERV;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_MOTOR_SERV;

public class Components {

  public static void registerItems() {
    ELECTRIC_MOTOR_MAX = registerItem("max_electric_motor", "MAX Electric Motor");
    ELECTRIC_MOTOR_ERV = registerItem("erv_electric_motor", "ERV Electric Motor");
    ELECTRIC_MOTOR_SERV = registerItem("serv_electric_motor", "SERV Electric Motor");
  }

  public static void registerComponents() {
    ELECTRIC_PUMP_MAX = registerComponent("max_electric_pump", "MAX Electric Pump", GTCovers.PUMPS[12], "item.gtceu.electric_pump.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280*64*64*4/20, "pump", GTCompassNodes.COVER);
    ELECTRIC_PUMP_ERV = registerComponent("erv_electric_pump", "ERV Electric Pump", GTCovers.PUMPS[12], "item.gtceu.electric_pump.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280*64*64*4/20, "pump", GTCompassNodes.COVER);
    ELECTRIC_PUMP_SERV = registerComponent("serv_electric_pump", "SERV Electric Pump", GTCovers.PUMPS[12], "item.gtceu.electric_pump.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280*64*64*4/20, "pump", GTCompassNodes.COVER);

    FLUID_REGULATOR_MAX = registerComponent("max_fluid_regulator", "MAX Fluid Regulator", GTCovers.FLUID_REGULATORS[12], "item.gtceu.fluid_regulator.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280*64*64*4/20);
    FLUID_REGULATOR_MAX = registerComponent("erv_fluid_regulator", "ERV Fluid Regulator", GTCovers.FLUID_REGULATORS[12], "item.gtceu.fluid_regulator.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280*64*64*4/20);
    FLUID_REGULATOR_MAX = registerComponent("serv_fluid_regulator", "SERV Fluid Regulator", GTCovers.FLUID_REGULATORS[12], "item.gtceu.fluid_regulator.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280*64*64*4/20);


  }
}
