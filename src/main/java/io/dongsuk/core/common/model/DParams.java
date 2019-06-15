package io.dongsuk.core.common.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface DParams extends Map, Serializable {
    public String getAsString(String key);
    public Integer getAsInteger(String key);
    public List getAsList(String key);
    public DDataset getAsDDataset(String key);
}
