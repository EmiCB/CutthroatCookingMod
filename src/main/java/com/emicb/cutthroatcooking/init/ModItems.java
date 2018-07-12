package com.emicb.cutthroatcooking.init;

import java.util.ArrayList;
import java.util.List;

import com.emicb.cutthroatcooking.items.ItemFryingPan;
import com.emicb.cutthroatcooking.items.ItemPancake;

import net.minecraft.item.Item;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//-----Item Declarations-----
	public static final Item PANCAKE = new ItemPancake("pancake", 4, 0.3f, false);
	public static final Item FRYING_PAN = new ItemFryingPan("frying_pan");
}
