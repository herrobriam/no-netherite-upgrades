package net.herrobriam.nonetheriteupgrades;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoNetheriteUpgrades implements ModInitializer {
	public static final String MOD_ID = "no-netherite-upgrades";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("No Netherite Upgrades loaded.");
	}
}