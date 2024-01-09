package jade.com.backenduol.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity(name="players")
@Table(name = "players")
@Getter
@Setter
@EqualsAndHashCode(of="id")
public class Player {

    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String codiname;
    private TimeTyper timeTyper;

}
