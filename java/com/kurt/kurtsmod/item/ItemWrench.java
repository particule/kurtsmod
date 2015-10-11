

package com.kurt.kurtsmod.item;

import com.kurt.kurtsmod.KurtsMod;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemWrench extends Item
{
    private String name = "wrench";
    public ItemWrench() 
    {
	super();

	GameRegistry.registerItem(this, name);

	setUnlocalizedName(KurtsMod.MODID + "_" + name);
	setCreativeTab(CreativeTabs.tabMisc);

	// This was in 1.7. For 1.8, see ModItems.java
	//	setTextureName(KurtsMod.MODID + ":" + name);

    }

    public String getName()
    {
	return name;
    }

}

