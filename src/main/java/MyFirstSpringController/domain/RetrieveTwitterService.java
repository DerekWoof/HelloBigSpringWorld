package MyFirstSpringController.domain;

import MyFirstSpringController.domain.port.offering.RetreieveTwitterPort;
import MyFirstSpringController.domain.view.TwitterView;

import java.util.List;

public class RetrieveTwitterService implements RetreieveTwitterPort{
    @Override
    public List<TwitterView> retrieveTwitters(Integer packetNumber) {
        return null;
    }
}
