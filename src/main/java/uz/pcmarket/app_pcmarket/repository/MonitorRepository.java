package uz.pcmarket.app_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.app_pcmarket.entity.Monitor;
import uz.pcmarket.app_pcmarket.projection.MonitorProjection;

@RepositoryRestResource(path = "monitor",excerptProjection = MonitorProjection.class)
public interface MonitorRepository extends JpaRepository<Monitor, Integer> {

}
