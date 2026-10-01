class TicketCounter implements Runnable {

    int availableTickets = 3;

    synchronized void bookTicket() {

        if (availableTickets > 0) {

            System.out.println(
                Thread.currentThread().getName()
                + " booked Ticket "
                + availableTickets
            );

            availableTickets--;

        } else {

            System.out.println("No tickets available");
        }
    }

    public void run() {
        bookTicket();
    }
}