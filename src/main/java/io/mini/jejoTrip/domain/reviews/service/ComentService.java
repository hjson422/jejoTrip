package io.mini.jejoTrip.domain.reviews.service;

import io.mini.jejoTrip.domain.reviews.Coments;
import io.mini.jejoTrip.domain.reviews.dto.ComentDTO;
import io.mini.jejoTrip.domain.reviews.repository.ComentRepository;
import org.modelmapper.TypeToken;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentService {

    private ComentRepository comentRepository;
    public void deleteComent(Long id) {
    }

    public void updateComent(Long id, ComentDTO dto) {
    }



    public List<ComentDTO> getComments(Long id) {
        List<Coments> commentEntity = comentRepository.findById(id);
        List<ComentDTO> comments = modelMapper.map(commentEntity, new TypeToken<List<ComentDTO>>() {
        }.getType());

        return comments;
    }
}
