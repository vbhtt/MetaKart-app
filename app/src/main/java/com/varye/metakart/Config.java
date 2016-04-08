package com.varye.metakart;

/**
 * Created by varun on 08-04-2016.
 */
public class Config {
    //Address of our scripts of the CRUD
    //public static final String URL_ADD = "http://metakart.cf/addPrd.php";
    public static final String URL_GET_ALL = "http://metakart.cf/get_all_products.php?category=";
    //public static final String URL_GET_PRD = "http://metakart.cf/getPrd.php?id=";
    //public static final String URL_UPDATE_PRD = "http://metakart.cf/updatePrd.php";
    //public static final String URL_DELETE_PRD = "http://metakart.cf/deletePrd.php?id=";

    //Keys that will be used to send the request to php scripts
    //public static final String KEY_PRD_ID = "PRODUCT_ID";
    //public static final String KEY_PRD_NAME = "PRODUCT_NAME";
    //public static final String KEY_PRD_PIC = "PRODUCT_IMAGE";
    //public static final String KEY_PRD_DESG = "PRODUCT_DESCRIPTION";
    //public static final String KEY_PRD_RATG = "RATING";
    //public static final String KEY_PRD_PRICE = "PRICE";

    //JSON Tags
    public static final String TAG_JSON_ARRAY = "products";
    public static final String TAG_ID = "pid";
    public static final String TAG_PIC = "image";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "description";
    public static final String TAG_RATG = "rating";
    public static final String TAG_PRICE = "price";

    //Product id to pass with intent
    //public static final String PRD_ID = "prd_id";
}
