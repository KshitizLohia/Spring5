package guru.springframework.recipeapp.repository;

import guru.springframework.recipeapp.models.Category;
import guru.springframework.recipeapp.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);

}
