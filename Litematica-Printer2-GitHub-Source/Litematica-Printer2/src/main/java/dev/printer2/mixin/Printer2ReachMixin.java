package dev.printer2.mixin;

import dev.printer2.Printer2State;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Prototype mixin. Minecraft 26.2 mappings may change this target/signature;
 * verify against the exact client source before relying on this mixin.
 */
@Mixin(ClientPlayerInteractionManager.class)
public abstract class Printer2ReachMixin {
    @Inject(method = "getReachDistance", at = @At("RETURN"), cancellable = true, require = 0)
    private void printer2$extendReach(CallbackInfoReturnable<Float> cir) {
        if (Printer2State.enabled) {
            cir.setReturnValue((float) Math.max(cir.getReturnValue(), Printer2State.reach));
        }
    }
}
