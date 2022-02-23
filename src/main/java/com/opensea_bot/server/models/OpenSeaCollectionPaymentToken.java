package com.opensea_bot.server.models;

public class OpenSeaCollectionPaymentToken {
    private String id;
    private String symbol;
    private String address;
    private String imageUrl;
    private String name;
    private String decimals;
    private String ethPrice;
    private String usdPrice;

    public OpenSeaCollectionPaymentToken() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecimals() {
        return decimals;
    }

    public void setDecimals(String decimals) {
        this.decimals = decimals;
    }

    public String getEthPrice() {
        return ethPrice;
    }

    public void setEthPrice(String ethPrice) {
        this.ethPrice = ethPrice;
    }

    public String getUsdPrice() {
        return usdPrice;
    }

    public void setUsdPrice(String usdPrice) {
        this.usdPrice = usdPrice;
    }
}
