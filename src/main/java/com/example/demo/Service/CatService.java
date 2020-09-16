package com.example.demo.Service;
import com.example.demo.Controller.HelloWorldController;
import com.example.demo.Models.CatFact;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class CatService {

    public String getTen() throws IOException {
        ArrayList<CatFact> catList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
            catList.add(data);
            inputFromCatURL.close();
        }
        return catList.toString();

    }

    public String getSingle() throws IOException {
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
        inputFromCatURL.close();
        return data.toString();


    }

    public String contains(char c, int n) throws IOException {
        URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
        BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
        CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
        inputFromCatURL.close();

        int count = 0;

        for (int i = 0; i < data.getText().length(); i++) {
            if (data.getText().charAt(i) == c) {
                count++;
            }
        }
        if (count == n) {
            return data.toString();

        }
return "Blev ikke fundet";
    }

    public String getSorted() throws IOException {

        ArrayList<CatFact> catList = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");
            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);
            catList.add(data);
            inputFromCatURL.close();
        }
        Collections.sort(catList);
        return catList.toString();

    }



    /*  URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random%22");
    // Instantiate a Buffered Reader to consume the InputStream from the URL
    BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));
    // Map the data from Json to an object
    HelloWorldController data = new Gson().fromJson(inputFromCatURL, HelloWorldController.class);
    // Close the BufferedReader
        inputFromCatURL.close();

    // Get front page
        System.out.println(data.frontPage());

    // Get Single
        System.out.println(data.getSingle());

    // Get ten
    // System.out.println(data.getTen());

    // Get ten sort by date
    // System.out.println(data.getTenSortByDate());

    // Contains
    // System.out.println(data.getContains()); */

}
