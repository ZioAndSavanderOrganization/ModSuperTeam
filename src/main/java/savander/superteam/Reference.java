package savander.superteam;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;

public class Reference {

    public static final String MODID = "superteammod";
    public static final String VERSION = "1.0";
    public static final String NAME = "SUPER Team Mod";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";

    public static final String CLIENT_PROXY_CLASS = "savander.superteam.proxy.ClientProxy";


    /**
     * Global references
     */
    public static final RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();

}
