package com.fatec.controle_financeiro.controllers;
 
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import com.fatec.controle_financeiro.entities.Client;
 
@RestController
@RequestMapping("/api/client")
public class ClientController {
    private List<Client> clients = new ArrayList<>();
    private int proximoId = 1;
 
    // CREATE
    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        for (Client c : clients) {
            if (c.getName().equalsIgnoreCase(client.getName())) {
                throw new IllegalArgumentException("Já existe um cliente com esse nome.");
            }
        }
 
        client.setId(proximoId++);
        clients.add(client);
 
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }
 
    // READ - Todos
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
 
    // READ - ID
    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable int id) {
        for (Client c : clients) {
            if (c.getId() == id) {
                return new ResponseEntity<>(c, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
 
    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable int id, @RequestBody Client clientAtualizado) {
        for (Client c : clients) {
            if (c.getId() == id) {
                c.setName(clientAtualizado.getName());
                return new ResponseEntity<>(c, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
 
    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable int id) {
        for (Client c : clients) {
            if (c.getId() == id) {
                clients.remove(c);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}