package com.gulshan.insurance.controller;

import com.gulshan.insurance.dto.Claim;
import com.gulshan.insurance.dto.ResponseStructure;
import com.gulshan.insurance.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    //insert Claim---------------------------------------------------------------------
    @PostMapping("/saveClaim/{policyId}")
    public ResponseStructure<Claim> insertClaim(@RequestBody Claim claim, @PathVariable int policyId) {
        return claimService.insertClaim(claim, policyId);
    }

    // getByClaimId-----------------------------------------------------------------------------
    @GetMapping("/getByClaimId/{claimId}")
    public ResponseStructure<Claim> getByClaimId(@PathVariable int claimId) {
        return claimService.getByClaimId(claimId);
    }

    // delete Claim-----------------------------------------------------------------------------
    @DeleteMapping("/deleteClaim/{claimId}")
    public ResponseStructure<Claim> deleteClaim(Claim claim, @PathVariable int claimId) {
        return claimService.deleteClaim(claim, claimId);
    }

    // update Claim------------------------------------------------------------------------------
    @PutMapping("/updateClaim/{claimId}")
    public ResponseStructure<Claim> updateClaim(@RequestBody Claim claim,@PathVariable int claimId) {
        return claimService.updateClaim(claim, claimId);
    }

    //displayAllClaim----------------------------------------------------------------------------
    @GetMapping("/displayAllClaim")
    public ResponseStructure<List<Claim>> displayAllClaim(){
        return claimService.displayAllClaim();
    }
}
