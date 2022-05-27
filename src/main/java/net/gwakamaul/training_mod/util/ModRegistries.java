package net.gwakamaul.training_mod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.gwakamaul.training_mod.TrainingMod;
import net.gwakamaul.training_mod.item.ModItems;

public class ModRegistries {

    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        TrainingMod.LOGGER.info("Registering Fuels for " + TrainingMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.LILAC_FLOWER_BULB, 200);
    }

}
