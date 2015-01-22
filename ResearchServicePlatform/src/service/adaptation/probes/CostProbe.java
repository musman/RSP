package service.adaptation.probes;

import service.auxiliary.ServiceDescription;

public abstract class CostProbe extends Probe {

    @Override
    public abstract void costOperation(ServiceDescription service, String opName);

}
