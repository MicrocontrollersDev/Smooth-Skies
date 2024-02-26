package dev.microcontrollers.smoothskies;

import dev.microcontrollers.smoothskies.config.SmoothConfig;
import net.fabricmc.api.ModInitializer;

public class SmoothSkies implements ModInitializer {
    @Override
    public void onInitialize() {
        SmoothConfig.CONFIG.load();
    }
}
