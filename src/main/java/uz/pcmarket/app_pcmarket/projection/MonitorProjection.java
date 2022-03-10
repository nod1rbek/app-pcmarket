package uz.pcmarket.app_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.app_pcmarket.entity.Monitor;

@Projection(types = Monitor.class)
public interface MonitorProjection {
    Integer getId();

    String getName();

    String getModel();

    Double getPrice();

    Double getScreenSize();
}
