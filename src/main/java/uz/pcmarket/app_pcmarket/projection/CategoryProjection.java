package uz.pcmarket.app_pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.app_pcmarket.entity.*;

@Projection(types = Category.class)
public interface CategoryProjection {
    Integer getId();

    String getName();

    Category getParentCategory();

    Pc getPc();

    Monitor getMonitor();

    Noutbook getNoutbook();

    Printer getPrinter();

    Monoblock getMonoblock();
}
