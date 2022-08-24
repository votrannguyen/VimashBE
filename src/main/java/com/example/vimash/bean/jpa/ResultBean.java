package com.example.vimash.bean.jpa;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResultBean implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The meta. */
    private MetaClass meta;

    /** The data. */
    private Object data;

    /** The data infor. */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object dataInfor;

    /** The errors. */
    // Errors result
    private List<ErrorBean> errors = new ArrayList<ErrorBean>();

    /**
     * Instantiates a new result bean.
     * @author (VIMASH)
     * @param data the data
     * @param code the code
     * @param message the message
     */
    public ResultBean(Object data, String code, String message) {
        this.meta = new ResultBean.MetaClass(code, message);
        this.data = data;

    }

    /**
     * Instantiates a new result bean.
     *
     * @author (VIMASH)
     * @param data the data
     * @param code the code
     * @param filed the field
     * @param message the message
     */
    public ResultBean(Object data, String code, String field ,String message) {
        this.meta = new ResultBean.MetaClass(code, field, message);
        this.data = data;

    }

    /**
     * Instantiates a new result bean.
     *
     * @param code the code
     * @param message the message
     */
    public ResultBean(String code, String message) {
        this.meta = new ResultBean.MetaClass(code, message);
    }

    /**
     * Instantiates a new result bean.
     *
     * @param code the code
     * @param message the message
     * @param errors the errors
     */
    public ResultBean(String code, String message, List<ErrorBean> errors) {
        this.meta = new ResultBean.MetaClass(code, message);
        this.errors = errors;
    }

    /**
     * Instantiates a new result bean.
     *
     * @param code the code
     * @param field the field
     * @param message the message
     */
    public ResultBean(String code, String field, String message) {
        this.meta = new ResultBean.MetaClass(code, field, message);
    }

    /**
     * Gets the meta.
     *
     * @return the meta
     */
    public MetaClass getMeta() {
        return meta;
    }

    /**
     * Sets the meta.
     *
     * @param meta the new meta
     */
    public void setMeta(MetaClass meta) {
        this.meta = meta;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Gets the errors.
     *
     * @return the errors
     */
    public List<ErrorBean> getErrors() {
        return errors;
    }

    /**
     * Sets the errors.
     *
     * @param errors the new errors
     */
    public void setErrors(List<ErrorBean> errors) {
        this.errors = errors;
    }

    /**
     * Adds the error.
     *
     * @param error the error
     */
    public void addError(ErrorBean error) {
        this.errors.add(error);
    }

    /**
     * Gets the data infor.
     *
     * @return the data infor
     */
    public Object getDataInfor() {
        return dataInfor;
    }

    /**
     * Sets the data infor.
     *
     * @param dataInfor the new data infor
     */
    public void setDataInfor(Object dataInfor) {
        this.dataInfor = dataInfor;
    }

    /**
     * The Class MetaClass.
     */
    public class MetaClass implements Serializable {

        /** The Constant serialVersionUID. */
        private static final long serialVersionUID = 1L;

        /** The code. */
        private String code;

        /** The field. */
        private String field;

        /** The message. */
        private String message;

        /**
         * Instantiates a new meta class.
         *
         * @param code the code
         * @param message the message
         */
        public MetaClass(String code, String message) {
            this.code = code;
            this.message = message;
        }

        /**
         * Instantiates a new meta class.
         *
         * @param code the code
         * @param field the field
         * @param message the message
         */
        public MetaClass(String code, String field, String message) {
            this.code = code;
            this.message = message;
            this.field = field;
        }

        /**
         * Gets the code.
         *
         * @return the code
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the code.
         *
         * @param code the new code
         */
        public void setCode(String code) {
            this.code = code;
        }

        /**
         * Gets the message.
         *
         * @return the message
         */
        public String getMessage() {
            return message;
        }

        /**
         * Sets the message.
         *
         * @param message the new message
         */
        public void setMessage(String message) {
            this.message = message;
        }

        /**
         * Gets the field.
         *
         * @return the field
         */
        public String getField() {
            return field;
        }

        /**
         * Sets the field.
         *
         * @param field the new field
         */
        public void setField(String field) {
            this.field = field;
        }
    }
}
