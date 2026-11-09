package dev.volcanocookies.otherworldfreemending.mixin;

import java.util.Map;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(targets = "dev.muon.otherworldorigins.restrictions.EnchantmentRestrictions", remap = false)
abstract class EnchantmentRestrictionsMixin {
    @Shadow
    @Final
    private static Map<?, ?> ENCHANTMENT_CLASS_MAP;

    @Inject(method = "<clinit>", at = @At("TAIL"))
    private static void otherworldfreemending$removeMendingRestriction(CallbackInfo ci) {
        // ResourceLocation.toString() includes the namespace and needs no Minecraft mappings.
        ENCHANTMENT_CLASS_MAP.keySet().removeIf(key -> "minecraft:mending".equals(key.toString()));
    }
}
