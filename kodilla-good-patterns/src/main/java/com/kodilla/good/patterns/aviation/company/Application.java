package com.kodilla.good.patterns.aviation.company;

public class Application {
    public static void main(String[] args) {

        FlightsList flightRegister = FlightsRetriever.retrieve();

        FlightSearcher flightSearchEngine = new FlightSearcher(flightRegister.getFlights());
        flightSearchEngine.searchByCityOfDeparture("Warszawa");
        flightSearchEngine.searchByCityOfArrival("Gdańsk");
        flightSearchEngine.searchByCityForTransfer("Katowice","Kraków", "Gdańsk");
    }
}
