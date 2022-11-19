package no.hvl.dat108.oblig4;

import no.hvl.dat108.oblig4.model.Deltager;
import no.hvl.dat108.oblig4.model.DeltagerJSON;
import no.hvl.dat108.oblig4.model.DeltakerDAO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LagreDeltagerTest {
    Deltager deltager;
    String fnavn = "Per";
    String enavn = "Pettersen";
    String kjonn = "Mann";
    String mob = "80080800";
    String hash = "HASH";
    String salt = "SALT";

    Deltager deltager2;
    Deltager deltager3;
    DeltakerDAO deltakerDAO = new DeltagerJSON();

    @BeforeEach
    void setUp() {
        deltager = new Deltager(fnavn, enavn, kjonn, mob, hash, salt);
        deltager2 = new Deltager("Hans", "Hansen", "Mann", "00030333", "SECONDHASH", "SECONDSALT");
        deltager3 = new Deltager("Lisa", "Listhaug", "Kvinne", "50055005", "LISAHASH", "LISASALT");

        deltakerDAO.save(deltager);
        deltakerDAO.save(deltager2);
        deltakerDAO.save(deltager3);
    }

    @Test
    void testGet(){
        assertEquals(deltakerDAO.get(mob), deltager);
    }

//    @Test
//    void testGetAll(){
//        List<Deltager> dl = new ArrayList<Deltager>();
//        dl.add(deltager);
//        dl.add(deltager2);
//        dl.add(deltager3);
//
//        assertEquals(deltakerDAO.getAll(), dl);
//    }
}
