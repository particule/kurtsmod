package com.kurt.kurtsmod;


import com.kurt.kurtsmod.item.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


@Mod(modid = KurtsMod.MODID, name = "kurtsmod", version = KurtsMod.VERSION)
public class KurtsMod
{
    public static final String MODID = "kurtsmod";
    public static final String VERSION = "1.0";
    
    //    public static Item wrench;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
	ModItems.init(event);
	//	wrench = new ItemWrench();
	//	GameRegistry.registerItem(wrench, "Wrench");
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("**************** Boo DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());

	GameRegistry.addRecipe(new ItemStack(Items.apple),
			       "XXX", "XXX", "XXX", 'X', Blocks.dirt);
	GameRegistry.addRecipe(new ItemStack(Items.arrow),
			       "XY", 'X', Items.stick, 'Y', Blocks.dirt);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
	ModItems.postInit(event);
    }

}

