package com.sciengex.minecraft.dmmi;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Dmmi.MODID, version = Dmmi.VERSION)
public class Dmmi
{
    public static final String MODID = "dmmi";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("======== DMMI ======== ");
    }
}
