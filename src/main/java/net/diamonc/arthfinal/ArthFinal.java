package net.diamonc.arthfinal;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArthFinal implements ModInitializer {
	public static final String MOD_ID = "arthfinal";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
			ModItems.registerModItems();
	}
}
