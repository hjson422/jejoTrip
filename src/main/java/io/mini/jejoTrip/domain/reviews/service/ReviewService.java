package io.mini.jejoTrip.domain.reviews.service;

import io.mini.jejoTrip.domain.reviews.Reviews;
import io.mini.jejoTrip.domain.reviews.dto.ReviewsDTO;
import io.mini.jejoTrip.domain.reviews.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
public class ReviewService  {
    private ReviewRepository reviewRepository;


    public Long regiReview(ReviewsDTO reviewsDTO) {

        return reviewRepository.save(reviewsDTO.toEntity()).getId();
    }

   @Transactional(readOnly = true)
    public String searchArticleByPlace(String place){
        List<Reviews> result = reviewRepository.findByPlace(place);
        return "??";
   }

}