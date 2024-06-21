package me.shedaniel.lightoverlay.neoforge;

import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.neoforged.fml.common.Mod;

@Mod("lightoverlay")
public class LightOverlay {
    public LightOverlay() {
        EnvExecutor.runInEnv(Env.CLIENT, () -> LightOverlayImpl::register);
    }
}
