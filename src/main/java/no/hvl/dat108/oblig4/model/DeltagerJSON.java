package no.hvl.dat108.oblig4.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.json.JSONObject;
//import org.apache.tomcat.util.json.JSONParser;
import com.fasterxml.jackson.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class DeltagerJSON implements DeltakerDAO{
    ObjectMapper mapper = new ObjectMapper();
    JSONObject jsonObject = new JSONObject();


//    public static void main(String[] args) {
//
//        JSONParser parser = new JSONParser();
//
//        try (Reader reader = new FileReader("c:\\projects\\test.json")) {
//
//            JSONObject jsonObject = (JSONObject) parser.parse(reader);
//            System.out.println(jsonObject);
//
//            String name = (String) jsonObject.get("name");
//            System.out.println(name);
//
//            long age = (Long) jsonObject.get("age");
//            System.out.println(age);
//
//            // loop array
//            JSONArray msg = (JSONArray) jsonObject.get("messages");
//            Iterator<String> iterator = msg.iterator();
//            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//    }

    @Override
    public Deltager get(String mobil) {
        JSONParser parser = new JSONParser();

        try{
            Reader reader = new FileReader("./test.json");
            jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("deltagere");
            reader.close();
            System.out.println(jsonObject);
            System.out.println(array);

            Deltager deltaker = null;
            Iterator<Deltager> iterator = array.iterator();
            while (deltaker == null && iterator.hasNext()){
                if (iterator.next().getMobil() == mobil){
                    deltaker = iterator.next();
                }
            }
            System.out.println(deltaker);

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

        try{
            Reader reader = new FileReader("./test.json");
            jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("deltagere");
            reader.close();
//            System.out.println(jsonObject);

            List<Deltager> deltagere = new ArrayList<Deltager>();
            deltagere.addAll(array);

            return deltagere;
        }
        catch (IOException | ParseException e){
            e.printStackTrace();
        }
//        return Optional.empty();
        return null;
    }

//    public static void main(String[] args) {
//
//        JSONObject obj = new JSONObject();
//        obj.put("name", "mkyong.com");
//        obj.put("age", 100);
//
//        JSONArray list = new JSONArray();
//        list.add("msg 1");
//        list.add("msg 2");
//        list.add("msg 3");
//
//        obj.put("messages", list);
//
//        try (FileWriter file = new FileWriter("c:\\projects\\test.json")) {
//            file.write(obj.toJSONString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.print(obj);
//
//    }

    @Override
    public void save(Deltager deltager) {
        JSONParser parser = new JSONParser();

        try{
            Reader reader = new FileReader("./test.json");
            jsonObject = (JSONObject) parser.parse(reader);
            JSONArray array = (JSONArray) jsonObject.get("deltagere");
            reader.close();

            array.add(deltager);
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
