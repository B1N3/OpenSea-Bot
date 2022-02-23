package com.opensea_bot.server.models;

import com.opensea_bot.server.enums.OpenSeaAssetDisplayType;

public class OpenSeaAssetTrait {
    private String traitType;
    private String value;
    private OpenSeaAssetDisplayType displayType;

    public OpenSeaAssetTrait() {
    }

    public String getTraitType() {
        return traitType;
    }

    public void setTraitType(String traitType) {
        this.traitType = traitType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public OpenSeaAssetDisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(OpenSeaAssetDisplayType displayType) {
        this.displayType = displayType;
    }
}
