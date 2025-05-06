package se.lexicon.exceptions.workshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import se.lexicon.exceptions.workshop.data_access.NameService;
import se.lexicon.exceptions.workshop.domain.Person;
import se.lexicon.exceptions.workshop.fileIO.CSVReader_Writer;

public class Main {

	public static void main(String[] args) {
		
		List <String> maleFirstNames = CSVReader_Writer.getMaleFirstNames();
        List <String> femaleFirstNames = CSVReader_Writer.getFemaleFirstNames();
        List<String> lastNames = new ArrayList<>();

        try {
            lastNames = CSVReader_Writer.getLastNames();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        NameService nameService = new NameService(maleFirstNames, femaleFirstNames, lastNames);

        //nameService.addFemaleFirstName("My");


        Person test = nameService.getNewRandomPerson();
        System.out.println("Random person: " + test);

	}
}
