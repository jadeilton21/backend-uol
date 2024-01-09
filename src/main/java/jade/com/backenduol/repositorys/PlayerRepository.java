package jade.com.backenduol.repositorys;

import jade.com.backenduol.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
