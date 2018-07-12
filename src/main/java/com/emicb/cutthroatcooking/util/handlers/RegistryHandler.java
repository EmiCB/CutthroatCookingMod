package com.emicb.cutthroatcooking.util.handlers;

import com.emicb.cutthroatcooking.init.ModItems;
import com.emicb.cutthroatcooking.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {
	//Item
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	//Block
//	@SubscribeEvent
//	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
//		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
//	}
	//IHasModel
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item item : ModItems.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
//		for(Block block : ModBlocks.BLOCKS) {
//			if(block instanceof IHasModel) {
//				((IHasModel)block).registerModels();
//			}
//		}
	}
}
