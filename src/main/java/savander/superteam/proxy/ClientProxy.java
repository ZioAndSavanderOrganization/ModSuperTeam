package savander.superteam.proxy;

import net.minecraft.entity.passive.EntityChicken;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import savander.superteam.animals.factories.CustomChickenRenderFactory;
import savander.superteam.contracts.ProxyContract;


public class ClientProxy implements ProxyContract {


    @Override
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(EntityChicken.class, new CustomChickenRenderFactory());
    }

    @Override
    public void Init(FMLInitializationEvent event) {
    }

    @Override
    public void PostInit(FMLPostInitializationEvent event) {

    }
}
