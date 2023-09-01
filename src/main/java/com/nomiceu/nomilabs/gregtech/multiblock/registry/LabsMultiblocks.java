package com.nomiceu.nomilabs.gregtech.multiblock.registry;

import com.nomiceu.nomilabs.gregtech.multiblock.MetaTileEntityGreenhouse;
import com.nomiceu.nomilabs.util.RegistryNames;
import gregtech.common.metatileentities.MetaTileEntities;

public class LabsMultiblocks {
    public static void postInit() {
        MetaTileEntities.registerMetaTileEntity(32000, new MetaTileEntityGreenhouse(RegistryNames.makeLabsName("greenhouse"))); // Get a set id later, use 32000 for now
    }
}