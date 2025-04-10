package net.teamluxron.gooberarsenal.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.teamluxron.gooberarsenal.GooberArsenal;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GooberArsenal.MOD_ID);


    //Crafting Ingredients
    public static final RegistryObject<Item> OBSIDIAN_HILT = ITEMS.register("obsidian_hilt",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> OBSIDIAN_HANDGUARD = ITEMS.register("obsidian_handguard",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> GOOBER_UPGRADE_TEMPLATE = ITEMS.register("goober_upgrade_template",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CAGITE_SCRAP = ITEMS.register("cagite_scrap",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> CAGITE_INGOT = ITEMS.register("cagite_ingot",
            () -> new Item(new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> KEVIN_SHARDS = ITEMS.register("kevin_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LIFE_SAVER = ITEMS.register("life_saver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER_CHICKEN = ITEMS.register("rubber_chicken",
            () -> new Item(new Item.Properties()));
//    public static final RegistryObject<Item> BUSINESS_CASE = ITEMS.register("business_case",
//            () -> new Item(new Item.Properties()));



    //Consumables
    public static final RegistryObject<Item> ENERGY_BAR = ITEMS.register("energy_bar",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ENERGY_BAR).rarity(Rarity.EPIC)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.gooberarsenal.energy_bar"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> SANDVICH = ITEMS.register("sandvich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SANDVICH)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.gooberarsenal.sandvich"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> CHOCOLATE_CHIP_PANCAKES = ITEMS.register("chocolate_chip_pancakes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHOCOLATE_CHIP_PANCAKES)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.gooberarsenal.chocolate_chip_pancakes"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> COPPER_APPLE = ITEMS.register("copper_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.COPPER_APPLE).rarity(Rarity.UNCOMMON)) {
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    pTooltipComponents.add(Component.translatable("tooltip.gooberarsenal.copper_apple"));
                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
