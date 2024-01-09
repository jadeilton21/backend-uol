package jade.com.backenduol.service;


import jade.com.backenduol.model.Player;
import jade.com.backenduol.model.dtos.PlayerDto;
import jade.com.backenduol.repositorys.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {



    @Autowired
    private PlayerRepository repository;
    public Player createPlayer(PlayerDto dto) {

        Player newPlayer = new Player(dto);
        return repository.save(newPlayer);
     }
}
