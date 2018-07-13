package com.emicb.cutthroatcooking.items;

import com.emicb.cutthroatcooking.Main;
import com.emicb.cutthroatcooking.init.ModItems;
import com.emicb.cutthroatcooking.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemRollingPin extends ItemSword implements IHasModel {

	public ItemRollingPin(String name, ToolMaterial material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
