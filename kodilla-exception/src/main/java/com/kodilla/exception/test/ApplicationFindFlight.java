package com.kodilla.exception.test;

public class ApplicationFindFlight {
    public static void main(String[] args) {
        Flight warsawCracow = new Flight("Warszawa", "Kraków");
        Flight resoviaRome = new Flight("Rzeszów", "Rzym");
        Flight tokyoLondon = new Flight("Tokio", "Londyn");
        Flight moscowNewYorkCity = new Flight("Moskwa", "Nowy Jork");

        FindFlight findFlight = new FindFlight();

        try {
            boolean routeWarsawCracow = findFlight.findFlight(warsawCracow);
            if(routeWarsawCracow) {
                System.out.println("Lot Warszawa - Kraków: wolne miejsce");
            } else {
                System.out.println("Lot Warszawa - Kraków: brak miejsc");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Proszę wprowadzić istniejące lotnisko.");
        }

        try {
            boolean routeResoviaRome = findFlight.findFlight(resoviaRome);
            if(routeResoviaRome) {
                System.out.println("Lot Rzeszów - Rzym: wolne miejsce");
            } else {
                System.out.println("Lot Rzeszów - Rzym: brak miejsc");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Proszę wprowadzić istniejące lotnisko.");
        }

        try {
            boolean routeTokyoLondon = findFlight.findFlight(tokyoLondon);
            if(routeTokyoLondon) {
                System.out.println("Lot Tokio - Londyn: wolne miejsce");
            } else {
                System.out.println("Lot Tokio - Londyn: brak miejsc");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Proszę wprowadzić istniejące lotnisko.");
        }

        try {
            boolean routeMoscowNewYorkCity = findFlight.findFlight(moscowNewYorkCity);
            if(routeMoscowNewYorkCity) {
                System.out.println("Lot Moskwa - Nowy Jork: wolne miejsce");
            } else {
                System.out.println("Lot Moskwa - Nowy Jork: brak miejsc");
            }
        } catch (RouteNotFoundException e) {
            System.out.println("Proszę wprowadzić istniejące lotnisko.");
        }
    }
}
