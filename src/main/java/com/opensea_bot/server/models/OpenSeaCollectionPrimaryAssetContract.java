package com.opensea_bot.server.models;

import java.time.LocalDateTime;

public class OpenSeaCollectionPrimaryAssetContract {
    private String address;
    private String assetContractType;
    private LocalDateTime createdDate;
    private String name;
    private String nftVersion;
    private String openSeaVersion;
    private String owner;
    private String schemaName;
    private String symbol;
    private String totalSupply;
    private String description;
    private String externalLink;
    private String imageUrl;
    private Boolean defaultToFiat;
    private Integer devBuyerFeeBasisPoints;
    private Integer devSellerFeeBasisPoints;
    private Boolean onlyProxiedTransfers;
    private Integer openSeaBuyerFeeBasisPoints;
    private Integer openSeaSellerFeeBasisPoints;
    private Integer buyerFeeBasisPoints;
    private Integer sellerFeeBasisPoints;
    private String payoutAddress;

    public OpenSeaCollectionPrimaryAssetContract() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAssetContractType() {
        return assetContractType;
    }

    public void setAssetContractType(String assetContractType) {
        this.assetContractType = assetContractType;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNftVersion() {
        return nftVersion;
    }

    public void setNftVersion(String nftVersion) {
        this.nftVersion = nftVersion;
    }

    public String getOpenSeaVersion() {
        return openSeaVersion;
    }

    public void setOpenSeaVersion(String openSeaVersion) {
        this.openSeaVersion = openSeaVersion;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(String totalSupply) {
        this.totalSupply = totalSupply;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getDefaultToFiat() {
        return defaultToFiat;
    }

    public void setDefaultToFiat(Boolean defaultToFiat) {
        this.defaultToFiat = defaultToFiat;
    }

    public Integer getDevBuyerFeeBasisPoints() {
        return devBuyerFeeBasisPoints;
    }

    public void setDevBuyerFeeBasisPoints(Integer devBuyerFeeBasisPoints) {
        this.devBuyerFeeBasisPoints = devBuyerFeeBasisPoints;
    }

    public Integer getDevSellerFeeBasisPoints() {
        return devSellerFeeBasisPoints;
    }

    public void setDevSellerFeeBasisPoints(Integer devSellerFeeBasisPoints) {
        this.devSellerFeeBasisPoints = devSellerFeeBasisPoints;
    }

    public Boolean getOnlyProxiedTransfers() {
        return onlyProxiedTransfers;
    }

    public void setOnlyProxiedTransfers(Boolean onlyProxiedTransfers) {
        this.onlyProxiedTransfers = onlyProxiedTransfers;
    }

    public Integer getOpenSeaBuyerFeeBasisPoints() {
        return openSeaBuyerFeeBasisPoints;
    }

    public void setOpenSeaBuyerFeeBasisPoints(Integer openSeaBuyerFeeBasisPoints) {
        this.openSeaBuyerFeeBasisPoints = openSeaBuyerFeeBasisPoints;
    }

    public Integer getOpenSeaSellerFeeBasisPoints() {
        return openSeaSellerFeeBasisPoints;
    }

    public void setOpenSeaSellerFeeBasisPoints(Integer openSeaSellerFeeBasisPoints) {
        this.openSeaSellerFeeBasisPoints = openSeaSellerFeeBasisPoints;
    }

    public Integer getBuyerFeeBasisPoints() {
        return buyerFeeBasisPoints;
    }

    public void setBuyerFeeBasisPoints(Integer buyerFeeBasisPoints) {
        this.buyerFeeBasisPoints = buyerFeeBasisPoints;
    }

    public Integer getSellerFeeBasisPoints() {
        return sellerFeeBasisPoints;
    }

    public void setSellerFeeBasisPoints(Integer sellerFeeBasisPoints) {
        this.sellerFeeBasisPoints = sellerFeeBasisPoints;
    }

    public String getPayoutAddress() {
        return payoutAddress;
    }

    public void setPayoutAddress(String payoutAddress) {
        this.payoutAddress = payoutAddress;
    }
}
