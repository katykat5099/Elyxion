package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.Elyxion;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Elyxion.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new ElyxionRecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), ElyxionLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new ElyxionBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ElyxionItemModelProvider(packOutput, existingFileHelper));

        ElyxionBlockTagProvider blockTagProvider = generator.addProvider(event.includeServer(),
                new ElyxionBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ElyxionItemTagProvider(packOutput, lookupProvider, blockTagProvider.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeServer(), new ElyxionWorldGenProvider(packOutput, lookupProvider));
    }
}
