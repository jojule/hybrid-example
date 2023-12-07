package com.example.application.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.vaadin.flow.server.auth.AnonymousAllowed;

import dev.hilla.BrowserCallable;

@BrowserCallable
@Service
@AnonymousAllowed
public class PersonService {

    public List<Person> getPeopleBornOn(LocalDate date) {

        String[] randomFirstNames = { "John", "Jane", "Mary", "Patricia", "Robert", "Michael", "James", "William",
                "David", "Richard", "Charles", "Joseph", "Thomas", "Christopher", "Daniel", "Paul", "Mark", "Donald",
                "George", "Kenneth", "Steven", "Edward", "Brian", "Ronald", "Anthony", "Kevin", "Jason", "Matthew",
                "Gary", "Timothy", "Jose", "Larry", "Jeffrey", "Frank", "Scott", "Eric", "Stephen", "Andrew", "Raymond",
                "Gregory", "Joshua", "Jerry", "Dennis", "Walter", "Patrick", "Peter", "Harold", "Douglas", "Henry",
                "Carl", "Arthur", "Ryan", "Roger" };
        String[] randomLastNames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia",
                "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Hernandez", "Moore", "Martin",
                "Jackson", "Thompson", "White", "Lopez", "Lee", "Gonzalez", "Harris", "Clark", "Lewis", "Robinson",
                "Walker", "Perez", "Hall", "Young", "Allen", "Sanchez", "Wright", "King", "Scott", "Green", "Baker",
                "Adams", "Nelson", "Hill", "Ramirez", "Campbell", "Mitchell", "Roberts", "Carter", "Phillips", "Evans",
                "Turner", "Torres", "Parker", "Collins", "Edwards" };

        ArrayList<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            people.add(new Person(randomFirstNames[(int) (Math.random() *
                    randomFirstNames.length)], randomLastNames[(int) (Math.random() * randomLastNames.length)], date));
        }

        return people;
    }
}
