package ru.netology.ticket;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Comparator;


public class AviaSoulsTest {

    @Test //N1
    public void shouldSearchSeveralTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Berlin","Paris", 25_000, 20, 22);
        Ticket ticket2 = new Ticket("Berlin","Rome", 20_000, 18, 20);
        Ticket ticket3 = new Ticket("Berlin","New-York", 65_000, 11, 18); // 4
        Ticket ticket4 = new Ticket("Berlin","Fes", 35_000, 10, 16);
        Ticket ticket5 = new Ticket("Berlin","New-York", 60_000, 11, 18); // 3
        Ticket ticket6 = new Ticket("Berlin","Beijing", 130_000, 10, 23);
        Ticket ticket7 = new Ticket("Moscow","Samara", 7_000, 15, 18);
        Ticket ticket8 = new Ticket("Spb","Vladivostok", 33_000, 16, 21);
        Ticket ticket9 = new Ticket("Berlin","New-York", 50_000, 10, 17); // 1
        Ticket ticket10 = new Ticket("Spb","Moscow", 6_000, 20, 22);
        Ticket ticket11 = new Ticket("Samara","Kazan", 4_000, 20, 22);
        Ticket ticket12 = new Ticket("Berlin","New-York", 60_000, 11, 18); // 2
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Ticket[] expected = {ticket9, ticket12, ticket5, ticket3};
        Ticket[] actual = manager.search("Berlin", "New-York");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //N2
    public void shouldSearchNoTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Berlin","Paris", 25_000, 20, 22);
        Ticket ticket2 = new Ticket("Berlin","Rome", 20_000, 18, 20);
        Ticket ticket3 = new Ticket("Berlin","New-York", 65_000, 11, 18);
        Ticket ticket4 = new Ticket("Berlin","Fes", 35_000, 10, 16);
        Ticket ticket5 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        Ticket ticket6 = new Ticket("Berlin","Beijing", 130_000, 10, 23);
        Ticket ticket7 = new Ticket("Moscow","Samara", 7_000, 15, 18);
        Ticket ticket8 = new Ticket("Spb","Vladivostok", 33_000, 16, 21);
        Ticket ticket9 = new Ticket("Berlin","New-York", 50_000, 10, 17);
        Ticket ticket10 = new Ticket("Spb","Moscow", 6_000, 20, 22);
        Ticket ticket11 = new Ticket("Samara","Kazan", 4_000, 20, 22);
        Ticket ticket12 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Samara", "Spb");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //N3
    public void shouldSearchOneTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Berlin","Paris", 25_000, 20, 22);
        Ticket ticket2 = new Ticket("Berlin","Rome", 20_000, 18, 20);
        Ticket ticket3 = new Ticket("Berlin","New-York", 65_000, 11, 18);
        Ticket ticket4 = new Ticket("Berlin","Fes", 35_000, 10, 16);
        Ticket ticket5 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        Ticket ticket6 = new Ticket("Berlin","Beijing", 130_000, 10, 23);
        Ticket ticket7 = new Ticket("Moscow","Samara", 7_000, 15, 18);
        Ticket ticket8 = new Ticket("Spb","Vladivostok", 33_000, 16, 21);
        Ticket ticket9 = new Ticket("Berlin","New-York", 50_000, 10, 17);
        Ticket ticket10 = new Ticket("Spb","Moscow", 6_000, 20, 22);
        Ticket ticket11 = new Ticket("Samara","Kazan", 4_000, 20, 22);
        Ticket ticket12 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Ticket[] expected = {ticket11};
        Ticket[] actual = manager.search("Samara", "Kazan");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //N4
    public void shouldSortSeveralTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Berlin","Paris", 25_000, 20, 22);
        Ticket ticket2 = new Ticket("Berlin","Rome", 20_000, 18, 20);
        Ticket ticket3 = new Ticket("Berlin","New-York", 65_000, 11, 20); // 9
        Ticket ticket4 = new Ticket("Berlin","Fes", 35_000, 10, 16);
        Ticket ticket5 = new Ticket("Berlin","New-York", 60_000, 11, 19); // 8
        Ticket ticket6 = new Ticket("Berlin","Beijing", 130_000, 10, 23);
        Ticket ticket7 = new Ticket("Moscow","Samara", 7_000, 15, 18);
        Ticket ticket8 = new Ticket("Spb","Vladivostok", 33_000, 16, 21);
        Ticket ticket9 = new Ticket("Berlin","New-York", 50_000, 10, 17); // 7
        Ticket ticket10 = new Ticket("Spb","Moscow", 6_000, 20, 22);
        Ticket ticket11 = new Ticket("Samara","Kazan", 4_000, 20, 22);
        Ticket ticket12 = new Ticket("Berlin","New-York", 60_000, 11, 18); // 7
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket9, ticket12, ticket5, ticket3};
        Ticket[] actual = manager.search("Berlin", "New-York", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //N5
    public void shouldSortOnelTicketWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Berlin","Paris", 25_000, 20, 22);
        Ticket ticket2 = new Ticket("Berlin","Rome", 20_000, 18, 20);
        Ticket ticket3 = new Ticket("Berlin","New-York", 65_000, 11, 18);
        Ticket ticket4 = new Ticket("Berlin","Fes", 35_000, 10, 16);
        Ticket ticket5 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        Ticket ticket6 = new Ticket("Berlin","Beijing", 130_000, 10, 23);
        Ticket ticket7 = new Ticket("Moscow","Samara", 7_000, 15, 18);
        Ticket ticket8 = new Ticket("Spb","Vladivostok", 33_000, 16, 21);
        Ticket ticket9 = new Ticket("Berlin","New-York", 50_000, 10, 17);
        Ticket ticket10 = new Ticket("Spb","Moscow", 6_000, 20, 22);
        Ticket ticket11 = new Ticket("Samara","Kazan", 4_000, 20, 22);
        Ticket ticket12 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket1};
        Ticket[] actual = manager.search("Berlin", "Paris", comparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test //№6
    public void shouldSortNolTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("Berlin","Paris", 25_000, 20, 22);
        Ticket ticket2 = new Ticket("Berlin","Rome", 20_000, 18, 20);
        Ticket ticket3 = new Ticket("Berlin","New-York", 65_000, 11, 18);
        Ticket ticket4 = new Ticket("Berlin","Fes", 35_000, 10, 16);
        Ticket ticket5 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        Ticket ticket6 = new Ticket("Berlin","Beijing", 130_000, 10, 23);
        Ticket ticket7 = new Ticket("Moscow","Samara", 7_000, 15, 18);
        Ticket ticket8 = new Ticket("Spb","Vladivostok", 33_000, 16, 21);
        Ticket ticket9 = new Ticket("Berlin","New-York", 50_000, 10, 17);
        Ticket ticket10 = new Ticket("Spb","Moscow", 6_000, 20, 22);
        Ticket ticket11 = new Ticket("Samara","Kazan", 4_000, 20, 22);
        Ticket ticket12 = new Ticket("Berlin","New-York", 60_000, 11, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        manager.add(ticket9);
        manager.add(ticket10);
        manager.add(ticket11);
        manager.add(ticket12);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("Samara", "Spb", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

}