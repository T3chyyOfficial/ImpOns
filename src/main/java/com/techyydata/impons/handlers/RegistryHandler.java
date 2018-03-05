package com.techyydata.impons.handlers;

import com.techyydata.impons.Main;
import com.techyydata.impons.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.*;

public class RegistryHandler {
    public static void registerBlock(Block block) {
        BlockRegistrationHandler.blocks.add(block);
    }

    public static void registerBlock(Block block, ItemBlock itemBlock) {
        ForgeRegistries.BLOCKS.register(block);
        itemBlock.setRegistryName(block.getRegistryName());
        ForgeRegistries.ITEMS.register(itemBlock);
    }

    @Mod.EventBusSubscriber(modid = Reference.MOD_ID)
    public static class BlockRegistrationHandler {
        public static final Set<Block> BLOCK_LIST = new HashSet<>();
        public static final Set<Item> ITEM_LIST = new HashSet<>();

        private static final Set<Block> registeredBlockList = new HashSet<>();
        public static final List<Block> blocks = new ArrayList<>();

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            final IForgeRegistry<Block> reg = event.getRegistry();
            for (final Block block : blocks) {
                if (block.getRegistryName() != null) {
                    reg.register(block);
                    BLOCK_LIST.add(block);
                    Main.getLogger().info("Successfully added blocks: " + block.getRegistryName().getResourcePath() + " to the game.");
                } else
                    Main.getLogger().warn("Tried to register blocks without registry name, ignoring.");
            }
        }

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            final IForgeRegistry<Item> reg = event.getRegistry( );
            for (final Block item : blocks) {
                if (item.getRegistryName( ) != null) {
                    ItemBlock itemBlock = (ItemBlock) new ItemBlock(item).setRegistryName(item.getRegistryName( ));
                    reg.register(itemBlock);
                    ITEM_LIST.add(itemBlock);
                }
            }
        }
    }
}