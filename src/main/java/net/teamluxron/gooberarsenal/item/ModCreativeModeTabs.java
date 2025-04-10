package net.teamluxron.gooberarsenal.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.teamluxron.gooberarsenal.GooberArsenal;
import net.teamluxron.gooberarsenal.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GooberArsenal.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GOOBER_BLOCKS = CREATIVE_MODE_TABS.register("goober_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.KEVIN_BLOCK.get()))
                    .title(Component.translatable("creativetab.gooberarsenal.goober_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.KEVIN_BLOCK.get());
                        output.accept(ModBlocks.KEVIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_KEVIN_ORE.get());


                        output.accept(ModBlocks.ANCIENT_CAGITE.get());
                        output.accept(ModBlocks.CAGITE_BLOCK.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> GOOBER_ITEMS = CREATIVE_MODE_TABS.register("goober_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.KEVIN_SHARDS.get()))
                    .withTabsBefore(GOOBER_BLOCKS.getId())
                    .title(Component.translatable("creativetab.gooberarsenal.goober_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.OBSIDIAN_HILT.get());
                        output.accept(ModItems.OBSIDIAN_HANDGUARD.get());
                        output.accept(ModItems.GOOBER_UPGRADE_TEMPLATE.get());
                        output.accept(ModItems.CAGITE_SCRAP.get());
                        output.accept(ModItems.CAGITE_INGOT.get());
                        output.accept(ModItems.KEVIN_SHARDS.get());
                        output.accept(ModItems.IRON_PLATE.get());
                        output.accept(ModItems.LIFE_SAVER.get());
                        output.accept(ModItems.RUBBER_CHICKEN.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> GOOBER_CONSUMABLES = CREATIVE_MODE_TABS.register("goober_consumables",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SANDVICH.get()))
                    .withTabsBefore(GOOBER_BLOCKS.getId())
                    .title(Component.translatable("creativetab.gooberarsenal.goober_consumables"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENERGY_BAR.get());
                        output.accept(ModItems.SANDVICH.get());
                        output.accept(ModItems.CHOCOLATE_CHIP_PANCAKES.get());
                        output.accept(ModItems.COPPER_APPLE.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
