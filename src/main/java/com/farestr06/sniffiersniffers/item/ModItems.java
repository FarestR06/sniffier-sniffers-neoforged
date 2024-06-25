package com.farestr06.sniffiersniffers.item;

import com.farestr06.sniffiersniffers.SniffierSniffersMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(SniffierSniffersMod.MOD_ID);

    public static final Supplier<Item> TORCHFRUIT = ITEMS.registerSimpleItem(
            "torchfruit",
            new Item.Properties()
    );
    public static final Supplier<Item> RAW_MACABRE = ITEMS.registerSimpleItem(
            "raw_macabre",
            new Item.Properties()
    );
    public static final Supplier<Item> MACABRE_INGOT = ITEMS.registerSimpleItem(
            "macabre_ingot",
            new Item.Properties()
    );
    public static final Supplier<Item> MACABRE_NUGGET = ITEMS.registerSimpleItem(
            "macabre_nugget",
            new Item.Properties()
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
