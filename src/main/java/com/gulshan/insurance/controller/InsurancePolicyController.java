package com.gulshan.insurance.controller;

import com.gulshan.insurance.dto.InsurancePolicy;
import com.gulshan.insurance.dto.ResponseStructure;
import com.gulshan.insurance.service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InsurancePolicyController {

    @Autowired
    private InsurancePolicyService insurancePolicyService;

    // insert insurancePolicy------------------------------------------------------------------
    @PostMapping("/saveInsurancePolicy")
    public ResponseStructure<InsurancePolicy> insertInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy) {
        return insurancePolicyService.insertInsurancePolicy(insurancePolicy);
    }

    // getByInsurancePolicyId-------------------------------------------------------------------------------
    @GetMapping("/getByInsurancePolicyId/{insurancePolicyId}")
    public ResponseStructure<InsurancePolicy> getByInsurancePolicyId(@PathVariable int insurancePolicyId) {
        return insurancePolicyService.getByInsurancePolicyId(insurancePolicyId);
    }

    // update Insurance Policy------------------------------------------------------------------------------------
    @PutMapping("/updateInsurancePolicy/{insurancePolicyId}")
    public ResponseStructure<InsurancePolicy> updateInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy,@PathVariable int insurancePolicyId) {
        return insurancePolicyService.updateInsurancePolicy(insurancePolicy, insurancePolicyId);
    }

    // delete Insurance Policy-------------------------------------------------------------------------------------
    @DeleteMapping("/deleteInsurancePolicy/{policyId}")
    public ResponseStructure<InsurancePolicy> deleteInsurancePolicy(InsurancePolicy insurancePolicy, @PathVariable int policyId){
        return insurancePolicyService.deleteInsurancePolicy(insurancePolicy, policyId);
    }

    //display InsuarncePolicy------------------------------------------------------------------------------------
    @GetMapping("/displayAllPolicy")
    public ResponseStructure<List<InsurancePolicy>> displayAllPolicy(){
        return insurancePolicyService.displayAllPolicy();
    }
}
