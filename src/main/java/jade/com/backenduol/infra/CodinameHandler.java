package jade.com.backenduol.infra;


import jade.com.backenduol.model.TimeTyper;
import jade.com.backenduol.service.CodinameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodinameHandler {

    @Autowired
    private CodinameService service;


    public String findCodiname(TimeTyper timeTyper) {
        if(timeTyper==TimeTyper.OS_VINGADORES){
            String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getLigadajusticalis().stream().findFirst().orElseThrow();
        this.service.getLigadajusticalis().remove(firstMatch);
        return firstMatch;
    }
    }
