package com.zircky.gtceuadd.common.data.items;

import com.gregtechceu.gtceu.api.registry.registrate.CompassSection;
import com.gregtechceu.gtceu.common.data.GTCompassSections;
import com.gregtechceu.gtceu.common.data.GTItems;
import com.gregtechceu.gtceu.data.recipe.CustomTags;
import com.lowdragmc.lowdraglib.gui.texture.ItemStackTexture;

import static com.zircky.gtceuadd.common.data.GTRItems.*;
import static com.zircky.gtceuadd.data.recipe.CustemTags.ERV_CIRCUITS;

public class Circuit {
  private static int priority = 0;

  public static void register() {
    SMD_TRANSISTOR_REFINED = registerItem("smd_transistor_refined", "SMD Transistor Refined");
    SMD_RESISTOR_REFINED = registerItem("smd_resistor_refined", "SMD Resistor Refined");
    SMD_CAPACITOR_REFINED = registerItem("smd_capacitor_refined", "SMD Capacitor Refined");
    SMD_INDUCTOR_REFINED = registerItem("smd_inductor_refined", "SMD Inductor Refined");
    SMD_DIOD_REFINED = registerItem("smd_diode_refined", "SMD Diode Refined");

    SMD_TRANSISTOR_NANO = registerItem("smd_transistor_nano", "SMD Transistor Nano");
    SMD_RESISTOR_NANO = registerItem("smd_resistor_nano", "SMD Resistor Nano");
    SMD_CAPACITOR_NANO = registerItem("smd_capacitor_nano", "SMD Capacitor Nano");
    SMD_INDUCTOR_NANO = registerItem("smd_inductor_nano", "SMD Inductor Nano");
    SMD_DIODE_NANO = registerItem("smd_diode_nano", "SMD Diode Nano");

    SMD_TRANSISTOR_CRYSTAL = registerItem("smd_transistor_crystal", "SMD Transistor Crystal");
    SMD_RESISTOR_CRYSTAL = registerItem("smd_resistor_crystal", "SMD Resistor Crystal");
    SMD_CAPACITOR_CRYSTAL = registerItem("smd_capacitor_crystal", "SMD Capacitor Crystal");
    SMD_INDUCTOR_CRYSTAL = registerItem("smd_inductor_crystal", "SMD Inductor Crystal");
    SMD_DIODE_CRYSTAL = registerItem("smd_diode_crystal", "SMD Diode Crystal");

    SMD_TRANSISTOR_QUANTUM = registerItem("smd_transistor_quantum", "SMD Transistor Quantum");
    SMD_RESISTOR_QUANTUM = registerItem("smd_resistor_quantum", "SMD Resistor Quantum");
    SMD_CAPACITOR_QUANTUM = registerItem("smd_capacitor_quantum", "SMD Capacitor Quantum");
    SMD_INDUCTOR_QUANTUM = registerItem("smd_inductor_quantum", "SMD Inductor Quantum");
    SMD_DIODE_QUANTUM = registerItem("smd_diode_quantum", "SMD Diode Quantum");

    SMD_TRANSISTOR_WETWARE = registerItem("smd_transistor_wetware", "SMD Transistor Wetware");
    SMD_RESISTOR_WETWARE = registerItem("smd_resistor_wetware", "SMD Resistor Wetware");
    SMD_CAPACITOR_WETWARE = registerItem("smd_capacitor_wetware", "SMD Capacitor Wetware");
    SMD_INDUCTOR_WETWARE = registerItem("smd_inductor_wetware", "SMD Inductor Wetware");
    SMD_DIODE_WETWARE = registerItem("smd_diode_wetware", "SMD Diode Wetware");

    SMD_TRANSISTOR_BIOWARE = registerItem("smd_transistor_bioware", "SMD Transistor Bioware");
    SMD_RESISTOR_BIOWARE = registerItem("smd_resistor_bioware", "SMD Resistor Bioware");
    SMD_CAPACITOR_BIOWARE = registerItem("smd_capacitor_bioware", "SMD Capacitor Bioware");
    SMD_INDUCTOR_BIOWARE = registerItem("smd_inductor_bioware", "SMD Inductor Bioware");
    SMD_DIODE_BIOWARE = registerItem("smd_diode_bioware", "SMD Diode Bioware");

    SMD_TRANSISTOR_OPTICAL = registerItem("smd_transistor_optical", "SMD Transistor Optical");
    SMD_RESISTOR_OPTICAL = registerItem("smd_resistor_optical", "SMD Resistor Optical");
    SMD_CAPACITOR_OPTICAL = registerItem("smd_capacitor_optical", "SMD Capacitor Optical");
    SMD_INDUCTOR_OPTICAL = registerItem("smd_inductor_optical", "SMD Inductor Optical");
    SMD_DIODE_OPTICAL = registerItem("smd_diode_optical", "SMD Diode Optical");

    SMD_TRANSISTOR_COSMIC = registerItem("smd_transistor_cosmic", "SMD Transistor Cosmic");
    SMD_RESISTOR_COSMIC = registerItem("smd_resistor_cosmic", "SMD Resistor Cosmic");
    SMD_CAPACITOR_COSMIC = registerItem("smd_capacitor_cosmic", "SMD Capacitor Cosmic");
    SMD_INDUCTOR_COSMIC = registerItem("smd_inductor_cosmic", "SMD Inductor Cosmic");
    SMD_DIODE_COSMIC = registerItem("smd_diode_cosmic", "SMD Diode Cosmic");

    SMD_TRANSISTOR_SUPRACAUSAL = registerItem("smd_transistor_supracausal", "SMD Transistor Supracausal");
    SMD_RESISTOR_SUPRACAUSAL = registerItem("smd_resistor_supracausal", "SMD Resistor Supracausal");
    SMD_CAPACITOR_SUPRACAUSAL = registerItem("smd_capacitor_supracausal", "SMD Capacitor Supracausal");
    SMD_INDUCTOR_SUPRACAUSAL = registerItem("smd_inductor_supracausal", "SMD Inductor Supracausal");
    SMD_DIODE_SUPRACAUSAL = registerItem("smd_diode_supracausal", "SMD Diode Supracausal");

    SMD_TRANSISTOR_EXOTIC = registerItem("smd_transistor_exotic", "SMD Transistor Exotic");
    SMD_RESISTOR_EXOTIC = registerItem("smd_resistor_exotic", "SMD Resistor Exotic");
    SMD_CAPACITOR_EXOTIC = registerItem("smd_capacitor_exotic", "SMD Capacitor Exotic");
    SMD_INDUCTOR_EXOTIC = registerItem("smd_inductor_exotic", "SMD Inductor Exotic");
    SMD_DIODE_EXOTIC = registerItem("smd_diode_exotic", "SMD Diode Exotic");

    SMD_TRANSISTOR_UNKNOWN = registerItem("smd_transistor_unknown", "SMD Transistor (Unknown)");
    SMD_RESISTOR_UNKNOWN = registerItem("smd_resistor_unknown", "SMD Resistor (Unknown)");
    SMD_CAPACITOR_UNKNOWN = registerItem("smd_capacitor_unknown", "SMD Capacitor (Unknown)");
    SMD_INDUCTOR_UNKNOWN = registerItem("smd_inductor_unknown", "SMD Inductor (Unknown)");
    SMD_DIODE_UNKNOWN = registerItem("smd_diode_unknown", "SMD Diode (Unknown)");

    BIOWARE_PROCESSOR = registerItem("bioware_processor", "BioWare Processor", CustomTags.ZPM_CIRCUITS);
    BIOWARE_ASSEMBL = registerItem("bioware_assembler", "BioWare Assembler", CustomTags.UV_CIRCUITS);
    BIOWARE_COMPUTER = registerItem("bioware_computer", "BioWare Computer", CustomTags.UHV_CIRCUITS);
    BIOWARE_MAINFRAME = registerItem("bioware_mainframe", "BioWare Mainframe", CustomTags.UEV_CIRCUITS);

    OPTICAL_PROCESSOR = registerItem("optical_processor", "Optical Processor", CustomTags.UV_CIRCUITS);
    OPTICAL_ASSEMBLY = registerItem("optical_assembler", "Optical Assembler", CustomTags.UHV_CIRCUITS);
    OPTICAL_COMPUTER = registerItem("optical_computer", "Optical Computer", CustomTags.UEV_CIRCUITS);
    OPTICAL_MAINFRAME = registerItem("optical_mainframe", "Optical Mainframe", CustomTags.UIV_CIRCUITS);

    EXOTIC_PROCESSOR = registerItem("exotic_processor", "Exotic Processor", CustomTags.UHV_CIRCUITS);
    EXOTIC_ASSEMBLY = registerItem("exotic_assembler", "Exotic Assembler", CustomTags.UEV_CIRCUITS);
    EXOTIC_COMPUTER = registerItem("exotic_computer", "Exotic Computer", CustomTags.UIV_CIRCUITS);
    EXOTIC_MAINFRAME = registerItem("exotic_mainframe", "Exotic Mainframe", CustomTags.UXV_CIRCUITS);

    COSMIC_PROCESSOR = registerItem("cosmic_processor", "Cosmic Processor", CustomTags.UEV_CIRCUITS);
    COSMIC_ASSEMBLY = registerItem("cosmic_assembler", "Cosmic Assembler", CustomTags.UIV_CIRCUITS);
    COSMIC_COMPUTER = registerItem("cosmic_computer", "Cosmic Computer", CustomTags.UXV_CIRCUITS);
    COSMIC_MAINFRAME = registerItem("cosmic_mainframe", "Cosmic Mainframe", CustomTags.OpV_CIRCUITS);

    UNKNOWN_PROCESSOR = registerItem("unknown_processor", "Unknown Processor", CustomTags.UIV_CIRCUITS);
    UNKNOWN_ASSEMBLY = registerItem("unknown_assembler", "Unknown Assembler", CustomTags.UXV_CIRCUITS);
    UNKNOWN_COMPUTER = registerItem("unknown_computer", "Unknown Computer", CustomTags.OpV_CIRCUITS);
    UNKNOWN_MAINFRAME = registerItem("unknown_mainframe", "Unknown Mainframe", CustomTags.MAX_CIRCUITS);

    SUPRACAUSAL_PROCESSOR = registerItem("supracausal_processor", "Supracausal Processor", CustomTags.UXV_CIRCUITS);
    SUPRACAUSAL_ASSEMBLY = registerItem("supracausal_assembler", "Supracausal Assembler", CustomTags.OpV_CIRCUITS);
    SUPRACAUSAL_COMPUTER = registerItem("supracausal_computer", "Supracausal Computer", CustomTags.MAX_CIRCUITS);
    SUPRACAUSAL_MAINFRAME = registerItem("supracausal_mainframe", "Supracausal Mainframe", ERV_CIRCUITS);
  }
}

