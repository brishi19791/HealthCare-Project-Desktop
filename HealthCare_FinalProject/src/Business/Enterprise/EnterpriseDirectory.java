/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class EnterpriseDirectory {
   
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public Enterprise createEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
                if(type==Enterprise.EnterpriseType.Hospital){
                    enterprise=new HospitalEnterprise(name);
                    enterpriseList.add(enterprise);
                }
//                else if(type==Enterprise.EnterpriseType.Clinic){
//                    enterprise=new ClinicalEnterprise(name);
//                    enterpriseList.add(enterprise);
//                }
                else if(type==Enterprise.EnterpriseType.Pharmacy){
                    enterprise=new PharmacyEnterprise(name);
                    enterpriseList.add(enterprise);
                }
                else if(type==Enterprise.EnterpriseType.DrugCompany){
                    enterprise=new DrugCompanyEnterprise(name);
                    enterpriseList.add(enterprise);
                }
                return enterprise;
    }
    
}
