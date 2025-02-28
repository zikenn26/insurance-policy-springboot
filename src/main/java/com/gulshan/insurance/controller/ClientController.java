package com.gulshan.insurance.controller;

import com.gulshan.insurance.dto.Client;
import com.gulshan.insurance.dto.ResponseStructure;
import com.gulshan.insurance.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {

    @Autowired
    private ClientService clientService;

    // insert Client(we need here policy id to connect with client table)----------------------------------
    @PostMapping("/saveClient/{policyId}")
    public ResponseStructure<Client> insertClient(@RequestBody Client client, @PathVariable int policyId){
        return clientService.insertClient(client, policyId);
    }

    // getByClientId---------------------------------------------------------------------------------------
    @GetMapping("/getClientById/{clientId}")
    public ResponseStructure<Client> getClientById(@PathVariable int clientId) {
        return clientService.getClientById(clientId);
    }

    // update Client--------------------------------------------------------------------------------------
    @PutMapping("/updateClient/{clientId}")
    public ResponseStructure<Client> updateClient(@RequestBody Client client,@PathVariable int clientId) {
        return clientService.updateClient(client, clientId);
    }

    //delete Client-----------------------------------------------------------------------------------------
    @DeleteMapping("/deleteClient/{clientId}")
    public ResponseStructure<Client> deleteClient(Client client,@PathVariable int clientId) {
        return clientService.deleteClient(client, clientId);
    }

    //display Client----------------------------------------------------------------------------------------
    @GetMapping("/displayAllClient")
    public ResponseStructure<List<Client>> displayAllCLient(){
        return clientService.displayAllCLient();
    }
}
