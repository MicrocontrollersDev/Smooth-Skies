package dev.microcontrollers.smoothskies.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {
	@ModifyArg(method = "method_37365", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/BackgroundRenderer;applyFog(Lnet/minecraft/client/render/Camera;Lnet/minecraft/client/render/BackgroundRenderer$FogType;FZF)V"), index = 2)
	private static float setMaxFogViewDistance(float h) {
		return Math.min(h, 96); // i found 96 to be a good value where it smooths nicely, maybe allow for config in future
	}
}
