package net.diamonc.arthfinal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.diamonc.arthfinal.ArthFinal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item FINALITEM = registerItem("finalitem",
    new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ArthFinal.MOD_ID, name), item);
    }
    public static void registerModItems() {
        ArthFinal.LOGGER.debug("Registering custom items for arthfinal");
    }
}


