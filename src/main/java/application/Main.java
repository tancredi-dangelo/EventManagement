package application;

import application.dao.EventDAO;
import application.entities.Event;
import application.enums.TypeOfEvent;

import java.time.LocalDate;
import java.util.List;

import static application.databases.CheckDatabaseConnection.checkDatabaseConnection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        checkDatabaseConnection();

        List<Event> events = List.of(

                new Event(null, "Company Board Meeting",
                        LocalDate.of(2026, 7, 1),
                        "Quarterly board meeting.",
                        TypeOfEvent.PRIVATE, 15),

                new Event(null, "Java Conference Rome",
                        LocalDate.of(2026, 7, 5),
                        "Conference for Java enthusiasts.",
                        TypeOfEvent.PUBLIC, 500),

                new Event(null, "Executive Strategy Session",
                        LocalDate.of(2026, 7, 10),
                        "Internal strategy planning.",
                        TypeOfEvent.PRIVATE, 20),

                new Event(null, "Open Tech Meetup",
                        LocalDate.of(2026, 7, 15),
                        "Networking for developers.",
                        TypeOfEvent.PUBLIC, 120),

                new Event(null, "HR Training Workshop",
                        LocalDate.of(2026, 7, 20),
                        "Employee development session.",
                        TypeOfEvent.PRIVATE, 30),

                new Event(null, "Summer Music Festival",
                        LocalDate.of(2026, 8, 1),
                        "Outdoor live music event.",
                        TypeOfEvent.PUBLIC, 2000),

                new Event(null, "Management Retreat",
                        LocalDate.of(2026, 8, 7),
                        "Leadership team retreat.",
                        TypeOfEvent.PRIVATE, 25),

                new Event(null, "Startup Pitch Night",
                        LocalDate.of(2026, 8, 14),
                        "Entrepreneurs presenting ideas.",
                        TypeOfEvent.PUBLIC, 150),

                new Event(null, "Security Audit Review",
                        LocalDate.of(2026, 8, 21),
                        "Internal compliance review.",
                        TypeOfEvent.PRIVATE, 12),

                new Event(null, "Community Charity Run",
                        LocalDate.of(2026, 8, 30),
                        "Fundraising sporting event.",
                        TypeOfEvent.PUBLIC, 800),

                new Event(null, "Product Roadmap Meeting",
                        LocalDate.of(2026, 9, 4),
                        "Internal planning session.",
                        TypeOfEvent.PRIVATE, 18),

                new Event(null, "Open Source Conference",
                        LocalDate.of(2026, 9, 12),
                        "Conference about open-source software.",
                        TypeOfEvent.PUBLIC, 700),

                new Event(null, "Finance Department Meeting",
                        LocalDate.of(2026, 9, 18),
                        "Budget review meeting.",
                        TypeOfEvent.PRIVATE, 10),

                new Event(null, "Art Exhibition",
                        LocalDate.of(2026, 9, 25),
                        "Public exhibition of local artists.",
                        TypeOfEvent.PUBLIC, 400),

                new Event(null, "Internal Hackathon",
                        LocalDate.of(2026, 10, 2),
                        "Company-only coding competition.",
                        TypeOfEvent.PRIVATE, 50),

                new Event(null, "City Innovation Summit",
                        LocalDate.of(2026, 10, 10),
                        "Public event on innovation and technology.",
                        TypeOfEvent.PUBLIC, 1000),

                new Event(null, "Legal Compliance Workshop",
                        LocalDate.of(2026, 10, 16),
                        "Internal legal training.",
                        TypeOfEvent.PRIVATE, 35),

                new Event(null, "Food & Culture Fair",
                        LocalDate.of(2026, 11, 1),
                        "Celebration of international cuisine.",
                        TypeOfEvent.PUBLIC, 1500),

                new Event(null, "Department Performance Review",
                        LocalDate.of(2026, 11, 12),
                        "Private review of department goals.",
                        TypeOfEvent.PRIVATE, 22),

                new Event(null, "Winter Market Festival",
                        LocalDate.of(2026, 12, 5),
                        "Seasonal public event.",
                        TypeOfEvent.PUBLIC, 2500)
        );

        EventDAO eventDAO = new EventDAO();
        events.forEach(event -> eventDAO.save(event));
        eventDAO.close();

    }
}
