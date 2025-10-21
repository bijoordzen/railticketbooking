package ticket.booking.entities;

import java.util.List;

public class User {

    private String name;
    private String password;
    private String hashPassword;
    //// class of ticket Booked where users have booked ticket as below
    private List<Ticket> ticketBooked;
    private String userId;
}
