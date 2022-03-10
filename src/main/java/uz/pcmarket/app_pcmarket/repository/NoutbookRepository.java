package uz.pcmarket.app_pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.app_pcmarket.entity.Noutbook;
import uz.pcmarket.app_pcmarket.projection.NoutbookProjection;

@RepositoryRestResource(path = "noutbook",excerptProjection = NoutbookProjection.class)
public interface NoutbookRepository extends JpaRepository<Noutbook, Integer> {

}
