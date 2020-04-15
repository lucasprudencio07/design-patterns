package com.alura.design_patterns_II.factory;

public class PlanFactory {

    public Plan getPlan(String planType){

        planType = planType.toUpperCase();

        try {
            if(planType.equals("DOMESTICPLAN")) {
                return new DomesticPlan();
            }
            else if(planType.equals("COMMERCIALPLAN")){
                return new CommercialPlan();
            }
            else if(planType.equals("INDUSTRIALPLAN")) {
                return new IndustrialPlan();
            }

        } catch (PlanException ignored){}
        throw new PlanException();
    }

}
