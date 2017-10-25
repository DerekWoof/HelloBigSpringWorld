package MyFirstSpringController.adapter.persistance;

import MyFirstSpringController.domain.port.offering.demand.TwitterAccessPort;
import MyFirstSpringController.domain.view.TwitterView;

import java.util.List;

public class InMemoryTwitterRepository implements TwitterAccessPort {




    @Override
    public List<TwitterView> getTwitters(Integer packetSize) {
        return null;
    }
}
