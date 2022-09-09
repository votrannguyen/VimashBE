package com.example.vimash.utils;

import com.example.vimash.bean.jpa.request.ItemValidate;
import com.example.vimash.bean.jpa.request.ValidateInfo;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jetbrains.annotations.Nullable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class ValidateData {
    public static final String REQUIRED_TYPE_ALL = "0";

    public static final String REQUIRED_TYPE_ADD = "1";

    public static final String REQUIRED_TYPE_UPDATE = "2";

    public static final String REQUIRED_TYPE_HASH_MEMBER = "3";

    public static final String TYPE_DATE = "DATE";

    public static final String TYPE_INT = "INT";

    public static final String TYPE_BIG_DECIMAL = "BIGDECIMAL";

    public static final String PARAM_SYSDATE = "{sysdate}";

    public static final String PATH_FILE_JSON = "path_file_json";

    private static ResourceBundle resouceApp;


    public static void validate(String fileName, JsonObject json, boolean isUpdate) throws Exception {
        ItemValidate validate = getItemValidate(fileName);
        if (Objects.isNull(validate)) {
            throw new Exception(MessageUtils.MESSAGE_ERROR_JSON);
        }
        String alias = validate.getAlias();
        List<ValidateInfo> checks = validate.getChecks();
        if (checks.isEmpty()) {
            return;
        }
        for (ValidateInfo check : checks) {
            checks = validate.getChecks();
            check(alias, json, check, isUpdate);
        }
    }

    public static @Nullable ItemValidate getItemValidate(String fileName, String locate) {
        BufferedReader red = null;

        try {
            red = new BufferedReader(new FileReader("C:\\Users\\PC\\Desktop\\vimash\\vimash\\src\\main\\resources\\validate\\" + fileName));
            return new Gson().fromJson(red, ItemValidate.class);
        } catch (FileNotFoundException e) {
            return null;
        } finally {
            if (Objects.nonNull(red)) {
                try {
                    red.close();
                } catch (IOException e) {
                    //
                }
            }
        }
    }

    public static ItemValidate getItemValidate(String fileName) {
        return getItemValidate(fileName, null);

    }
    public static void check(String alias, JsonObject json, ValidateInfo check, boolean isUpdate) throws ApiValidateException {
        check(alias, json, check, isUpdate, null);
    }
    public static void check(String alias, JsonObject json, ValidateInfo check, boolean isUpdate, String locate) throws ApiValidateException {
        String id = check.getId();
        String value = DataUtil.getJsonString(json, id);

        if(check.isNotNull()){
            if(DataUtil.isEmpty(value)){
                throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, id,
                        "Field bị null");
            }
        }

        if(check.isCheckZipCode()){
            if(!(DataUtil.checkZipCode(value))){
                throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, id,
                        "zip code bị sai kí tự");
            }
        }

        if(check.isPhone()){
            if(!(DataUtil.isPhoneNumber(value))){
                throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, id,
                        "phone khong dung dinh dang");
            }
        }

        if (check.getMaxLength() > 0) {
            if (!DataUtil.checkMaxLength(value, check.getMaxLength())) {
                if (check.getMinLength() > -1) {
                    throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, id,
                            "Field bị dư");
                }
                throw new ApiValidateException(Constants.STATUS_SYSTEM_ERROR, id,
                        "Field bị dư");
            }
        }
        if (check.isDate()) {
            if (!DataUtil.isDate(value, Constants.DATE_PATTEN)) {
                throw new ApiValidateException(Constants.ID_BKE00009, id, "Khong dung truong date");
            }
        }
        if (check.isDateTime()) {
            if (!DataUtil.isDate(value, Constants.DATE_TIME_PATTEN)) {
                throw new ApiValidateException(Constants.ID_BKE00009, id, "Khong dung truong date");
            }

        }
        if (!DataUtil.isEmpty(check.getNumber())) {
            if (!DataUtil.checkPattern(value, check.getNumber())) {
                throw new ApiValidateException(Constants.ID_BKE00008, id, "Truong khong phai kieu du lieu Interger");
            }
        }
    }
}
