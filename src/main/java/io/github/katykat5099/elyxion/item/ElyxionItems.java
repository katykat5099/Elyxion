package io.github.katykat5099.elyxion.item;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ElyxionItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Elyxion.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = ElyxionItems.ITEMS.register("example_item", () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEat().nutrition(1).saturationMod(2f).build())));
    public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = ITEMS.register("example_block", () -> new BlockItem(ElyxionBlocks.EXAMPLE_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
