package org.baticuisine.repository;

import org.baticuisine.entities.Client;

public interface ClientRepository {
    void addClient(Client client);
    Client getClientById(int clientId);
    Client searchClientByName(String name);
    boolean isClientNameUnique(String name);
}