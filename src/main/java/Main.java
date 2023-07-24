

import clients.Client;
import clients.ClientCrudService;
import planets.Planet;
import planets.PlanetCrudService;

import java.sql.SQLException;


public class Main {

    public static void main(String[] args) throws SQLException {


        ClientCrudService clientCrud = new ClientCrudService();

        long newClient = clientCrud.create("Leya Organa");

        System.out.println("newClientGetById = " + clientCrud.getById(newClient));

        for (Client current : clientCrud.getAll()) {
            System.out.println("currentClient = " + current);
        }

        clientCrud.updateClientName(5, "Snowk");

        for (Client current : clientCrud.getAll()) {
            System.out.println("currentClient = " + current);
        }

        System.out.println("********** deleting newClient ****************");
        clientCrud.deleteClient(5l);

        for (Client current : clientCrud.getAll()) {
            System.out.println("currentClient = " + current);
        }
System.out.println("******************************************************************************************************");

        PlanetCrudService planetCrud = new PlanetCrudService();

        String newPlanet = planetCrud.create("PLANET100", "Earth");

        System.out.println("newPlanetGetById = " + planetCrud.getById(newPlanet));

        for (Planet current : planetCrud.getAll()) {
            System.out.println("currentPlanet = " + current);
        }

        planetCrud.updatePlanetName("X1", "Super Planet");

        System.out.println("********** deleting newPlanet ****************");
        planetCrud.deletePlanet("X1");

        for (Planet current : planetCrud.getAll()) {
            System.out.println("currentPlanet = " + current);
        }


    }
}