package com.opensea_bot.server.models;

import java.util.List;

public class OpenSeaAsset {

    private String token_id;
    private String imageUrl;
    private String backgroundColor;
    private String name;
    private String externalLink;
    private String assetContact;
    private String owner;
    private List<OpenSeaAssetTrait> traits;
    private String lastSale;


    public OpenSeaAsset() {
    }

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    public String getAssetContact() {
        return assetContact;
    }

    public void setAssetContact(String assetContact) {
        this.assetContact = assetContact;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<OpenSeaAssetTrait> getTraits() {
        return traits;
    }

    public void setTraits(List<OpenSeaAssetTrait> traits) {
        this.traits = traits;
    }

    public String getLastSale() {
        return lastSale;
    }

    public void setLastSale(String lastSale) {
        this.lastSale = lastSale;
    }
}
