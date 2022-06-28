package io.mini.jejoTrip.domain.reviews.service;

import io.mini.jejoTrip.domain.reviews.Coments;
import io.mini.jejoTrip.domain.reviews.dto.ComentDTO;
import io.mini.jejoTrip.domain.reviews.repository.ComentRepository;
import io.mini.jejoTrip.domain.reviews.repository.ReviewRepository;
import io.mini.jejoTrip.domain.users.Users;
import io.mini.jejoTrip.domain.users.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.TypeToken;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class ComentService {

    private final ComentRepository comentRepository;
    private final UserRepository userRepository;

    private final ReviewRepository reviewRepository;
    public void deleteComent(Long id) {
    }

    public void updateComent(Long id, ComentDTO dto) {
    }



    public List<ComentDTO> getComments(Long reviewId) {

        List<Coments> byReviewsId = comentRepository.findByReviewsId(reviewId);
        // dto로 변환 후 return



    }

    public void create(ComentDTO comentDTO){
        Coments coments = Coments.ofCreate(comentDTO);
        comentRepository.save(coments);
    }
}
