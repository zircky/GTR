package com.zircky.gtceuadd.common.data.items;

import com.gregtechceu.gtceu.common.data.GTCovers;

import static com.zircky.gtceuadd.common.data.Covers.*;
import static com.zircky.gtceuadd.common.data.GTRItems.registerItem;
import static com.zircky.gtceuadd.common.data.Covers.ELECTRIC_PUMP_MAX;
import static com.zircky.gtceuadd.common.data.Covers.ELECTRIC_PUMP_ERV;
import static com.zircky.gtceuadd.common.data.Covers.ELECTRIC_PUMP_SERV;
import static com.zircky.gtceuadd.common.data.Covers.FLUID_REGULATOR_MAX;
import static com.zircky.gtceuadd.common.data.Covers.FLUID_REGULATOR_ERV;
import static com.zircky.gtceuadd.common.data.Covers.FLUID_REGULATOR_SERV;
import static com.zircky.gtceuadd.common.data.Covers.ROBOT_ARM_MAX;
import static com.zircky.gtceuadd.common.data.Covers.ROBOT_ARM_ERV;
import static com.zircky.gtceuadd.common.data.Covers.ROBOT_ARM_SERV;
import static com.zircky.gtceuadd.common.data.Covers.CONCVEYOR_MODULE_MAX;
import static com.zircky.gtceuadd.common.data.Covers.CONCVEYOR_MODULE_ERV;
import static com.zircky.gtceuadd.common.data.Covers.CONCVEYOR_MODULE_SERV;
import static com.zircky.gtceuadd.common.data.GTRItems.registerItem;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_MOTOR_MAX;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_MOTOR_ERV;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_MOTOR_SERV;
import static com.zircky.gtceuadd.common.data.GTRItems.SENSOR_MAX;
import static com.zircky.gtceuadd.common.data.GTRItems.SENSOR_ERV;
import static com.zircky.gtceuadd.common.data.GTRItems.SENSOR_SERV;
import static com.zircky.gtceuadd.common.data.GTRItems.EMITTER_MAX;
import static com.zircky.gtceuadd.common.data.GTRItems.EMITTER_ERV;
import static com.zircky.gtceuadd.common.data.GTRItems.EMITTER_SERV;
import static com.zircky.gtceuadd.common.data.GTRItems.FIELD_GENERATOR_MAX;
import static com.zircky.gtceuadd.common.data.GTRItems.FIELD_GENERATOR_ERV;
import static com.zircky.gtceuadd.common.data.GTRItems.FIELD_GENERATOR_SERV;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_PISTON_MAX;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_PISTON_ERV;
import static com.zircky.gtceuadd.common.data.GTRItems.ELECTRIC_PISTON_SERV;

public class Components {

  public static void registerItems() {
    ELECTRIC_MOTOR_MAX = registerItem("max_electric_motor", "MAX Electric Motor");
    ELECTRIC_MOTOR_ERV = registerItem("erv_electric_motor", "ERV Electric Motor");
    ELECTRIC_MOTOR_SERV = registerItem("serv_electric_motor", "SERV Electric Motor");

    FIELD_GENERATOR_MAX = registerItem("max_field_generator", "MAX Field Generator");
    FIELD_GENERATOR_ERV = registerItem("erv_field_generator", "ERV Field Generator");
    FIELD_GENERATOR_SERV = registerItem("serv_field_generator", "SERV Field Generator");

    ELECTRIC_PISTON_MAX = registerItem("max_electric_piston", "MAX Electric Piston");
    ELECTRIC_PISTON_ERV = registerItem("erv_electric_piston", "ERV Electric Piston");
    ELECTRIC_PISTON_SERV = registerItem("serv_electric_piston", "SERV Electric Piston");

    SENSOR_MAX = registerItem("max_sensor", "MAX Sensor");
    SENSOR_ERV = registerItem("erv_sensor", "ERV Sensor");
    SENSOR_SERV = registerItem("serv_servo", "SERV Sensor");

    EMITTER_MAX = registerItem("max_emitter", "MAX Emitter");
    EMITTER_ERV = registerItem("erv_emitter", "ERV Emitter");
    EMITTER_SERV = registerItem("serv_emitter", "SERV Emitter");


  }

  public static void registerComponents() {
    ELECTRIC_PUMP_MAX = registerComponent("max_electric_pump", "MAX Electric Pump", GTCovers.PUMPS[12], "item.gtceu.electric_pump.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280 * 64 * 64 * 4 / 20, "pump");
    ELECTRIC_PUMP_ERV = registerComponent("erv_electric_pump", "ERV Electric Pump", GTCovers.PUMPS[12], "item.gtceu.electric_pump.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280 * 64 * 64 * 4 / 20, "pump");
    ELECTRIC_PUMP_SERV = registerComponent("serv_electric_pump", "SERV Electric Pump", GTCovers.PUMPS[12], "item.gtceu.electric_pump.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280 * 64 * 64 * 4 / 20, "pump");

    FLUID_REGULATOR_MAX = registerComponent("max_fluid_regulator", "MAX Fluid Regulator", GTCovers.FLUID_REGULATORS[12], "item.gtceu.fluid_regulator.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280 * 64 * 64 * 4 / 20);
    FLUID_REGULATOR_ERV = registerComponent("erv_fluid_regulator", "ERV Fluid Regulator", GTCovers.FLUID_REGULATORS[12], "item.gtceu.fluid_regulator.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280 * 64 * 64 * 4 / 20);
    FLUID_REGULATOR_SERV = registerComponent("serv_fluid_regulator", "SERV Fluid Regulator", GTCovers.FLUID_REGULATORS[12], "item.gtceu.fluid_regulator.tooltip", "gtceu.universal.tooltip.fluid_transfer_rate", 1280 * 64 * 64 * 4 / 20);

    CONCVEYOR_MODULE_MAX = registerComponent("max_conveyor_module", "MAX Conveyor Module", GTCovers.CONVEYORS[12], "item.gtceu.conveyor.module.tooltip", "gtceu.universal.tooltip.item_transfer_rate_stacks", 16, "conveyor");
    CONCVEYOR_MODULE_ERV = registerComponent("erv_conveyor_module", "ERV Conveyor Module", GTCovers.CONVEYORS[12], "item.gtceu.conveyor.module.tooltip", "gtceu.universal.tooltip.item_transfer_rate_stacks", 16, "conveyor");
    CONCVEYOR_MODULE_SERV = registerComponent("serv_conveyor_module", "SERV Conveyor Module", GTCovers.CONVEYORS[12], "item.gtceu.conveyor.module.tooltip", "gtceu.universal.tooltip.item_transfer_rate_stacks", 16, "conveyor");

    ROBOT_ARM_MAX = registerComponent("max_robot_arm", "MAX Robot Arm", GTCovers.ROBOT_ARMS[12], "item.gtceu.robot.arm.tooltip", "gtceu.universal.tooltip.item_transfer_rate_stacks", 16, "robot_arm");
    ROBOT_ARM_ERV = registerComponent("erv_robot_arm", "ERV Robot Arm", GTCovers.ROBOT_ARMS[12], "item.gtceu.robot.arm.tooltip", "gtceu.universal.tooltip.item_transfer_rate_stacks", 16, "robot_arm");
    ROBOT_ARM_SERV = registerComponent("serv_robot_arm", "SERV Robot Arm", GTCovers.ROBOT_ARMS[12], "item.gtceu.robot.arm.tooltip", "gtceu.universal.tooltip.item_transfer_rate_stacks", 16, "robot_arm");
  }
}