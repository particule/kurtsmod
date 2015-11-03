package com.kurt.kurtsmod;


import com.kurt.kurtsmod.item.ModItems;
import com.kurt.kurtsmod.item.ItemWrench;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

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


    private static Item wrench;
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("**************** Boo DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());

	GameRegistry.addRecipe(new ItemStack(Items.apple),
			       "XXX", "XXX", "XXX", 'X', Blocks.dirt);

	GameRegistry.addRecipe(new ItemStack(Blocks.torch),
			       "XY", 'X', Items.stick, 'Y', Blocks.dirt);

	ResourceLocation wrenchRL = new ResourceLocation("wrench");
        if (wrenchRL != null) {
	    System.out.println("**************** wrenchRl");

	    wrench = (Item)Item.itemRegistry.getObject(new ResourceLocation("wrench"));
	}
	else {
	    System.out.println("**************** wrenchRl NULL");
	}

        if (wrench != null) {
	    System.out.println("**************** wrench is good");
	}
	else {
	    System.out.println("**************** wrench NULL");
	}
	GameRegistry.addRecipe(new ItemStack( wrench ),
			       "XY", 'X', Items.wheat_seeds, 'Y', Blocks.dirt);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
	ModItems.postInit(event);
    }

}

