package com.techyydata.impons;

import com.mrcrayfish.device.api.ApplicationManager;
import com.techyydata.impons.apps.ApplicationCrayOSAntivirus;
import com.techyydata.impons.apps.ApplicationDocumentWriter;
import com.techyydata.impons.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, dependencies = Reference.DEPENDS)
public class Main
{

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        ApplicationManager.registerApplication(new ResourceLocation(Reference.MOD_ID, "document_writer"), ApplicationDocumentWriter.class);
        ApplicationManager.registerApplication(new ResourceLocation(Reference.MOD_ID, "crayos_antivirus"), ApplicationCrayOSAntivirus.class);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
