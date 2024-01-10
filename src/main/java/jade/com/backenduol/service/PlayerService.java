package jade.com.backenduol.service;


import jade.com.backenduol.infra.CodinameHandler;
import jade.com.backenduol.model.Player;
import jade.com.backenduol.model.TimeTyper;
import jade.com.backenduol.model.dtos.PlayerDto;
import jade.com.backenduol.repositorys.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {



    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {

        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.timeTyper());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
     }

    private String getCodiname(TimeTyper timeTyper) {
        return handler.findCodiname(timeTyper);
    }

    public List<Player> getAllPlayers(){

        return repository.findAll();
    }

}
