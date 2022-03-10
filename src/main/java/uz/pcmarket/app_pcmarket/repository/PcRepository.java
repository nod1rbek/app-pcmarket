package uz.pcmarket.app_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.app_pcmarket.entity.Pc;
import uz.pcmarket.app_pcmarket.projection.PcProjection;

@RepositoryRestResource(path = "pc",excerptProjection = PcProjection.class)
public interface PcRepository extends JpaRepository<Pc, Integer> {

}
