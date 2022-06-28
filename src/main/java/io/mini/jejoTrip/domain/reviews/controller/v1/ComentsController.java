package io.mini.jejoTrip.domain.reviews.controller.v1;


import io.mini.jejoTrip.domain.reviews.Coments;
import io.mini.jejoTrip.domain.reviews.dto.ComentDTO;
import io.mini.jejoTrip.domain.reviews.service.ComentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Documented;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/")
public class ComentsController {

    @Autowired
    ComentService service;


    @GetMapping("/review/{id}/coment")
    public ResponseEntity<List<ComentDTO>> getComent(@PathVariable("id")Long id){
       return ResponseEntity.ok(service.getComents(id));
    }

    @DeleteMapping("/review/{id}/coment/{id}")
    public void deleteComent(@PathVariable("id")Long id)
                              {
        service.deleteComent(id);
        System.out.println(id + "댓글 삭제 완료");
    }

    @PutMapping("/review/{id}/coment/{id}")
    public void putComent(@PathVariable("id") Long id,
                          ComentDTO dto) {

        service.updateComent(id,dto);
        System.out.println(id + "댓글 수정 완료");
    }
}
