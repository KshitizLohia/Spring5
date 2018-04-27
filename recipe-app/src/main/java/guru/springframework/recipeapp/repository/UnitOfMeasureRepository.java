package guru.springframework.recipeapp.repository;

import guru.springframework.recipeapp.models.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
