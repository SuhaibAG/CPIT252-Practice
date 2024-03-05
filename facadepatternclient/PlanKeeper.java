package facadepatternclient;

public class PlanKeeper {
    private PlanType domesticplan;
    private PlanType commercialplan;
    private PlanType institutionalplan;

    public PlanKeeper(){
        domesticplan = new DomesticPlan();
        commercialplan = new CommercialPlan();
        institutionalplan = new InstitutionPlan();
    }

    public void domesticRate(){
        domesticplan.getPlan();
        domesticplan.getRate();
    }

    public void commRate(){
        commercialplan.getPlan();
        commercialplan.getRate();
    }

    public void institutionalRate(){
        institutionalplan.getPlan();
        institutionalplan.getRate();
    }
}
