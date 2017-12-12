package savander.superteam;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import savander.superteam.contracts.ProxyContract;

import static net.minecraftforge.fml.common.Mod.Instance;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class SuperTeam {

    @Instance
    public static SuperTeam instance = new SuperTeam();

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS)
    public static ProxyContract proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

}

