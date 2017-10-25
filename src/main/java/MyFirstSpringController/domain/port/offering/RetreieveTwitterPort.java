package MyFirstSpringController.domain.port.offering;

import MyFirstSpringController.domain.view.TwitterView;

import java.util.List;

public interface RetreieveTwitterPort {

    List<TwitterView> retrieveTwitters(Integer packetNumber);



}
