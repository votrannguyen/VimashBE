package com.example.vimash.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.NotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataUtil {


    public static boolean isEmpty(String value) {
        if (null == value || 0 == value.length()) {
            return true;
        }
        return false;
    }

    public static void checkSearchCustomer(String name,String code) throws ApiValidateException{
        if(name.trim().length() == 0){
            throw new ApiValidateException(name,"name","Search name khong hop le");
        }
        if(code.trim().length() == 0 || code.trim().length() > 7 ){
            throw new ApiValidateException(name,"name","Search code khong hop le");
        }

    }

    public static JsonObject getJsonObject(String strJson) throws ApiValidateException {
        JsonObject json = null;
        try {
            if (null != strJson && 0 != strJson.length()) {
                json = new Gson().fromJson(strJson, JsonObject.class);
            }

        } catch (Exception ex) {
            json = null;
        }

        if (null == json) {
            // The JSON format is incorrect.
            throw new ApiValidateException(null, null, "JSONフォーマットが正しくありません。");
        }
        return json;
    }
    public static String getJsonString(JsonObject json, String memberName) {
        return getJsonString(json, memberName, null);
    }
    public static String getJsonString(@NotNull JsonElement jsonElement, String memberName) {
        JsonObject json = jsonElement.getAsJsonObject();
        return getJsonString(json, memberName, null);
    }
    public static String getJsonString(@NotNull JsonObject json, String memberName, String defaultValue) {
        if (!json.has(memberName) || json.get(memberName).isJsonNull()) {
            return defaultValue;
        }
        return json.get(memberName).getAsString().trim();
    }

    public static boolean checkMaxLength(String value, int maxlength) {
        if (value.isEmpty() || value.length() > maxlength) {
            return false;
        }
        return true;
    }

    public static boolean isDate(String value, String sPattern) {
        if (isEmpty(value)) {
            return true;
        }
        SimpleDateFormat format = new SimpleDateFormat(sPattern);
        format.setLenient(false);
        try {
            format.parse(value);
        } catch (ParseException ex) {
            return false;
        }
        return true;
    }

    public static boolean checkCodePrice(String code) {
        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }

    public static boolean isInterger(String value){
        try {
            Integer.parseInt(value);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    public static boolean checkPattern(String value, String sPattern) {
        if (DataUtil.isEmpty(value)) {
            return true;
        }
        Pattern pattern = Pattern.compile(sPattern);
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }
}
