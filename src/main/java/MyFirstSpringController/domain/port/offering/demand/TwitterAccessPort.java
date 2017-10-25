package MyFirstSpringController.domain.port.offering.demand;

import MyFirstSpringController.domain.view.TwitterView;

import java.util.List;

public interface TwitterAccessPort {

    List<TwitterView> getTwitters(Integer packetSize);

}
