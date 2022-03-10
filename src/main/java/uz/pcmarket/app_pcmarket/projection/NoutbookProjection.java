package uz.pcmarket.app_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.app_pcmarket.entity.Noutbook;

@Projection(types = Noutbook.class)
public interface NoutbookProjection {
    Integer getId();

    String getName();

    String getModel();

    Double getPrice();

    Double getScreenSize();

    Integer getRam();

    Integer getHdd();
}
