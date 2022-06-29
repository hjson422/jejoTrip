package io.mini.jejoTrip.domain.reviews.service;

import io.mini.jejoTrip.domain.reviews.Comments;
import io.mini.jejoTrip.domain.reviews.Reviews;
import io.mini.jejoTrip.domain.reviews.controller.v1.request.CommentsCreateRequest;
import io.mini.jejoTrip.domain.reviews.controller.v1.request.CommentsModifyRequest;
import io.mini.jejoTrip.domain.reviews.dto.CommentsDTO;
import io.mini.jejoTrip.domain.reviews.repository.ComentRepository;
import io.mini.jejoTrip.domain.reviews.repository.ReviewRepository;
import io.mini.jejoTrip.domain.users.Users;
import io.mini.jejoTrip.domain.users.repository.UserRepository;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
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

        comentRepository.deleteById(id);

    }

    public CommentsDTO updateComments(Long id, CommentsModifyRequest request) {

        Comments comments = comentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("존재하지 않는 댓글입니다."));

        comments.update(request.getContent());
        return comments.convertToCommentsDTO();
    }



    public List<CommentsDTO> getComments(Long reviewId) {

        List<Comments> comments = comentRepository.findByReviewsId(reviewId);
        // dto로 변환 후 return
        List<CommentsDTO> commentsDTOList = comments.stream().map(Comments::convertToCommentsDTO)
            .collect(Collectors.toList());

        return commentsDTOList;


    }

    public void create(CommentsCreateRequest request){

        Reviews reviews = reviewRepository.findById(request.getReviewsId())
            .orElseThrow(() -> new RuntimeException("리뷰가 존재하지 않습니다."));
        Users users = userRepository.findById(request.getUsersId())
            .orElseThrow(() -> new RuntimeException("존재하지 않는 유저입니다."));

        Comments comments = Comments.ofCreate(request.getContent(), users, reviews);
        comentRepository.save(comments);
    }
}
