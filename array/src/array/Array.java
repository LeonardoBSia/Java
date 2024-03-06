package array;

public class Array {
	String name;
    String phone;
    String email;
}

class Main {
    public static void main(String[] args) {
        Client[] clients = new Client[50];

        for (int i = 0; i < clients.length; i++) {
            clients[i] = new Client();
            clients[i].name = "Client " + (i + 1);
            clients[i].phone = "555-555-555" + (i + 1);
            clients[i].email = "client" + (i + 1) + "@example.com";
        }

        // Printing the client's name, phone and email
        for (int i = 0; i < clients.length; i++) {
            System.out.println("Client " + (i + 1) + ":");
            System.out.println("Name: " + clients[i].name);
            System.out.println("Phone: " + clients[i].phone);
            System.out.println("Email: " + clients[i].email);
            System.out.println();
        }
    }
}
