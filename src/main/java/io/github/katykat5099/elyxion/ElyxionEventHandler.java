package io.github.katykat5099.elyxion;

import io.github.katykat5099.elyxion.gameplay.ElyxionDamageTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "elyxion")
public class ElyxionEventHandler {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        // Negatively affect the player the deeper they go into the world, starting below 10
        Player player = event.player;
        if (!(player.level() instanceof ServerLevel serverLevel)) return;
        double y = player.getY();

        if (y < 10) {
            int depth = (int)(y);
            float scale = (10 - depth) / 74f;

            float damage = Math.min(scale * 10f, 10.0f);
            int interval = (int)(600 - scale * (600 - 40));

            if (player.tickCount % interval == 0) {
                if (depth <= 5) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, interval, 1, false, false, true));
                } if (depth <= -5) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, interval, 2, false, false, true));
                } if (depth <= -20) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, interval, 2, false, false, true));
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, interval, 1, false, false, true));
                } if (depth <= -30) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, interval, 3, false, false, true));
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, interval, 2, false, false, true));
                    player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 80, 1, false, false, true));
                }

                player.hurt(ElyxionDamageTypes.pressure(serverLevel), damage);
            }
        }
    }
}
