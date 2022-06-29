package io.mini.jejoTrip.domain.reviews.controller.v1;


import io.mini.jejoTrip.domain.reviews.controller.v1.request.CommentsCreateRequest;
import io.mini.jejoTrip.domain.reviews.controller.v1.request.CommentsModifyRequest;
import io.mini.jejoTrip.domain.reviews.service.ComentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class ComentsController {

    // 필드 인젝션은 좋은 방법이 아닙니다
//    @Autowired
//    ComentService service;

    // 생성자 인젝션
    private final ComentService comentService;


    @PostMapping
    public ResponseEntity<?> create(CommentsCreateRequest request){
        comentService.create(request);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<?> getComent(

        @RequestParam Long reviewId
    ){

        return ResponseEntity.ok(comentService.getComments(reviewId));
    }

    @DeleteMapping("/{commentsId}")
    public ResponseEntity<?> deleteComent(@PathVariable Long commentsId)
                              {
        comentService.deleteComent(commentsId);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("/{commentsId}/update")
    public ResponseEntity<?> updateComent(
        @PathVariable Long commentsId,
        @RequestBody CommentsModifyRequest request
    ) {


        return ResponseEntity.ok(comentService.updateComments(commentsId, request));
    }
}
