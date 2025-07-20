package io.github.katykat5099.elyxion.datagen;

import io.github.katykat5099.elyxion.Elyxion;
import io.github.katykat5099.elyxion.item.ElyxionItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ElyxionItemModelProvider extends ItemModelProvider {
    public ElyxionItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Elyxion.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ElyxionItems.ENVELOPE);
        simpleItem(ElyxionItems.PERCH);
        simpleItem(ElyxionItems.COTTON);
        simpleItem(ElyxionItems.CLOTH);
        simpleItem(ElyxionItems.SILK);
        simpleItem(ElyxionItems.CLOTHING_PART);
        simpleItem(ElyxionItems.LETTER);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(Elyxion.MODID, "item/" + item.getId().getPath()));
    }
}
