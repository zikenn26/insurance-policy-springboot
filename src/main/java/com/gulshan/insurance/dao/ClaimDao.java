package com.gulshan.insurance.dao;

import com.gulshan.insurance.dto.Claim;
import com.gulshan.insurance.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClaimDao {

    @Autowired
    private ClaimRepository claimRepository;

    //insert Claim------------------------------------------------------------------------------
    public Claim insertClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    // getByClaimId-----------------------------------------------------------------------------
    public Claim getByClaimId(int claimId) {
        Optional<Claim> optional = claimRepository.findById(claimId);

        if(optional.isPresent()) {
            return optional.get();
        }else {
            return null;
        }
    }

    // delete Claim-----------------------------------------------------------------------------
    public Claim deleteClaim(Claim claim, int claimId) {
        Optional<Claim> optional = claimRepository.findById(claimId);

        if(optional.isPresent()) {
            claimRepository.delete(optional.get());
            return claim;
        }else {
            return null;
        }
    }


    // update Claim------------------------------------------------------------------------------
    public Claim updateClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    //displayAllClaim----------------------------------------------------------------------------
    public List<Claim> displayAllClaim(){
        return claimRepository.findAll();
    }
}
