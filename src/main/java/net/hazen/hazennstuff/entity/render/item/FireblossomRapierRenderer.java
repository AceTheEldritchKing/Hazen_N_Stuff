package net.hazen.hazennstuff.entity.render.item;

import net.hazen.hazennstuff.item.weapons.FireblossomRapierItem;
import net.hazen.hazennstuff.item.weapons.FireblossomRapierModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class FireblossomRapierRenderer extends GeoItemRenderer<FireblossomRapierItem> {
    public FireblossomRapierRenderer() {
        super(new FireblossomRapierModel());
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
