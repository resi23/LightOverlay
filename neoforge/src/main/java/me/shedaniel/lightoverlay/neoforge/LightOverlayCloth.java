package me.shedaniel.lightoverlay.neoforge;

import me.shedaniel.lightoverlay.common.ClothScreen;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

public class LightOverlayCloth {
    public static void register() {
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (client, parent) -> {
            return ClothScreen.getConfigScreenByCloth(parent);
        });
    }
}
