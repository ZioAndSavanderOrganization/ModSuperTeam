package savander.superteam.animals.factories;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import savander.superteam.animals.renderers.CustomChickenRender;

public class CustomChickenRenderFactory implements IRenderFactory<EntityChicken> {

    @Override
    public Render<EntityChicken> createRenderFor(RenderManager manager) {
        return new CustomChickenRender(manager);
    }
}
