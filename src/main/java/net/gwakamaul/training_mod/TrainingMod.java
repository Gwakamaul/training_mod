package net.gwakamaul.training_mod;

import net.fabricmc.api.ModInitializer;
import net.gwakamaul.training_mod.block.ModBlocks;
import net.gwakamaul.training_mod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrainingMod implements ModInitializer {

	public static final String MOD_ID = "training_mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}

}
