package com.nomiceu.nomilabs.recipe;

import com.nomiceu.nomilabs.gregtech.recipe.LabsRecipeMaps;
import com.nomiceu.nomilabs.item.registry.LabsItems;
import gregtech.api.GTValues;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

@SuppressWarnings("unused")
public class LabsTestRecipes {
    public static void initRecipes() {
        assert Blocks.SAPLING != null;
        assert Blocks.LOG != null;
        LabsRecipeMaps.GREENHOUSE_RECIPES.recipeBuilder().duration(1200).EUt(GTValues.VHA[GTValues.MV])
                .input(Blocks.SAPLING)
                .output(Blocks.LOG)
                .buildAndRegister();

        for (var recipeBuilder : LabsRecipeMaps.MICROVERSE_RECIPES) {
            recipeBuilder.recipeBuilder().duration(9408).EUt(GTValues.VA[GTValues.LuV])
                .input(LabsItems.T1_SHIP)
                .output(Blocks.REDSTONE_ORE, 64)
                .buildAndRegister();
        }

        LabsRecipeMaps.CREATIVE_TANK_RECIPES.recipeBuilder().duration(1200).EUt(40)
                .input(Blocks.SAPLING)
                .output(Blocks.LOG)
                .buildAndRegister();

        for (var recipeBuilder : LabsRecipeMaps.NAQUADAH_REACTOR_RECIPES) {
            recipeBuilder.recipeBuilder()
                    .duration(938)
                    .EUt((int) (GTValues.V[GTValues.ZPM] * 3))
                    .inputs(OreDictUnifier.get(OrePrefix.bolt, Materials.NaquadahEnriched))
                    .outputs(OreDictUnifier.get(OrePrefix.bolt, Materials.NaquadahEnriched))
                    .buildAndRegister();
        }

        LabsRecipeMaps.ACTUALIZATION_CHAMBER_RECIPES.recipeBuilder().duration(1200).EUt(40)
                .input(LabsItems.T8_STABILIZED_MATTER).circuitMeta(1)
                .output(Blocks.LOG, 128)
                .buildAndRegister();

        LabsRecipeMaps.UNIVERSAL_CRYSTALIZER_RECIPES.recipeBuilder().duration(1200).EUt(40)
                .input(Blocks.SAPLING).circuitMeta(1)
                .output(Blocks.LOG, 128)
                .buildAndRegister();

        LabsRecipeMaps.DME_SIM_CHAMBER_RECIPES.recipeBuilder().duration(1200).EUt(40)
                .inputs(new ItemStack(Blocks.SAPLING), new ItemStack(LabsItems.PULSATING_DUST))
                .output(Blocks.LOG, 64).output(Blocks.LOG, 64)
                .buildAndRegister();
    }
}
