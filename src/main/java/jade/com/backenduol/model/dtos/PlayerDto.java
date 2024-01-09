package jade.com.backenduol.model.dtos;

import jade.com.backenduol.model.TimeTyper;

public record PlayerDto(
        String nome,
        String email,
        String telefone,
        TimeTyper timeTyper

) {
}
