package com.kurt.kurtsmod.item;

import com.kurt.kurtsmod.KurtsMod;
import com.kurt.kurtsmod.item.ItemWrench;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

public class ModItems
{
	public static Item wrench;

	public static void init(FMLPreInitializationEvent event)
	{
	    wrench = new ItemWrench();
	}

	public static void postInit(FMLPostInitializationEvent event)
	{
		if (event.getSide() == Side.CLIENT)
		{
			RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();

			String path = KurtsMod.MODID + ":" + ((ItemWrench) wrench).getName();
			System.out.println("**************** ModItem texture path>> " + path);

			renderItem.getItemModelMesher().register(wrench, 0, new ModelResourceLocation(path, "inventory"));
		}
	}
}
