package io.mini.jejoTrip.domain.reviews.controller.v1;


import io.mini.jejoTrip.domain.reviews.Coments;
import io.mini.jejoTrip.domain.reviews.dto.ComentDTO;
import io.mini.jejoTrip.domain.reviews.service.ComentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Documented;
import java.util.List;

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
    public ResponseEntity<?> create(ComentDTO comentDTO){
        comentService.create(comentDTO);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    @GetMapping("/review")
    public ResponseEntity<?> getComent(

        @RequestParam Long reviewId
    ){

        return ResponseEntity.ok(comentService.getComments(reviewId));
    }

    @DeleteMapping("{comentsId}")
    public ResponseEntity<?> deleteComent(@PathVariable Long comentsId)
                              {
        comentService.deleteComent(comentsId);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @PutMapping("")
    public ResponseEntity<?> updateComent() {


        return ResponseEntity.ok(comentService.updateComent());
    }
}
