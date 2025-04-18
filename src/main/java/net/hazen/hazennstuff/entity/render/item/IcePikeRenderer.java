package net.hazen.hazennstuff.entity.render.item;

import net.hazen.hazennstuff.item.weapons.IcePikeItem;
import net.hazen.hazennstuff.item.weapons.IcePikeModel;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class IcePikeRenderer extends GeoItemRenderer<IcePikeItem> {
    public IcePikeRenderer() {
        super(new IcePikeModel());
        // Uncomment this for glowing items
        // Don't forget the glowmasks! ;D
        //addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
