package com.techyydata.impons;

import com.mrcrayfish.device.api.ApplicationManager;
import com.techyydata.impons.apps.ApplicationCrayOSAntivirus;
import com.techyydata.impons.apps.ApplicationDocumentWriter;
import com.techyydata.impons.handlers.ConfigurationHandler;
import com.techyydata.impons.proxy.CommonProxy;
import com.techyydata.impons.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, dependencies = Reference.DEPENDS)
public class Main {

    private static Logger logger;

    @Mod.Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog( );

        logger.info("Pre Init");

        ConfigurationHandler.load(event.getSuggestedConfigurationFile( ));
        MinecraftForge.EVENT_BUS.register(new ConfigurationHandler( ));

        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("Init");
        proxy.init(event);

        ApplicationManager.registerApplication(new ResourceLocation(Reference.MOD_ID, "document_writer"), ApplicationDocumentWriter.class);
        ApplicationManager.registerApplication(new ResourceLocation(Reference.MOD_ID, "crayos_antivirus"), ApplicationCrayOSAntivirus.class);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        logger.info("Post Init");
        proxy.postInit(event);
    }

    public static Logger getLogger() {
        return logger;
    }
}
