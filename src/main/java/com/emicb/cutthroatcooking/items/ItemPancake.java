package com.emicb.cutthroatcooking.items;

import com.emicb.cutthroatcooking.Main;
import com.emicb.cutthroatcooking.init.ModItems;
import com.emicb.cutthroatcooking.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemPancake extends ItemFood implements IHasModel {

	public ItemPancake(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.FOOD);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
}
