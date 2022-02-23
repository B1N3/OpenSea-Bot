package com.opensea_bot.server.utils;


import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils {

    private JsonUtils(){}

    public static boolean validateEmployeePermissionsJsonString(String jsonString){
        try {
            JSONObject json = new JSONObject(jsonString);
            JSONArray jsonArray = json.getJSONArray("permissions");
            boolean result = true;
            for (Object permission : jsonArray){
                if(!permission.toString().contains("_PERMISSION")){
                    result = false;
                }
            }
            return result;
        }
        catch(Exception e){
            return false;
        }
    }
}

