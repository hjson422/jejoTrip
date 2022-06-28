package io.mini.jejoTrip.domain.reviews.repository;

import io.mini.jejoTrip.domain.reviews.Reviews;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Reviews, Long> {

    List<Reviews> findByTags(String tags);

    List<Reviews> findByPlaces(String places);


}
