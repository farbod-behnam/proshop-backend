package com.proshop.rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.proshop.rest.entity.Product;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JsonConverter {

    public static void main(String[] args) throws Exception {   //handle exception
        String jsonFile;
        jsonFile = convertFileIntoString("./src/main/resources/static/products_data.json");
//        System.out.println(jsonFile);
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Product> stringProductMap = mapper.readValue(jsonFile, Map.class);



        for (Product p: stringProductMap.values()) {
            System.out.println(p);
        }


    }

    public static String convertFileIntoString(String fileLocation)throws Exception
    {
        String result = "null";

        try {
            result = new String(Files.readAllBytes(Paths.get(fileLocation)));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    private String asJsonString(final Object obj)
    {
        try
        {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
