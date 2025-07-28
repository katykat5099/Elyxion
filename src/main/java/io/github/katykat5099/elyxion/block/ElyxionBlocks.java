package io.github.katykat5099.elyxion.block;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.item.ElyxionItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ElyxionBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Elyxion.MODID);

    public static final RegistryObject<Block> BIRD_POST = registerBlock("bird_post", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> HOME_PERCH = registerBlock("home_perch", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> MAILBOX = registerBlock("mailbox", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> BULLETIN_BOARD = registerBlock("bulletin_board", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> CARPENTRY_STATION = registerBlock("carpentry_station", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> JEWEL_CUTTER = registerBlock("jewel_cutter", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SEWING_MACHINE = registerBlock("sewing_machine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRAP = registerBlock("trap", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> ANIMAL_TOTEM = registerBlock("animal_totem", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    // Hardstone
    public static final RegistryObject<Block> HARDSTONE = registerBlock("hardstone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 2.0F))
    );
    public static final RegistryObject<Block> HARDCOBBLESTONE = registerBlock("hardcobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 2.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_COAL_ORE = registerBlock("hardstone_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(2.0F, 2.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_IRON_ORE = registerBlock("hardstone_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_COPPER_ORE = registerBlock("hardstone_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_GOLD_ORE = registerBlock("hardstone_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_REDSTONE_ORE = registerBlock("hardstone_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_EMERALD_ORE = registerBlock("hardstone_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_LAPIS_ORE = registerBlock("hardstone_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> HARDSTONE_DIAMOND_ORE = registerBlock("hardstone_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );

    // Obdurite
    public static final RegistryObject<Block> OBDURITE = registerBlock("obdurite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> FRACTURED_OBDURITE = registerBlock("fractured_obdurite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> GLOWING_FRACTURED_OBDURITE = registerBlock("glowing_fractured_obdurite",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_COAL_ORE = registerBlock("obdurite_coal_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_IRON_ORE = registerBlock("obdurite_iron_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_COPPER_ORE = registerBlock("obdurite_copper_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_GOLD_ORE = registerBlock("obdurite_gold_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_REDSTONE_ORE = registerBlock("obdurite_redstone_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_EMERALD_ORE = registerBlock("obdurite_emerald_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_LAPIS_ORE = registerBlock("obdurite_lapis_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );
    public static final RegistryObject<Block> OBDURITE_DIAMOND_ORE = registerBlock("obdurite_diamond_ore",
            () -> new Block(BlockBehaviour.Properties.of()
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 6.0F))
    );

    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ElyxionItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
