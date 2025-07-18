package io.github.katykat5099.elyxion;

import io.github.katykat5099.elyxion.gameplay.ElyxionDamageTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "elyxion")
public class ElyxionEventHandler {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        // Damage player the deeper they go into the world, starting below 10
        Player player = event.player;
        if (!(player.level() instanceof ServerLevel serverLevel)) return;
        double y = player.getY();

        if (y < 10) {
            int depth = (int)(20 - y);
            float damage = Math.min(0.5f + (depth * 0.01f), 3.0f);
            if (player.tickCount % 100 == 0) {
                player.hurt(ElyxionDamageTypes.pressure(serverLevel), damage);
            }
        }
    }
}
