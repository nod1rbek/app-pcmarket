package uz.pcmarket.app_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.app_pcmarket.entity.Monoblock;
import uz.pcmarket.app_pcmarket.projection.MonoblockProjection;

@RepositoryRestResource(path = "monoblock",excerptProjection = MonoblockProjection.class)
public interface MonoblockRepository extends JpaRepository<Monoblock, Integer> {

}
