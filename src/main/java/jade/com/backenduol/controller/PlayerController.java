package jade.com.backenduol.controller;


import jade.com.backenduol.model.Player;
import jade.com.backenduol.model.dtos.PlayerDto;
import jade.com.backenduol.service.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService service;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Valid PlayerDto dto){
            Player newPlayer = service.createPlayer(dto);
            return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);

    }
}
