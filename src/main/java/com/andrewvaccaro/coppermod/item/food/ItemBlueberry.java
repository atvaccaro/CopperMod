package com.andrewvaccaro.coppermod.item.food;

import com.andrewvaccaro.coppermod.CopperMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;

public class ItemBlueberry extends ItemSeedFood
{

    public ItemBlueberry()
    {
        super(1, 0.3F, CopperModItems.blueberryBlock, Blocks.farmland);
        setUnlocalizedName("blueberry");
        setTextureName("coppermod:blueberry");
        setCreativeTab(CreativeTabs.tabFood);
    }
}