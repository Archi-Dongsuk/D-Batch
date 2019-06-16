package io.dongsuk.core.common.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public abstract class DBaseParams extends HashMap implements DParams {
    public static final String MESSAGE_CD_NONE = "NON";
    public static final String MESSAGE_NONE = "NONE";

    protected DBaseParams(){
        this.put("messageCd", MESSAGE_CD_NONE);
        this.put("message", MESSAGE_NONE);
    }

    @Override
    public String getAsString(String key){
        String value = this.get(key) != null ? (String)this.get(key) : "";
        return value;
    }

    @Override
    public Integer getAsInteger(String key) {
        Integer value = this.get(key) != null ? (Integer)this.get(key) : 0;
        return value;
    }

    @Override
    public List getAsList(String key) {
        if (this.get(key) == null) {
            return new ArrayList();
        } else {
            String raw = this.get(key).toString();
            if (raw.length() <= 2) {
                return new ArrayList();
            } else {
                raw = raw.substring(1, raw.length() - 1);
                String[] vars = raw.split(",");
                return Arrays.asList(vars);
            }
        }
    }

    @Override
    public DDataset getAsDDataset(String key) {
        return null;
    }
}
