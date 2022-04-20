package net.thunderstrikers.oresmod;

import net.fabricmc.api.ModInitializer;
import net.thunderstrikers.oresmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OresMod implements ModInitializer {
	public static final String MOD_ID = "oresmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
