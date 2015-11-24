package com.perqin.smsbackup;

/*
* This is a singleton class. The adapter get and modify data using this class.
* This class use Database to operate data internally.
* */

public class SMSDataModel {
    private static SMSDataModel mInstance = null;

    private SMSDataModel() {}

    public static SMSDataModel getInstance() {
        if (mInstance == null) {
            mInstance = new SMSDataModel();
        }
        return mInstance;
    }
}
