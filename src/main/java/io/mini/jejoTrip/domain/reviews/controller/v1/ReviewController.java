package io.mini.jejoTrip.domain.reviews.controller.v1;

import io.mini.jejoTrip.domain.reviews.dto.ReviewsDTO;
import io.mini.jejoTrip.domain.reviews.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/review")
public class ReviewController {
    private final ReviewService reviewService;
    @GetMapping("/home")
    public String gohome(){
        return "redirect:/";}

    @GetMapping("/woodo")
    public String gowoodo(){
        return "/woodo";
    }

    @GetMapping("/reviewhome")
    public String dispMyInfo() {
        return "/reviewhome";
    }

    @GetMapping("/register")
    public String dispRegiInfo() {
        return "/reviewregister";
    }

    @PostMapping("/register")
    public String dispRegiInfo(ReviewsDTO reviewsDTO) {
        reviewService.regiReview(reviewsDTO);

        return "/reviewhome";
    }

}
