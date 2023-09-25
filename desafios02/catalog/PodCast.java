package tasks.desafios02.catalog;

import java.util.ArrayList;
import java.util.List;

public class PodCast extends Audio {

    //CONSTRUCTOR:
    public PodCast(String title, String producer, double duration) {
        super(title, producer, duration);
    }

    //ATTRIBUTE:
    private String feat;

    //GETS & SETS:
    public List<String> getFeat() {
        return feats;
    }

    public void setFeat(String feat) {
        feats.add(feat);
    }
    public List<String> getHosts(){
        return hosts;
    }

    public void setHost(String host) {
        hosts.add(host);
    }

    //OPERATIONS:
    List<String> feats = new ArrayList<>();
    List<String> hosts = new ArrayList<>();
    @Override
    public String getStatus() {
        if (getLikes()>(getReprodutions()*0.7)){
            return "Uma das favoritas!";
        } else if (getLikes()<(getReprodutions()*0.3)) {
            return "PodCast desaprovado pela comunidade.";
        }else {
            return "Conteúdo polêmico.";
        }
    }


}
