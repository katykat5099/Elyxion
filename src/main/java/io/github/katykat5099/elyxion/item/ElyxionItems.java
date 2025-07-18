package io.github.katykat5099.elyxion.item;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.ElyxionToolTiers;
import io.github.katykat5099.elyxion.block.ElyxionBlocks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ElyxionItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Elyxion.MODID);

    // Materials
    public static final RegistryObject<Item> ENVELOPE = ITEMS.register("envelope", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PERCH = ITEMS.register("perch", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COTTON = ITEMS.register("cotton", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILK = ITEMS.register("silk", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CLOTHING_PART = ITEMS.register("clothing_part", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_RING = ITEMS.register("metal_ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METAL_PIN = ITEMS.register("metal_pin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PRONG = ITEMS.register("prong", () -> new Item(new Item.Properties()));

    // Usable Items
    public static final RegistryObject<Item> LETTER = ITEMS.register("letter", () -> new Item(new Item.Properties()));

    // Tools
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ElyxionToolTiers.COPPER, 1, -2.8F, new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
