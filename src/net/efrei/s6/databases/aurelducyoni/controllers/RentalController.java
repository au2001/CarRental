package net.efrei.s6.databases.aurelducyoni.controllers;

import net.efrei.s6.databases.aurelducyoni.dbms.Datastore;
import net.efrei.s6.databases.aurelducyoni.models.Agency;
import net.efrei.s6.databases.aurelducyoni.models.Rental;
import net.efrei.s6.databases.aurelducyoni.models.Return;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RentalController {

    private final Datastore datastore;

    public RentalController(Datastore datastore) {
        this.datastore = datastore;
    }

    public List<Rental> getOngoingRentalList() {
        Set<Integer> returnedRentals = datastore.getReturnList().stream().map(r -> r.getRental().getReservation().getId()).collect(Collectors.toSet());
        return datastore.getRentalList().stream().filter(rental -> !returnedRentals.contains(rental.getReservation().getId())).collect(Collectors.toList());
    }

    public List<Agency> getAgencyList() {
        return datastore.getAgencyList();
    }

}
