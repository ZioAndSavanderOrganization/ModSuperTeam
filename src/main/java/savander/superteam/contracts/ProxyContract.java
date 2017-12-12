package savander.superteam.contracts;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public interface ProxyContract {

    @Mod.EventHandler
    void preInit(FMLPreInitializationEvent event);

    @Mod.EventHandler
    void Init(FMLInitializationEvent event);

    @Mod.EventHandler
    void PostInit(FMLPostInitializationEvent event);
}
