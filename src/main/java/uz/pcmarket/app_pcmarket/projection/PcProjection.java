package uz.pcmarket.app_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.app_pcmarket.entity.Pc;

@Projection(types = Pc.class)
public interface PcProjection {
    Integer getId();

    String getName();

    String getModel();

    Double getPrice();

    Double getScreenSize();
}
