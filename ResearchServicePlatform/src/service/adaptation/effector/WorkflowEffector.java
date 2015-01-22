package service.adaptation.effector;

import service.composite.CompositeService;

public class WorkflowEffector extends AbstractEffector {

    public WorkflowEffector(CompositeService compositeService) {
	super(compositeService);
    }

    /**
     * Update the workflow
     * @param workflow
     */
    public void updateWorkflow(String workflow) {
	compositeService.setWorkflow(workflow);
    }
}
