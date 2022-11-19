package no.hvl.dat108.oblig4.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;

public class DeltagerJSON implements DeltakerDAO{
//    ObjectMapper mapper = new ObjectMapper();
    JSONObject jsonObject = new JSONObject();
    String fileName = "./test.json";

    @Override
    public Deltager get(String mobil) {
        JSONParser parser = new JSONParser();
        checkIfJSON();

        try{
            Reader reader = new FileReader(fileName);
            jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("deltagere");
            if (array == null){
                return null;
            }
            reader.close();
//            System.out.println(jsonObject);
//            System.out.println(array);

            Deltager deltaker = null;
            Iterator<JSONObject> iterator = array.iterator();
            while (deltaker == null && iterator.hasNext()){
                Deltager c = getDeltagerJSON(iterator.next());
                if (c.getMobil() == mobil){
                    deltaker = c;
                }
            }
//            System.out.println(deltaker);

            return deltaker;
        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }
//        return Optional.empty();
        return null;
    }

    @Override
    public List<Deltager> getAll() {
        JSONParser parser = new JSONParser();
        checkIfJSON();

        try{
            Reader reader = new FileReader(fileName);
            jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("deltagere");
            if (array == null){
                return null;
            }
            reader.close();
//            System.out.println(jsonObject);

            List<Deltager> deltagere = new ArrayList<Deltager>();

            Iterator<JSONObject> iterator = array.iterator();
            while (iterator.hasNext()){
                deltagere.add(getDeltagerJSON(iterator.next()));
            }

            return deltagere;
        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }
//        return Optional.empty();
        return null;
    }

    @Override
    public void save(Deltager deltager) {
        JSONParser parser = new JSONParser();
        checkIfJSON();
        if (deltager == get(deltager.getMobil())){
            return;
        }

        try{
            Reader reader = new FileReader(fileName);
            jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("deltagere");
            if (array == null){
                array = new JSONArray();
            }
            reader.close();

            JSONObject jsonDeltager = new JSONObject();
            jsonDeltager.put(deltager.getMobil(),setDeltakerJSON(deltager));

            array.add(jsonDeltager);
            jsonObject = new JSONObject();

            jsonObject.put("deltagere", array);
            FileWriter fileWriter = new FileWriter("./test.json");
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.close();
        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }
//        jsonObject = new JSONObject();
    }

    private JSONObject setDeltakerJSON(Deltager deltager){
        JSONObject delt = new JSONObject();
        delt.put("fornavn", deltager.getFornavn());
        delt.put("etternavn", deltager.getEtternavn());
        delt.put("Kjonn", deltager.getKjonn());
        delt.put("Mobil", deltager.getMobil());
        delt.put("hash", deltager.getPassordHash());
        delt.put("salt", deltager.getPassordSalt());

        return delt;

//        JSONObject fnavn = new JSONObject();
//        JSONObject enavn = new JSONObject();
//        JSONObject kjonn = new JSONObject();
//        JSONObject mob = new JSONObject();
//        JSONObject hash = new JSONObject();
//        JSONObject salt = new JSONObject();
//
//        fnavn.put("fornavn", deltager.getFornavn());
//        enavn.put("etternavn", deltager.getEtternavn());
//        kjonn.put("Kjonn", deltager.getKjonn());
//        mob.put("Mobil", deltager.getMobil());
//        hash.put("hash", deltager.getPassordHash());
//        salt.put("salt", deltager.getPassordSalt());
//
//        JSONArray array = new JSONArray();
//        array.add(fnavn);
//        array.add(enavn);
//        array.add(kjonn);
//        array.add(mob);
//        array.add(hash);
//        array.add(salt);
//        return array;
    }

    private Deltager getDeltagerJSON(JSONObject jo){
        Deltager deltager = new Deltager();

        deltager.setFornavn(jo.get("fornavn").toString());
        deltager.setEtternavn(jo.get("etternavn").toString());
        deltager.setKjonn(jo.get("kjonn").toString());
        deltager.setMobil(jo.get("mobil").toString());
        deltager.setPassordSalt(jo.get("salt").toString());
        deltager.setPassordHash(jo.get("hash").toString());

        return deltager;
    }

    private void checkIfJSON(){
        try{
            Reader reader = new FileReader(fileName);
            reader.close();
        } catch (FileNotFoundException e) {
            try {
                FileWriter writer = new FileWriter(fileName);
                JSONObject jo = new JSONObject();
                jo.put("test", "test");
                writer.write(jo.toJSONString());
                writer.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

//            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void update(Deltager deltager, String[] params) {
//        jsonObject = new JSONObject();
////        jsonObject.get(deltager.getMobil());
//        try{
//            FileReader fileReader = new FileReader("./test.json");
//            jsonObject.get(fileReader.read());
//
//
//            FileWriter fileWriter = new FileWriter("./test.json");
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
    }

    @Override
    public void delete(Deltager deltager) {

    }
}
