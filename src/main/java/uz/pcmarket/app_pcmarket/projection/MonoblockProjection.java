package uz.pcmarket.app_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.app_pcmarket.entity.Monoblock;

@Projection(types = Monoblock.class)
public interface MonoblockProjection {
    Integer getId();

    String getName();

    String getModel();

    Double getPrice();

    Double getScreenSize();
}
