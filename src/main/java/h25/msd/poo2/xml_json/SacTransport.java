package h25.msd.poo2.xml_json;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

public class SacTransport {

    private Map<String, Object> contenu = new HashMap<>();

    public SacTransport() {

    }

    //TODO 9 rendre le contenu dynamique du sac accesible pour Jackson.

    public Map<String, Object> getContenu() {
        return contenu;
    }

    public void setContenu(Map<String, Object> contenu) {
        this.contenu = contenu;
    }

    //TODO 9 rendre le contenu dynamique du sac accesible pour Jackson.


}
