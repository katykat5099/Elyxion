package io.github.katykat5099.elyxion;

import io.github.katykat5099.elyxion.item.ElyxionItems;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ElyxionCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Elyxion.MODID);

    public static final RegistryObject<CreativeModeTab> ELYXION_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ElyxionItems.ENVELOPE.get().getDefaultInstance())
            .title(Component.translatable("creative_tab.elyxion_tab"))
            .displayItems((parameters, output) -> {
                output.accept(ElyxionItems.ENVELOPE.get());
                output.accept(ElyxionItems.PERCH.get());
                output.accept(ElyxionItems.COTTON.get());
                output.accept(ElyxionItems.CLOTH.get());
                output.accept(ElyxionItems.SILK.get());
                output.accept(ElyxionItems.CLOTHING_PART.get());
                output.accept(ElyxionItems.LETTER.get());
                output.accept(ElyxionBlocks.BIRD_POST.get());
                output.accept(ElyxionBlocks.HOME_PERCH.get());
                output.accept(ElyxionBlocks.MAILBOX.get());
                output.accept(ElyxionBlocks.BULLETIN_BOARD.get());
                output.accept(ElyxionBlocks.CARPENTRY_STATION.get());
                output.accept(ElyxionBlocks.JEWEL_CUTTER.get());
                output.accept(ElyxionBlocks.SEWING_MACHINE.get());
                output.accept(ElyxionBlocks.TRAP.get());
                output.accept(ElyxionBlocks.ANIMAL_TOTEM.get());
                output.accept(ElyxionBlocks.HARDSTONE.get());
                output.accept(ElyxionBlocks.OBDURITE.get());
            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
